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
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getMainFigure <em>Main Figure</em>}</li>
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
   * Returns the value of the '<em><b>Main Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Figure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Figure</em>' containment reference.
   * @see #setMainFigure(ConnectableElement)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNode_MainFigure()
   * @model containment="true"
   * @generated
   */
  ConnectableElement getMainFigure();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getMainFigure <em>Main Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Figure</em>' containment reference.
   * @see #getMainFigure()
   * @generated
   */
  void setMainFigure(ConnectableElement value);

  /**
   * Returns the value of the '<em><b>Anchors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor}.
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
  EList<Anchor> getAnchors();

} // Node
