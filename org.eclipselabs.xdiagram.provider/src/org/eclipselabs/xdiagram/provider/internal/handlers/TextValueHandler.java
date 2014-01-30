package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.TextValue;

public class TextValueHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return TextValue.class;
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, final GraphicsAlgorithm figure) {
		TextValue v = (TextValue) feature;
		String value = "";
		final EAttribute att = v.getModelAttribute();
		if(att != null) {
			value += eObject.eGet(att);
			eObject.eAdapters().add(new AdapterImpl() {	
				@Override
				public void notifyChanged(Notification notification) {
					if(att.equals(notification.getFeature()))
						((AbstractText) figure).setValue(notification.getNewStringValue());
				}
			});
			
		}
		else {
			value += v.getText();
		}
		((AbstractText) figure).setValue(value + "");
	}

	

	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		if(figure instanceof AbstractText)
			((AbstractText) figure).setValue("?");
	}
}
