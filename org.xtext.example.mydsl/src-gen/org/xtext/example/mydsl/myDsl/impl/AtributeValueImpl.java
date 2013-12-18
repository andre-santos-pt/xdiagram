/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.AtributeValue;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueINT <em>Value INT</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueDEC <em>Value DEC</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueID <em>Value ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueBOOL <em>Value BOOL</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueSTRING <em>Value STRING</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueDAY <em>Value DAY</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueMONTH <em>Value MONTH</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl#getValueYEAR <em>Value YEAR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtributeValueImpl extends MinimalEObjectImpl.Container implements AtributeValue
{
  /**
   * The default value of the '{@link #getValueINT() <em>Value INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueINT()
   * @generated
   * @ordered
   */
  protected static final int VALUE_INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueINT() <em>Value INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueINT()
   * @generated
   * @ordered
   */
  protected int valueINT = VALUE_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getValueDEC() <em>Value DEC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDEC()
   * @generated
   * @ordered
   */
  protected static final int VALUE_DEC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueDEC() <em>Value DEC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDEC()
   * @generated
   * @ordered
   */
  protected int valueDEC = VALUE_DEC_EDEFAULT;

  /**
   * The default value of the '{@link #getValueID() <em>Value ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueID()
   * @generated
   * @ordered
   */
  protected static final String VALUE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueID() <em>Value ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueID()
   * @generated
   * @ordered
   */
  protected String valueID = VALUE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getValueBOOL() <em>Value BOOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueBOOL()
   * @generated
   * @ordered
   */
  protected static final String VALUE_BOOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueBOOL() <em>Value BOOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueBOOL()
   * @generated
   * @ordered
   */
  protected String valueBOOL = VALUE_BOOL_EDEFAULT;

  /**
   * The default value of the '{@link #getValueSTRING() <em>Value STRING</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueSTRING()
   * @generated
   * @ordered
   */
  protected static final String VALUE_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueSTRING() <em>Value STRING</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueSTRING()
   * @generated
   * @ordered
   */
  protected String valueSTRING = VALUE_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getValueDAY() <em>Value DAY</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDAY()
   * @generated
   * @ordered
   */
  protected static final int VALUE_DAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueDAY() <em>Value DAY</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDAY()
   * @generated
   * @ordered
   */
  protected int valueDAY = VALUE_DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getValueMONTH() <em>Value MONTH</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueMONTH()
   * @generated
   * @ordered
   */
  protected static final int VALUE_MONTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueMONTH() <em>Value MONTH</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueMONTH()
   * @generated
   * @ordered
   */
  protected int valueMONTH = VALUE_MONTH_EDEFAULT;

  /**
   * The default value of the '{@link #getValueYEAR() <em>Value YEAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueYEAR()
   * @generated
   * @ordered
   */
  protected static final int VALUE_YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueYEAR() <em>Value YEAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueYEAR()
   * @generated
   * @ordered
   */
  protected int valueYEAR = VALUE_YEAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtributeValueImpl()
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
    return MyDslPackage.Literals.ATRIBUTE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueINT()
  {
    return valueINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueINT(int newValueINT)
  {
    int oldValueINT = valueINT;
    valueINT = newValueINT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_INT, oldValueINT, valueINT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueDEC()
  {
    return valueDEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueDEC(int newValueDEC)
  {
    int oldValueDEC = valueDEC;
    valueDEC = newValueDEC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_DEC, oldValueDEC, valueDEC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueID()
  {
    return valueID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueID(String newValueID)
  {
    String oldValueID = valueID;
    valueID = newValueID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_ID, oldValueID, valueID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueBOOL()
  {
    return valueBOOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueBOOL(String newValueBOOL)
  {
    String oldValueBOOL = valueBOOL;
    valueBOOL = newValueBOOL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_BOOL, oldValueBOOL, valueBOOL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueSTRING()
  {
    return valueSTRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueSTRING(String newValueSTRING)
  {
    String oldValueSTRING = valueSTRING;
    valueSTRING = newValueSTRING;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_STRING, oldValueSTRING, valueSTRING));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueDAY()
  {
    return valueDAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueDAY(int newValueDAY)
  {
    int oldValueDAY = valueDAY;
    valueDAY = newValueDAY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_DAY, oldValueDAY, valueDAY));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueMONTH()
  {
    return valueMONTH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueMONTH(int newValueMONTH)
  {
    int oldValueMONTH = valueMONTH;
    valueMONTH = newValueMONTH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_MONTH, oldValueMONTH, valueMONTH));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueYEAR()
  {
    return valueYEAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueYEAR(int newValueYEAR)
  {
    int oldValueYEAR = valueYEAR;
    valueYEAR = newValueYEAR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTE_VALUE__VALUE_YEAR, oldValueYEAR, valueYEAR));
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
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_INT:
        return getValueINT();
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DEC:
        return getValueDEC();
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_ID:
        return getValueID();
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_BOOL:
        return getValueBOOL();
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_STRING:
        return getValueSTRING();
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DAY:
        return getValueDAY();
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_MONTH:
        return getValueMONTH();
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_YEAR:
        return getValueYEAR();
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
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_INT:
        setValueINT((Integer)newValue);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DEC:
        setValueDEC((Integer)newValue);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_ID:
        setValueID((String)newValue);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_BOOL:
        setValueBOOL((String)newValue);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_STRING:
        setValueSTRING((String)newValue);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DAY:
        setValueDAY((Integer)newValue);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_MONTH:
        setValueMONTH((Integer)newValue);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_YEAR:
        setValueYEAR((Integer)newValue);
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
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_INT:
        setValueINT(VALUE_INT_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DEC:
        setValueDEC(VALUE_DEC_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_ID:
        setValueID(VALUE_ID_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_BOOL:
        setValueBOOL(VALUE_BOOL_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_STRING:
        setValueSTRING(VALUE_STRING_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DAY:
        setValueDAY(VALUE_DAY_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_MONTH:
        setValueMONTH(VALUE_MONTH_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_YEAR:
        setValueYEAR(VALUE_YEAR_EDEFAULT);
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
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_INT:
        return valueINT != VALUE_INT_EDEFAULT;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DEC:
        return valueDEC != VALUE_DEC_EDEFAULT;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_ID:
        return VALUE_ID_EDEFAULT == null ? valueID != null : !VALUE_ID_EDEFAULT.equals(valueID);
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_BOOL:
        return VALUE_BOOL_EDEFAULT == null ? valueBOOL != null : !VALUE_BOOL_EDEFAULT.equals(valueBOOL);
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_STRING:
        return VALUE_STRING_EDEFAULT == null ? valueSTRING != null : !VALUE_STRING_EDEFAULT.equals(valueSTRING);
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_DAY:
        return valueDAY != VALUE_DAY_EDEFAULT;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_MONTH:
        return valueMONTH != VALUE_MONTH_EDEFAULT;
      case MyDslPackage.ATRIBUTE_VALUE__VALUE_YEAR:
        return valueYEAR != VALUE_YEAR_EDEFAULT;
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
    result.append(" (valueINT: ");
    result.append(valueINT);
    result.append(", valueDEC: ");
    result.append(valueDEC);
    result.append(", valueID: ");
    result.append(valueID);
    result.append(", valueBOOL: ");
    result.append(valueBOOL);
    result.append(", valueSTRING: ");
    result.append(valueSTRING);
    result.append(", valueDAY: ");
    result.append(valueDAY);
    result.append(", valueMONTH: ");
    result.append(valueMONTH);
    result.append(", valueYEAR: ");
    result.append(valueYEAR);
    result.append(')');
    return result.toString();
  }

} //AtributeValueImpl
