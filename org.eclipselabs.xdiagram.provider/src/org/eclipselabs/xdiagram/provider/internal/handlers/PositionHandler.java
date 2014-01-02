package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.LanguageProvider;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Element;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Position;

public class PositionHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof Position && element instanceof ConnectableElement && accept(element, container);
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Position p = (Position) feature;
		Graphiti.getGaService().setLocation(figure, p.getX(), p.getY());
		
	}
	
	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return element instanceof ConnectableElement && accept(element, container);
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		Graphiti.getGaService().setLocation(figure, 5, 5);
	}

	private boolean accept(Element element, GraphicsAlgorithmContainer container) {
		return element instanceof ConnectableElement &&
				!(container instanceof ContainerShape && ((ContainerShape) container).getContainer() instanceof Diagram) && 
				(!(container instanceof ContainerShape && ((ContainerShape) container).isActive()) ||
				LanguageProvider.hasFeature((ConnectableElement) element, Contains.class, false));
	}
}
