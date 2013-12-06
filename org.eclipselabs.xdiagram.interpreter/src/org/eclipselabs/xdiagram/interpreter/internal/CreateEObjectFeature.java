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

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

public class CreateEObjectFeature extends AbstractCreateFeature {

	private final GenericFeatureProvider provider;
	private final EFactory eFactory;
	private final EClass eClass;

	public CreateEObjectFeature(GenericFeatureProvider provider, EClass eClass) {
		super(provider, prettyPrint(eClass.getName()), tooltip(eClass));
		this.provider = provider;
		this.eFactory = eClass.getEPackage().getEFactoryInstance();
		this.eClass = eClass;
	}

	private static String tooltip(EClass eClass) {
		return "Create " + prettyPrint(eClass.getName());
	}

	private static String prettyPrint(String name) {
		String s = "";
		for (char c : name.toCharArray()) {
			if (!s.isEmpty()
					&& !Character.isUpperCase(s.charAt(s.length() - 1))
					&& Character.isUpperCase(c))
				s += ' ';
			s += c;
		}

		return s;
	}

	public boolean canCreate(ICreateContext context) {
		return ECoreUtil.matchContainment(context.getTargetContainer(),
				provider.getRootClass(), eClass);
	}

	public Object[] create(ICreateContext context) {
		EObject eObject = eFactory.create(eClass);
		EObject eObjectParent = null;
		EReference containingRef = null;

		ContainerShape containerShape = context.getTargetContainer();
		if (containerShape != null && !(containerShape instanceof Diagram)) {
			PictogramLink link = containerShape.getLink();
			eObjectParent = link.getBusinessObjects().get(0);
			for (EReference r : eObjectParent.eClass().getEAllContainments()) {
				if (((EClass) r.getEType()).isSuperTypeOf(eObject.eClass())) {
					containingRef = r;
					ECoreUtil.setReference(eObjectParent, r, eObject);
					// if(r.isMany()) {
					// List<EObject> list = (List<EObject>)
					// eObjectParent.eGet(r);
					// list.add(eObject);
					// }
					// else {
					// eObjectParent.eSet(r, eObject);
					// }
					break;
				}
			}
		}

		// Add model element to resource.
		// We add the model element to the resource of the diagram for
		// simplicity's sake. Normally, a customer would use its own
		// model persistence layer for storing the business model separately.
		// getDiagram().eResource().getContents().add(eObject);

		try {
			try {
				FileUtil.saveToModelFile(eObject, eObjectParent, containingRef,
						getDiagram());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		// do the add
		addGraphicalRepresentation(context, eObject);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return new Object[] { eObject };
	}
}