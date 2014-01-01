package org.eclipselabs.xdiagram.provider;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.io.File;
import java.util.HashMap;
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
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
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
import org.eclipse.graphiti.util.ILocationInfo;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.provider.handlers.ColorHandler;
import org.eclipselabs.xdiagram.provider.handlers.ConnectableElementHandler;
import org.eclipselabs.xdiagram.provider.handlers.ConnectableElementHandlerChain;
import org.eclipselabs.xdiagram.provider.handlers.ContainsHand;
import org.eclipselabs.xdiagram.provider.handlers.EllipseHandler;
import org.eclipselabs.xdiagram.provider.handlers.FeatureHandler;
import org.eclipselabs.xdiagram.provider.handlers.FeatureHandlerChain;
import org.eclipselabs.xdiagram.provider.handlers.LabelHandler;
import org.eclipselabs.xdiagram.provider.handlers.LineWidthHandler;
import org.eclipselabs.xdiagram.provider.handlers.PointHandler;
import org.eclipselabs.xdiagram.provider.handlers.PolylineHandler;
import org.eclipselabs.xdiagram.provider.handlers.PositionHandler;
import org.eclipselabs.xdiagram.provider.handlers.RectangleHandler;
import org.eclipselabs.xdiagram.provider.handlers.SizeHandler;
import org.eclipselabs.xdiagram.provider.handlers.TextValueHandler;
import org.eclipselabs.xdiagram.provider.handlers.Util;
import org.eclipselabs.xdiagram.xtext.XDiagramStandaloneSetup;
import org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Label;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer;
import org.eclipselabs.xdiagram.xtext.xdiagram.TextValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram;
import org.osgi.framework.Bundle;

import static org.eclipselabs.xdiagram.provider.Constants.*;

public class LanguageProvider implements GraphicsProvider {

	private Resource resource;
	private XDiagram model;
	//	private EPackage ePackage;

	private ConnectableElementHandler nodeHandler;
	private FeatureHandlerChain featureChain;
	//	private DefaultLinkHandler linkHandler;

	private ContainsHand containsHandler;

	public LanguageProvider() {
		containsHandler = new ContainsHand();

		featureChain = new FeatureHandlerChain()
		.add(new ColorHandler())
		.add(new SizeHandler())
		.add(new PositionHandler())
		.add(new LineWidthHandler())
		.add(new PointHandler())
		.add(new TextValueHandler())
		.add(containsHandler);


		nodeHandler = new ConnectableElementHandlerChain(featureChain)
		.add(new RectangleHandler())
		.add(new EllipseHandler())
		.add(new LabelHandler())
		.add(new PolylineHandler());


		//		linkHandler = new DefaultLinkHandler();

	}

