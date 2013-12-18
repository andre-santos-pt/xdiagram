/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Corner#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCorner()
 * @model
 * @generated
 */
public interface Corner extends Feature
{
  /**
   * Returns the value of the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle</em>' attribute.
   * @see #setAngle(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCorner_Angle()
   * @model
   * @generated
   */
  int getAngle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Corner#getAngle <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle</em>' attribute.
   * @see #getAngle()
   * @generated
   */
  void setAngle(int value);

} // Corner
