/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Align</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.TextAlign#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getTextAlign()
 * @model
 * @generated
 */
public interface TextAlign extends Feature
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.dsl.TextAlignValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.TextAlignValue
   * @see #setValue(TextAlignValue)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getTextAlign_Value()
   * @model
   * @generated
   */
  TextAlignValue getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.TextAlign#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.TextAlignValue
   * @see #getValue()
   * @generated
   */
  void setValue(TextAlignValue value);

} // TextAlign
