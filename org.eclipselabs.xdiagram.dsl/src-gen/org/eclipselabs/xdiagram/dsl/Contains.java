/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Contains#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Contains#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getContains()
 * @model
 * @generated
 */
public interface Contains extends Feature
{
  /**
   * Returns the value of the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Reference</em>' reference.
   * @see #setModelReference(EReference)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getContains_ModelReference()
   * @model
   * @generated
   */
  EReference getModelReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Contains#getModelReference <em>Model Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Reference</em>' reference.
   * @see #getModelReference()
   * @generated
   */
  void setModelReference(EReference value);

  /**
   * Returns the value of the '<em><b>Layout</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.dsl.ContainerLayout}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.ContainerLayout
   * @see #setLayout(ContainerLayout)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getContains_Layout()
   * @model
   * @generated
   */
  ContainerLayout getLayout();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Contains#getLayout <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.ContainerLayout
   * @see #getLayout()
   * @generated
   */
  void setLayout(ContainerLayout value);

} // Contains
