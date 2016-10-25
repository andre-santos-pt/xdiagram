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
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import pt.iscte.xdiagram.dsl.model.ConnectableElement;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.FontProperties;
import pt.iscte.xdiagram.dsl.model.Label;
import pt.iscte.xdiagram.dsl.model.TextAlign;
import pt.iscte.xdiagram.dsl.model.Visible;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class FontHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return FontProperties.class;
	}
	

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
	
		Text text = (Text) figure;
	
		FontProperties props = (FontProperties) feature;
		
		String face = props.getFace();
		if(face == null)
			face = "arial";
		
		int size = props.getSize();
		if(size == 0)
			size = 12;
		
		Font font = Graphiti.getGaService().manageFont(diagram, face, size, props.isItalics(), props.isBold());
		text.setFont(font);		
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Font font = Graphiti.getGaService().manageFont(diagram, "arial", 12);
		((Text) figure).setFont(font);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof Label;
	}
}
