package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.dsl.Anchor;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Element;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Position;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class AnchorHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof Anchor && container instanceof org.eclipse.graphiti.mm.pictograms.Anchor;
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject,
			Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Anchor anchor = (Anchor) feature;
		org.eclipse.graphiti.mm.pictograms.Anchor gAnchor = (org.eclipse.graphiti.mm.pictograms.Anchor) container;
		ConnectableElement e = (ConnectableElement) element;
		for(Feature f : e.getFeatures())
			if(f instanceof Position) {
				Position p = (Position) f;
				Graphiti.getGaLayoutService().setLocation(gAnchor.getGraphicsAlgorithm(), p.getX(), p.getY());
			}
	}

	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return true;
	}

	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		Graphiti.getPeCreateService().createChopboxAnchor((ContainerShape)figure.getPictogramElement());
	}
	
}
