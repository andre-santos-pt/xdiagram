/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Line;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LineImpl#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LineImpl#isVertical <em>Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends FeatureContainerImpl implements Line
{
  /**
   * The default value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHorizontal()
   * @generated
   * @ordered
   */
  protected static final boolean HORIZONTAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHorizontal()
   * @generated
   * @ordered
   */
  protected boolean horizontal = HORIZONTAL_EDEFAULT;

  /**
   * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVertical()
   * @generated
   * @ordered
   */
  protected static final boolean VERTICAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVertical()
   * @generated
   * @ordered
   */
  protected boolean vertical = VERTICAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LineImpl()
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
    return DslPackage.Literals.LINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHorizontal()
  {
    return horizontal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontal(boolean newHorizontal)
  {
    boolean oldHorizontal = horizontal;
    horizontal = newHorizontal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINE__HORIZONTAL, oldHorizontal, horizontal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVertical()
  {
    return vertical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVertical(boolean newVertical)
  {
    boolean oldVertical = vertical;
    vertical = newVertical;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINE__VERTICAL, oldVertical, vertical));
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
      case DslPackage.LINE__HORIZONTAL:
        return isHorizontal();
      case DslPackage.LINE__VERTICAL:
        return isVertical();
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
      case DslPackage.LINE__HORIZONTAL:
        setHorizontal((Boolean)newValue);
        return;
      case DslPackage.LINE__VERTICAL:
        setVertical((Boolean)newValue);
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
      case DslPackage.LINE__HORIZONTAL:
        setHorizontal(HORIZONTAL_EDEFAULT);
        return;
      case DslPackage.LINE__VERTICAL:
        setVertical(VERTICAL_EDEFAULT);
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
      case DslPackage.LINE__HORIZONTAL:
        return horizontal != HORIZONTAL_EDEFAULT;
      case DslPackage.LINE__VERTICAL:
        return vertical != VERTICAL_EDEFAULT;
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
    result.append(" (horizontal: ");
    result.append(horizontal);
    result.append(", vertical: ");
    result.append(vertical);
    result.append(')');
    return result.toString();
  }

} //LineImpl
