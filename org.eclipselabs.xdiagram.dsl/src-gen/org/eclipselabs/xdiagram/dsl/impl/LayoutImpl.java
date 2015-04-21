/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Layout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LayoutImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LayoutImpl#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LayoutImpl#getMargin <em>Margin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayoutImpl extends FeatureImpl implements Layout
{
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
   * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMargin()
   * @generated
   * @ordered
   */
  protected static final int MARGIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMargin()
   * @generated
   * @ordered
   */
  protected int margin = MARGIN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayoutImpl()
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
    return DslPackage.Literals.LAYOUT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LAYOUT__VERTICAL, oldVertical, vertical));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LAYOUT__HORIZONTAL, oldHorizontal, horizontal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMargin()
  {
    return margin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMargin(int newMargin)
  {
    int oldMargin = margin;
    margin = newMargin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LAYOUT__MARGIN, oldMargin, margin));
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
      case DslPackage.LAYOUT__VERTICAL:
        return isVertical();
      case DslPackage.LAYOUT__HORIZONTAL:
        return isHorizontal();
      case DslPackage.LAYOUT__MARGIN:
        return getMargin();
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
      case DslPackage.LAYOUT__VERTICAL:
        setVertical((Boolean)newValue);
        return;
      case DslPackage.LAYOUT__HORIZONTAL:
        setHorizontal((Boolean)newValue);
        return;
      case DslPackage.LAYOUT__MARGIN:
        setMargin((Integer)newValue);
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
      case DslPackage.LAYOUT__VERTICAL:
        setVertical(VERTICAL_EDEFAULT);
        return;
      case DslPackage.LAYOUT__HORIZONTAL:
        setHorizontal(HORIZONTAL_EDEFAULT);
        return;
      case DslPackage.LAYOUT__MARGIN:
        setMargin(MARGIN_EDEFAULT);
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
      case DslPackage.LAYOUT__VERTICAL:
        return vertical != VERTICAL_EDEFAULT;
      case DslPackage.LAYOUT__HORIZONTAL:
        return horizontal != HORIZONTAL_EDEFAULT;
      case DslPackage.LAYOUT__MARGIN:
        return margin != MARGIN_EDEFAULT;
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
    result.append(" (vertical: ");
    result.append(vertical);
    result.append(", horizontal: ");
    result.append(horizontal);
    result.append(", margin: ");
    result.append(margin);
    result.append(')');
    return result.toString();
  }

} //LayoutImpl
