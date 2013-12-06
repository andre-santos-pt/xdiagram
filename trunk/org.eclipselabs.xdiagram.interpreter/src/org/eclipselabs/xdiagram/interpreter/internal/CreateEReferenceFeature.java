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
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;

public class CreateEReferenceFeature extends AbstractCreateConnectionFeature {
	private EReference eReference;
	private EClass sourceType;
	private EClass targetType;
	private GraphicsProvider provider;
	
	public CreateEReferenceFeature(GenericFeatureProvider fp, EReference eReference) {
		super(fp, eReference.getName(), tooltip(eReference));
		this.eReference = eReference;
		sourceType = (EClass) eReference.eContainer();
		targetType = (EClass) eReference.getEType();
		provider = fp.getGraphicsProvider();
	}

	private static String tooltip(EReference eReference) {
		return "Connect " + ((EClass) eReference.eContainer()).getClass().getName() + " to " + eReference.getEReferenceType().getName();
	}
	
	public boolean canCreate(ICreateConnectionContext context) {
		Anchor sourceAnchor = context.getSourceAnchor();
		Anchor targetAnchor = context.getTargetAnchor();
		EObject source = getEObject(sourceAnchor);
		return 
				sourceAnchor != null && 
				targetAnchor != null &&
				provider.isValidOutgoingConnection(sourceAnchor, eReference) &&
				provider.isValidIncomingConnection(targetAnchor, eReference) &&
				ECoreUtil.enoughUpperBound(eReference, source);
	}

	

	public boolean canStartConnection(ICreateConnectionContext context) {
		Anchor anchor = context.getSourceAnchor();
		EObject source = getEObject(anchor);
		return 
				sourceType.isInstance(source) &&
				provider.isValidOutgoingConnection(anchor, eReference) &&
				ECoreUtil.enoughUpperBound(eReference, source);
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		EObject source = getEObject(context.getSourceAnchor());
		EObject target = getEObject(context.getTargetAnchor());
	
		if (sourceType.isInstance(source) && targetType.isInstance(target)) {	
			ECoreUtil.setReference(source, eReference, target);
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;
	}

	private EObject getEObject(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor.getParent());
			if (obj instanceof EObject) {
				return (EObject) obj;
			}
		}
		return null;
	}
}
