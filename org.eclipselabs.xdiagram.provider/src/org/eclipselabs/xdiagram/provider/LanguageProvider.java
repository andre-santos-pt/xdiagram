package org.eclipselabs.xdiagram.provider;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.geom.Dimension2D;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
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
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipselabs.xdiagram.DslStandaloneSetup;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.provider.internal.DimensionFactor;
import org.eclipselabs.xdiagram.provider.internal.ElementCreation;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
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
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Custom;
import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.DiagramElement;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureConditional;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.dsl.Node;
import org.eclipselabs.xdiagram.dsl.Size;
import org.eclipselabs.xdiagram.dsl.TextValue;
import org.eclipselabs.xdiagram.dsl.XDiagram;
import org.eclipselabs.xdiagram.dsl.util.DslSwitch;
import org.osgi.framework.Bundle;

import com.google.common.collect.Maps;

public class LanguageProvider implements GraphicsProvider {

	private URI modelLocation;
//	private String modelFilePath;
	private XDiagram model;
	private EPackage ePackage;

	private FeatureHandlerChain featureChain;

	private ContainsHandler containsHandler;

	private Map<EClass, Node> nodes;
	private Map<EClass, Link> complexLinks;
	private Map<EReference, Link> links;

	private Map<Anchor, EObject> anchors;
	
	public LanguageProvider() {
		anchors = Maps.newHashMap();
		containsHandler = new ContainsHandler();

		featureChain = new FeatureHandlerChain()
		.add(new ColorHandler())		
		.add(new LineWidthHandler())
		.add(new PointHandler())
		.add(new TextValueHandler())
		.add(new CornerHandler())
		.add(new PositionHandler())
		.add(new SizeHandler())

		.add(containsHandler)
		.add(new AnchorHandler());
	}


	@Override
	public void setup(Bundle bundle, Map<String, String> properties, EPackage ePackage) throws ProviderException {		
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.ePackage = ePackage;

		modelLocation = URI.createPlatformPluginURI(bundle.getSymbolicName() + "/" + properties.get("file"), false);
		
		modelLocation = URI.createFileURI(properties.get("file"));
//		modelFilePath = properties.get("file");
//		if(!new File(modelFilePath).exists())
//			throw new ProviderException("File not found: " + modelFilePath);

		loadModel();
	}

