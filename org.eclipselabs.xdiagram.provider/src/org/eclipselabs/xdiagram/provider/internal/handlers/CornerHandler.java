package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.awt.Dimension;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.DimensionFactor;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.Corner;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.LineWidth;
import org.eclipselabs.xdiagram.dsl.Rectangle;

public class CornerHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Corner.class;
	}

	/**
	 *  este pode assumir que:
	 *  feature e Corner (por causa de getTargetFeature)
	 *  element e valido de acordo com a gramatica
	 */
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Corner angle = (Corner) feature;
		RoundedRectangle r = (RoundedRectangle) figure;
		r.setCornerWidth(angle.getAngle());
		r.setCornerHeight(angle.getAngle());
	}

	/**
	 * este nao assume nada, tem que ser defensivo
	 * quando nao ha defaults (pe. Point), fica vazio
	 */
	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		if(element instanceof Rectangle) {
			RoundedRectangle r = (RoundedRectangle) figure;
			r.setCornerWidth(0);
			r.setCornerHeight(0);
		}
	}

	
	@Override
	public boolean isStyle() {
		return true;
	}

	@Override
	public void update(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram,
			GraphicsAlgorithmContainer container, GraphicsAlgorithm figure,
			java.awt.Point location, DimensionFactor diff) {
		// TODO Auto-generated method stub
		
	}

}
