/*******************************************************************************
 * Copyright (c) 2016 ISCTE-IUL.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André L. Santos, Eduardo Gomes - initial API and implementation
 *******************************************************************************/
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
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
//import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.provider.internal.ElementCreation;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandlerChain;
import org.eclipselabs.xdiagram.provider.internal.handlers.AlignHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.AnchorHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.ColorHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.ContainsHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.CornerHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.FontHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.LayoutHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.LineStyleHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.LineWidthHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PointHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.PositionHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.SizeHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.TextValueHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.TransparencyHandler;
import org.eclipselabs.xdiagram.provider.internal.handlers.VisibleHandler;
import org.osgi.framework.Bundle;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

import pt.iscte.xdiagram.dsl.XdiagramDslStandaloneSetup;
import pt.iscte.xdiagram.dsl.model.AnchorDirection;
import pt.iscte.xdiagram.dsl.model.ConnectableElement;
import pt.iscte.xdiagram.dsl.model.Contains;
import pt.iscte.xdiagram.dsl.model.Decorator;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureConditional;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Label;
import pt.iscte.xdiagram.dsl.model.LineStyle;
import pt.iscte.xdiagram.dsl.model.Link;
import pt.iscte.xdiagram.dsl.model.Node;
import pt.iscte.xdiagram.dsl.model.TextPart;
import pt.iscte.xdiagram.dsl.model.XDiagram;
import pt.iscte.xdiagram.dsl.model.util.ModelSwitch;

public final class LanguageProvider implements GraphicsProvider {

	private URI modelLocation;
	private Bundle bundle;
	private XDiagram model;
	private EPackage ePackage;

	private Diagram diagram;

	private FeatureHandlerChain featureChain;

	private IFeatureProvider gFeatureProvider;

	private ContainsHandler containsHandler;
	private AnchorHandler anchorHandler;
	private LayoutHandler layoutHandler;
	private SizeHandler sizeHandler;
	private TextValueHandler textHandler;

	private Map<EClass, Node> nodes;
	private Map<EClass, Link> complexLinks;
	private Map<EReference, Link> links;

	private Multimap<EReference, pt.iscte.xdiagram.dsl.model.Anchor> outgoing;
	private Multimap<EReference, pt.iscte.xdiagram.dsl.model.Anchor> incoming;




	public LanguageProvider() {
		containsHandler = new ContainsHandler();
		anchorHandler = new AnchorHandler();
		layoutHandler = new LayoutHandler();
		sizeHandler = new SizeHandler();
		textHandler = new TextValueHandler();

		featureChain = new FeatureHandlerChain(this)

				.add(new VisibleHandler())
				.add(new ColorHandler())
				.add(new TransparencyHandler())
				.add(new PositionHandler(layoutHandler))
				.add(new FontHandler())
				.add(textHandler)
				.add(new AlignHandler())
				.add(sizeHandler)
				.add(new LineWidthHandler())
				.add(new PointHandler())

				.add(new CornerHandler())
				.add(new LineStyleHandler())

				//.add(new DecoratorHandler())

				.add(containsHandler)
				.add(anchorHandler)

				.add(layoutHandler);
	}


