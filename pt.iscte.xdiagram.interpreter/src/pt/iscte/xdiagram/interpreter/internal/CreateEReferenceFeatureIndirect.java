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
package pt.iscte.xdiagram.interpreter.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.mm.pictograms.Connection;

public class CreateEReferenceFeatureIndirect extends AbstractCreateEReferenceFeature {
	private final EReference targetRef;

	public CreateEReferenceFeatureIndirect(GenericFeatureProvider fp, EReference eReference, EReference target, EClass objectType) {
		super(fp, objectType.getName(), eReference, (EClass) eReference.eContainer(), target.getEReferenceType());
		this.targetRef = target;
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		EObject sourceObj = getEObject(context.getSourceAnchor());
		EObject targetObj = getEObject(context.getTargetAnchor());

		EObject eObject = sourceType.getEPackage().getEFactoryInstance().create(eReference.getEReferenceType());
		eObject.eSet(targetRef, targetObj);

		ECoreUtil.setReference(sourceObj, eReference, eObject);

		AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
		addContext.setNewObject(eObject);
		newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);

		return newConnection;
	}
}
