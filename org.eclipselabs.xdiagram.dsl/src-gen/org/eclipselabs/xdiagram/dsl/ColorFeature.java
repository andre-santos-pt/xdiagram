/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.ColorFeature#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getColorFeature()
 * @model
 * @generated
 */
public interface ColorFeature extends Feature
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getColorFeature_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.ColorFeature#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // ColorFeature
