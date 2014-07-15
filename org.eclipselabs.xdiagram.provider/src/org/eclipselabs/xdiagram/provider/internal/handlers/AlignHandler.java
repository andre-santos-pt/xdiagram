package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.TextAlign;
import org.eclipselabs.xdiagram.dsl.Visible;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class AlignHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return TextAlign.class;
	}
	

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
	
		Text text = (Text) figure;
		switch(((TextAlign) feature).getValue()) {
		case LEFT: text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT); break;
		case CENTER: text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER); break;
		case RIGHT: text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT); break;
		}
		((Text) figure).setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		((Text) figure).setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		((Text) figure).setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof Label;
	}
}
