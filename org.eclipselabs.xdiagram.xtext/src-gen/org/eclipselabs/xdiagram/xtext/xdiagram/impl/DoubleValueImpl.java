/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleValueImpl#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleValueImpl#getValueDecimal <em>Value Decimal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleValueImpl extends ValueImpl implements DoubleValue
{
  /**
   * The default value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueInt()
   * @generated
   * @ordered
   */
  protected static final int VALUE_INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueInt()
   * @generated
   * @ordered
   */
  protected int valueInt = VALUE_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getValueDecimal() <em>Value Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDecimal()
   * @generated
   * @ordered
   */
  protected static final int VALUE_DECIMAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueDecimal() <em>Value Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDecimal()
   * @generated
   * @ordered
   */
  protected int valueDecimal = VALUE_DECIMAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoubleValueImpl()
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
    return XdiagramPackage.Literals.DOUBLE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueInt()
  {
    return valueInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueInt(int newValueInt)
  {
    int oldValueInt = valueInt;
    valueInt = newValueInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DOUBLE_VALUE__VALUE_INT, oldValueInt, valueInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueDecimal()
  {
    return valueDecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueDecimal(int newValueDecimal)
  {
    int oldValueDecimal = valueDecimal;
    valueDecimal = newValueDecimal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DOUBLE_VALUE__VALUE_DECIMAL, oldValueDecimal, valueDecimal));
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
      case XdiagramPackage.DOUBLE_VALUE__VALUE_INT:
        return getValueInt();
      case XdiagramPackage.DOUBLE_VALUE__VALUE_DECIMAL:
        return getValueDecimal();
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
      case XdiagramPackage.DOUBLE_VALUE__VALUE_INT:
        setValueInt((Integer)newValue);
        return;
      case XdiagramPackage.DOUBLE_VALUE__VALUE_DECIMAL:
        setValueDecimal((Integer)newValue);
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
      case XdiagramPackage.DOUBLE_VALUE__VALUE_INT:
        setValueInt(VALUE_INT_EDEFAULT);
        return;
      case XdiagramPackage.DOUBLE_VALUE__VALUE_DECIMAL:
        setValueDecimal(VALUE_DECIMAL_EDEFAULT);
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
      case XdiagramPackage.DOUBLE_VALUE__VALUE_INT:
        return valueInt != VALUE_INT_EDEFAULT;
      case XdiagramPackage.DOUBLE_VALUE__VALUE_DECIMAL:
        return valueDecimal != VALUE_DECIMAL_EDEFAULT;
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
    result.append(" (valueInt: ");
    result.append(valueInt);
    result.append(", valueDecimal: ");
    result.append(valueDecimal);
    result.append(')');
    return result.toString();
  }

} //DoubleValueImpl