	@Override
	public void setup(String diagramType, Map<String, String> properties, Bundle bundle) throws ProviderException {		
		new XDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();		
		String file = properties.get("file");
		if(!new File(file).exists())
			throw new ProviderException("File not found: " + file);

		try{			
			ResourceSet rs = new ResourceSetImpl();

			//String path = "/" + bundle.getSymbolicName() + "/" + file;
			//URI uri = URI.createPlatformPluginURI(path, false);	
			//String uri = bundle.getResource(file).toString().replace("\\", "/");
			//String uri = Platform.getBundle(namespace).getResource(recource).toString();
			//			String uri = file;
			URI uri = URI.createFileURI(file);

			//			resource = rs.getResource(URI.createURI(uri), true);
			resource = rs.getResource(uri, true);

			List<EObject> objs = resource.getContents();
			this.model = (XDiagram) objs.get(0);
			//			String importUri = this.model.getMetamodel().getImportURI();
			//			ePackage = EPackage.Registry.INSTANCE.getEPackage(this.model.getModel());	

			// TODO: Eduardo
			//			FigureProvider.setStyles(this.model.getStyles());
			//			NodeProvider.registerNodeImages(properties, bundle, this.model.getNodes());
		}
		catch(Exception e){
			throw new ProviderException("Could not create resource model for '" + diagramType + "': " + e.getMessage());
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
		//		return this.model.getModelClass();
	}


	@Override
	public boolean canAddChild(ContainerShape container, EClass eClass, int x, int y) {

		//		ILocationInfo loc = Graphiti.getPeLayoutService().getLocationInfo(container, x, y);
		//		Shape child = loc.getShape();
		//		System.out.println("LOC " + child);
		if(!containsHandler.isContainer( container)) {
			System.out.println("NOT " + container);

			return false;
		}

		EReference ref = containsHandler.getReference(container);
		return ((EClass) ref.getEType()).isSuperTypeOf(eClass);
	}


	@Override
	public EReference getContainerReference(ContainerShape container) {
		return containsHandler.isContainer(container) ? containsHandler.getReference(container) : null;
	}

	@Override
	public EObject getContainerObject(ContainerShape container) {
		return containsHandler.isContainer(container) ? containsHandler.getOwner(container) : null;
	}

	@Override
	public void update(PictogramElement e, EObject o, Diagram diagram) {
		for(Shape shape : diagram.getChildren())
			updateObject(diagram, diagram, shape, null, null);
	}

	// first is never null
	private void updateObject(Diagram diagram, ContainerShape container, Shape shape, EObject parent, ConnectableElement element) {
		PictogramLink link = shape.getLink();
		EObject eObject = null;
		ConnectableElement ce = null;
		if(link != null) {
			eObject = (EObject) link.getBusinessObjects().get(0);
			Node node = matchNode(eObject.eClass());
			ce = node.getMainFigure();
			featureChain.update(ce, eObject, diagram, shape.getGraphicsAlgorithm(), container);
		}
		else {
			featureChain.update(element, parent, diagram, shape.getGraphicsAlgorithm(), container);
		}
		
		
		if(shape instanceof ContainerShape && ce != null) {
			List<ConnectableElement> childrenElements = ce.getChildren();
			List<Shape> childrenShapes = ((ContainerShape) shape).getChildren();
			
			for(int i = 0; i < childrenElements.size(); i++) {
				EObject o = eObject == null ? parent : eObject;
				updateObject(diagram, (ContainerShape) shape, childrenShapes.get(i), o , childrenElements.get(i));
			
			}
			
//			for(Shape childShape : ((ContainerShape) shape).getChildren()) {
//				updateObject(diagram, (ContainerShape) shape, childShape, eObject == null ? parent : eObject, element);
//			}
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
		Point location = new Point(context.getX(), context.getY());

		for (Node node : model.getNodes()) {
			if (equals(node.getModelClass(), eObject.eClass())){
				ConnectableElement mainFig = node.getMainFigure();
				// interperter links this
				nodeFigure = nodeHandler.createNodeFigure(mainFig, diagram, container, nodeFigure, eObject);

				featureChain.update(mainFig, eObject, diagram, nodeFigure, container);

				addChildren(mainFig, container, diagram, eObject);

				//TODO:Eduardo
				handleAnchors(diagram, container, eObject, nodeFigure, node);
			}
		}

		if (nodeFigure == null){
			nodeFigure = Graphiti.getGaService().createImage(container, null);
			Graphiti.getGaService().setLocationAndSize(nodeFigure, location.x, location.y, 100, 50);		
		}

		return nodeFigure;		
	}



	private void addChildren(ConnectableElement element, ContainerShape container, Diagram diagram, EObject eObject) {
		for(ConnectableElement child : element.getChildren()) {
			//			ConnectableElement element = child.getElement();
			ContainerShape childContainer = Graphiti.getPeCreateService().createContainerShape(container, false);
			GraphicsAlgorithm childFigure = nodeHandler.createNodeFigure(child, diagram, childContainer, null, eObject);
			featureChain.update(child, eObject, diagram, childFigure, childContainer);

			addChildren(child, childContainer, diagram, eObject);

			//TODO: has contains?
			//			if(element.getChildren().isEmpty()) {
			//				Shape shape = Graphiti.getPeCreateService().createShape(container, false);
			//				GraphicsAlgorithm childFigure = nodeHandler.createNodeFigure(element, diagram, shape, null, eObject);
			//			}
			//			else {
			//				
			//			}
		}
	}








	//private Map<ContainerShape, EReference> containers = new HashMap<>();

	//private void handleContainers(Diagram diagram, ContainerShape container, EObject eObject,
	//		GraphicsAlgorithm nodeFigure, Node node) {
	//
	//	int remaining = 100;
	//	int count = 0;
	//	for (NodeContainer cont : node.getContainers()){
	//
	//		ContainerShape containerShape = Graphiti.getPeCreateService().createContainerShape(container, false);
	//		EReference ref = (EReference) Util.matchFeature(eObject.eClass(), cont.getModelReference());
	//		containers.put(containerShape, ref);
	//		System.out.println("PARENT " + container);
	//		System.out.println("CONT " + containerShape);
	//		//			GraphicsAlgorithm nodeContainer = Graphiti.getGaService().createInvisibleRectangle(containerShape);
	//
	//		ConnectableElement e = cont.getFigures().get(0).getElement();
	//
	//		GraphicsAlgorithm fig = nodeHandler.createNodeFigure(e, diagram, containerShape, nodeFigure, eObject);
	//
	//
	//		//			EClass childClass = (EClass) cont.getModelReference().getEType();
	//
	//		//			FigureProperty.setProperties(nodeContainer, obj== null ? this.model.getName() : obj );
	//		//			FigureProperty.setProperties(nodeContainer, obj== null ? this.model.getModelClass().getName() : obj );
	//		//			FigureProperty.setProperties(nodeContainer, childClass== null ? this.model.getModelClass().getName() : childClass.getName());
	//
	//		//			FigureProperty.TYPE.set(nodeContainer, cont.getLayout());
	//
	//		//			if (nodecontainer.getFormat()==null){
	//		//				FigureProperty.VERTICAL.set(nodeContainer, vertical);
	//		//				FigureProperty.FORMAT.set(nodeContainer, "px");
	//		//				count++;
	//		//			}else if (nodecontainer.getFormat().equals("%")){
	//		//				vertical = 0;
	//		//				if (remaining>nodecontainer.getValue()){
	//		//					vertical = nodecontainer.getValue();
	//		//					remaining -= vertical;
	//		//				}else{
	//		//					vertical = remaining;
	//		//					remaining = 0;
	//		//				}
	//		//				FigureProperty.VERTICAL.set(nodeContainer, vertical);
	//		//				FigureProperty.FORMAT.set(nodeContainer, "%");
	//		//			}else{
	//		//				FigureProperty.VERTICAL.set(nodeContainer, nodecontainer.getValue());
	//		//				FigureProperty.FORMAT.set(nodeContainer, "px");
	//		//			}					
	//
	//	}
	//
	//	//		if (count>0){
	//	//			int part = remaining / count;
	//	//			for (GraphicsAlgorithm figure : nodeFigure.getGraphicsAlgorithmChildren()){
	//	//				if (FigureProperty.VERTICAL.get(figure).length()==0)
	//	//					FigureProperty.VERTICAL.set(figure, part);						
	//	//			}
	//	//		}
	//}



	private void handleAnchors(Diagram diagram, ContainerShape container, EObject eObject,
			GraphicsAlgorithm nodeFigure, Node node) {

		if (node.getAnchors().size()==0){
			ChopboxAnchor boxAnchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
			GraphicsAlgorithm nodeAnchor = Graphiti.getGaService().createInvisibleRectangle(boxAnchor);
			//			FigureProperty.PARENT.set(nodeAnchor, node.getModelClass().getName());
		}


		int anchor_left = 0;
		int anchor_right = 0;
		int anchor_down = 0;
		int anchor_up = 0;


		for (org.eclipselabs.xdiagram.xtext.xdiagram.Anchor anchor : node.getAnchors()) {

			GraphicsAlgorithm nodeAnchor = null;

			if (anchor.getFigures().size()==0){

				ChopboxAnchor boxAnchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
				nodeAnchor = Graphiti.getGaService().createInvisibleRectangle(boxAnchor);

			}else{

				FixPointAnchor boxAnchor = 
						Graphiti.getPeCreateService().createFixPointAnchor(container);				      
				boxAnchor.setLocation(Graphiti.getGaService().createPoint(0, 0)); //use golden section
				//boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
				boxAnchor.setReferencedGraphicsAlgorithm(nodeFigure);

				nodeAnchor = Graphiti.getGaService().createInvisibleRectangle(boxAnchor);

				//			ConnectableElement e = node.getFigures().get(0).getElement();
				ConnectableElement e = node.getMainFigure();

				// TODO: Eduardo
				//			GraphicsAlgorithm figure = nodeHandler.createNodeFigure(e, diagram, nodeAnchor, nodeFigure, eObject);

				// TODO: to feature handler
				nodeAnchor.setTransparency(1.0);
			}
		}

		// TODO: Eduardo
		//				int horizontal =  bounds.width-bounds.x;
		//				int vertical = bounds.height-bounds.y;
		//	
		//				Graphiti.getGaService().setLocationAndSize(nodeAnchor, bounds.x, bounds.y, horizontal, vertical);
		//				FigureProperty.setProperties(nodeAnchor);



		//				int value = 0;	
		//				FigureProperty.ANCHOR_HORIZ.set(nodeAnchor, anchor.getFormatX());
		//				value = -anchor.getX();
		//				if (anchor.getPassX()!=null && anchor.getPassX().equals("-"))
		//					value = -value;
		//				if (anchor.getFormatX().equals("%") && value<0)
		//					value = -value;
		//				FigureProperty.FORMAT.set(nodeAnchor, Integer.toString(value));
		//				if (anchor.getFormatX().equals("lf") && value>anchor_left)
		//					anchor_left = value;
		//				if (anchor.getFormatX().equals("rg") && value>anchor_right)
		//					anchor_right = value;
		//	
		//				FigureProperty.ANCHOR_VERT.set(nodeAnchor, anchor.getFormatY());
		//				value = -anchor.getY();
		//				if (anchor.getPassY()!=null && anchor.getPassY().equals("-"))
		//					value = -value;
		//				if (anchor.getFormatY().equals("%") && value<0)
		//					value = -value;
		//				FigureProperty.VERTICAL.set(nodeAnchor, value);
		//				if (anchor.getFormatY().equals("up") && value>anchor_up)
		//					anchor_up = value;
		//				if (anchor.getFormatY().equals("dw") && value>anchor_down)
		//					anchor_down = value;	
		//	
		////				Graphiti.getGaService().setLocationAndSize(nodeAnchor, 
		////						bounds.x, bounds.y, bounds.width, bounds.height);
		//				
		//			}
		//			
		//			
		//			FigureProperty.PARENT.set(nodeAnchor, node.getModelClass().getName());
		//			
		//			String incoming = expressionSeparator;
		//			String outgoing = expressionSeparator;
		//			for (AnchorConstraint arrow : anchor.getConstraints()){
		//				if ("both".equalsIgnoreCase(arrow.getType()) || "incoming".equalsIgnoreCase(arrow.getType()))
		//					incoming += arrow.getReference() + expressionSeparator;
		//				if ("both".equalsIgnoreCase(arrow.getType()) || "outgoing".equalsIgnoreCase(arrow.getType()))
		//					outgoing += arrow.getReference() + expressionSeparator;
		//			}
		//			if (incoming.length()==1 && outgoing.length()==1)
		//				incoming = outgoing = null;
		//			FigureProperty.ANCHOR_INCOMING.set(nodeAnchor, incoming);
		//			FigureProperty.ANCHOR_OUTGOING.set(nodeAnchor, outgoing);
		//			
		//		}
		//
		//
		//		FigureProperty.ANCHOR_UP.set(nodeFigure, anchor_up);
		//		FigureProperty.ANCHOR_LEFT.set(nodeFigure, anchor_left);
		//		FigureProperty.ANCHOR_DOWN.set(nodeFigure, anchor_down);
		//		FigureProperty.ANCHOR_RIGHT.set(nodeFigure, anchor_right);
		//
		//		
		//		if (anchor_left+anchor_right+anchor_up+anchor_down>0)
		//			resizeNodeFigure(diagram, container, 
		//					nodeFigure.getWidth()+anchor_left+anchor_right, 
		//					nodeFigure.getHeight()+anchor_up+anchor_down);
	}

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

		nodeHandler.removeContainerFigures(null, diagram, figure);
	}

	@Override
	public boolean canResizeNodeFigure(EObject eObject) {

		for(Node node : model.getNodes())
			if (equals(node.getModelClass(), eObject.eClass()) && node.isResizable())
				return true;

		return false;
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
				connection = link.isManhattan() ? Graphiti.getPeCreateService().createManhattanConnection(diagram) :
					Graphiti.getPeCreateService().createFreeFormConnection(diagram);

				GraphicsAlgorithm connectionLink = createLinkConnection(link, diagram, connection, eObject);

				//TODO: Eduardo			
				//				if (link.getAttributes().size()>0)
				//					setAttributesValue(link.getAttributes(), eObject);


				//TODO: Eduardo
				for (Decorator decorator: link.getDecorators()) {
					ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, 
							false, (double) decorator.getPosition()/100.0, true);

					if (decorator.getStaticElement() != null) {

						nodeHandler.createNodeFigure(decorator.getStaticElement(), diagram, cd, connectionLink, eObject);

						//						linkHandler.createLinkFigure((Link) eObject, diagram, cd, decorator.getPlacingStatic(), link.getStyle());

					}
					else {
						Label label = decorator.getLabel();
						nodeHandler.createNodeFigure(label, diagram, cd, connectionLink, null);
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

		for(Feature f : link.getFeatures())
			for(FeatureHandler fh : featureChain)
				if(fh.accept(link, f))
					fh.handle(link, f, linkConnector, diagram, eObject, null);

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
