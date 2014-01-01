/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getConnectableElement()
 * @model
 * @generated
 */
public interface ConnectableElement extends Element
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getConnectableElement_Children()
   * @model containment="true"
   * @generated
   */
  EList<ConnectableElement> getChildren();

} // ConnectableElement
