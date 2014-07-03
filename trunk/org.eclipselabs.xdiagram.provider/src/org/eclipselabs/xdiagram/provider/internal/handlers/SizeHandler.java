package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Rectangle;
import org.eclipselabs.xdiagram.dsl.Size;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class SizeHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Size.class;
	}
	
	
	
	private static class Dim {
		int width;
		int height;
		
		Dim(int w, int h) {
			width = w;
			height = h;
		}
		void maximize(int w, int h) {
			if(w > width)
				width = w;
			
			if(h > height)
				height = h;
		}
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
		
		Dim max = maximize(figure, w, h);
		
		Graphiti.getGaService().setSize(figure, max.width, max.height);
	}




	private Dim maximize(GraphicsAlgorithm figure, int w, int h) {
		Dim max = new Dim(w, h);
		
		ContainerShape cont = (ContainerShape) figure.eContainer();
		
		for(Shape child : cont.getChildren()) {
			GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
			IDimension dim = Graphiti.getGaService().calculateSize(ga);
			int x = ga.getX() + dim.getWidth();
			int y = ga.getY() + dim.getHeight();
			max.maximize(x, y);
		}
		return max;
	}
	
	
	
	
	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram, GraphicsAlgorithmContainer container) {
		
		Dim max = maximize(figure, 100, 50);
		
		Graphiti.getGaService().setSize(figure, max.width, max.height);
//		if(element instanceof ConnectableElement)
//			Graphiti.getGaService().setSize(figure, 100, 50);
	}

	
}
