package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.awt.Dimension;
import java.awt.Point;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.LanguageProvider;
import org.eclipselabs.xdiagram.provider.internal.DimensionFactor;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Position;

public class PositionHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Position.class;
	}
	
	@Override
	public boolean isStyle() {
		return false;
	}

	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		if(accept(element, figure.getPictogramElement()))
			Graphiti.getGaService().setLocation(figure, 5, 5);
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		update(element, feature, eObject, diagram, container, figure,
				new Point(0, 0), new DimensionFactor(1.0, 1.0));
	}
	
	@Override
	public void update(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure, 
			Point location, DimensionFactor scale){		
		Position p = (Position) feature;
		p.setX(location.x+(int)(p.getX()*scale.getWidth()));
		p.setY(location.y+(int)(p.getY()*scale.getHeight()));
		Graphiti.getGaService().setLocation(figure, p.getX(), p.getY());
	}
	

	// TODO review
	private boolean accept(FeatureContainer element, GraphicsAlgorithmContainer container) {
		return element instanceof ConnectableElement &&
				!(container instanceof ContainerShape && ((ContainerShape) container).getContainer() instanceof Diagram) && 
				(!(container instanceof ContainerShape && ((ContainerShape) container).isActive()) ||
				LanguageProvider.hasFeature((ConnectableElement) element, Contains.class, false));
	}

	
}
