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

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

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
		ContainerShape container = context.getTargetContainer();
		EObject owner = provider.getGraphicsProvider().getContainerObject(container);
		Collection<EReference> refs = provider.getGraphicsProvider().getContainerReferences(container);

		boolean card = false;
		
		for(EReference r : refs)
			if(r.getEReferenceType().isSuperTypeOf(eClass) && ECoreUtil.enoughUpperBound(r, owner))
				card = true;
		
		if(!card)
			return false;
					
		// TODO: enough upper bound
		
		return provider.getGraphicsProvider().canAddChild(container, eClass);
	}

	public Object[] create(ICreateContext context) {
		EObject eObject = eFactory.create(eClass);
		EObject eObjectParent = null;
		EReference containingRef = null;

		ContainerShape containerShape = context.getTargetContainer();

		Collection<EReference> refs = provider.getGraphicsProvider().getCompatibleContainerReferences(containerShape, eObject);
		containingRef = selectReference(refs, eObject);

		eObjectParent = provider.getGraphicsProvider().getContainerObject(containerShape);

		if(eObjectParent != null)
			ECoreUtil.setReference(eObjectParent, containingRef, eObject);

		try {
			FileUtil.persistEObject(eObject, eObjectParent, containingRef, getDiagram());
		} catch (Exception e) {
			e.printStackTrace();
		}

		addGraphicalRepresentation(context, eObject);

		// provider.getGraphicsProvider().canEditFigureLabel(ga, eObject);
		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return new Object[] { eObject };
	}

	/**
	 * Criteria: most specific type
	 * @param refs
	 * @param eObject
	 * @return
	 */
	private EReference selectReference(Collection<EReference> refs, EObject eObject) {
		EReference ref = null;
		for(EReference r : refs) {
			if(r.getEReferenceType().isInstance(eObject)) {
				if(ref == null || ref.getEReferenceType().isSuperTypeOf((EClass) r.getEType()))
					ref = r;
			}
		}
		return ref;
	}
}
