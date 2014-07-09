package org.eclipselabs.xdiagram.provider.internal;



import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.Custom;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Visible;
import org.eclipselabs.xdiagram.provider.LanguageProvider;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

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

		if(element instanceof Custom)
			update(((Custom) element).getFigure().getElement(), eObject, diagram, figure, container);

		boolean existsConditional = false;

		// defaults are applied first
		for(Class<? extends Feature> cf : handlers.keys()) {
			if(cf.equals(Visible.class) || !LanguageProvider.hasFeature(element, cf, false))
				for(FeatureHandler fh : handlers.get(cf))
					if(fh.accept(element))
						fh.applyDefaults(element, eObject, diagram, container, figure);
		}
			
		for(Feature f : element.getFeatures()) {
			if(f.getConditional() != null)
				existsConditional = true;

			Collection<FeatureHandler> compatible = handlers.get(matchFeature(f));
			if(compatible.isEmpty())
				System.err.println("not supported: " + f);
			else {
				for(FeatureHandler fh : compatible) {
					if(fh.accept(element) && FeatureConditionals.evaluate(eObject, f.getConditional())) {
						fh.handle(element, f, eObject, diagram, container, figure);
					}
				}
			}
		}

		if(existsConditional && eObject != null)
			addListener(element, diagram, eObject, figure, container);

	}

	private Class<? extends Feature> matchFeature(Feature f) {
		return (Class<? extends Feature>) f.getClass().getInterfaces()[0];
	}
	
	private void addListener(final FeatureContainer element,
			final Diagram diagram, final EObject eObject,
			final GraphicsAlgorithm figure, final GraphicsAlgorithmContainer container) {

		eObject.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				for(Feature f : element.getFeatures()) {
					for(FeatureHandler fh : handlers.get(matchFeature(f))) {
						if(fh.accept(element) && FeatureConditionals.evaluate(eObject, f.getConditional()))
							fh.handle(element, f, eObject, diagram, container, figure);
					}
				}
			}
		});
	}


	
}
