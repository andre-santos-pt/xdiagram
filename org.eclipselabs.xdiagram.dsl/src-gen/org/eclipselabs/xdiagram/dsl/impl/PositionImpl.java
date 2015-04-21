/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.PositionImpl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.PositionImpl#isXRelative <em>XRelative</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.PositionImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.PositionImpl#isYRelative <em>YRelative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends FeatureImpl implements Position
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #isXRelative() <em>XRelative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isXRelative()
   * @generated
   * @ordered
   */
  protected static final boolean XRELATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isXRelative() <em>XRelative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isXRelative()
   * @generated
   * @ordered
   */
  protected boolean xRelative = XRELATIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #isYRelative() <em>YRelative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isYRelative()
   * @generated
   * @ordered
   */
  protected static final boolean YRELATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isYRelative() <em>YRelative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isYRelative()
   * @generated
   * @ordered
   */
  protected boolean yRelative = YRELATIVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PositionImpl()
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
    return DslPackage.Literals.POSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.POSITION__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isXRelative()
  {
    return xRelative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXRelative(boolean newXRelative)
  {
    boolean oldXRelative = xRelative;
    xRelative = newXRelative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.POSITION__XRELATIVE, oldXRelative, xRelative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.POSITION__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isYRelative()
  {
    return yRelative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYRelative(boolean newYRelative)
  {
    boolean oldYRelative = yRelative;
    yRelative = newYRelative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.POSITION__YRELATIVE, oldYRelative, yRelative));
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
      case DslPackage.POSITION__X:
        return getX();
      case DslPackage.POSITION__XRELATIVE:
        return isXRelative();
      case DslPackage.POSITION__Y:
        return getY();
      case DslPackage.POSITION__YRELATIVE:
        return isYRelative();
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
      case DslPackage.POSITION__X:
        setX((Integer)newValue);
        return;
      case DslPackage.POSITION__XRELATIVE:
        setXRelative((Boolean)newValue);
        return;
      case DslPackage.POSITION__Y:
        setY((Integer)newValue);
        return;
      case DslPackage.POSITION__YRELATIVE:
        setYRelative((Boolean)newValue);
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
      case DslPackage.POSITION__X:
        setX(X_EDEFAULT);
        return;
      case DslPackage.POSITION__XRELATIVE:
        setXRelative(XRELATIVE_EDEFAULT);
        return;
      case DslPackage.POSITION__Y:
        setY(Y_EDEFAULT);
        return;
      case DslPackage.POSITION__YRELATIVE:
        setYRelative(YRELATIVE_EDEFAULT);
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
      case DslPackage.POSITION__X:
        return x != X_EDEFAULT;
      case DslPackage.POSITION__XRELATIVE:
        return xRelative != XRELATIVE_EDEFAULT;
      case DslPackage.POSITION__Y:
        return y != Y_EDEFAULT;
      case DslPackage.POSITION__YRELATIVE:
        return yRelative != YRELATIVE_EDEFAULT;
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
    result.append(" (x: ");
    result.append(x);
    result.append(", xRelative: ");
    result.append(xRelative);
    result.append(", y: ");
    result.append(y);
    result.append(", yRelative: ");
    result.append(yRelative);
    result.append(')');
    return result.toString();
  }

} //PositionImpl
