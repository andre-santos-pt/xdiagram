/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isSquare <em>Square</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends ConnectableElement
{
  /**
   * Returns the value of the '<em><b>Rectangle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rectangle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rectangle</em>' attribute.
   * @see #setRectangle(boolean)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getRectangle_Rectangle()
   * @model
   * @generated
   */
  boolean isRectangle();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isRectangle <em>Rectangle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rectangle</em>' attribute.
   * @see #isRectangle()
   * @generated
   */
  void setRectangle(boolean value);

  /**
   * Returns the value of the '<em><b>Square</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Square</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Square</em>' attribute.
   * @see #setSquare(boolean)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getRectangle_Square()
   * @model
   * @generated
   */
  boolean isSquare();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isSquare <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Square</em>' attribute.
   * @see #isSquare()
   * @generated
   */
  void setSquare(boolean value);

} // Rectangle
