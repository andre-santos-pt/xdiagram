package org.eclipselabs.xdiagram.provider.handlers;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional;
import org.eclipselabs.xdiagram.xtext.xdiagram.IntValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.StringValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Value;

public class ConnectableElementHandlerChain implements ConnectableElementHandler {

	private List<ConnectableElementHandler>  chain;
//	private List<FeatureHandler> featureHandlers;
	private FeatureHandlerChain featureHandlers;

	public ConnectableElementHandlerChain(FeatureHandlerChain featureChain) {
		chain = new ArrayList<>();
		this.featureHandlers = featureChain;
//		featureHandlers = new ArrayList<>();
	}

	public ConnectableElementHandlerChain add(ConnectableElementHandler handler) {
		chain.add(handler);
		return this;
	}

//	public ConnectableElementHandlerChain add(FeatureHandler handler) {
//		featureHandlers.add(handler);
//		return this;
//	}

	@Override
	public boolean accept(ConnectableElement object) {
		return true;
	}




	@Override
	public GraphicsAlgorithm createNodeFigure(final ConnectableElement element, final Diagram diagram,
			Shape container,
			GraphicsAlgorithm parentFigure, final EObject eObject) {

		for(ConnectableElementHandler h : chain) {
			if(h.accept(element)) {
				final GraphicsAlgorithm figure = h.createNodeFigure(element, diagram, container, parentFigure, null);
//				Set<Class<?>> defined = new HashSet<>();
//
//				boolean existsConditional = false;
//				for(Feature f : element.getFeatures()) {
//					if(f.getConditional() != null)
//						existsConditional = true;
//
//					boolean accepted = false;
//					for(FeatureHandler fh : featureHandlers) {
//						if(fh.accept(element, f)) {
//							accepted = true;
//							if(evaluate(eObject, f.getConditional())) {
//								fh.handle(element, f, figure, diagram, eObject, container);
//								defined.add(fh.getClass());
//							}
//						}
//					}
//					if(!accepted)
//						System.err.println("not supported: " + f);
//				}
				
//				if(existsConditional)
//					addListener(element, diagram, eObject, figure, container);
//
//				for(FeatureHandler fh : featureHandlers)
//					if(!defined.contains(fh.getClass()) && fh.accept(element, figure))
//						fh.setDefaults(element, figure, diagram);

				return figure;
			}
		}

		return null;
	}

	private void addListener(final ConnectableElement element,
			final Diagram diagram, final EObject eObject,
			final GraphicsAlgorithm figure, final GraphicsAlgorithmContainer container) {
		
		eObject.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				for(Feature f : element.getFeatures()) {
					for(FeatureHandler fh : featureHandlers) {
						if(fh.accept(element, f) && evaluate(eObject, f.getConditional())) {
							fh.handle(element, f, figure, diagram, eObject, (ContainerShape) container);
						}
					}
				}
			}
		});
	}




	private boolean evaluate(EObject eObject, FeatureConditional cond) {
		if(cond == null)
			return true;

		EAttribute att = Util.matchAttribute(eObject.eClass(), cond.getModelAttribute());

		Object obj = eObject.eGet(att);

		if(obj == null)
			return false;

		Object v = getValue(cond.getValue());
		switch(cond.getOperator()) {
		case EQUAL: return obj.equals(v);
		case DIFFERENT: return !obj.equals(v);
		default: return false;
		}
	}


	private Object getValue(Value v) {
		if(v instanceof IntValue) return ((IntValue) v).getValue();
		if(v instanceof StringValue) return ((StringValue) v).getValue();

		return null;
	}

	@Override
	public void updateContainerFigures(ConnectableElement eObject,
			ContainerShape container, GraphicsAlgorithm child) {

		for(ConnectableElementHandler h : chain)
			if(h.accept(eObject))
				h.updateContainerFigures(eObject, container, child);

	}

//	@Override
//	public void updateNodeFigure(ConnectableElement element, Diagram diagram, ContainerShape shape, 
//			GraphicsAlgorithm figure, EObject eObject) {
//		for(ConnectableElementHandler h : chain)
//			if(h.accept(element))
//				h.updateNodeFigure(element, diagram, shape, null, null);
//
//		for(FeatureHandler h : featureHandlers)
//			if(h.accept(element, figure))
//				h.update(element, figure, eObject);
//
//
//	}

	@Override
	public void resizeNodeFigure(ConnectableElement eObject, Diagram diagram, ContainerShape container, Dimension size) {
		for(ConnectableElementHandler h : chain)
			if(h.accept(eObject))
				h.resizeNodeFigure(eObject, diagram, container, size);

	}

	@Override
	public void removeContainerFigures(ConnectableElement eObject, Diagram diagram, GraphicsAlgorithm figure) {
		for(ConnectableElementHandler h : chain)
			if(h.accept(eObject))
				h.removeContainerFigures(eObject, diagram, figure);

	}



}
