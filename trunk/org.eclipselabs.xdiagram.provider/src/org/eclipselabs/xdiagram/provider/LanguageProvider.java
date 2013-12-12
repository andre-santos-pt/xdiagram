package org.eclipselabs.xdiagram.provider;

import static org.eclipselabs.xdiagram.provider.internal.FigureProperty.ANCHOR_INCOMING;
import static org.eclipselabs.xdiagram.provider.internal.FigureProperty.ANCHOR_OUTGOING;
import static org.eclipselabs.xdiagram.provider.internal.FigureProvider.createImageFigure;
import static org.eclipselabs.xdiagram.provider.internal.FigureProvider.getContainerObject;
import static org.eclipselabs.xdiagram.provider.internal.FigureProvider.getLineSyle;
import static org.eclipselabs.xdiagram.provider.internal.FigureProvider.minValue;
import static org.eclipselabs.xdiagram.provider.internal.FigureProvider.setAttributesValue;
import static org.eclipselabs.xdiagram.provider.internal.FigureProvider.setLabelValue;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.provider.internal.FigureProperty;
import org.eclipselabs.xdiagram.provider.internal.FigureProvider;
import org.eclipselabs.xdiagram.provider.internal.FigureProvider.ColorProperty;
import org.eclipselabs.xdiagram.provider.internal.FigureProvider.IntegerProperty;
import org.eclipselabs.xdiagram.provider.internal.LinkProvider;
import org.eclipselabs.xdiagram.provider.internal.NodeProvider;
import org.eclipselabs.xdiagram.xtext.XDiagramStandaloneSetup;
import org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer;
import org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram;
import org.osgi.framework.Bundle;


public class LanguageProvider implements GraphicsProvider {
	
	private Resource resource;
	private XDiagram model;
//	private EPackage ePackage;

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
			
