/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipselabs.xdiagram.interpreter.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;

public abstract class AbstractCreateEReferenceFeature extends AbstractCreateConnectionFeature {
	protected final EReference eReference;
	protected final EClass sourceType;
	protected final EClass targetType;
	protected final GraphicsProvider provider;
	
	public AbstractCreateEReferenceFeature(
			GenericFeatureProvider fp, EReference eReference, 
			EClass sourceType, EClass targetType) {
		
		super(fp, eReference.getName(), tooltip(sourceType, targetType));
		
		this.eReference = eReference;
		this.sourceType = sourceType;
		this.targetType = targetType;
		provider = fp.getGraphicsProvider();
	}

	private static String tooltip(EClass sourceType, EClass targetType) {
		return "Connect " + sourceType.getName() + " to " + targetType.getName();
	}
	
	public boolean canCreate(ICreateConnectionContext context) {
		Anchor sourceAnchor = context.getSourceAnchor();
		Anchor targetAnchor = context.getTargetAnchor();
		EObject source = getEObject(sourceAnchor);
		EObject target = getEObject(targetAnchor);
		
		return 	validOutgoing(sourceAnchor, source) &&
				targetAnchor != null &&
				targetType.isInstance(target) &&
				provider.isValidIncomingConnection(targetAnchor, eReference);
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		Anchor anchor = context.getSourceAnchor();
		EObject source = getEObject(anchor);
		return validOutgoing(anchor, source);
	}
	
	private boolean validOutgoing(Anchor sourceAnchor, EObject source) {
		return sourceAnchor != null &&
		sourceType.isInstance(source) &&
		provider.isValidOutgoingConnection(sourceAnchor, eReference) &&
		ECoreUtil.enoughUpperBound(eReference, source);
	}

	
	protected EObject getEObject(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor.getParent());
			if (obj instanceof EObject) {
				return (EObject) obj;
			}
		}
		return null;
	}
}
