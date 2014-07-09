/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Layout#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends Feature
{
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLayout_Layout()
   * @model
   * @generated
   */
  ContainerLayout getLayout();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Layout#getLayout <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.ContainerLayout
   * @see #getLayout()
   * @generated
   */
  void setLayout(ContainerLayout value);

} // Layout
