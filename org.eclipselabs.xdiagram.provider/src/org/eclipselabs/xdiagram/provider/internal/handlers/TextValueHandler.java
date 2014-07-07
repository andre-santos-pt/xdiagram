package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EAdapterList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.TextValue;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class TextValueHandler implements FeatureHandler {

//	private static class TextListener extends AdapterImpl {
//		
//		@Override
//		public void notifyChanged(Notification notification) {
//			if(att.equals(notification.getFeature()))
//				((AbstractText) figure).setValue(notification.getNewStringValue());
//		}
//	}

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
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		if(figure instanceof AbstractText)
			((AbstractText) figure).setValue("?");
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof Label;
	}
}