			FigureProvider.setStyles(this.model.getStyles());
			NodeProvider.registerNodeImages(properties, bundle, this.model.getNodes());
		}
		catch(Exception e){
			throw new ProviderException("Could not create resource model for '" + diagramType + "': " + e.getMessage());
		}
	}

	private static boolean equals(EClass a, EClass b) {
		return a.getName().equals(b.getName());
	}

	@Override
	public EClass getRoot(EPackage ePackage) {
		System.out.println("--> recouce model name: " + this.model.getModelClass().getName());
		
		return (EClass) ePackage.getEClassifier(this.model.getModelClass().getName());
//		return this.model.getModelClass();
	}


	@Override
	public GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject) {
		GraphicsAlgorithm nodeFigure = null;
		Point location = new Point(context.getX(), context.getY());
		EList<Node> nodes = this.model.getNodes();

		for (Node node : nodes){
			if (equals(node.getModelClass(), eObject.eClass())){
				
				Rectangle bounds = new Rectangle(0, 0, minValue, minValue);
				nodeFigure = createImageFigure(container, node.getIcon(), bounds);
				NodeProvider.createNodeFigure(diagram, container, eObject, nodeFigure, 
						node.getFigures(), bounds, node.getStyle());
				
				Graphiti.getGaService().setLocationAndSize(nodeFigure, 
						location.x+bounds.x, location.y+bounds.y, bounds.width, bounds.height);	
				FigureProperty.CAN_RESIZE.set(nodeFigure, node.isResizable() ? "1" : "0");
				FigureProvider.setAttributesValue(node.getAttributes(), eObject);
				FigureProperty.setProperties(nodeFigure);

				handleContainers(diagram, container, eObject, nodeFigure, node);
				handleAnchors(diagram, container, eObject, nodeFigure, node);
				
			}
		}

		if (nodeFigure==null){
			nodeFigure = Graphiti.getGaService().createImage(container, null);
			Graphiti.getGaService().setLocationAndSize(nodeFigure, 
					location.x, location.y, 100, 50);		
			FigureProperty.setProperties(nodeFigure);
		}


		if(!(context.getTargetContainer() instanceof Diagram))
			NodeProvider.updateContainerFigures(eObject, context.getTargetContainer(), nodeFigure);
		
		return nodeFigure;		
		
	}
	

	private void handleContainers(Diagram diagram, ContainerShape container, EObject eObject,
			GraphicsAlgorithm nodeFigure, Node node) {

		int remaining = 100;
		int count = 0;
		for (NodeContainer nodecontainer : node.getContainers()){

			Shape object = Graphiti.getPeCreateService().createShape(container, false);
			GraphicsAlgorithm nodeContainer = Graphiti.getGaService().createInvisibleRectangle(object);
			Rectangle bounds = NodeProvider.createNodeFigure(diagram, nodeContainer, eObject, 
					nodeFigure, nodecontainer.getFigures(), node.getStyle());

			int vertical = bounds.height-bounds.y;

			Graphiti.getGaService().setLocationAndSize(nodeContainer, 
					bounds.x, bounds.y, bounds.width-bounds.x, vertical);
//			String obj = nodecontainer.getObject();
			
			EClass childClass = (EClass) nodecontainer.getModelReference().getEType();
			
//			FigureProperty.setProperties(nodeContainer, obj== null ? this.model.getName() : obj );
//			FigureProperty.setProperties(nodeContainer, obj== null ? this.model.getModelClass().getName() : obj );
			FigureProperty.setProperties(nodeContainer, childClass== null ? this.model.getModelClass().getName() : childClass.getName());

			FigureProperty.TYPE.set(nodeContainer, nodecontainer.getLayout());

			if (nodecontainer.getFormat()==null){
				FigureProperty.VERTICAL.set(nodeContainer, vertical);
				FigureProperty.FORMAT.set(nodeContainer, "px");
				count++;
			}else if (nodecontainer.getFormat().equals("%")){
				vertical = 0;
				if (remaining>nodecontainer.getValue()){
					vertical = nodecontainer.getValue();
					remaining -= vertical;
				}else{
					vertical = remaining;
					remaining = 0;
				}
				FigureProperty.VERTICAL.set(nodeContainer, vertical);
				FigureProperty.FORMAT.set(nodeContainer, "%");
			}else{
				FigureProperty.VERTICAL.set(nodeContainer, nodecontainer.getValue());
				FigureProperty.FORMAT.set(nodeContainer, "px");
			}					

		}

		if (count>0){
			int part = remaining / count;
			for (GraphicsAlgorithm figure : nodeFigure.getGraphicsAlgorithmChildren()){
				if (FigureProperty.VERTICAL.get(figure).length()==0)
					FigureProperty.VERTICAL.set(figure, part);						
			}
		}
	}
	
	

	private void handleAnchors(Diagram diagram, ContainerShape container, EObject eObject,
			GraphicsAlgorithm nodeFigure, Node node) {

		if (node.getAnchors().size()==0){
			ChopboxAnchor boxAnchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
			GraphicsAlgorithm nodeAnchor = Graphiti.getGaService().createInvisibleRectangle(boxAnchor);
			FigureProperty.PARENT.set(nodeAnchor, node.getModelClass().getName());
		}


		int anchor_left = 0;
		int anchor_right = 0;
		int anchor_down = 0;
		int anchor_up = 0;
		

		for (NodeAnchor anchor : node.getAnchors()) {
			
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
	
				Rectangle bounds = NodeProvider.createNodeFigure(diagram, nodeAnchor, eObject, 
						nodeFigure, anchor.getFigures(), node.getStyle());
				int horizontal =  bounds.width-bounds.x;
				int vertical = bounds.height-bounds.y;
	
				nodeAnchor.setTransparency(1.0);
				Graphiti.getGaService().setLocationAndSize(nodeAnchor, bounds.x, bounds.y, horizontal, vertical);
				FigureProperty.setProperties(nodeAnchor);
				
				int value = 0;	
				FigureProperty.ANCHOR_HORIZ.set(nodeAnchor, anchor.getFormatX());
				value = -anchor.getX();
				if (anchor.getPassX()!=null && anchor.getPassX().equals("-"))
					value = -value;
				if (anchor.getFormatX().equals("%") && value<0)
					value = -value;
				FigureProperty.FORMAT.set(nodeAnchor, Integer.toString(value));
				if (anchor.getFormatX().equals("lf") && value>anchor_left)
					anchor_left = value;
				if (anchor.getFormatX().equals("rg") && value>anchor_right)
					anchor_right = value;
	
				FigureProperty.ANCHOR_VERT.set(nodeAnchor, anchor.getFormatY());
				value = -anchor.getY();
				if (anchor.getPassY()!=null && anchor.getPassY().equals("-"))
					value = -value;
				if (anchor.getFormatY().equals("%") && value<0)
					value = -value;
				FigureProperty.VERTICAL.set(nodeAnchor, value);
				if (anchor.getFormatY().equals("up") && value>anchor_up)
					anchor_up = value;
				if (anchor.getFormatY().equals("dw") && value>anchor_down)
					anchor_down = value;	
	
				Graphiti.getGaService().setLocationAndSize(nodeAnchor, 
						bounds.x, bounds.y, bounds.width, bounds.height);
				
			}
			
			
			FigureProperty.PARENT.set(nodeAnchor, node.getModelClass().getName());
			
			String incoming = FigureProvider.expressionSeperator;
			String outgoing = FigureProvider.expressionSeperator;
			for (ArrowAnchor arrow : anchor.getArrows()){
				if ("both".equalsIgnoreCase(arrow.getType()) || "incoming".equalsIgnoreCase(arrow.getType()))
					incoming += arrow.getReference() + FigureProvider.expressionSeperator;
				if ("both".equalsIgnoreCase(arrow.getType()) || "outgoing".equalsIgnoreCase(arrow.getType()))
					outgoing += arrow.getReference() + FigureProvider.expressionSeperator;
			}
			if (incoming.length()==1 && outgoing.length()==1)
				incoming = outgoing = null;
			FigureProperty.ANCHOR_INCOMING.set(nodeAnchor, incoming);
			FigureProperty.ANCHOR_OUTGOING.set(nodeAnchor, outgoing);
			
		}


		FigureProperty.ANCHOR_UP.set(nodeFigure, anchor_up);
		FigureProperty.ANCHOR_LEFT.set(nodeFigure, anchor_left);
		FigureProperty.ANCHOR_DOWN.set(nodeFigure, anchor_down);
		FigureProperty.ANCHOR_RIGHT.set(nodeFigure, anchor_right);

		
		if (anchor_left+anchor_right+anchor_up+anchor_down>0)
			resizeNodeFigure(diagram, container, 
					nodeFigure.getWidth()+anchor_left+anchor_right, 
					nodeFigure.getHeight()+anchor_up+anchor_down);
		
		
	}

	@Override
	public void updateNodeFigure(Diagram diagram, ContainerShape container) {
		NodeProvider.updateNodeFigure(diagram, container);
	}

	@Override
	public void resizeNodeFigure(Diagram diagram, ContainerShape container, int width, int height) {
		NodeProvider.resizeNodeFigure(diagram, container, new Dimension(width, height));
	}

	@Override
	public void removeNodeFigure(Diagram diagram, GraphicsAlgorithm figure) {
		NodeProvider.removeContainerFigures(diagram, figure);
	}

	@Override
	public boolean canResizeNodeFigure(GraphicsAlgorithm figure) {
		return "1".equals(FigureProperty.CAN_RESIZE.get(figure));
	}

	@Override
	public boolean canMoveNodeFigure(GraphicsAlgorithm figure) {
		String value = FigureProperty.CAN_MOVE.get(figure);
		return value==null || value.equals("1");
	}



	@Override
	public boolean canEditFigureLabel(GraphicsAlgorithm figure) {
		return "1".equals(FigureProperty.CAN_EDIT.get(figure));
	}	

	@Override
	public String getFigureLabelValue(GraphicsAlgorithm figure) {
		if (FigureProperty.TEXT_ATTR.get(figure)!=null)
			return FigureProperty.TEXT_VALUE.get(figure);
		return FigureProperty.TEXT.get(figure);
	}

	@Override
	public void updateFigureLabel(Diagram diagram, GraphicsAlgorithm figure, String value) {
		setLabelValue(figure, value);
		Object container = getContainerObject(figure);
		if (container instanceof ContainerShape)
			NodeProvider.updateNodeFigure(diagram, (ContainerShape)container);
		else if (container instanceof Connection)
			LinkProvider.updateLinkConnection(diagram, (Connection)container);
	}

	@Override
	public GraphicsAlgorithm getFigureLabel(Diagram diagram, ContainerShape container) {
		return FigureProvider.getTextFigure(container);
	}
	
	



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

				//if (link.getOption()!=null && link.getOption().equalsIgnoreCase("manhattan"))
				if(link.isManhattan())
					connection = Graphiti.getPeCreateService().createManhattanConnection(diagram);
				else
					connection = Graphiti.getPeCreateService().createFreeFormConnection(diagram);
				if (link.getAttributes().size()>0)
					setAttributesValue(link.getAttributes(), eObject);

				Polyline linkConnector = Graphiti.getGaService().createPlainPolyline(connection);
				
				linkConnector.setForeground(Graphiti.getGaService().manageColor(diagram, 
						ColorProperty.FOREGROUND.getValue(linkConnector, eObject, link.getColorfeatures())));
				linkConnector.setLineWidth(
						IntegerProperty.LINE_WIDTH.getValue(linkConnector, eObject, link.getIntegerfeatures()));
				linkConnector.setLineStyle(getLineSyle(linkConnector, eObject, link.getLinefeatures()));

				
