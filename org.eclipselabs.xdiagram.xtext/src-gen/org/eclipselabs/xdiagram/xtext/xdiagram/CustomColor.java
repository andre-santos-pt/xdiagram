/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getRgb <em>Rgb</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getCustomColor()
 * @model
 * @generated
 */
public interface CustomColor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getCustomColor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rgb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rgb</em>' containment reference.
   * @see #setRgb(RGB)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getCustomColor_Rgb()
   * @model containment="true"
   * @generated
   */
  RGB getRgb();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getRgb <em>Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rgb</em>' containment reference.
   * @see #getRgb()
   * @generated
   */
  void setRgb(RGB value);

} // CustomColor
