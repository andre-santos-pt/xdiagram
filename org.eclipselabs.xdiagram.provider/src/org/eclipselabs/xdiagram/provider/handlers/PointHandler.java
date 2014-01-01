package org.eclipselabs.xdiagram.provider.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.mm.algorithms.styles.impl.PointImpl;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Point;
import org.eclipselabs.xdiagram.xtext.xdiagram.Size;

public class PointHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature) {
		return feature instanceof Point;
	}

	@Override
	public void handle(Element element, Feature feature, GraphicsAlgorithm figure, Diagram diagram, EObject eObject, GraphicsAlgorithmContainer container) {
		
		if(figure instanceof Polyline) {
			Point point = (Point) feature;
			org.eclipse.graphiti.mm.algorithms.styles.Point p = StylesFactory.eINSTANCE.createPoint();
			p.setX(point.getX());
			p.setY(point.getY());
			((Polyline) figure).getPoints().add(p);
		}
	}
	
	@Override
	public boolean accept(Element element, GraphicsAlgorithm figure) {
		return false;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {

	}

	

	
}
