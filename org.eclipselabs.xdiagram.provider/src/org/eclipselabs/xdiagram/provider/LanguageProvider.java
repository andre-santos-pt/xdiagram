package org.eclipselabs.xdiagram.provider;


import java.util.Collection;
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
import org.eclipselabs.xdiagram.DslStandaloneSetup;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureConditional;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.dsl.Node;
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
import org.eclipselabs.xdiagram.provider.internal.handlers.LineWidthHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PointHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PositionHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.SizeHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.TextValueHandler;
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

	
	private Map<EClass, Node> nodes;
	private Map<EClass, Link> complexLinks;
	private Map<EReference, Link> links;
	
	private Multimap<EReference, org.eclipselabs.xdiagram.dsl.Anchor> outgoing;
	private Multimap<EReference, org.eclipselabs.xdiagram.dsl.Anchor> incomming;
	
	
	private Map<Anchor, EObject> anchors; // instance-level
	
	
	
	
	public LanguageProvider() {
		anchors = Maps.newHashMap();
		containsHandler = new ContainsHandler();

		featureChain = new FeatureHandlerChain()
		.add(new ColorHandler())
		.add(new SizeHandler())
		.add(new PositionHandler())
		.add(new LineWidthHandler())
		.add(new PointHandler())
		.add(new TextValueHandler())
		.add(new CornerHandler())

		.add(containsHandler)
		.add(new AnchorHandler());
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
		
		public Object caseTextValue(TextValue textValue) {
			if(textValue.getModelAttribute() != null)
				textValue.setModelAttribute(match(textValue.getModelAttribute()));
			return null;
		};
		
		public Object caseFeatureConditional(FeatureConditional conditional) {
			conditional.setModelAttribute(match(conditional.getModelAttribute()));
			return null;
		};
		
	};
	
	
	
	private void loadModelData() {
		nodes = Maps.newHashMap();
		links = Maps.newHashMap();
		complexLinks = Maps.newHashMap();
		anchors = Maps.newHashMap();
		
		
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
			updateConnections(conn, diagram);
	}

	


	private void updateLinked(ContainerShape shape, Diagram diagram) {
		PictogramLink link = shape.getLink();
		EObject eObject = (EObject) link.getBusinessObjects().get(0);
		Node node = getNode(eObject.eClass());
		updateElement(node.getRootFigure(), eObject, shape, diagram);
	}

	// TODO remove children?
	private void updateElement(ConnectableElement e, EObject o, ContainerShape s, Diagram diagram) {
		featureChain.update(e, o, diagram, s.getGraphicsAlgorithm(), s);
		List<ConnectableElement> childrenElements = e.getChildren();
		List<Shape> childrenShapes = ((ContainerShape) s).getChildren();

		for(int i = 0; i < childrenShapes.size() && i < childrenElements.size(); i++) {
			if(childrenShapes.get(i).getLink() != null)
				updateLinked((ContainerShape) childrenShapes.get(i), diagram);
			else
				updateElement(childrenElements.get(i), o, (ContainerShape) childrenShapes.get(i), diagram);
		}

	}

	private void updateConnections(Connection conn, Diagram diagram) {
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
			featureChain.update(link, eObject, diagram, conn.getGraphicsAlgorithm(), diagram);
	}
	
	


	@Override
	public GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject) {
		GraphicsAlgorithm nodeFigure = null;

		Node node = getNode(eObject.eClass());
		ConnectableElement mainFig = node.getRootFigure();
		nodeFigure = ElementCreation.createNodeFigure(mainFig, diagram, container);
		
//		if(mainFig instanceof Custom)
//			featureChain.update(((Custom) mainFig).getFigure().getElement(), eObject, diagram, nodeFigure, container);

		featureChain.update(mainFig, eObject, diagram, nodeFigure, container);

		for(ConnectableElement child : mainFig.getChildren())
			addChildren(child, container, diagram, eObject);

		if(!hasFeature(mainFig, org.eclipselabs.xdiagram.dsl.Anchor.class, true)) {
			Anchor anchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
			anchors.put(anchor, eObject);
		}
		return nodeFigure;		
	}

	

	// TODO validation anchors cannot have children?
	private void addChildren(ConnectableElement element, Shape container, Diagram diagram, EObject eObject) {
		boolean isActive = hasFeature(element, Contains.class, false);
		boolean hasAnchor = hasFeature(element, org.eclipselabs.xdiagram.dsl.Anchor.class, false);

		GraphicsAlgorithmContainer childContainer = null; 
		if(hasAnchor) {
			BoxRelativeAnchor anchor = Graphiti.getPeCreateService().createBoxRelativeAnchor(container);
			anchor.setReferencedGraphicsAlgorithm(container.getGraphicsAlgorithm());
			childContainer = anchor;
			anchors.put(anchor, eObject);
		}
		else {
			childContainer = Graphiti.getPeCreateService().createContainerShape((ContainerShape) container, isActive);
		}

		GraphicsAlgorithm childFigure =  ElementCreation.createNodeFigure(element, diagram, childContainer);
		featureChain.update(element, eObject, diagram, childFigure, childContainer);

		// anchors cannot have children
		if(!hasAnchor) {
			for(ConnectableElement child : element.getChildren())
				addChildren(child, (Shape) childContainer, diagram, eObject);
		}
	}



	public static boolean hasFeature(ConnectableElement element, Class<? extends Feature> clazz, boolean recursive) {
		for(Feature f : element.getFeatures()) {
			if(clazz.isInstance(f))
				return true;

			if(recursive)
				for(ConnectableElement child : element.getChildren())
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
	public boolean canMoveNodeFigure(GraphicsAlgorithm figure) {
		//TODO can move
		//		String value = FigureProperty.CAN_MOVE.get(figure);
		//		return value==null || value.equals("1");
		return true;
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

		return element instanceof Label && ((Label) element).isEditable();
		//	return "1".equals(FigureProperty.CAN_EDIT.get(figure));
	}	

	@Override
	public EAttribute getTextEditableAttribute(EClass eClass) {
		Node node = getNode(eClass);

		ConnectableElement element  = node.getRootFigure();
		for(Feature f : element.getFeatures()) {
			if(f instanceof TextValue) {
				TextValue v = (TextValue) f;
				if(v.getModelAttribute() != null)
					return v.getModelAttribute();
			}
		}
		return null;
	}



	@Override
	public Connection getConnectionFigure(Diagram diagram, Anchor source, Anchor target, EObject eObject) {
		assert source != null && target != null;
		
		Connection connection = null;
		Link link = null;

		// complex link
		if(eObject != null) {
			link = getComplexLink(eObject.eClass());
		}
		// simple link
		else {
			EObject sourceObject = anchors.get(source);
			EObject targetObject = anchors.get(target);

			link = matchLink(sourceObject);
		}

		assert link != null;

		// TODO connection type
		connection = Graphiti.getPeCreateService().createFreeFormConnection(diagram);
		// link.isManhattan() ?  Graphiti.getPeCreateService().createManhattanConnection(diagram) :


		GraphicsAlgorithm connectionLink = createLinkConnection(link, diagram, connection, eObject);

		//TODO: Eduardo
		for (Decorator decorator: link.getDecorators()) {
			ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, 
					false, (double) decorator.getPosition()/100.0, true);

			if (decorator.getStaticElement() != null) {
				ElementCreation.createNodeFigure(decorator.getStaticElement(), diagram, cd);
				//						nodeHandler.createNodeFigure(decorator.getStaticElement(), diagram, cd, connectionLink, eObject);
				//						linkHandler.createLinkFigure((Link) eObject, diagram, cd, decorator.getPlacingStatic(), link.getStyle());

			}
			else {
				Label label = decorator.getLabel();
				ElementCreation.createNodeFigure(label, diagram, cd);
				//						nodeHandler.createNodeFigure(label, diagram, cd, connectionLink, null);
				//linkHandler.createDynamicFigure((Link) eObject, diagram, cd, label);
			}
			//					for (DynamicFigure text: decorator.getPlacingDynamic()){
			//						ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, 
			//								true, (double)decorator.getPos()/100.0, true);
			//						linkHandler.createDynamicFigure((Link) eObject, diagram, cd, text, link.getStyle());
			//					}
		}

		connection.setStart(source);
		connection.setEnd(target);

		return connection;
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

	private GraphicsAlgorithm createLinkConnection(Link link, Diagram diagram, Connection connection, EObject eObject) {
		Polyline linkConnector = Graphiti.getGaService().createPlainPolyline(connection);
		featureChain.update(link, eObject, diagram, linkConnector, diagram);
		return linkConnector;
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
