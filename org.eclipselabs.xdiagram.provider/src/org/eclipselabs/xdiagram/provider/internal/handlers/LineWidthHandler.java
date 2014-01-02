package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth;

public class LineWidthHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, ContainerShape container) {
		return feature instanceof LineWidth;
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, ContainerShape container, GraphicsAlgorithm figure) {
		LineWidth lineWidth = (LineWidth) feature;	
		figure.setLineWidth(lineWidth.getWidth());
	}
	
	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, ContainerShape container) {
		return true;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		figure.setLineWidth(1);
	}

	
}
