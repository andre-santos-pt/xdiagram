package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.ContainerLayout;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Layout;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

import com.google.common.collect.Maps;

public class LayoutHandler implements FeatureHandler {

	private Map<FeatureContainer, ContainerLayout> layouts;
	
	public LayoutHandler() {
		layouts = Maps.newHashMap();
	}
	
	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Layout.class;
	}
	

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
		
		Layout layout = (Layout) feature;
		layouts.put(element, layout.getLayout());
			
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
//		layouts.put(element, ContainerLayout.FREE);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof ConnectableElement;
	}
	
	public ContainerLayout getLayout(EObject element) {
		return layouts.containsKey(element) ? layouts.get(element) : ContainerLayout.FREE;
	}
}
