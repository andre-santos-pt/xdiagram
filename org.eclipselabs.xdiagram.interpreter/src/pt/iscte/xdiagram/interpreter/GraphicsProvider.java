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
package pt.iscte.xdiagram.interpreter;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.osgi.framework.Bundle;

public interface GraphicsProvider {

	/**
	 * Provider setup. This is always the first operation to be invoked.
	 * @param bundle 
	 * @param diagramType
	 * @param properties
	 * @param ePackage 
	 * @param bundle
	 */
	void setup(Bundle bundle, Map<String, String> properties, EPackage ePackage) throws ProviderException;
	
	/**
	 * Obtains the root class of the model that will be mapped to the whole diagram area.
	 * @return non-null reference to an EClass
	 */
	EClass getRoot();
	
	void loadDiagram(Diagram diagram, EObject rootObject, IFeatureProvider featureProvider);
	
	/**
	 * Returns true if the given EClass should have a corresponding node creation tool.
	 * @param eClass
	 * @return
	 */
	boolean hasNodeTool(EClass eClass);
	
	/**
	 * Returns true if the given EReference should have a corresponding link creation tool.
	 * @param eReference
	 * @return
	 */
	boolean hasLinkTool(EReference eReference);
	
	/**
	 * Returns true if the given EClass should be treated as a link in the context of the given EReference.
	 * The type of eReference is always equal to eClass
	 * @param eClass
	 * @param eReference
	 * @return
	 */
	boolean isLink(EClass eClass);
	

	/**
	 * Obtains the EReference for a EClass link. Should be invoked only when isLink(eClass) is true.
	 * @param eClass
	 * @return
	 */
	EReference getLinkTarget(EClass eClass);
	
	
	boolean canAddChild(ContainerShape container, EClass eClass);
	
	EObject getContainerObject(ContainerShape container);

	Collection<EReference> getContainerReferences(ContainerShape container);

	Collection<EReference> getCompatibleContainerReferences(ContainerShape targetContainer, EObject eObject);
	
	
	
	/**
	 * Creates a figure for a given node object (eObject). 
	 * Should be invoked only in cases that hasTool(eObject.eClass()) is true.
	 * 
	 * @param diagram
	 * @param container
	 * @param eObject
	 * @return
	 */
	GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject);
	
	void resizeNodeFigure(Diagram diagram, ContainerShape container, int width, int height);
	
	boolean canResizeNodeFigure(GraphicsAlgorithm element);
	
	void removeNodeFigure(Diagram diagram, GraphicsAlgorithm figure);
	
	
	
	
	
	
	boolean canMoveNode(PictogramElement element);
	
	
	
	boolean canEditFigureLabel(AbstractText text);
	
	AbstractText getFigureLabel(ContainerShape container);
	
	EAttribute getTextEditableAttribute(AbstractText text);
	
	EObject getLabelEObject(AbstractText text);

	
	
	/**
	 * Creates a connection figure for a given reference (eReference).
	 * Should be invoked only in cases that hasTool(eReference) is true.
	 * 
	 * In case of a direct reference, eObject is always null. 
	 * In case of an indirect reference, eObject is the link object.
	 * 
	 * @param diagram
	 * @param source
	 * @param target
	 * @param eRef
	 * @param eObject
	 * @return
	 */
	Connection createConnectionFigure(Diagram diagram, Anchor source, Anchor target, EObject eObject);
	

	
	/**
	 * Checks if the anchor can accept outgoing connections for a given reference.
	 * 
	 * @param anchor
	 * @param eReference
	 * @return true if yes, false otherwise
	 */
	boolean isValidOutgoingConnection(Anchor anchor, EReference eReference);
	
	/**
	 * Checks if the anchor can accept incoming connections for a given reference.
	 * 
	 * @param anchor
	 * @param eReference
	 * @return true if yes, false otherwise
	 */
	boolean isValidIncomingConnection(Anchor anchor, EReference eReference);
	
	
	
	
	

	
	// FUTURE:
//	/**
//	 * Returns true if the given feature (EReference or EAttribute) should be treated as a property (Properties view).
//	 */
//	boolean isProperty(EStructuralFeature feature);


	void update(Diagram diagram);
	
	void update(PictogramElement element);

	
	

	
	
	
}
