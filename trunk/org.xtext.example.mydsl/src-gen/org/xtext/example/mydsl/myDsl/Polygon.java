/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Polygon#isPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Polygon#isPolyline <em>Polyline</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends ConnectableElement
{
  /**
   * Returns the value of the '<em><b>Polygon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polygon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon</em>' attribute.
   * @see #setPolygon(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolygon_Polygon()
   * @model
   * @generated
   */
  boolean isPolygon();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Polygon#isPolygon <em>Polygon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polygon</em>' attribute.
   * @see #isPolygon()
   * @generated
   */
  void setPolygon(boolean value);

  /**
   * Returns the value of the '<em><b>Polyline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polyline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polyline</em>' attribute.
   * @see #setPolyline(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolygon_Polyline()
   * @model
   * @generated
   */
  boolean isPolyline();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Polygon#isPolyline <em>Polyline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polyline</em>' attribute.
   * @see #isPolyline()
   * @generated
   */
  void setPolyline(boolean value);

} // Polygon
