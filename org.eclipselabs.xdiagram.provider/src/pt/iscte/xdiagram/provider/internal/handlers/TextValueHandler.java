/*******************************************************************************
 * Copyright (c) 2016 ISCTE-IUL.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André L. Santos, Eduardo Gomes - initial API and implementation
 *******************************************************************************/
package pt.iscte.xdiagram.provider.internal.handlers;

import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Label;
import pt.iscte.xdiagram.dsl.model.TextPart;
import pt.iscte.xdiagram.dsl.model.TextValue;
import pt.iscte.xdiagram.provider.internal.FeatureHandler;

public class TextValueHandler implements FeatureHandler {

	private Map<AbstractText, EObject> objects;
	private Map<AbstractText, EAttribute> attributes;

	public TextValueHandler() {
		objects = new WeakHashMap<>();
		attributes = new WeakHashMap<>();
	}

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return TextValue.class;
	}


	@Override
	public void handle(FeatureContainer element, Feature feature, final EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, final GraphicsAlgorithm figure) {
		final TextValue textValue = (TextValue) feature;
		AbstractText text = (AbstractText) figure;
		text.setValue(calcString(textValue, eObject));

		objects.put(text, eObject);

		for(TextPart part : textValue.getParts()) {
			final EAttribute att = part.getModelAttribute();
			if(att != null) {

				// TODO: memory leak
				eObject.eAdapters().add(new AdapterImpl() {	
					@Override
					public void notifyChanged(Notification notification) {
						if(att.equals(notification.getFeature()))
							((AbstractText) figure).setValue(calcString(textValue, eObject));
					}
				});


				if(part.isEditable())
					attributes.put(text, att);
			}

		}
	}

	private static String calcString(TextValue textValue, EObject eObject) {
		String value = "";

		for(TextPart part : textValue.getParts()) {
			EAttribute att = part.getModelAttribute();
			if(att != null)
				value += eObject.eGet(att);
			else 
				value += part.getText();
		}
		return value;
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

	public boolean isLabelEditable(AbstractText text) {
		return attributes.containsKey(text);
	}

	public EObject getLabelEObject(GraphicsAlgorithm text) {
		return objects.get(text);
	}

	public EAttribute getEditableEAttribute(GraphicsAlgorithm text) {
		return attributes.get(text);
	}
}
