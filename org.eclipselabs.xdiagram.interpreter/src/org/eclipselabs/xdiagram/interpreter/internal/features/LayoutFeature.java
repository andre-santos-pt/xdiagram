package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

public class LayoutFeature extends AbstractLayoutFeature {

	public LayoutFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		return true;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		PictogramElement e = context.getPictogramElement();
		if(e instanceof ContainerShape) {
			ContainerShape container = (ContainerShape) e;
			int x = 5;
			for(Shape shape : container.getChildren()) {
				GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();
				Graphiti.getGaLayoutService().setLocation(figure, x, x);
				x+=30;
			}
		}
		return true;
	}

	
}
