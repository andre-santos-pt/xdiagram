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
package pt.iscte.xdiagram.interpreter.internal.features;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;

import pt.iscte.xdiagram.interpreter.internal.GenericFeatureProvider;

public class DirectEditingFeature extends AbstractDirectEditingFeature {

	private GenericFeatureProvider provider;

	public DirectEditingFeature(GenericFeatureProvider provider) {
		super(provider);
		this.provider = provider;
	}

	public int getEditingType() {
		// there are several possible editor-types supported:
		// text-field, checkbox, color-chooser, combobox, ...
		// TODO: ver interessante
		return org.eclipse.graphiti.func.IDirectEditing.TYPE_TEXT;
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		if(!(ga instanceof AbstractText))
			return false;

		return provider.getGraphicsProvider().canEditFigureLabel((AbstractText) ga);
	}


	@Override	
	public String getInitialValue(IDirectEditingContext context) {
		AbstractText text = (AbstractText) context.getGraphicsAlgorithm();
		EObject eObject = provider.getGraphicsProvider().getLabelEObject(text);
		EAttribute att = provider.getGraphicsProvider().getTextEditableAttribute(text);
		return "" + eObject.eGet(att); 
	}

	@Override
	public void setValue(String value, IDirectEditingContext context) {
		AbstractText text = (AbstractText) context.getGraphicsAlgorithm();
		EObject eObject = provider.getGraphicsProvider().getLabelEObject(text);
		EAttribute att = provider.getGraphicsProvider().getTextEditableAttribute(text);
		eObject.eSet(att, value);
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		//	    if (value.length() < 1)
		//	        return "Please enter any text.";

		// null means, that the value is valid
		return null;
	}

}
