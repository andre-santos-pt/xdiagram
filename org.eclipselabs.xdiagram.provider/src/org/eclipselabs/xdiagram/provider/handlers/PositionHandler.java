package org.eclipselabs.xdiagram.provider.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Position;
import org.eclipselabs.xdiagram.xtext.xdiagram.Size;

public class PositionHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature) {
		return feature instanceof Position;
	}

	@Override
	public void handle(Element element, Feature feature, GraphicsAlgorithm figure, Diagram diagram, EObject eObject, GraphicsAlgorithmContainer container) {
		Position p = (Position) feature;
		Graphiti.getGaService().setLocation(figure, p.getX(), p.getY());
	}
	
	@Override
	public boolean accept(Element element, GraphicsAlgorithm figure) {
		return element instanceof ConnectableElement;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		Graphiti.getGaService().setLocation(figure, 5, 5);
	}

	
}
