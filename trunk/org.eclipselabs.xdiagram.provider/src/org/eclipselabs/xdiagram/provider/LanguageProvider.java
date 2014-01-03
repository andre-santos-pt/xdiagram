package org.eclipselabs.xdiagram.provider;


import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
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
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.DslStandaloneSetup;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.provider.internal.ElementCreation;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandlerChain;
import org.eclipselabs.xdiagram.provider.internal.handlers.AnchorHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.ColorHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.ContainsHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.LineWidthHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PointHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PositionHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.SizeHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.TextValueHandler;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.Element;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.dsl.Node;
import org.eclipselabs.xdiagram.dsl.TextValue;
import org.eclipselabs.xdiagram.dsl.XDiagram;
import org.osgi.framework.Bundle;

public class LanguageProvider implements GraphicsProvider {

	private String modelFilePath;
	private XDiagram model;

	private FeatureHandlerChain featureChain;

	private ContainsHandler containsHandler;

	public LanguageProvider() {
		containsHandler = new ContainsHandler();

		featureChain = new FeatureHandlerChain()
		.add(new ColorHandler())
		.add(new SizeHandler())
		.add(new PositionHandler())
		.add(new LineWidthHandler())
		.add(new PointHandler())
		.add(new TextValueHandler())
		
		.add(containsHandler)
		.add(new AnchorHandler());
	}

	@Override
	public void setup(Map<String, String> properties) throws ProviderException {		
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();

		modelFilePath = properties.get("file");
		if(!new File(modelFilePath).exists())
			throw new ProviderException("File not found: " + modelFilePath);

		loadModel();
	}

	private void loadModel() throws ProviderException {

		try{			
			ResourceSet rs = new ResourceSetImpl();

			//String path = "/" + bundle.getSymbolicName() + "/" + file;
			//URI uri = URI.createPlatformPluginURI(path, false);	
			//String uri = bundle.getResource(file).toString().replace("\\", "/");
			//String uri = Platform.getBundle(namespace).getResource(recource).toString();
			//			String uri = file;
			URI uri = URI.createFileURI(modelFilePath);

			//			resource = rs.getResource(URI.createURI(uri), true);
			Resource resource = rs.getResource(uri, true);

			List<EObject> objs = resource.getContents();
			this.model = (XDiagram) objs.get(0);
			//			String importUri = this.model.getMetamodel().getImportURI();
			//			ePackage = EPackage.Registry.INSTANCE.getEPackage(this.model.getModel());	

			// TODO: Eduardo
			//			FigureProvider.setStyles(this.model.getStyles());
			//			NodeProvider.registerNodeImages(properties, bundle, this.model.getNodes());
		}
		catch(Exception e){
			throw new ProviderException("Could not load language model:" + e.getMessage());
		}
	}

	private static boolean equals(EClass a, EClass b) {
		return a.getName().equals(b.getName());
	}

	private Node match(EClass c) {
		for(Node node : model.getNodes())
			if (equals(node.getModelClass(), c))
				return node;
		return null;
	}

	@Override
	public EClass getRoot(EPackage ePackage) {
		return (EClass) ePackage.getEClassifier(this.model.getModelClass().getName());
	}


	@Override
	public boolean canAddChild(ContainerShape container, EClass eClass, int x, int y) {
		if(!containsHandler.isContainer( container)) {
			return false;
		}

		for(EReference r: containsHandler.getReferences(container))
			if(((EClass) r.getEType()).isSuperTypeOf(eClass))
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

		for(Shape shape : diagram.getChildren()) {
			updateLinked((ContainerShape) shape, diagram);
		}
	}

	public void updateLinked(ContainerShape shape, Diagram diagram) {
		PictogramLink link = shape.getLink();
		EObject eObject = (EObject) link.getBusinessObjects().get(0);
		Node node = matchNode(eObject.eClass());
		updateElement(node.getMainFigure(), eObject, shape, diagram);
	}

