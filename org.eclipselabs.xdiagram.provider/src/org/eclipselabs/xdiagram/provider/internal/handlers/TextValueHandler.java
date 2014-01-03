package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.provider.internal.Util;
import org.eclipselabs.xdiagram.dsl.Element;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.TextValue;

public class TextValueHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof TextValue;
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, final GraphicsAlgorithm figure) {
		TextValue v = (TextValue) feature;
		String value = "";
		EAttribute att = v.getModelAttribute();
		if(att != null) {
			final EAttribute a = Util.matchAttribute(eObject.eClass(), att);	
			value += eObject.eGet(a);
			eObject.eAdapters().add(new AdapterImpl() {	
				@Override
				public void notifyChanged(Notification notification) {
					if(a.equals(notification.getFeature()))
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
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return figure instanceof AbstractText;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		((AbstractText) figure).setValue("?");
	}

}
