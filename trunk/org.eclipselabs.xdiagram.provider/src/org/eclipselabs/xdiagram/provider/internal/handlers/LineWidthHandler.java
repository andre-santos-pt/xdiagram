package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.LineWidth;

public class LineWidthHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return LineWidth.class;
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		LineWidth lineWidth = (LineWidth) feature;	
		figure.setLineWidth(lineWidth.getWidth());
	}
	
	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		figure.setLineWidth(1);
	}

	
}
