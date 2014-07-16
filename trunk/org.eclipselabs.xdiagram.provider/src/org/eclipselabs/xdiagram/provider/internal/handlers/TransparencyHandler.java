package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Transparency;
import org.eclipselabs.xdiagram.dsl.Visible;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class TransparencyHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Transparency.class;
	}
	

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
			
		figure.setTransparency(((Transparency) feature).getPercent()/100.0);
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		figure.setTransparency(0.0);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return true;
	}
}