	@Override
	public void setup(Bundle bundle, Map<String, String> properties, EPackage ePackage) throws ProviderException {		
		new XdiagramDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.ePackage = ePackage;
		this.bundle = bundle;
		modelLocation = URI.createPlatformPluginURI(bundle.getSymbolicName() + "/" + properties.get("file"), false);
		loadModel();
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


	private void loadModelData() {
		nodes = Maps.newHashMap();
		links = Maps.newHashMap();
		complexLinks = Maps.newHashMap();

		incoming = ArrayListMultimap.create();
		outgoing = ArrayListMultimap.create();

		LoadModelData doSwitch = new LoadModelData();
		for(TreeIterator<EObject> iterator = EcoreUtil.getAllContents(model.eResource(), false); iterator.hasNext();) {
			EObject obj = iterator.next();
			doSwitch.doSwitch(obj);
		}

	}		


	private class LoadModelData extends ModelSwitch<Object> {

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
		}

		public Object caseAnchor(pt.iscte.xdiagram.dsl.model.Anchor anchor) {
			EReference r = match(anchor.getModelReference());
			anchor.setModelReference(r);

			switch(anchor.getDirection()) {
			case OUTGOING: outgoing.put(r, anchor); break;
			case INCOMING: incoming.put(r, anchor); break;
			}
			return null;
		}

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






	@Override
	public void loadDiagram(Diagram diagram, EObject rootObject, IFeatureProvider gFeatureProvider) {
		assert diagram != null;
		assert rootObject != null;
		this.diagram = diagram;
		this.gFeatureProvider = gFeatureProvider;

		for(Contains c : model.getDiagram().getContains())
			containsHandler.handle(null, c, rootObject, diagram, diagram, diagram.getGraphicsAlgorithm());
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
	public boolean hasNodeTool(EClass eClass) {
		return isNode(eClass);
	}

	@Override
	public boolean hasLinkTool(EReference eReference) {	
		return isLink(eReference) && !eReference.isContainment();
	}

	@Override
	public boolean isLink(EClass eClass) {
		return isComplexLink(eClass);
	}

	//	@Override
	//	public boolean isProperty(EStructuralFeature feature) {
	//		return true;
	//	}

	@Override
	public EClass getRoot() {
		return model.getDiagram().getModelClass();
	}


	@Override
	public boolean canAddChild(ContainerShape container, EClass eClass) {
		//		if(!containsHandler.isContainer( container)) {
		//			return false;
		//		}
		//		
		//		
		//
		//		for(EReference r: containsHandler.getReferences(container))
		//			if(r.getEReferenceType().isSuperTypeOf(eClass))
		//				return true;

		//		return false;

		// codigo repetido do interpreter?

		return true;
	}


	@Override
	public EObject getContainerObject(ContainerShape container) {
		return containsHandler.isContainer(container) ? containsHandler.getOwner(container) : null;
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
	public void update(Diagram diagram) {
		assert diagram != null;
		try {
			loadModel();
		}
		catch(ProviderException ex) {
			ex.printStackTrace();
		}

		for(Shape shape : diagram.getChildren())
			update((ContainerShape) shape);

		for(Connection conn : diagram.getConnections())
			updateConnection(conn, diagram);
	}




	@Override
	public void update(PictogramElement element) {
		assert element != null;

		PictogramLink link = element.getLink();
		EObject eObject = link != null ? (EObject) link.getBusinessObjects().get(0) : null;

		if(element instanceof ContainerShape) {
			Node node = getNode(eObject.eClass());
			if(node != null) {
				updateElement(node.getRootFigure(), eObject, (ContainerShape) element, diagram);
				return;
			}
		}
		else 
			updateConnection((Connection) element, diagram);
	}


	// TODO remove children?
	private void updateElement(FeatureContainer e, EObject o, ContainerShape s, Diagram diagram) {

		if(e instanceof ConnectableElement) {
			List<FeatureContainer> childrenElements = ((ConnectableElement)e).getChildren();
			List<Shape> childrenShapes = ((ContainerShape) s).getChildren();

			for(int i = 0; i < childrenShapes.size() && i < childrenElements.size(); i++) {
				if(childrenShapes.get(i).getLink() != null)
					update((ContainerShape) childrenShapes.get(i));
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

		for(Decorator d : link.getDecorators()) {
			FeatureContainer el = d.getElement();
			if(it.hasNext()) {
				ConnectionDecorator dec = it.next();
				featureChain.update(el, eObject, diagram, dec.getGraphicsAlgorithm(), dec);
			}
		}
	}




	@Override
	public GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject) {
		Node node = getNode(eObject.eClass());
		ConnectableElement mainFig = node.getRootFigure();
		GraphicsAlgorithm nodeFigure = ElementCreation.createNodeFigure(mainFig, diagram, container, bundle);

		for(FeatureContainer child : mainFig.getChildren())
			addChildren(child, container, diagram, eObject);

		// parent features after
		featureChain.update(mainFig, eObject, diagram, nodeFigure, container);

		Graphiti.getGaLayoutService().setLocation(nodeFigure, context.getX(), context.getY(), true);
		return nodeFigure;		
	}



	// TODO validation anchors cannot have children?
	private void addChildren(FeatureContainer element, Shape container, Diagram diagram, EObject eObject) {
		boolean isActive = hasFeature(element, Contains.class, false);
		boolean hasAnchor = hasFeature(element, pt.iscte.xdiagram.dsl.model.Anchor.class, false);

		GraphicsAlgorithmContainer childContainer = null; 
//		if(hasAnchor) {
//			BoxRelativeAnchor anchor = Graphiti.getPeCreateService().createBoxRelativeAnchor(container);
//			anchor.setReferencedGraphicsAlgorithm(container.getGraphicsAlgorithm());
//			childContainer = anchor;
//		}
//		else {
			childContainer = Graphiti.getPeCreateService().createContainerShape((ContainerShape) container, isActive);
//		}

		GraphicsAlgorithm childFigure =  ElementCreation.createNodeFigure(element, diagram, childContainer, bundle);
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
					if(hasFeature(child, clazz, recursive))
						return true;
							
		}

		return false;
	}


	public static <T extends Feature> T getFeature(FeatureContainer element, Class<T> clazz) {
		for(Feature f : element.getFeatures()) {
			if(clazz.isInstance(f))
				return clazz.cast(f);
		}
		return null;
	}











	@Override
	public void resizeNodeFigure(Diagram diagram, ContainerShape container, int width, int height) {
		// TODO: figuras especiais
		Graphiti.getLayoutService().setSize(container.getGraphicsAlgorithm(), width, height);
	}

	@Override
	public void removeNodeFigure(Diagram diagram, GraphicsAlgorithm figure) {
		//TODO: ???
	}

	@Override
	public boolean canResizeNodeFigure(GraphicsAlgorithm element) {
		return sizeHandler.isResizable(element);
	}

	@Override
	public boolean canMoveNode(PictogramElement element) {
		GraphicsAlgorithm parentFig = ((ContainerShape) element).getContainer().getGraphicsAlgorithm();
		return !layoutHandler.hasLayout(parentFig);
	}







	@Override
	public boolean canEditFigureLabel(AbstractText text) {
		return textHandler.isLabelEditable((AbstractText) text);
	}	



	@Override
	public AbstractText getFigureLabel(ContainerShape container) {
		return null;
		//		return textHandler.getEditableLabel(container);
	}


	@Override
	public EObject getLabelEObject(AbstractText text) {
		return textHandler.getLabelEObject(text);
	}

	@Override
	public EAttribute getTextEditableAttribute(AbstractText text) {
		return textHandler.getEditableEAttribute(text);
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

		LineStyle style = getFeature(link, LineStyle.class);

		connection = style != null && style.isManhattan() ?
				Graphiti.getPeCreateService().createManhattanConnection(diagram) :
					Graphiti.getPeCreateService().createFreeFormConnection(diagram);


				GraphicsAlgorithm connectionLink = createLinkConnection(link, diagram, connection, eObject);

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
		for(Decorator decorator : link.getDecorators()) {
			double perc = decorator.getPosition(); // TODO: validation percent
			double position = perc/100.0;
			boolean active = decorator.getElement() instanceof Label;
			ConnectionDecorator dec = 
					Graphiti.getPeCreateService().createConnectionDecorator(connection, active, position, true);

			GraphicsAlgorithm decFig = ElementCreation.createNodeFigure(decorator.getElement(), diagram, dec, bundle);
			featureChain.update(decorator.getElement(), eObject, diagram, decFig, dec);
		}
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

		// no anchors
		if(anchor instanceof ChopboxAnchor)
			return true;

		EObject eObject = anchor.getParent().getLink().getBusinessObjects().get(0);

		for(pt.iscte.xdiagram.dsl.model.Anchor a : outgoing.get(eReference))
			if(a.getMax() == 0 || anchor.getOutgoingConnections().size() <= a.getMax())
				return true;
					
					//a.getModelReference().equals(eReference) &&
				//(a.getMax() == 0 || anchor.getOutgoingConnections().size() <= a.getMax())

		return false;
	}

	@Override
	public boolean isValidIncomingConnection(Anchor anchor, EReference eReference) {
		assert anchor != null;
		assert eReference != null;
		// no anchors
		if(anchor instanceof ChopboxAnchor)
			return true;
		
		for(pt.iscte.xdiagram.dsl.model.Anchor a : incoming.get(eReference))
			if(a.getMax() == 0 || anchor.getOutgoingConnections().size() <= a.getMax())
				return true;
		
		return false;
	}

	@Override
	public EReference getLinkTarget(EClass eClass) {	
		assert eClass != null && isComplexLink(eClass);
		return getComplexLink(eClass).getTargetReference();
	}


	public IUpdateFeature getUpdateFeature(UpdateContext updateContext) {
		return gFeatureProvider.getUpdateFeature(updateContext);
	}


	public void internalUpdate(PictogramElement element) {
		while(!(element.eContainer() instanceof Diagram))
			element = (PictogramElement) element.eContainer();

		UpdateContext updateContext = new UpdateContext(element);
		IUpdateFeature updateFeature = gFeatureProvider.getUpdateFeature(updateContext);
		if(updateFeature != null)
			updateFeature.update(updateContext);
	}
}
