/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineStyle#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLineStyle()
 * @model
 * @generated
 */
public interface LineStyle extends Feature
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.xtext.xdiagram.LineType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineType
   * @see #setStyle(LineType)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLineStyle_Style()
   * @model
   * @generated
   */
  LineType getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineStyle#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineType
   * @see #getStyle()
   * @generated
   */
  void setStyle(LineType value);

} // LineStyle