	private void loadModel() throws ProviderException {

		try{			
//			ResourceSet rs = new ResourceSetImpl();
//
//			//String path = "/" + bundle.getSymbolicName() + "/" + file;
//			//URI uri = URI.createPlatformPluginURI(path, false);	
//			//String uri = bundle.getResource(file).toString().replace("\\", "/");
//			//String uri = Platform.getBundle(namespace).getResource(recource).toString();
//			//			String uri = file;
////			URI uri = URI.createFileURI(modelFilePath);
//
//			//			resource = rs.getResource(URI.createURI(uri), true);
//			Resource resource = rs.getResource(modelLocation, true);
//			
//			if(resource == null)
//				throw new ProviderException("Could not load: " + modelLocation);
//			
//			List<EObject> objs = resource.getContents();
//			model = (XDiagram) objs.get(0);
//			
//			
//			
//			loadModelData();
			
			ResourceSet rs = new ResourceSetImpl();

			//String path = "/" + bundle.getSymbolicName() + "/" + file;
			//URI uri = URI.createPlatformPluginURI(path, false);	
			//String uri = bundle.getResource(file).toString().replace("\\", "/");
			//String uri = Platform.getBundle(namespace).getResource(recource).toString();
			//			String uri = file;
			//URI uri = URI.createFileURI(modelLocation);

			//			resource = rs.getResource(URI.createURI(uri), true);
			Resource resource = rs.getResource(modelLocation, true);
			List<EObject> objs = resource.getContents();
			model = (XDiagram) objs.get(0);
			
			
			
			loadModelData();
			
		}
		catch(Exception e){
			e.printStackTrace();
			throw new ProviderException("Could not load language model:" + e.getMessage());
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
			anchor.setModelReference(match(anchor.getModelReference()));
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
	public void updateElement(Diagram diagram, PictogramElement pe) {
		updateElement(diagram, pe, null);
	}
	
	@Override
	public void updateElement(Diagram diagram, PictogramElement pe, Dimension size) {
		try {
			loadModel();
		}
		catch(ProviderException ex) {
			ex.printStackTrace();
		}
		
		if ( pe instanceof ContainerShape ){
//			Object container = pe.eContainer();
//			while ( container!=null && container instanceof ContainerShape 
//					&& ((ContainerShape)container).getLink()==null )
//				container = ((Shape)container).eContainer();
//			if ( container!=null && container instanceof ContainerShape ){
//				ContainerShape cs = (ContainerShape)container;					
//			}
			
			updateLinked((ContainerShape)pe, diagram, size);
		}

//		if ( pe instanceof Connection )
//	  		provider.getGraphicsProvider().updateLinkFigure(getDiagram(), (Connection)pe);
//	  	else
//	  		provider.getGraphicsProvider().updateNodeFigure(getDiagram(), (ContainerShape)pe);
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
			updateLinked((ContainerShape) shape, diagram, null);
		}
	}

	private void updateLinked(ContainerShape shape, Diagram diagram, Dimension size) {
		PictogramLink link = shape.getLink();
		EObject eObject = (EObject) link.getBusinessObjects().get(0);
		Node node = getNode(eObject.eClass());
		GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
		ConnectableElement elem = node.getRootFigure();
		if (size == null)
			size = new Dimension(ga.getWidth(), ga.getHeight());
		ga.setWidth(size.width);
		ga.setHeight(size.height);
		DimensionFactor diff = new DimensionFactor();
		for(Feature ft : elem.getFeatures()) {
			if(ft instanceof Size) {
				Size sz = (Size)ft;
				diff.setSize(size.getWidth()/sz.getWidth(), size.getHeight()/sz.getHeight());
			}
		}
		updateElement(node.getRootFigure(), eObject, shape, diagram, new Point(0,0), diff);
	}

	private void updateElement(ConnectableElement e, EObject o, ContainerShape s, Diagram diagram,
			Point location, DimensionFactor diff){
		featureChain.update(e, o, diagram, s.getGraphicsAlgorithm(), s, location, diff);

		List<ConnectableElement> childrenElements = e.getChildren();
		List<Shape> childrenShapes = ((ContainerShape) s).getChildren();

		for(int i = 0; i < childrenShapes.size(); i++) {
			if(childrenShapes.get(i).getLink() != null)
				updateLinked((ContainerShape) childrenShapes.get(i), diagram, null);
			else if ( childrenShapes.get(i) instanceof ContainerShape )
				updateElement(childrenElements.get(i), o, (ContainerShape) childrenShapes.get(i), diagram, location, diff);
			else
				featureChain.update(childrenElements.get(i), o, diagram, childrenShapes.get(i).getGraphicsAlgorithm(), s, location, diff);
		}

	}




	@Override
	public GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject) {
		GraphicsAlgorithm nodeFigure = null;

		Node node = getNode(eObject.eClass());
		ConnectableElement mainFig = node.getRootFigure();
		nodeFigure = ElementCreation.createNodeFigure(mainFig, diagram, container);
		
		//System.err.println("-->: " +container.getLink().getBusinessObjects().size());
		
//		nodeFigure = Graphiti.getGaService().createImage(container, null);
//		Graphiti.getGaService().setLocationAndSize(nodeFigure, 
//				0, 0, 100, 50);
//		GraphicsAlgorithmContainer object = container;
//		if (container instanceof ContainerShape)
//			object = Graphiti.getPeCreateService().createShape((ContainerShape) container, false);
//		GraphicsAlgorithm figure = Graphiti.getGaService().createPlainEllipse(object);
//		figure.setBackground(Graphiti.getGaService().manageColor(diagram, ColorConstant.GREEN));
//		Graphiti.getGaService().setLocationAndSize(figure, 0, 0, 70, 25);
//		GraphicsAlgorithmContainer txtshape = container;
//		if (container instanceof ContainerShape)
//			txtshape = Graphiti.getPeCreateService().createShape((ContainerShape) container, false);
//		MultiText text = Graphiti.getGaService().createMultiText(txtshape);
//		text.setValue("123qwe");
//		text.setForeground(Graphiti.getGaService().manageColor(diagram, ColorConstant.BLACK));
//		Graphiti.getGaService().setLocationAndSize(text, 50, 5, 200, 50);
		
//		if(mainFig instanceof Custom)
//			featureChain.update(((Custom) mainFig).getFigure().getElement(), eObject, diagram, nodeFigure, container);

		featureChain.handle(mainFig, eObject, diagram, nodeFigure, container);
		for(ConnectableElement child : mainFig.getChildren())
			addChildren(child, container, diagram, eObject);
		

//		if(!hasFeature(mainFig, org.eclipselabs.xdiagram.dsl.Anchor.class, true)) {
//			Anchor anchor = Graphiti.getPeCreateService().createChopboxAnchor(container);
//			anchors.put(anchor, eObject);
//		}
		return nodeFigure;		
	}

	

