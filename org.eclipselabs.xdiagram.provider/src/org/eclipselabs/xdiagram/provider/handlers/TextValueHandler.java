package org.eclipselabs.xdiagram.provider.handlers;

import javax.naming.NoInitialContextException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.internal.GraphitiUIPlugin;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.TextValue;

public class TextValueHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature) {
		return feature instanceof TextValue;
	}

	@Override
	public void handle(Element element, Feature feature, final GraphicsAlgorithm figure, Diagram diagram, EObject eObject, GraphicsAlgorithmContainer container) {
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
	public boolean accept(Element element, GraphicsAlgorithm figure) {
		return figure instanceof AbstractText;
	}
	
	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		((AbstractText) figure).setValue("?");
	}

}
