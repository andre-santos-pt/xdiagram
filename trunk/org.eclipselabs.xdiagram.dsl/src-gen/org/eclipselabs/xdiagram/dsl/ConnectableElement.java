/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.ConnectableElement#isComposite <em>Composite</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.ConnectableElement#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getConnectableElement()
 * @model
 * @generated
 */
public interface ConnectableElement extends Element
{
  /**
   * Returns the value of the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' attribute.
   * @see #setComposite(boolean)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getConnectableElement_Composite()
   * @model
   * @generated
   */
  boolean isComposite();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.ConnectableElement#isComposite <em>Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' attribute.
   * @see #isComposite()
   * @generated
   */
  void setComposite(boolean value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.ConnectableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getConnectableElement_Children()
   * @model containment="true"
   * @generated
   */
  EList<ConnectableElement> getChildren();

} // ConnectableElement
