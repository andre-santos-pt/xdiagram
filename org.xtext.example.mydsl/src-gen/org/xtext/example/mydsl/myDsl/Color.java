/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Color#isCustom <em>Custom</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Color#getRgb <em>Rgb</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Color#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject
{
  /**
   * Returns the value of the '<em><b>Custom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom</em>' attribute.
   * @see #setCustom(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColor_Custom()
   * @model
   * @generated
   */
  boolean isCustom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Color#isCustom <em>Custom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom</em>' attribute.
   * @see #isCustom()
   * @generated
   */
  void setCustom(boolean value);

  /**
   * Returns the value of the '<em><b>Rgb</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rgb</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rgb</em>' reference.
   * @see #setRgb(CustomColor)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColor_Rgb()
   * @model
   * @generated
   */
  CustomColor getRgb();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Color#getRgb <em>Rgb</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rgb</em>' reference.
   * @see #getRgb()
   * @generated
   */
  void setRgb(CustomColor value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.DefaultColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.DefaultColor
   * @see #setDefault(DefaultColor)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColor_Default()
   * @model
   * @generated
   */
  DefaultColor getDefault();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Color#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.DefaultColor
   * @see #getDefault()
   * @generated
   */
  void setDefault(DefaultColor value);

} // Color
