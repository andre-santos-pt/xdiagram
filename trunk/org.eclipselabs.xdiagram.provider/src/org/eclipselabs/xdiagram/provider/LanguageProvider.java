package org.eclipselabs.xdiagram.provider;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.xdiagram.DslStandaloneSetup;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.ConnectionType;
import org.eclipselabs.xdiagram.dsl.ContainerLayout;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureConditional;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.dsl.Node;
import org.eclipselabs.xdiagram.dsl.TextPart;
import org.eclipselabs.xdiagram.dsl.TextValue;
import org.eclipselabs.xdiagram.dsl.XDiagram;
import org.eclipselabs.xdiagram.dsl.util.DslSwitch;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.provider.internal.ElementCreation;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandlerChain;
import org.eclipselabs.xdiagram.provider.internal.handlers.AnchorHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.ColorHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.ContainsHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.CornerHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.LayoutHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.LineStyleHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.LineWidthHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PointHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PositionHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.SizeHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.TextValueHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.VisibleHandler;
import org.osgi.framework.Bundle;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

public class LanguageProvider implements GraphicsProvider {

	private URI modelLocation;
	private XDiagram model;
	private EPackage ePackage;

	private FeatureHandlerChain featureChain;

	private ContainsHandler containsHandler;
	private AnchorHandler anchorHandler;
	private LayoutHandler layoutHandler;

	private Map<EClass, Node> nodes;
	private Map<EClass, Link> complexLinks;
	private Map<EReference, Link> links;

	private Multimap<EReference, org.eclipselabs.xdiagram.dsl.Anchor> outgoing;
	private Multimap<EReference, org.eclipselabs.xdiagram.dsl.Anchor> incomming;



	public LanguageProvider() {
		containsHandler = new ContainsHandler();

		anchorHandler = new AnchorHandler();

		layoutHandler = new LayoutHandler();

		featureChain = new FeatureHandlerChain()
		.add(layoutHandler)
		.add(new VisibleHandler())
		.add(new ColorHandler())
		.add(new PositionHandler(layoutHandler))
		.add(new SizeHandler())
		.add(new LineWidthHandler())
		.add(new PointHandler())
		.add(new TextValueHandler())
		.add(new CornerHandler())
		.add(new LineStyleHandler())

		//.add(new DecoratorHandler())



		.add(containsHandler)
		.add(anchorHandler);
	}


	@Override
	public void setup(Bundle bundle, Map<String, String> properties, EPackage ePackage) throws ProviderException {		
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.ePackage = ePackage;
		modelLocation = URI.createPlatformPluginURI(bundle.getSymbolicName() + "/" + properties.get("file"), false);
		loadModel();
	}

	@Override
	public void loadDiagram(Diagram diagram, EObject rootObject) {
		for(Contains c : model.getDiagram().getContains())
			containsHandler.handle(null, c, rootObject, diagram, diagram, diagram.getGraphicsAlgorithm());
	}

	private void loadModel() throws ProviderException {

		try{			
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.getResource(modelLocation, true);

			if(resource == null)
				throw new ProviderException("Could not load: " + modelLocation);

			List<EObject> objs = resource.getContents();
			model = (XDiagram) objs.get(0);
			loadModelData();
		}
		catch(Exception e){
			e.printStackTrace();
			throw new ProviderException("Could not load language model: " + e.getMessage());
		}
	}

	private class LoadModelData extends DslSwitch<Object> {

		private EClass match(EClass c) {
			return (EClass) ePackage.getEClassifier(c.getName());
		}

		private <T extends EStructuralFeature> T match(T r) {
			EClass c = match((EClass) r.eContainer());
			T f = (T) c.getEStructuralFeature(r.getName());
			return f;
		}

		public Object caseXDiagram(XDiagram model) {
			model.getDiagram().setModelClass(match(model.getDiagram().getModelClass())); 
			return null;
		};

		public Object caseNode(Node node) {
			EClass c = match(node.getModelClass());
			node.setModelClass(c);
			nodes.put(c, node);
			return null;
		}

