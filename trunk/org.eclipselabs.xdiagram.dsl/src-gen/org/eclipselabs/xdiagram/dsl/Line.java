/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Line#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Line#isVertical <em>Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends FeatureContainer
{
  /**
   * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horizontal</em>' attribute.
   * @see #setHorizontal(boolean)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLine_Horizontal()
   * @model
   * @generated
   */
  boolean isHorizontal();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Line#isHorizontal <em>Horizontal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horizontal</em>' attribute.
   * @see #isHorizontal()
   * @generated
   */
  void setHorizontal(boolean value);

  /**
   * Returns the value of the '<em><b>Vertical</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertical</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertical</em>' attribute.
   * @see #setVertical(boolean)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLine_Vertical()
   * @model
   * @generated
   */
  boolean isVertical();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Line#isVertical <em>Vertical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertical</em>' attribute.
   * @see #isVertical()
   * @generated
   */
  void setVertical(boolean value);

} // Line
