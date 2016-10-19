package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import pt.iscte.xdiagram.dsl.model.Corner;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Rectangle;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

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
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		RoundedRectangle r = (RoundedRectangle) figure;
		r.setCornerWidth(0);
		r.setCornerHeight(0);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof Rectangle;
	}


}
