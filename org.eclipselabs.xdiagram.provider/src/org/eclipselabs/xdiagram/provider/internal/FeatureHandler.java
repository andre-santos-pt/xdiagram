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
package org.eclipselabs.xdiagram.provider.internal;



import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;

public interface FeatureHandler {
	
	/**
	 * Supported feature
	 */
	Class<? extends Feature> getTargetFeature();
	
	/**
	 * Accepts the element?
	 * @param element
	 */
	boolean accept(FeatureContainer element);
		
	/**
	 * 
	 * @param element language element that holds the feature
	 * @param feature always of type equal to getTargetFeature()
	 * @param eObject model object associated with the element
	 * @param diagram
	 * @param container 
	 * @param figure
	 */
	void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure);
	
	
	/**
	 * Apply default values for the feature
	 * @param element
	 * @param eObject TODO
	 * @param diagram
	 * @param container TODO
	 * @param figure
	 */
	void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure);
}
