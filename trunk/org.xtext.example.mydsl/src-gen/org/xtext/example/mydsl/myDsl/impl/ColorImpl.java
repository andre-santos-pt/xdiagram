/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Color;
import org.xtext.example.mydsl.myDsl.CustomColor;
import org.xtext.example.mydsl.myDsl.DefaultColor;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ColorImpl#isCustom <em>Custom</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ColorImpl#getRgb <em>Rgb</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ColorImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color
{
  /**
   * The default value of the '{@link #isCustom() <em>Custom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCustom()
   * @generated
   * @ordered
   */
  protected static final boolean CUSTOM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCustom() <em>Custom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCustom()
   * @generated
   * @ordered
   */
  protected boolean custom = CUSTOM_EDEFAULT;

  /**
   * The cached value of the '{@link #getRgb() <em>Rgb</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRgb()
   * @generated
   * @ordered
   */
  protected CustomColor rgb;

  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final DefaultColor DEFAULT_EDEFAULT = DefaultColor.RED;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected DefaultColor default_ = DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorImpl()
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
    return MyDslPackage.Literals.COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCustom()
  {
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustom(boolean newCustom)
  {
    boolean oldCustom = custom;
    custom = newCustom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLOR__CUSTOM, oldCustom, custom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomColor getRgb()
  {
    if (rgb != null && rgb.eIsProxy())
    {
      InternalEObject oldRgb = (InternalEObject)rgb;
      rgb = (CustomColor)eResolveProxy(oldRgb);
      if (rgb != oldRgb)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COLOR__RGB, oldRgb, rgb));
      }
    }
    return rgb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomColor basicGetRgb()
  {
    return rgb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRgb(CustomColor newRgb)
  {
    CustomColor oldRgb = rgb;
    rgb = newRgb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLOR__RGB, oldRgb, rgb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultColor getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(DefaultColor newDefault)
  {
    DefaultColor oldDefault = default_;
    default_ = newDefault == null ? DEFAULT_EDEFAULT : newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLOR__DEFAULT, oldDefault, default_));
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
      case MyDslPackage.COLOR__CUSTOM:
        return isCustom();
      case MyDslPackage.COLOR__RGB:
        if (resolve) return getRgb();
        return basicGetRgb();
      case MyDslPackage.COLOR__DEFAULT:
        return getDefault();
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
      case MyDslPackage.COLOR__CUSTOM:
        setCustom((Boolean)newValue);
        return;
      case MyDslPackage.COLOR__RGB:
        setRgb((CustomColor)newValue);
        return;
      case MyDslPackage.COLOR__DEFAULT:
        setDefault((DefaultColor)newValue);
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
      case MyDslPackage.COLOR__CUSTOM:
        setCustom(CUSTOM_EDEFAULT);
        return;
      case MyDslPackage.COLOR__RGB:
        setRgb((CustomColor)null);
        return;
      case MyDslPackage.COLOR__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
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
      case MyDslPackage.COLOR__CUSTOM:
        return custom != CUSTOM_EDEFAULT;
      case MyDslPackage.COLOR__RGB:
        return rgb != null;
      case MyDslPackage.COLOR__DEFAULT:
        return default_ != DEFAULT_EDEFAULT;
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
    result.append(" (custom: ");
    result.append(custom);
    result.append(", default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //ColorImpl
