package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.LineStyle;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class LineStyleHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return LineStyle.class;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		LineStyle lineStyle = (LineStyle) feature;
		org.eclipse.graphiti.mm.algorithms.styles.LineStyle s = org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID;

		if(lineStyle.getStyle() != null) {
			switch(lineStyle.getStyle()) {
			case SOLID: s = org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID; break;
			case DASH: s =  org.eclipse.graphiti.mm.algorithms.styles.LineStyle.DASH; break;
			case DOT: s = org.eclipse.graphiti.mm.algorithms.styles.LineStyle.DOT; break;
			}
		}
		figure.setLineStyle(s);
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		figure.setLineStyle(org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return true;
	}


}
