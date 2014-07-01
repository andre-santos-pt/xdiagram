package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Position;
import org.eclipselabs.xdiagram.provider.LanguageProvider;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class PositionHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Position.class;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Position p = (Position) feature;
		Graphiti.getGaService().setLocation(figure, p.getX(), p.getY());
		
	}
	
	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		if(accept(element, figure.getPictogramElement()))
			Graphiti.getGaService().setLocation(figure, 5, 5);
	}

	// TODO review
	private boolean accept(FeatureContainer element, GraphicsAlgorithmContainer container) {
		return element instanceof ConnectableElement &&
				!(container instanceof ContainerShape && ((ContainerShape) container).getContainer() instanceof Diagram) && 
				(!(container instanceof ContainerShape && ((ContainerShape) container).isActive()) ||
				LanguageProvider.hasFeature((ConnectableElement) element, Contains.class, false));
	}
}
