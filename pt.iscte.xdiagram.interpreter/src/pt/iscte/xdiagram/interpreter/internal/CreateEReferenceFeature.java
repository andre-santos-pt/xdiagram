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

public class CreateEReferenceFeature extends AbstractCreateEReferenceFeature {
	
	public CreateEReferenceFeature(GenericFeatureProvider fp, EReference eReference) {
		super(fp, eReference.getName(), eReference, (EClass) eReference.eContainer(), eReference.getEReferenceType());
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		EObject source = getEObject(context.getSourceAnchor());
		EObject target = getEObject(context.getTargetAnchor());

		ECoreUtil.setReference(source, eReference, target);
		AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
		newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);

		return newConnection;
	}
	
}
