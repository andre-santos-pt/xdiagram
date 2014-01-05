package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Rectangle;
import org.eclipselabs.xdiagram.dsl.Size;

public class SizeHandler implements FeatureHandler {

	@Override
	public boolean accept(FeatureContainer element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof Size;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
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
	public boolean acceptDefaults(FeatureContainer element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return element instanceof ConnectableElement;
	}
	
	@Override
	public void setDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		Graphiti.getGaService().setSize(figure, 100, 50);
	}

	
}
