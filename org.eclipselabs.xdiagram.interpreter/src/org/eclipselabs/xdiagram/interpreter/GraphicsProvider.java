package org.eclipselabs.xdiagram.interpreter;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.osgi.framework.Bundle;

public interface GraphicsProvider {

	/**
	 * Provider setup. This is always the first operation to be invoked.
	 * @param diagramType
	 * @param properties
	 * @param bundle
	 */
	void setup(String diagramType, Map<String, String> properties, Bundle bundle) throws ProviderException;
	
	/**
	 * Obtains the root class of the model that will be mapped to the whole diagram area.
	 * @param ePackage
	 * @return non-null reference to an EClass
	 */
	EClass getRoot(EPackage ePackage);
	
	
	/**
	 * Returns true if the given EClass should have a corresponding node creation tool.
	 * @param eClass
	 * @return
	 */
	boolean hasTool(EClass eClass);
	
	/**
	 * Returns true if the given EReference should have a corresponding link creation tool.
	 * @param eReference
	 * @return
	 */
	boolean hasTool(EReference eReference);
	
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
	
	void updateNodeFigure(Diagram diagram, ContainerShape container);
	
	void removeNodeFigure(Diagram diagram, GraphicsAlgorithm figure);
	
	boolean canResizeNodeFigure(GraphicsAlgorithm figure);
	
	boolean canMoveNodeFigure(GraphicsAlgorithm figure);
	
	boolean canEditFigureLabel(GraphicsAlgorithm figure);
	
	String getFigureLabelValue(GraphicsAlgorithm figure);
	
	GraphicsAlgorithm getFigureLabel(Diagram diagram, ContainerShape container);
	
	void updateFigureLabel(Diagram diagram, GraphicsAlgorithm figure, String value);
	
	
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
	Connection getConnectionFigure(Diagram diagram, Anchor source, Anchor target, EObject eObject);
	
	void updateLinkFigure(Diagram diagram, Connection connection);

	
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

	/**
	 * Returns true if the given feature (EReference or EAttribute) should be treated as a property (Properties view).
	 */
	boolean isProperty(EStructuralFeature feature);
}
