package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Visible;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class VisibleHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Visible.class;
	}
	

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
			
		figure.getPictogramElement().setVisible(false);
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		figure.getPictogramElement().setVisible(true);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return true;
	}
}