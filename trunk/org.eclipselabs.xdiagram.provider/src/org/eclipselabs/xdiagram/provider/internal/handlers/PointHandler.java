package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Point;

public class PointHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, ContainerShape container) {
		return feature instanceof Point;
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, ContainerShape container, GraphicsAlgorithm figure) {
		
		if(figure instanceof Polyline) {
			Point point = (Point) feature;
			org.eclipse.graphiti.mm.algorithms.styles.Point p = StylesFactory.eINSTANCE.createPoint();
			p.setX(point.getX());
			p.setY(point.getY());
			((Polyline) figure).getPoints().add(p);
		}
	}
	
	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, ContainerShape container) {
		return false;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {

	}

	

	
}
