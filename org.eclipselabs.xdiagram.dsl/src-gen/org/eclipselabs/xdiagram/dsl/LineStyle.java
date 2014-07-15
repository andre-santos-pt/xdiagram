/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.LineStyle#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.LineStyle#isManhattan <em>Manhattan</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLineStyle()
 * @model
 * @generated
 */
public interface LineStyle extends Feature
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.dsl.LineType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.LineType
   * @see #setStyle(LineType)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLineStyle_Style()
   * @model
   * @generated
   */
  LineType getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.LineStyle#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.LineType
   * @see #getStyle()
   * @generated
   */
  void setStyle(LineType value);

  /**
   * Returns the value of the '<em><b>Manhattan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manhattan</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manhattan</em>' attribute.
   * @see #setManhattan(boolean)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLineStyle_Manhattan()
   * @model
   * @generated
   */
  boolean isManhattan();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.LineStyle#isManhattan <em>Manhattan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manhattan</em>' attribute.
   * @see #isManhattan()
   * @generated
   */
  void setManhattan(boolean value);

} // LineStyle
