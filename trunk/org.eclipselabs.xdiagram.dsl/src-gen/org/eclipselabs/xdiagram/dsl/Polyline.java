/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Polyline#isPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Polyline#isPolyline <em>Polyline</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getPolyline()
 * @model
 * @generated
 */
public interface Polyline extends ConnectableElement
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getPolyline_Polygon()
   * @model
   * @generated
   */
  boolean isPolygon();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Polyline#isPolygon <em>Polygon</em>}' attribute.
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getPolyline_Polyline()
   * @model
   * @generated
   */
  boolean isPolyline();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Polyline#isPolyline <em>Polyline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polyline</em>' attribute.
   * @see #isPolyline()
   * @generated
   */
  void setPolyline(boolean value);

} // Polyline
