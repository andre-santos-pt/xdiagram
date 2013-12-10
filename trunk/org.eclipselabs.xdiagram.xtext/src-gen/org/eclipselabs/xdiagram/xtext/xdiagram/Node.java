/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#isResizable <em>Resizable</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getFigures <em>Figures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getAnchors <em>Anchors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DiagramElement
{
  /**
   * Returns the value of the '<em><b>Resizable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resizable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resizable</em>' attribute.
   * @see #setResizable(boolean)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNode_Resizable()
   * @model
   * @generated
   */
  boolean isResizable();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#isResizable <em>Resizable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resizable</em>' attribute.
   * @see #isResizable()
   * @generated
   */
  void setResizable(boolean value);

  /**
   * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNode_Figures()
   * @model containment="true"
   * @generated
   */
  EList<NodeFigure> getFigures();

  /**
   * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containers</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNode_Containers()
   * @model containment="true"
   * @generated
   */
  EList<NodeContainer> getContainers();

  /**
   * Returns the value of the '<em><b>Anchors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anchors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anchors</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNode_Anchors()
   * @model containment="true"
   * @generated
   */
  EList<NodeAnchor> getAnchors();

} // Node
