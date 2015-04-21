/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Custom#getFigure <em>Figure</em>}</li>
 * </ul>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getCustom()
 * @model
 * @generated
 */
public interface Custom extends ConnectableElement
{
  /**
   * Returns the value of the '<em><b>Figure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figure</em>' reference.
   * @see #setFigure(CustomFigure)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getCustom_Figure()
   * @model
   * @generated
   */
  CustomFigure getFigure();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Custom#getFigure <em>Figure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Figure</em>' reference.
   * @see #getFigure()
   * @generated
   */
  void setFigure(CustomFigure value);

} // Custom
