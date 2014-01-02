package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.LanguageProvider;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Position;

public class PositionHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, ContainerShape container) {
		return feature instanceof Position && accept(element, container);
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, ContainerShape container, GraphicsAlgorithm figure) {
		Position p = (Position) feature;
		Graphiti.getGaService().setLocation(figure, p.getX(), p.getY());
		
	}
	
	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, ContainerShape container) {
		return element instanceof ConnectableElement && accept(element, container);
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		Graphiti.getGaService().setLocation(figure, 10, 10);
	}

	private boolean accept(Element element, ContainerShape container) {
		return !(container.getContainer() instanceof Diagram) && 
				(!container.isActive() ||
				LanguageProvider.isContainer((ConnectableElement) element));
	}
}
