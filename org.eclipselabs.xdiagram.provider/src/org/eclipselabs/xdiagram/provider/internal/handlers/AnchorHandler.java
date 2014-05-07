package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.awt.Dimension;

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
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Position;
import org.eclipselabs.xdiagram.provider.internal.DimensionFactor;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class AnchorHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Anchor.class;
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject,
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
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		
	}
	
	
	@Override
	public boolean isStyle() {
		return false;
	}

	@Override
	public void update(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram,
			GraphicsAlgorithmContainer container, GraphicsAlgorithm figure,
			java.awt.Point location, DimensionFactor diff) {
		// TODO Auto-generated method stub
		
	}
	
}
