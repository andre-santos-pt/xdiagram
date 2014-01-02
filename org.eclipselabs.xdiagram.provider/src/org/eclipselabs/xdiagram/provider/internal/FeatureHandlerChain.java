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
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional;
import org.eclipselabs.xdiagram.xtext.xdiagram.IntValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.StringValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Value;

public class FeatureHandlerChain implements Iterable<FeatureHandler> {

	private List<FeatureHandler> handlers;

	public FeatureHandlerChain() {
		handlers = new ArrayList<>();
	}

	@Override
	public Iterator<FeatureHandler> iterator() {
		return handlers.iterator();
	}

	public FeatureHandlerChain add(FeatureHandler h) {
		handlers.add(h);
		return this;
	}

	public void update(Element element, EObject eObject, Diagram diagram, GraphicsAlgorithm figure, ContainerShape container) {
		
		Set<Class<?>> defined = new HashSet<>();

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
	
	}

	
	private void addListener(final Element element,
			final Diagram diagram, final EObject eObject,
			final GraphicsAlgorithm figure, final ContainerShape container) {
		
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
}
