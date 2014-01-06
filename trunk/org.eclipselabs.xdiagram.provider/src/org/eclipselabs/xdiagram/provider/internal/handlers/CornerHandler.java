package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.Corner;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.LineWidth;

public class CornerHandler implements FeatureHandler {

	@Override
	public boolean accept(FeatureContainer element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof Corner;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Corner angle = (Corner) feature;
		if ( figure instanceof RoundedRectangle ){
			((RoundedRectangle)figure).setCornerWidth(angle.getAngle());
			((RoundedRectangle)figure).setCornerHeight(angle.getAngle());
		}
	}
	
	@Override
	public boolean acceptDefaults(FeatureContainer element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return true;
	}
	
	@Override
	public void setDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		if ( figure instanceof RoundedRectangle ){
			((RoundedRectangle)figure).setCornerWidth(0);
			((RoundedRectangle)figure).setCornerHeight(0);
		}
	}

	
}
