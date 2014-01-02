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


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.interpreter.internal.Activator.LanguageDescription;
import org.eclipselabs.xdiagram.interpreter.internal.features.DirectEditingFeature;
import org.eclipselabs.xdiagram.interpreter.internal.features.LayoutFeature;
import org.eclipselabs.xdiagram.interpreter.internal.features.MoveNodeFeature;
import org.eclipselabs.xdiagram.interpreter.internal.features.RemoveNodeFeature;
import org.eclipselabs.xdiagram.interpreter.internal.features.ResizeNodeFeature;
import org.eclipselabs.xdiagram.interpreter.internal.features.UpdateNodeFeature;


public class GenericFeatureProvider extends DefaultFeatureProvider {

	private EPackage ePackage;
	private EClass rootClass;

	private GraphicsProvider graphicsProvider;
	
	public GenericFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	public EPackage getEPackage() {
		if(ePackage != null)
			return ePackage;
		
		String diagramType = getDiagramTypeProvider().getDiagram().getDiagramTypeId();

		LanguageDescription desc = Activator.getInstance().getLanguageProvider(diagramType);
		graphicsProvider = desc.provider;

		try {
			graphicsProvider.setup(desc.properties);
		} catch (ProviderException e) {
			System.err.println("Problem in graphics provider '" + graphicsProvider.getClass().getName() + "' :" + e.getMessage());
			return null;
		}
		
		ePackage = EPackage.Registry.INSTANCE.getEPackage(desc.ecoreURI);
		if(ePackage == null)
			System.err.println("Could not bind an EPackage for diagram type '" + diagramType + "'");

		rootClass = graphicsProvider.getRoot(ePackage);
		if(rootClass == null)
			System.err.println("Could not load root class for diagram type '" + diagramType + "'");

		return ePackage;
	}

	public EClass getRootClass() {
		if(rootClass == null)
			getEPackage();

		return rootClass;
	}

	public GraphicsProvider getGraphicsProvider() {
		return graphicsProvider;
	}


	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		EObject eObject = (EObject) context.getNewObject();

		if(eObject != null) {
			if(graphicsProvider.isLink(eObject.eClass()))
				return new CreateConnectionFeature(this);
			else
				return new CreateNodeFeature(this, eObject.eContainer());
		}
		else
			return new CreateConnectionFeature(this);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		List<ICreateFeature> list = new ArrayList<ICreateFeature>();

		EPackage ePackage = getEPackage();

		if(ePackage == null)
			return new ICreateFeature[0];

		for(EClassifier c : ePackage.getEClassifiers())
			if(c instanceof EClass && isNode((EClass) c))
				list.add(new CreateEObjectFeature(this, (EClass) c));

		return list.toArray(new ICreateFeature[list.size()]);
	}

	private boolean isNode(EClass c) {
		return 
				!c.isAbstract() &&
				!rootClass.equals(c) &&
				graphicsProvider.hasTool(c);
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		EPackage ePackage = getEPackage();

		if(ePackage == null)
			return new ICreateConnectionFeature[0];

		List<ICreateConnectionFeature> list = new ArrayList<ICreateConnectionFeature>();
		Set<EClass> handledLinks = new HashSet<EClass>();

		for(EClassifier c : ePackage.getEClassifiers()) {
			if(c instanceof EClass) { 
				EClass eClass = (EClass) c;

				for(EReference ref : eClass.getEReferences()) {
					if(!ref.isContainment() && graphicsProvider.hasTool(ref)) {
						list.add(new CreateEReferenceFeature(this, ref));
					}
					else {
						EClass refType = (EClass) ref.getEType();
						for(EClass type : ECoreUtil.allCompatibleClasses(ePackage, refType)) {
							if(!handledLinks.contains(type) && graphicsProvider.isLink(type)) {
								EReference target = graphicsProvider.getLinkTarget((EClass) ref.getEType());
								list.add(new CreateEReferenceFeatureIndirect(this, ref, target, type));
								handledLinks.add(type);
							}
						}
					}
				}
			}
		}
		return list.toArray(new ICreateConnectionFeature[list.size()]);
	}


	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		return context.getPictogramElement() instanceof Diagram ?
			new UpdateNodeFeature(this, graphicsProvider) : null;
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		return new MoveNodeFeature(this);
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		return new RemoveNodeFeature(this);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		return new ResizeNodeFeature(this);
	}

	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		return getCreateConnectionFeatures();
	}

	@Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
		return new DirectEditingFeature(this);
	}

//	@Override
//	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
//		return new LayoutFeature(this);
//	}
}