		public Object caseLink(Link link) {
			if(link.isComplex()) {
				EClass c = match(link.getModelClass());
				link.setModelClass(c);
				complexLinks.put(c, link);

				link.setSourceReference(match(link.getSourceReference()));
				link.setTargetReference(match(link.getTargetReference()));
			}
			else {
				EReference r = match(link.getModelReference());
				link.setModelReference(r);
				links.put(r, link);
			}
			return null;
		};

		public Object caseContains(Contains contains) {
			contains.setModelReference(match(contains.getModelReference()));
			return null;
		};

		public Object caseAnchor(org.eclipselabs.xdiagram.dsl.Anchor anchor) {
			EReference r = match(anchor.getModelReference());
			anchor.setModelReference(r);

			switch(anchor.getDirection()) {
			case OUTGOING:
				outgoing.put(r, anchor);
				break;
			case INCOMING:
				incomming.put(r, anchor);
				break;
			}
			return null;
		};

		@Override
		public Object caseTextPart(TextPart part) {
			if(part.getModelAttribute() != null)
				part.setModelAttribute(match(part.getModelAttribute()));
			return null;
		}

		//		public Object caseTextValue(TextValue textValue) {
		//			if(textValue.getModelAttribute() != null)
		//				textValue.setModelAttribute(match(textValue.getModelAttribute()));
		//			return null;
		//		};

		public Object caseFeatureConditional(FeatureConditional conditional) {
			conditional.setModelAttribute(match(conditional.getModelAttribute()));
			return null;
		};

	};



	private void loadModelData() {
		nodes = Maps.newHashMap();
		links = Maps.newHashMap();
		complexLinks = Maps.newHashMap();

		incomming = ArrayListMultimap.create();
		outgoing = ArrayListMultimap.create();

		LoadModelData doSwitch = new LoadModelData();

		for(TreeIterator<EObject> iterator = EcoreUtil.getAllContents(model.eResource(), false); iterator.hasNext();)
			doSwitch.doSwitch(iterator.next());
	}		

	private boolean isNode(EClass c) {
		assert c != null;
		return nodes.containsKey(c);
	}

	private Node getNode(EClass c) {
		assert c != null;
		return nodes.get(c);
	}

	private boolean isComplexLink(EClass c) {
		assert c != null;
		return complexLinks.containsKey(c);
	}

	private Link getComplexLink(EClass c) {
		assert c != null;
		return complexLinks.get(c);
	}


	private boolean isLink(EReference r) {
		assert r != null;
		return links.containsKey(r);
	}

	private Link getLink(EReference r) {
		assert r != null;
		return links.get(r);
	}


	@Override
	public boolean hasTool(EClass eClass) {
		return isNode(eClass);
	}

	@Override
	public boolean hasTool(EReference eReference) {	
		return isLink(eReference);
	}

	@Override
	public boolean isLink(EClass eClass) {
		return isComplexLink(eClass);
	}

	@Override
	public boolean isProperty(EStructuralFeature feature) {
		return true;
	}

	@Override
	public EClass getRoot() {
		return model.getDiagram().getModelClass();
	}


	@Override
	public boolean canAddChild(ContainerShape container, EClass eClass, int x, int y) {
		if(!containsHandler.isContainer( container)) {
			return false;
		}

		for(EReference r: containsHandler.getReferences(container))
			if(r.getEReferenceType().isSuperTypeOf(eClass))
				return true;

		return false;
	}


	@Override
	public Collection<EReference> getContainerReferences(ContainerShape container) {
		return containsHandler.getReferences(container);
	}
	@Override
	public Collection<EReference> getCompatibleContainerReferences(ContainerShape container, EObject eObject) {
		return containsHandler.getReferences(container, eObject);
	}

	@Override
	public EObject getContainerObject(ContainerShape container) {
		return containsHandler.isContainer(container) ? containsHandler.getOwner(container) : null;
	}






	@Override
	public void update(Diagram diagram) {
		try {
			loadModel();
		}
		catch(ProviderException ex) {
			ex.printStackTrace();
		}

		for(Shape shape : diagram.getChildren())
			updateLinked((ContainerShape) shape, diagram);

		for(Connection conn : diagram.getConnections())
			updateConnection(conn, diagram);
	}




