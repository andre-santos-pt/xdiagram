package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.awt.Dimension;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.DimensionFactor;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Point;

public class PointHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Point.class;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		if(figure instanceof Polyline) {
			Point point = (Point) feature;
			org.eclipse.graphiti.mm.algorithms.styles.Point p = StylesFactory.eINSTANCE.createPoint();
			p.setX(point.getX());
			p.setY(point.getY());
			((Polyline) figure).getPoints().add(p);
		}
	}
	

	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {

	}
	
	
	@Override
	public boolean isStyle() {
		return false;
	}

	@Override
	public void update(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram,
			GraphicsAlgorithmContainer container, GraphicsAlgorithm figure,
			java.awt.Point location, DimensionFactor diff) {
		// TODO Auto-generated method stub
		
	}
	
}