//				if (link.getSourceStatic()!=null){
//					ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, false, 0.0, true);
//					LinkProvider.createLinkFigure(diagram, cd, eObject, link.getSourceStatic());
//				}
//
//				for (DynamicFigure text: link.getSourceDynamic()){
//					ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, true, 0.1, true);
//					LinkProvider.createDynamicFigure(diagram, cd, eObject, text);
//				}
//
//				if (link.getTargetStatic()!=null){
//					ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, false, 1.0, true);
//					LinkProvider.createLinkFigure(diagram, cd, eObject, link.getTargetStatic());
//				}
//
//				for (DynamicFigure text: link.getTargetDynamic()){
//					ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, true, 0.8, true);
//					LinkProvider.createDynamicFigure(diagram, cd, eObject, text);
//				}

				for (Decorator decorator: link.getDecorators()){
					if (decorator.getPlacingStatic()!=null){
						ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, 
								false, (double)decorator.getPos()/100.0, true);
						LinkProvider.createLinkFigure(diagram, cd, eObject, decorator.getPlacingStatic());
					}
					for (DynamicFigure text: decorator.getPlacingDynamic()){
						ConnectionDecorator cd = Graphiti.getPeCreateService().createConnectionDecorator(connection, 
								true, (double)decorator.getPos()/100.0, true);
						LinkProvider.createDynamicFigure(diagram, cd, eObject, text);
					}
				}
				break;
			}
			
		}

		if (connection==null){
			connection = Graphiti.getPeCreateService().createFreeFormConnection(diagram);
			Graphiti.getGaService().createPlainPolyline(connection);
		}

		connection.setStart(source);
		connection.setEnd(target);

		return connection;
	}

	
	@Override
	public void updateLinkFigure(Diagram diagram, Connection connection) {
		LinkProvider.updateLinkConnection(diagram, connection);
	}
	

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

	public boolean canSetConnection(Anchor anchor, EReference eReference, FigureProperty feature) {
		GraphicsAlgorithm ga = anchor.getGraphicsAlgorithm();		
		String arrows = Graphiti.getPeService().getPropertyValue(ga, feature.toString());
		if (arrows == null || arrows.length()==0)
			return true;
		return arrows.contains(FigureProvider.expressionSeperator + eReference.getName() + FigureProvider.expressionSeperator); 
	}	

	@Override
	public boolean isValidOutgoingConnection(Anchor anchor, EReference eReference) {
		return anchor instanceof ChopboxAnchor || (anchor.getOutgoingConnections().size()>=0 &&
				canSetConnection(anchor, eReference, ANCHOR_OUTGOING));
	}

	@Override
	public boolean isValidIncomingConnection(Anchor anchor, EReference eReference) {
		return anchor instanceof ChopboxAnchor || (anchor.getIncomingConnections().size()>=0 &&
				canSetConnection(anchor, eReference, ANCHOR_INCOMING));
	}

	//	@Override
	//	public EReference getLinkSource(EClass eClass) {
	//		return getLink(true, eClass);
	//	}

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