	private void updateElement(ConnectableElement e, EObject o, ContainerShape s, Diagram diagram) {
		featureChain.update(e, o, diagram, s.getGraphicsAlgorithm(), s);

		List<ConnectableElement> childrenElements = e.getChildren();
		List<Shape> childrenShapes = ((ContainerShape) s).getChildren();

		for(int i = 0; i < childrenShapes.size(); i++) {
			if(childrenShapes.get(i).getLink() != null)
				updateLinked((ContainerShape) childrenShapes.get(i), diagram);
			else
				updateElement(childrenElements.get(i), o, (ContainerShape) childrenShapes.get(i), diagram);
		}

	}




	private Node matchNode(EClass eClass) {
		for (Node node : model.getNodes())
			if (equals(node.getModelClass(), eClass))
				return node;

		return null;
	}

	@Override
	public GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject) {
		GraphicsAlgorithm nodeFigure = null;

		Node node = matchNode(eObject.eClass());
		ConnectableElement mainFig = node.getMainFigure();
		nodeFigure = ElementCreation.createNodeFigure(mainFig, diagram, container);
		featureChain.update(mainFig, eObject, diagram, nodeFigure, container);

		for(ConnectableElement child : mainFig.getChildren())
			addChildren(child, container, diagram, eObject);

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
		}
		else {
			childContainer = Graphiti.getPeCreateService().createContainerShape((ContainerShape) container, isActive);
		}

		GraphicsAlgorithm childFigure =  ElementCreation.createNodeFigure(element, diagram, childContainer);
		featureChain.update(element, eObject, diagram, childFigure, childContainer);

