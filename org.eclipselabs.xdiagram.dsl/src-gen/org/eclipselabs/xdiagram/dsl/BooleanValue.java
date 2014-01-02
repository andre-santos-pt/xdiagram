/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.BooleanValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.dsl.BooleanLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.BooleanLiteral
   * @see #setValue(BooleanLiteral)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getBooleanValue_Value()
   * @model
   * @generated
   */
  BooleanLiteral getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.BooleanValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.BooleanLiteral
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanLiteral value);

} // BooleanValue