	private void updateLinked(ContainerShape shape, Diagram diagram) {
		PictogramLink link = shape.getLink();
		EObject eObject = (EObject) link.getBusinessObjects().get(0);
		Node node = getNode(eObject.eClass());
		updateElement(node.getRootFigure(), eObject, shape, diagram);
	}

	// TODO remove children?
	private void updateElement(FeatureContainer e, EObject o, ContainerShape s, Diagram diagram) {

		if(e instanceof ConnectableElement) {
			List<FeatureContainer> childrenElements = ((ConnectableElement)e).getChildren();
			List<Shape> childrenShapes = ((ContainerShape) s).getChildren();

			for(int i = 0; i < childrenShapes.size() && i < childrenElements.size(); i++) {
				if(childrenShapes.get(i).getLink() != null)
					updateLinked((ContainerShape) childrenShapes.get(i), diagram);
				else
					updateElement(childrenElements.get(i), o, (ContainerShape) childrenShapes.get(i), diagram);
			}
		}
		featureChain.update(e, o, diagram, s.getGraphicsAlgorithm(), s);
	}

	private void updateConnection(Connection conn, Diagram diagram) {
		PictogramLink plink = conn.getLink();
		EObject eObject = null;
		Link link = null;
		if(plink != null) {
			eObject = plink.getBusinessObjects().get(0);
			link = getComplexLink(eObject.eClass());
		}
		else {
			Anchor anc = conn.getStart();
			PictogramLink outLink = anc.getParent().getLink();
			EObject owner = outLink.getBusinessObjects().get(0);
			link = matchLink(owner);
		}
		if(link != null)
			featureChain.update(link, eObject, diagram, conn.getGraphicsAlgorithm(), conn);

		Iterator<ConnectionDecorator> it = conn.getConnectionDecorators().iterator();

		for(Feature f : link.getFeatures()) {
			if(f instanceof Decorator) {
				Decorator decorator = (Decorator) f;
				FeatureContainer el = decorator.getElement();
				if(it.hasNext()) {
					ConnectionDecorator dec = it.next();
					featureChain.update(el, eObject, diagram, dec.getGraphicsAlgorithm(), dec);
				}
			}
		}
	}




