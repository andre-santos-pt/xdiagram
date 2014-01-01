/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.xtext.xdiagram.Polyline;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PolylineImpl#isPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PolylineImpl#isPolyline <em>Polyline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolylineImpl extends ConnectableElementImpl implements Polyline
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
  protected PolylineImpl()
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
    return XdiagramPackage.Literals.POLYLINE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.POLYLINE__POLYGON, oldPolygon, polygon));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.POLYLINE__POLYLINE, oldPolyline, polyline));
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
      case XdiagramPackage.POLYLINE__POLYGON:
        return isPolygon();
      case XdiagramPackage.POLYLINE__POLYLINE:
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
      case XdiagramPackage.POLYLINE__POLYGON:
        setPolygon((Boolean)newValue);
        return;
      case XdiagramPackage.POLYLINE__POLYLINE:
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
      case XdiagramPackage.POLYLINE__POLYGON:
        setPolygon(POLYGON_EDEFAULT);
        return;
      case XdiagramPackage.POLYLINE__POLYLINE:
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
      case XdiagramPackage.POLYLINE__POLYGON:
        return polygon != POLYGON_EDEFAULT;
      case XdiagramPackage.POLYLINE__POLYLINE:
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

} //PolylineImpl
