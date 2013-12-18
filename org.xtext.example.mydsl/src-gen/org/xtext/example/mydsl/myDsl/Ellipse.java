/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Ellipse#isEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Ellipse#isCircle <em>Circle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEllipse()
 * @model
 * @generated
 */
public interface Ellipse extends ConnectableElement
{
  /**
   * Returns the value of the '<em><b>Ellipse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ellipse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ellipse</em>' attribute.
   * @see #setEllipse(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEllipse_Ellipse()
   * @model
   * @generated
   */
  boolean isEllipse();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Ellipse#isEllipse <em>Ellipse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ellipse</em>' attribute.
   * @see #isEllipse()
   * @generated
   */
  void setEllipse(boolean value);

  /**
   * Returns the value of the '<em><b>Circle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Circle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Circle</em>' attribute.
   * @see #setCircle(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEllipse_Circle()
   * @model
   * @generated
   */
  boolean isCircle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Ellipse#isCircle <em>Circle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Circle</em>' attribute.
   * @see #isCircle()
   * @generated
   */
  void setCircle(boolean value);

} // Ellipse
