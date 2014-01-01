/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Color#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Color#getCustom <em>Custom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject
{
  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor
   * @see #setDefault(DefaultColor)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColor_Default()
   * @model
   * @generated
   */
  DefaultColor getDefault();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Color#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor
   * @see #getDefault()
   * @generated
   */
  void setDefault(DefaultColor value);

  /**
   * Returns the value of the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom</em>' reference.
   * @see #setCustom(CustomColor)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColor_Custom()
   * @model
   * @generated
   */
  CustomColor getCustom();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Color#getCustom <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom</em>' reference.
   * @see #getCustom()
   * @generated
   */
  void setCustom(CustomColor value);

} // Color
