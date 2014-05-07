/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Diagram#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Diagram#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Class</em>' reference.
   * @see #setModelClass(EClass)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDiagram_ModelClass()
   * @model
   * @generated
   */
  EClass getModelClass();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Diagram#getModelClass <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Class</em>' reference.
   * @see #getModelClass()
   * @generated
   */
  void setModelClass(EClass value);

  /**
   * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.Contains}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDiagram_Contains()
   * @model containment="true"
   * @generated
   */
  EList<Contains> getContains();

} // Diagram