	// TODO validation anchors cannot have children?
	private void addChildren(ConnectableElement element, Shape container, Diagram diagram, EObject eObject) {
		
		try	{
			
		
		boolean isActive = hasFeature(element, Contains.class, false);
		boolean hasAnchor = hasFeature(element, org.eclipselabs.xdiagram.dsl.Anchor.class, false);

		Shape childContainer = container; 
		if(hasAnchor) {
//			BoxRelativeAnchor anchor = Graphiti.getPeCreateService().createBoxRelativeAnchor(container);
//			anchor.setReferencedGraphicsAlgorithm(container.getGraphicsAlgorithm());
//			childContainer = anchor;
//			anchors.put(anchor, eObject);
		}
		else {
//			if (container instanceof ContainerShape)
//			//	childContainer = Graphiti.getPeCreateService().createShape((ContainerShape) container, true);
			
		}

		if ( element.getChildren().size()>0 )
			childContainer = Graphiti.getPeCreateService().createContainerShape((ContainerShape) container, true);
		else
			childContainer = Graphiti.getPeCreateService().createShape((ContainerShape) container, true);
		//System.err.println(".-->: " + ((ContainerShape)childContainer).getLink().toString());
		GraphicsAlgorithm childFigure =  ElementCreation.createNodeFigure(element, diagram, childContainer);
		featureChain.handle(element, eObject, diagram, childFigure, childContainer);
//		childFigure = Graphiti.getGaService().createMultiText(childContainer);
//		if (childFigure instanceof AbstractText)
//		((AbstractText)childFigure).setValue("123qwekkk");
//		childFigure.setForeground(Graphiti.getGaService().manageColor(diagram, ColorConstant.BLACK));
//		Graphiti.getGaService().setLocationAndSize(childFigure, 50, 50, 150, 50);
		
		
//		GraphicsAlgorithmContainer txtshape = container;
//		if (container instanceof ContainerShape)
//			txtshape = Graphiti.getPeCreateService().createShape((ContainerShape) container, false);
//		MultiText text = Graphiti.getGaService().createMultiText(txtshape);
//		text.setValue("123qwe");
//		text.setForeground(Graphiti.getGaService().manageColor(diagram, ColorConstant.BLACK));
//		Graphiti.getGaService().setLocationAndSize(text, 50, 5, 200, 50);
		// anchors cannot have children
		if(!hasAnchor) {
			for(ConnectableElement child : element.getChildren())
				addChildren(child, childContainer, diagram, eObject);
		}
		
		
	}
	catch(IllegalArgumentException e) {
		System.err.println("Not supported: " + e.getMessage());
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
		Node node = getNode(eObject.eClass());
		ConnectableElement element  = node.getRootFigure();

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

			for(Link l : links.values()) {
				EReference ref = l.getModelReference();
				EClass refOwner = (EClass) ref.eContainer();
				if(refOwner.isSuperTypeOf(sourceObject.eClass()))
					link = l;
			}
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

	private GraphicsAlgorithm createLinkConnection(Link link, Diagram diagram, Connection connection, EObject eObject) {
		Polyline linkConnector = Graphiti.getGaService().createPlainPolyline(connection);
		featureChain.handle(link, eObject, diagram, linkConnector, diagram);
		return linkConnector;
	}


	//	@Override
	//	public void updateLinkFigure(Diagram diagram, Connection connection) {
	//		linkHandler.updateLinkConnection(null, diagram, connection);
	//	}


	
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
		assert isComplexLink(eClass);
		return getComplexLink(eClass).getTargetReference();
	}

}
