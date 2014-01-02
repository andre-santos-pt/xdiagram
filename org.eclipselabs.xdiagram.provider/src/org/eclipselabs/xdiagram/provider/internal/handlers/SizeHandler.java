package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle;
import org.eclipselabs.xdiagram.xtext.xdiagram.Size;

public class SizeHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, ContainerShape container) {
		return feature instanceof Size;
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, ContainerShape container, GraphicsAlgorithm figure) {
		Size size = (Size) feature;
		int w = size.getWidth();
		int h = size.getHeight();
		
		if(element instanceof Rectangle && ((Rectangle) element).isSquare() ||
		   element instanceof Ellipse && ((Ellipse) element).isCircle()) {
			int max = Math.max(w, h);
			w = max;
			h = max;
		}
		Graphiti.getGaService().setSize(figure, w, h);
	}
	
	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, ContainerShape container) {
		return element instanceof ConnectableElement;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		Graphiti.getGaService().setSize(figure, 100, 50);
	}

	
}
