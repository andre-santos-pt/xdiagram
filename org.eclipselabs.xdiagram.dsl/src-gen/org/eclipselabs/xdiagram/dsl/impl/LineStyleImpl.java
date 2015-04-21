/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.LineStyle;
import org.eclipselabs.xdiagram.dsl.LineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LineStyleImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LineStyleImpl#isManhattan <em>Manhattan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineStyleImpl extends FeatureImpl implements LineStyle
{
  /**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final LineType STYLE_EDEFAULT = LineType.SOLID;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected LineType style = STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #isManhattan() <em>Manhattan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManhattan()
   * @generated
   * @ordered
   */
  protected static final boolean MANHATTAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isManhattan() <em>Manhattan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManhattan()
   * @generated
   * @ordered
   */
  protected boolean manhattan = MANHATTAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LineStyleImpl()
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
    return DslPackage.Literals.LINE_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineType getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(LineType newStyle)
  {
    LineType oldStyle = style;
    style = newStyle == null ? STYLE_EDEFAULT : newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINE_STYLE__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isManhattan()
  {
    return manhattan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManhattan(boolean newManhattan)
  {
    boolean oldManhattan = manhattan;
    manhattan = newManhattan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINE_STYLE__MANHATTAN, oldManhattan, manhattan));
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
      case DslPackage.LINE_STYLE__STYLE:
        return getStyle();
      case DslPackage.LINE_STYLE__MANHATTAN:
        return isManhattan();
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
      case DslPackage.LINE_STYLE__STYLE:
        setStyle((LineType)newValue);
        return;
      case DslPackage.LINE_STYLE__MANHATTAN:
        setManhattan((Boolean)newValue);
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
      case DslPackage.LINE_STYLE__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case DslPackage.LINE_STYLE__MANHATTAN:
        setManhattan(MANHATTAN_EDEFAULT);
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
      case DslPackage.LINE_STYLE__STYLE:
        return style != STYLE_EDEFAULT;
      case DslPackage.LINE_STYLE__MANHATTAN:
        return manhattan != MANHATTAN_EDEFAULT;
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
    result.append(" (style: ");
    result.append(style);
    result.append(", manhattan: ");
    result.append(manhattan);
    result.append(')');
    return result.toString();
  }

} //LineStyleImpl
