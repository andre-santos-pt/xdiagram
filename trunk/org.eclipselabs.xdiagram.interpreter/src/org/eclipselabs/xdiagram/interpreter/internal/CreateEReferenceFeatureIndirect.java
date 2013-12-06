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

public class CreateEReferenceFeatureIndirect extends AbstractCreateConnectionFeature {
	private final EReference eReference;
	private final EClass sourceType;
	private final EReference targetRef;
	private GraphicsProvider provider;
	
	public CreateEReferenceFeatureIndirect(GenericFeatureProvider fp, EReference eReference, EReference target, EClass objectType) {
		super(fp, objectType.getName(), "indirect");
		this.eReference = eReference;
		this.sourceType = (EClass) eReference.eContainer();
		this.targetRef = target;
		provider = fp.getGraphicsProvider();
	}

	public boolean canCreate(ICreateConnectionContext context) {
		Anchor sourceAnchor = context.getSourceAnchor();
		Anchor targetAnchor = context.getTargetAnchor();
//		EObject source = getEObject(sourceAnchor);
//		EObject target = getEObject(targetAnchor);
		
		return 
				sourceAnchor != null && 
				targetAnchor != null &&
				provider.isValidOutgoingConnection(sourceAnchor, eReference) &&
				provider.isValidIncomingConnection(targetAnchor, targetRef);
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		Anchor anchor = context.getSourceAnchor();
		return 
				anchor != null &&
				sourceType.isInstance(getEObject(anchor)) &&
				provider.isValidOutgoingConnection(anchor, eReference);
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		EObject sourceObj = getEObject(context.getSourceAnchor());
		EObject targetObj = getEObject(context.getTargetAnchor());
	
		if (sourceType.isInstance(sourceObj) && targetRef.getEType().isInstance(targetObj)) {

			EObject eObject = sourceType.getEPackage().getEFactoryInstance().create((EClass) eReference.getEType());
			eObject.eSet(targetRef, targetObj);
			
			ECoreUtil.setReference(sourceObj, eReference, eObject);
//			Object obj = sourceObj.eGet(eReference);
//			if(obj instanceof List)
//				((List) obj).add(eObject);
//			else
//				sourceObj.eSet(eReference, eObject);
				
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(eObject);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;
	}

	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
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
