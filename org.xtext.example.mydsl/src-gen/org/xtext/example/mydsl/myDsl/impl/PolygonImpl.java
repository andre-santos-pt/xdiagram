/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Polygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PolygonImpl#isPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PolygonImpl#isPolyline <em>Polyline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolygonImpl extends ConnectableElementImpl implements Polygon
{
  /**
   * The default value of the '{@link #isPolygon() <em>Polygon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPolygon()
   * @generated
   * @ordered
   */
  protected static final boolean POLYGON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPolygon() <em>Polygon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPolygon()
   * @generated
   * @ordered
   */
  protected boolean polygon = POLYGON_EDEFAULT;

  /**
   * The default value of the '{@link #isPolyline() <em>Polyline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPolyline()
   * @generated
   * @ordered
   */
  protected static final boolean POLYLINE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPolyline() <em>Polyline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPolyline()
   * @generated
   * @ordered
   */
  protected boolean polyline = POLYLINE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolygonImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.POLYGON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPolygon()
  {
    return polygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolygon(boolean newPolygon)
  {
    boolean oldPolygon = polygon;
    polygon = newPolygon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.POLYGON__POLYGON, oldPolygon, polygon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPolyline()
  {
    return polyline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolyline(boolean newPolyline)
  {
    boolean oldPolyline = polyline;
    polyline = newPolyline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.POLYGON__POLYLINE, oldPolyline, polyline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.POLYGON__POLYGON:
        return isPolygon();
      case MyDslPackage.POLYGON__POLYLINE:
        return isPolyline();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.POLYGON__POLYGON:
        setPolygon((Boolean)newValue);
        return;
      case MyDslPackage.POLYGON__POLYLINE:
        setPolyline((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.POLYGON__POLYGON:
        setPolygon(POLYGON_EDEFAULT);
        return;
      case MyDslPackage.POLYGON__POLYLINE:
        setPolyline(POLYLINE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.POLYGON__POLYGON:
        return polygon != POLYGON_EDEFAULT;
      case MyDslPackage.POLYGON__POLYLINE:
        return polyline != POLYLINE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (polygon: ");
    result.append(polygon);
    result.append(", polyline: ");
    result.append(polyline);
    result.append(')');
    return result.toString();
  }

} //PolygonImpl
