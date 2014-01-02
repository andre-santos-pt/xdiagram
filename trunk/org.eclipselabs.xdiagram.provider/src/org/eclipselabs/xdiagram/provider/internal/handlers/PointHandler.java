package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.Element;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Point;

public class PointHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof Point;
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		
		if(figure instanceof Polyline) {
			Point point = (Point) feature;
			org.eclipse.graphiti.mm.algorithms.styles.Point p = StylesFactory.eINSTANCE.createPoint();
			p.setX(point.getX());
			p.setY(point.getY());
			((Polyline) figure).getPoints().add(p);
		}
	}
	
	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return false;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {

	}

	

	
}
