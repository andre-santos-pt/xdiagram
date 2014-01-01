/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueDecimal <em>Value Decimal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDoubleValue()
 * @model
 * @generated
 */
public interface DoubleValue extends Value
{
  /**
   * Returns the value of the '<em><b>Value Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Int</em>' attribute.
   * @see #setValueInt(int)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDoubleValue_ValueInt()
   * @model
   * @generated
   */
  int getValueInt();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueInt <em>Value Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Int</em>' attribute.
   * @see #getValueInt()
   * @generated
   */
  void setValueInt(int value);

  /**
   * Returns the value of the '<em><b>Value Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Decimal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Decimal</em>' attribute.
   * @see #setValueDecimal(int)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDoubleValue_ValueDecimal()
   * @model
   * @generated
   */
  int getValueDecimal();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueDecimal <em>Value Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Decimal</em>' attribute.
   * @see #getValueDecimal()
   * @generated
   */
  void setValueDecimal(int value);

} // DoubleValue
