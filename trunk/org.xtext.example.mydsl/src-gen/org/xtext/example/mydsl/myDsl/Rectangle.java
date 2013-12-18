/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rectangle#isRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rectangle#isSquare <em>Square</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRectangle()
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRectangle_Rectangle()
   * @model
   * @generated
   */
  boolean isRectangle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rectangle#isRectangle <em>Rectangle</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRectangle_Square()
   * @model
   * @generated
   */
  boolean isSquare();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rectangle#isSquare <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Square</em>' attribute.
   * @see #isSquare()
   * @generated
   */
  void setSquare(boolean value);

} // Rectangle
