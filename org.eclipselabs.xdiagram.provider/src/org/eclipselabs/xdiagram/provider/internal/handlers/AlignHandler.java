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
package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Label;
import pt.iscte.xdiagram.dsl.model.TextAlign;

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