//		Graphiti.getGaLayoutService().setLocation(childFigure, -2, -2);
		
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

	//	public static boolean isContainer(ConnectableElement element) {
	//		for(Feature f : element.getFeatures())
	//			if(f instanceof Contains)
	//				return true;
	//
	//		return false;
	//	}






	//	private void handleAnchors(Diagram diagram, ContainerShape container, EObject eObject,
	//			GraphicsAlgorithm nodeFigure, Node node) {
	//
	//		if (node.getAnchors().size()==0){
	//			ChopboxAnchor boxAnchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
	//			GraphicsAlgorithm nodeAnchor = Graphiti.getGaService().createInvisibleRectangle(boxAnchor);
	//			//			FigureProperty.PARENT.set(nodeAnchor, node.getModelClass().getName());
	//		}
	//
	//
	//		int anchor_left = 0;
	//		int anchor_right = 0;
	//		int anchor_down = 0;
	//		int anchor_up = 0;
	//
	//
	//		for (org.eclipselabs.xdiagram.dsl.Anchor anchor : node.getAnchors()) {
	//
	//			GraphicsAlgorithm nodeAnchor = null;
	//
	//			if (anchor.getFigures().size()==0){
	//
	//				ChopboxAnchor boxAnchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
	//				nodeAnchor = Graphiti.getGaService().createInvisibleRectangle(boxAnchor);
	//
	//			}else{
	//
	//				FixPointAnchor boxAnchor = 
	//						Graphiti.getPeCreateService().createFixPointAnchor(container);				      
	//				boxAnchor.setLocation(Graphiti.getGaService().createPoint(0, 0)); //use golden section
	//				//boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
	//				boxAnchor.setReferencedGraphicsAlgorithm(nodeFigure);
	//
	//				nodeAnchor = Graphiti.getGaService().createInvisibleRectangle(boxAnchor);
	//
	//				//			ConnectableElement e = node.getFigures().get(0).getElement();
	//				ConnectableElement e = node.getMainFigure();
	//
	//				// TODO: Eduardo
	//				//			GraphicsAlgorithm figure = nodeHandler.createNodeFigure(e, diagram, nodeAnchor, nodeFigure, eObject);
	//
	//				// TODO: to feature handler
	//				nodeAnchor.setTransparency(1.0);
	//			}
	//		}
	//
	//		// TODO: Eduardo
	//		//				int horizontal =  bounds.width-bounds.x;
	//		//				int vertical = bounds.height-bounds.y;
	//		//	
	//		//				Graphiti.getGaService().setLocationAndSize(nodeAnchor, bounds.x, bounds.y, horizontal, vertical);
	//		//				FigureProperty.setProperties(nodeAnchor);
	//
	//
	//
	//		//				int value = 0;	
	//		//				FigureProperty.ANCHOR_HORIZ.set(nodeAnchor, anchor.getFormatX());
	//		//				value = -anchor.getX();
	//		//				if (anchor.getPassX()!=null && anchor.getPassX().equals("-"))
	//		//					value = -value;
	//		//				if (anchor.getFormatX().equals("%") && value<0)
	//		//					value = -value;
	//		//				FigureProperty.FORMAT.set(nodeAnchor, Integer.toString(value));
	//		//				if (anchor.getFormatX().equals("lf") && value>anchor_left)
	//		//					anchor_left = value;
	//		//				if (anchor.getFormatX().equals("rg") && value>anchor_right)
	//		//					anchor_right = value;
	//		//	
	//		//				FigureProperty.ANCHOR_VERT.set(nodeAnchor, anchor.getFormatY());
	//		//				value = -anchor.getY();
	//		//				if (anchor.getPassY()!=null && anchor.getPassY().equals("-"))
	//		//					value = -value;
	//		//				if (anchor.getFormatY().equals("%") && value<0)
	//		//					value = -value;
	//		//				FigureProperty.VERTICAL.set(nodeAnchor, value);
	//		//				if (anchor.getFormatY().equals("up") && value>anchor_up)
	//		//					anchor_up = value;
	//		//				if (anchor.getFormatY().equals("dw") && value>anchor_down)
	//		//					anchor_down = value;	
	//		//	
	//		////				Graphiti.getGaService().setLocationAndSize(nodeAnchor, 
	//		////						bounds.x, bounds.y, bounds.width, bounds.height);
	//		//				
	//		//			}
	//		//			
	//		//			
	//		//			FigureProperty.PARENT.set(nodeAnchor, node.getModelClass().getName());
	//		//			
	//		//			String incoming = expressionSeparator;
	//		//			String outgoing = expressionSeparator;
	//		//			for (AnchorConstraint arrow : anchor.getConstraints()){
	//		//				if ("both".equalsIgnoreCase(arrow.getType()) || "incoming".equalsIgnoreCase(arrow.getType()))
	//		//					incoming += arrow.getReference() + expressionSeparator;
	//		//				if ("both".equalsIgnoreCase(arrow.getType()) || "outgoing".equalsIgnoreCase(arrow.getType()))
	//		//					outgoing += arrow.getReference() + expressionSeparator;
	//		//			}
	//		//			if (incoming.length()==1 && outgoing.length()==1)
	//		//				incoming = outgoing = null;
	//		//			FigureProperty.ANCHOR_INCOMING.set(nodeAnchor, incoming);
	//		//			FigureProperty.ANCHOR_OUTGOING.set(nodeAnchor, outgoing);
	//		//			
	//		//		}
	//		//
	//		//
	//		//		FigureProperty.ANCHOR_UP.set(nodeFigure, anchor_up);
	//		//		FigureProperty.ANCHOR_LEFT.set(nodeFigure, anchor_left);
	//		//		FigureProperty.ANCHOR_DOWN.set(nodeFigure, anchor_down);
	//		//		FigureProperty.ANCHOR_RIGHT.set(nodeFigure, anchor_right);
	//		//
	//		//		
	//		//		if (anchor_left+anchor_right+anchor_up+anchor_down>0)
	//		//			resizeNodeFigure(diagram, container, 
	//		//					nodeFigure.getWidth()+anchor_left+anchor_right, 
	//		//					nodeFigure.getHeight()+anchor_up+anchor_down);
	//	}

	//	@Override
	//	public void updateNodeFigure(Diagram diagram, ContainerShape container, GraphicsAlgorithm figure, EObject eObject) {
	//		nodeHandler.updateNodeFigure(null, diagram, container, null, eObject);
	//	}

	@Override
	public void resizeNodeFigure(Diagram diagram, ContainerShape container, int width, int height) {
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
		//TODO
		return true;
	}

	@Override
	public boolean canMoveNodeFigure(GraphicsAlgorithm figure) {
		//TODO: Eduardo
		//		String value = FigureProperty.CAN_MOVE.get(figure);
		//		return value==null || value.equals("1");
		return true;
	}



	@Override
	public boolean canEditFigureLabel(GraphicsAlgorithm figure, EObject eObject) {
		Node node = match(eObject.eClass());
		ConnectableElement element  = node.getMainFigure();

		// TODO
		//	for(NodeFigure f : node.getFigures()) {
		//		if(f.getElement() instanceof Label && ((Label) f.getElement()).isEditable()) {
		//			return true;
		//		}

		return element instanceof Label && ((Label) element).isEditable();
		//	return "1".equals(FigureProperty.CAN_EDIT.get(figure));
	}	

	@Override
	public EAttribute getTextEditableAttribute(EClass eClass) {
		Node node = match(eClass);

		// TODO
		//	for(NodeFigure fig : node.getFigures()) {
		//		if(fig.getElement() instanceof Label && ((Label) fig.getElement()).isEditable()) {
		//			for(Feature f : ((Label) fig.getElement()).getFeatures())
		//				if(f instanceof TextValue && ((TextValue) f).getModelAttribute() != null)
		//					return match(eClass, ((TextValue) f).getModelAttribute());
		//		}
		//	}
		ConnectableElement element  = node.getMainFigure();
		for(Feature f : element.getFeatures())
			if(f instanceof TextValue && ((TextValue) f).getModelAttribute() != null)
				return match(eClass, ((TextValue) f).getModelAttribute());


		return null;
	}

	private EAttribute match(EClass eClass, EAttribute att) {
		for(EAttribute a : eClass.getEAllAttributes())
			if(a.getName().equals(att.getName()))
				return a;

		return null;
	}

	//	@Override
	//	public String getFigureLabelValue(GraphicsAlgorithm figure) {
	//		if (FigureProperty.TEXT_ATTR.get(figure)!=null)
	//			return FigureProperty.TEXT_VALUE.get(figure);
	//		return FigureProperty.TEXT.get(figure);
	//	}

	//	@Override
	//	public void updateFigureLabel(Diagram diagram, GraphicsAlgorithm figure, String value) {
	// TODO: Eduardo
	//		setLabelValue(figure, value);
	//		Object container = getContainerObject(figure);
	//		if (container instanceof ContainerShape)
	//			nodeProvider.updateNodeFigure(diagram, (ContainerShape)container);
	//		else if (container instanceof Connection)
	//			LinkProvider.updateLinkConnection(diagram, (Connection)container);
	//	}

	//	@Override
	//	public GraphicsAlgorithm getFigureLabel(Diagram diagram, ContainerShape container) {
	//		
	//		return null;
	//		// TODO: Eduardo
	//		//		return FigureProvider.getTextFigure(container);
	//	}



	@Override
	public Connection getConnectionFigure(Diagram diagram, Anchor source, Anchor target, EObject eObject) {
		Connection connection = null;

		// TODO: refactor
		for (Link link : model.getLinks()){
			boolean isLink = link.isComplex() && eObject != null && equals(link.getModelClass(), eObject.eClass());

			if (!isLink && !link.isComplex() && eObject == null) {
				EClass owner = (EClass) link.getModelReference().eContainer();

				for(Node node : model.getNodes()) {
					EClass c = node.getModelClass();
					if(equals(c, owner)) {
						for (EReference ref : c.getEAllReferences()) {
							EReference r = link.getModelReference();
							if(ref.getName().equals(r.getName())) {
								isLink = true;
							}
						}
					}
				}
			}

			if (isLink){
				connection = Graphiti.getPeCreateService().createFreeFormConnection(diagram);

				// link.isManhattan() ?  Graphiti.getPeCreateService().createManhattanConnection(diagram) :


				GraphicsAlgorithm connectionLink = createLinkConnection(link, diagram, connection, eObject);

				//TODO: Eduardo			
				//				if (link.getAttributes().size()>0)
				//					setAttributesValue(link.getAttributes(), eObject);


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

				break;
			}
		}

		if (connection == null) {
			connection = Graphiti.getPeCreateService().createFreeFormConnection(diagram);
			Graphiti.getGaService().createPlainPolyline(connection);
		}

		connection.setStart(source);
		connection.setEnd(target);

		return connection;
	}

	private GraphicsAlgorithm createLinkConnection(Link link, Diagram diagram, Connection connection, EObject eObject) {
		Polyline linkConnector = Graphiti.getGaService().createPlainPolyline(connection);
		featureChain.update(link, eObject, diagram, linkConnector, diagram);
		return linkConnector;
	}


	//	@Override
	//	public void updateLinkFigure(Diagram diagram, Connection connection) {
	//		linkHandler.updateLinkConnection(null, diagram, connection);
	//	}


	@Override
	public boolean hasTool(EClass eClass) {
		for(Link link : model.getLinks()) {
			if (link.isComplex() && equals(link.getModelClass(), eClass)) // review
				return false;				
		}

		for(Node node : model.getNodes()) {
			if(equals(node.getModelClass(), eClass))
				return true;
		}

		return false;
	}


	@Override
	public boolean hasTool(EReference eReference) {		
		EClass parent = (EClass)eReference.eContainer();
		EList<Link> links = this.model.getLinks();
		for (Link link : links) {
			if (link.isComplex() && equals(link.getModelClass(), parent))
				return false;
			else if(!link.isComplex() && equals((EClass) link.getModelReference().eContainer(), (EClass) eReference.eContainer()))
				return true;
		}

		return false;
	}

	@Override
	public boolean isLink(EClass eClass) {		
		EList<Link> links = this.model.getLinks();
		for (Link link : links){
			if (link.isComplex() && equals(link.getModelClass(), eClass) ) 
				return true;				
		}
		return false;
	}

	//	public boolean canSetConnection(Anchor anchor, EReference eReference, FigureProperty feature) {
	//		GraphicsAlgorithm ga = anchor.getGraphicsAlgorithm();		
	//		String arrows = Graphiti.getPeService().getPropertyValue(ga, feature.toString());
	//		if (arrows == null || arrows.length()==0)
	//			return true;
	//		return arrows.contains(expressionSeparator + eReference.getName() + expressionSeparator); 
	//	}	

	@Override
	public boolean isValidOutgoingConnection(Anchor anchor, EReference eReference) {
		//TODO:Eduardo
		return true;
		//		return anchor instanceof ChopboxAnchor || (anchor.getOutgoingConnections().size()>=0 &&
		//				canSetConnection(anchor, eReference, ANCHOR_OUTGOING));
	}

	@Override
	public boolean isValidIncomingConnection(Anchor anchor, EReference eReference) {
		//TODO:Eduardo
		return true;
		//		return anchor instanceof ChopboxAnchor || (anchor.getIncomingConnections().size()>=0 &&
		//				canSetConnection(anchor, eReference, ANCHOR_INCOMING));
	}

	@Override
	public EReference getLinkTarget(EClass eClass) {		
		return getLink(false, eClass);
	}

	private EReference getLink(boolean source, EClass eClass) {		
		EList<Link> links = this.model.getLinks();
		for (Link link : links)
			if (link.isComplex() && equals(link.getModelClass(), eClass)){
				String nlink = source ? link.getSourceReference().getName() : link.getTargetReference().getName();
				for (EReference ref : eClass.getEReferences())
					if (nlink.equals(ref.getName()))
						return ref;
			}
		return null;
	}

	@Override
	public boolean isProperty(EStructuralFeature feature) {
		return true;
	}


}