	@Override
	public GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject) {
		GraphicsAlgorithm nodeFigure = null;

		Node node = getNode(eObject.eClass());
		ConnectableElement mainFig = node.getRootFigure();
		nodeFigure = ElementCreation.createNodeFigure(mainFig, diagram, container);

		//		if(mainFig instanceof Custom)
		//			featureChain.update(((Custom) mainFig).getFigure().getElement(), eObject, diagram, nodeFigure, container);

		for(FeatureContainer child : mainFig.getChildren())
			addChildren(child, container, diagram, eObject);

		// parent features after
		featureChain.update(mainFig, eObject, diagram, nodeFigure, container);

		//		if(!hasFeature(mainFig, org.eclipselabs.xdiagram.dsl.Anchor.class, true)) {
		//			Anchor anchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
		//			anchors.put(anchor, eObject);
		//		}

		Graphiti.getGaLayoutService().setLocation(nodeFigure, context.getX(), context.getY(), true);
		return nodeFigure;		
	}



	// TODO validation anchors cannot have children?
	private void addChildren(FeatureContainer element, Shape container, Diagram diagram, EObject eObject) {
		boolean isActive = hasFeature(element, Contains.class, false);
		boolean hasAnchor = hasFeature(element, org.eclipselabs.xdiagram.dsl.Anchor.class, false);

		GraphicsAlgorithmContainer childContainer = null; 
		if(hasAnchor) {
			BoxRelativeAnchor anchor = Graphiti.getPeCreateService().createBoxRelativeAnchor(container);
			anchor.setReferencedGraphicsAlgorithm(container.getGraphicsAlgorithm());
			childContainer = anchor;
			//			anchors.put(anchor, eObject);
		}
		else {
			childContainer = Graphiti.getPeCreateService().createContainerShape((ContainerShape) container, isActive);
		}

		GraphicsAlgorithm childFigure =  ElementCreation.createNodeFigure(element, diagram, childContainer);
		featureChain.update(element, eObject, diagram, childFigure, childContainer);

		// anchors cannot have children
		if(!hasAnchor && element instanceof ConnectableElement) {
			for(FeatureContainer child : ((ConnectableElement) element).getChildren())
				addChildren(child, (Shape) childContainer, diagram, eObject);
		}
	}



	public static boolean hasFeature(FeatureContainer element, Class<? extends Feature> clazz, boolean recursive) {
		for(Feature f : element.getFeatures()) {
			if(clazz.isInstance(f))
				return true;

			if(recursive && element instanceof ConnectableElement)
				for(FeatureContainer child : ((ConnectableElement) element).getChildren())
					hasFeature(child, clazz, recursive);
		}

		return false;
	}













	@Override
	public void resizeNodeFigure(Diagram diagram, ContainerShape container, int width, int height) {
		// TODO: Eduardo
		Graphiti.getLayoutService().setSize(container.getGraphicsAlgorithm(), width, height);

		//		nodeHandler.resizeNodeFigure(null, diagram, container, new Dimension(width, height));
	}

	@Override
	public void removeNodeFigure(Diagram diagram, GraphicsAlgorithm figure) {

		//TODO: remove container refs
		//nodeHandler.removeContainerFigures(null, diagram, figure);
	}

	@Override
	public boolean canResizeNodeFigure(EObject eObject) {

		//		for(Node node : model.getNodes())
		//			if (equals(node.getModelClass(), eObject.eClass()) && node.isResizable())
		//				return true;
		//
		//		return false;
		// TODO can resize
		return true;
	}

	@Override
	public boolean canMoveNode(EObject eObject) {
//		ContainerShape parent = (ContainerShape) ((ContainerShape) eObject.eContainer()).eContainer();
		  EObject parent = eObject.eContainer();
		ContainerLayout layout = layoutHandler.getLayout(parent);
		
//		for(Contains c : containsHandler.getContainsFeature()
//			return c.getLayout().equals(ContainerLayout.FREE);
		return layout.equals(ContainerLayout.FREE);
	}



	@Override
	public boolean canEditFigureLabel(GraphicsAlgorithm figure, EObject eObject) {
		Node node = getNode(eObject.eClass());
		ConnectableElement element  = node.getRootFigure();

		// TODO can edit figure label

		//	for(NodeFigure f : node.getFigures()) {
		//		if(f.getElement() instanceof Label && ((Label) f.getElement()).isEditable()) {
		//			return true;
		//		}

		return element instanceof Label; //&& ((Label) element).isEditable();
	}	

	@Override
	public EAttribute getTextEditableAttribute(EClass eClass) {
		Node node = getNode(eClass);

		//TODO recover editable label
		//		ConnectableElement element  = node.getRootFigure();
		//		for(Feature f : element.getFeatures()) {
		//			if(f instanceof TextValue) {
		//				TextValue v = (TextValue) f;
		//				if(v.getModelAttribute() != null)
		//					return v.getModelAttribute();
		//			}
		//		}
		return null;
	}



	@Override
	public Connection createConnectionFigure(Diagram diagram, Anchor source, Anchor target, EObject eObject) {
		assert source != null && target != null;

		Connection connection = null;
		Link link = null;

		// complex link
		if(eObject != null) {
			link = getComplexLink(eObject.eClass());
		}
		// simple link
		else {
			EObject sourceObject = anchorHandler.get(source);
			EObject targetObject = anchorHandler.get(target);

			link = matchLink(sourceObject);
		}

		assert link != null;

		connection = link.getType().equals(ConnectionType.FREE) ?
				Graphiti.getPeCreateService().createFreeFormConnection(diagram):
					Graphiti.getPeCreateService().createManhattanConnection(diagram);

				GraphicsAlgorithm connectionLink = createLinkConnection(link, diagram, connection, eObject);

				//		handleDecorators(diagram, eObject, connection, link, connectionLink);
				handleDecorators(link, connection, eObject, diagram, connectionLink);

				connection.setStart(source);
				connection.setEnd(target);

				return connection;
	}

	private GraphicsAlgorithm createLinkConnection(Link link, Diagram diagram, Connection connection, EObject eObject) {
		Polyline linkConnector = Graphiti.getGaService().createPlainPolyline(connection);
		featureChain.update(link, eObject, diagram, linkConnector, connection);
		return linkConnector;
	}

	private void handleDecorators(Link link, Connection connection, EObject eObject, Diagram diagram, GraphicsAlgorithm connectionLink) {

		for(Feature f : link.getFeatures()) {
			if(f instanceof Decorator) {
				Decorator decorator = (Decorator) f;
				double perc = decorator.getPosition(); // TODO: validation percent
				double position = perc/100.0;
				boolean active = decorator.getElement() instanceof Label;
				ConnectionDecorator dec = 
						Graphiti.getPeCreateService().createConnectionDecorator(connection, active, position, true);

				GraphicsAlgorithm decFig = ElementCreation.createNodeFigure(decorator.getElement(), diagram, dec);
				featureChain.update(decorator.getElement(), eObject, diagram, decFig, dec);
			}
		}
	}

	//	private void handleDecorators(Diagram diagram, EObject eObject,
	//			Connection connection, Link link, GraphicsAlgorithm connectionLink) {
	//		
	//		for (Decorator decorator: link.getDecorators()) {
	//			double perc = Double.parseDouble(decorator.getPosition().substring(0, decorator.getPosition().length()-1));
	//			double position = perc/100.0;
	//			boolean active = decorator.getElement() instanceof Label;
	//			ConnectionDecorator dec = Graphiti.getPeCreateService().createConnectionDecorator(connection, 
	//					active, position, true);
	//			
	//			GraphicsAlgorithm decFig = ElementCreation.createNodeFigure(decorator.getElement(), diagram, dec);
	////			GraphicsAlgorithm decFig = createArrow(dec);
	////					GraphicsAlgorithm decFig = Graphiti.getGaService().createEllipse(dec);
	//							
	//			featureChain.update(decorator.getElement(), eObject, diagram, decFig, connectionLink);
	//		}
	//	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {

		IGaService gaService = Graphiti.getGaService();
		Polygon polygon = gaService.createPolygon(gaContainer, new int[] { -15, 10, 1, 0, -15, -10 });
		//        polygon.setForeground(manageColor(IColorConstant.BLACK));
		//        polygon.setBackground(manageColor(IColorConstant.BLACK));
		polygon.setLineWidth(2);
		polygon.setFilled(true);
		return polygon;
	}


	private Link matchLink(EObject sourceObject) {
		assert sourceObject != null;
		for(Link l : links.values()) {
			EReference ref = l.getModelReference();
			EClass refOwner = (EClass) ref.eContainer();
			if(refOwner.isSuperTypeOf(sourceObject.eClass()))
				return l;
		}
		return null;
	}




	@Override
	public boolean isValidOutgoingConnection(Anchor anchor, EReference eReference) {
		assert anchor != null;
		assert eReference != null;

		EObject eObject = anchor.getParent().getLink().getBusinessObjects().get(0);

		for(org.eclipselabs.xdiagram.dsl.Anchor a : outgoing.get(eReference)) {

		}

		return true;
		//		return anchor instanceof ChopboxAnchor || (anchor.getOutgoingConnections().size()>=0 &&
		//				canSetConnection(anchor, eReference, ANCHOR_OUTGOING));
	}

	@Override
	public boolean isValidIncomingConnection(Anchor anchor, EReference eReference) {
		assert anchor != null;
		assert eReference != null;
		return true;
		//		return anchor instanceof ChopboxAnchor || (anchor.getIncomingConnections().size()>=0 &&
		//				canSetConnection(anchor, eReference, ANCHOR_INCOMING));
	}

	@Override
	public EReference getLinkTarget(EClass eClass) {	
		assert eClass != null && isComplexLink(eClass);
		return getComplexLink(eClass).getTargetReference();
	}

}
