/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.EllipseImpl#isEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.EllipseImpl#isCircle <em>Circle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EllipseImpl extends ConnectableElementImpl implements Ellipse
{
  /**
   * The default value of the '{@link #isEllipse() <em>Ellipse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEllipse()
   * @generated
   * @ordered
   */
  protected static final boolean ELLIPSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEllipse() <em>Ellipse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEllipse()
   * @generated
   * @ordered
   */
  protected boolean ellipse = ELLIPSE_EDEFAULT;

  /**
   * The default value of the '{@link #isCircle() <em>Circle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCircle()
   * @generated
   * @ordered
   */
  protected static final boolean CIRCLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCircle() <em>Circle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCircle()
   * @generated
   * @ordered
   */
  protected boolean circle = CIRCLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EllipseImpl()
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
    return XdiagramPackage.Literals.ELLIPSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEllipse()
  {
    return ellipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEllipse(boolean newEllipse)
  {
    boolean oldEllipse = ellipse;
    ellipse = newEllipse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.ELLIPSE__ELLIPSE, oldEllipse, ellipse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCircle()
  {
    return circle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCircle(boolean newCircle)
  {
    boolean oldCircle = circle;
    circle = newCircle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.ELLIPSE__CIRCLE, oldCircle, circle));
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
      case XdiagramPackage.ELLIPSE__ELLIPSE:
        return isEllipse();
      case XdiagramPackage.ELLIPSE__CIRCLE:
        return isCircle();
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
      case XdiagramPackage.ELLIPSE__ELLIPSE:
        setEllipse((Boolean)newValue);
        return;
      case XdiagramPackage.ELLIPSE__CIRCLE:
        setCircle((Boolean)newValue);
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
      case XdiagramPackage.ELLIPSE__ELLIPSE:
        setEllipse(ELLIPSE_EDEFAULT);
        return;
      case XdiagramPackage.ELLIPSE__CIRCLE:
        setCircle(CIRCLE_EDEFAULT);
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
      case XdiagramPackage.ELLIPSE__ELLIPSE:
        return ellipse != ELLIPSE_EDEFAULT;
      case XdiagramPackage.ELLIPSE__CIRCLE:
        return circle != CIRCLE_EDEFAULT;
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
    result.append(" (ellipse: ");
    result.append(ellipse);
    result.append(", circle: ");
    result.append(circle);
    result.append(')');
    return result.toString();
  }

} //EllipseImpl
