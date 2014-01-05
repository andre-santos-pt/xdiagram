package org.eclipselabs.xdiagram.provider.internal;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
import org.eclipselabs.xdiagram.dsl.BooleanValue;
import org.eclipselabs.xdiagram.dsl.Custom;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.EnumValue;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureConditional;
import org.eclipselabs.xdiagram.dsl.IntValue;
import org.eclipselabs.xdiagram.dsl.StringValue;
import org.eclipselabs.xdiagram.dsl.Value;

public class FeatureHandlerChain  {

	private List<FeatureHandler> handlers;

	public FeatureHandlerChain() {
		handlers = new ArrayList<>();
	}

	public FeatureHandlerChain add(FeatureHandler h) {
		handlers.add(h);
		return this;
	}

	public Set<Class<?>> update(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		Set<Class<?>> defined = null;
				
		if(element instanceof Custom)
			defined = update(((Custom) element).getFigure().getElement(), eObject, diagram, figure, container);
		else
			defined = new HashSet<>();

		boolean existsConditional = false;
		
		for(Feature f : element.getFeatures()) {
			if(f.getConditional() != null)
				existsConditional = true;
				
			boolean accepted = false;
			for(FeatureHandler fh : handlers) {
				if(fh.accept(element, f, container)) {
					accepted = true;
					if(evaluate(eObject, f.getConditional())) {
						fh.handle(element, f, eObject, diagram, container, figure);
						defined.add(fh.getClass());
					}
				}
			}
			if(!accepted)
				System.err.println("not supported: " + f);
		}
		
		if(existsConditional)
			addListener(element, diagram, eObject, figure, container);

		for(FeatureHandler fh : handlers)
			if(!defined.contains(fh.getClass()) && fh.acceptDefaults(element, figure, container))
				fh.setDefaults(element, figure, diagram);
		
		return defined;
	}

	
	private void addListener(final FeatureContainer element,
			final Diagram diagram, final EObject eObject,
			final GraphicsAlgorithm figure, final GraphicsAlgorithmContainer container) {
		
		eObject.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				for(Feature f : element.getFeatures()) {
					for(FeatureHandler fh : handlers) {
						if(fh.accept(element, f, container) && evaluate(eObject, f.getConditional())) {
							fh.handle(element, f, eObject, diagram, container, figure);
						}
					}
				}
			}
		});
	}

	
	private boolean evaluate(EObject eObject, FeatureConditional cond) {
		if(cond == null)
			return true;

//		EAttribute att = Util.matchAttribute(eObject.eClass(), cond.getModelAttribute());

		Object obj = eObject.eGet(cond.getModelAttribute());

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
		if(v instanceof BooleanValue) return Boolean.parseBoolean(((BooleanValue) v).getValue().name().toLowerCase());
//		if(v instanceof EnumValue) return null; // TODO enum
		return null;
	}
}
