/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Rectangle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.RectangleImpl#isRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.RectangleImpl#isSquare <em>Square</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleImpl extends ConnectableElementImpl implements Rectangle
{
  /**
   * The default value of the '{@link #isRectangle() <em>Rectangle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRectangle()
   * @generated
   * @ordered
   */
  protected static final boolean RECTANGLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRectangle() <em>Rectangle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRectangle()
   * @generated
   * @ordered
   */
  protected boolean rectangle = RECTANGLE_EDEFAULT;

  /**
   * The default value of the '{@link #isSquare() <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSquare()
   * @generated
   * @ordered
   */
  protected static final boolean SQUARE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSquare() <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSquare()
   * @generated
   * @ordered
   */
  protected boolean square = SQUARE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RectangleImpl()
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
    return DslPackage.Literals.RECTANGLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRectangle()
  {
    return rectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRectangle(boolean newRectangle)
  {
    boolean oldRectangle = rectangle;
    rectangle = newRectangle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RECTANGLE__RECTANGLE, oldRectangle, rectangle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSquare()
  {
    return square;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSquare(boolean newSquare)
  {
    boolean oldSquare = square;
    square = newSquare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RECTANGLE__SQUARE, oldSquare, square));
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
      case DslPackage.RECTANGLE__RECTANGLE:
        return isRectangle();
      case DslPackage.RECTANGLE__SQUARE:
        return isSquare();
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
      case DslPackage.RECTANGLE__RECTANGLE:
        setRectangle((Boolean)newValue);
        return;
      case DslPackage.RECTANGLE__SQUARE:
        setSquare((Boolean)newValue);
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
      case DslPackage.RECTANGLE__RECTANGLE:
        setRectangle(RECTANGLE_EDEFAULT);
        return;
      case DslPackage.RECTANGLE__SQUARE:
        setSquare(SQUARE_EDEFAULT);
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
      case DslPackage.RECTANGLE__RECTANGLE:
        return rectangle != RECTANGLE_EDEFAULT;
      case DslPackage.RECTANGLE__SQUARE:
        return square != SQUARE_EDEFAULT;
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
    result.append(" (rectangle: ");
    result.append(rectangle);
    result.append(", square: ");
    result.append(square);
    result.append(')');
    return result.toString();
  }

} //RectangleImpl
