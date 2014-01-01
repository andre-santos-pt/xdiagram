package org.eclipselabs.xdiagram.provider.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth;
import org.eclipselabs.xdiagram.xtext.xdiagram.Size;

public class LineWidthHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature) {
		return feature instanceof LineWidth;
	}

	@Override
	public void handle(Element element, Feature feature, GraphicsAlgorithm figure, Diagram diagram, EObject eObject, GraphicsAlgorithmContainer container) {
		LineWidth lineWidth = (LineWidth) feature;	
		figure.setLineWidth(lineWidth.getWidth());
	}
	
	@Override
	public boolean accept(Element element, GraphicsAlgorithm figure) {
		return true;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		figure.setLineWidth(1);
	}

	
}
