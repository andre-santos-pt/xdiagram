package org.eclipselabs.xdiagram.provider.internal;



import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.BooleanValue;
import org.eclipselabs.xdiagram.dsl.Custom;
import org.eclipselabs.xdiagram.dsl.EnumValue;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureConditional;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.IntValue;
import org.eclipselabs.xdiagram.dsl.StringValue;
import org.eclipselabs.xdiagram.dsl.Value;
import org.eclipselabs.xdiagram.provider.LanguageProvider;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

public class FeatureHandlerChain  {

	private ListMultimap<Class<? extends Feature>,FeatureHandler> handlers;

	public FeatureHandlerChain() {
		handlers = ArrayListMultimap.create();
	}

	public FeatureHandlerChain add(FeatureHandler h) {
		handlers.put(h.getTargetFeature(), h);
		return this;
	}

	public void update(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		update(element, eObject, diagram, figure, container, new HashSet<FeatureHandler>());
	}

	private void update(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container, Set<FeatureHandler> defined) {

		if(element instanceof Custom)
			update(((Custom) element).getFigure().getElement(), eObject, diagram, figure, container, defined);

		boolean existsConditional = false;

		// defaults are applied first
		for(Class<? extends Feature> cf : handlers.keys()) {
			if(!LanguageProvider.hasFeature(element, cf, false))
				for(FeatureHandler fh : handlers.get(cf))
					fh.applyDefaults(element, figure, diagram, container);
		}
			
		for(Feature f : element.getFeatures()) {
			if(f.getConditional() != null)
				existsConditional = true;

			Collection<FeatureHandler> compatible = handlers.get((Class<? extends Feature>) f.getClass().getInterfaces()[0]);
			if(compatible.isEmpty())
				System.err.println("not supported: " + f);
			else {
				for(FeatureHandler fh : compatible) {
					if(evaluate(eObject, f.getConditional())) {
						fh.handle(element, f, eObject, diagram, container, figure);
						defined.add(fh);
					}
				}
			}
		}

		if(existsConditional)
			addListener(element, diagram, eObject, figure, container);

//		for(FeatureHandler fh : handlers.values())
//			if(!defined.contains(fh))
//				fh.applyDefaults(element, figure, diagram);
	}

	//	private boolean contains(Class<? extends Feature> type, List<Feature> list) {
	//		for(Feature f : list) {
	//			if(f.getClass().equals(type))
	//				return true;
	//		}
	//		return false;
	//	}

	private void addListener(final FeatureContainer element,
			final Diagram diagram, final EObject eObject,
			final GraphicsAlgorithm figure, final GraphicsAlgorithmContainer container) {

		eObject.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				for(Feature f : element.getFeatures()) {
					for(FeatureHandler fh : handlers.get(f.getClass())) {
						if(evaluate(eObject, f.getConditional()))
							fh.handle(element, f, eObject, diagram, container, figure);
					}
				}
			}
		});
	}


	private boolean evaluate(EObject eObject, FeatureConditional cond) {
		if(cond == null)
			return true;

		EAttribute att = cond.getModelAttribute();

		Object obj = eObject.eGet(cond.getModelAttribute());

		if(obj == null)
			return false;

		Object v = getValue(cond.getValue(), att);
		switch(cond.getOperator()) {
		case EQUAL: return obj.equals(v);
		case DIFFERENT: return !obj.equals(v);
		default: return false;
		}
	}


	private Object getValue(Value v, EAttribute attribute) {
		if(v instanceof IntValue) return ((IntValue) v).getValue();
		if(v instanceof StringValue) return ((StringValue) v).getValue();
		if(v instanceof BooleanValue) return Boolean.parseBoolean(((BooleanValue) v).getValue().name().toLowerCase());
		if(v instanceof EnumValue) {
			String enumLit = ((EnumValue) v).getName();
			EEnum e = (EEnum) attribute.getEAttributeType();
			EEnumLiteral lit = e.getEEnumLiteral(enumLit);
			return lit;
		}
		return null;
	}
}
