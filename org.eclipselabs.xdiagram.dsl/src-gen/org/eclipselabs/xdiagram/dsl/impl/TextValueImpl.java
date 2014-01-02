/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.TextValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.TextValueImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.TextValueImpl#getModelAttribute <em>Model Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextValueImpl extends FeatureImpl implements TextValue
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getModelAttribute() <em>Model Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelAttribute()
   * @generated
   * @ordered
   */
  protected EAttribute modelAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextValueImpl()
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
    return DslPackage.Literals.TEXT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TEXT_VALUE__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelAttribute()
  {
    if (modelAttribute != null && modelAttribute.eIsProxy())
    {
      InternalEObject oldModelAttribute = (InternalEObject)modelAttribute;
      modelAttribute = (EAttribute)eResolveProxy(oldModelAttribute);
      if (modelAttribute != oldModelAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.TEXT_VALUE__MODEL_ATTRIBUTE, oldModelAttribute, modelAttribute));
      }
    }
    return modelAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetModelAttribute()
  {
    return modelAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelAttribute(EAttribute newModelAttribute)
  {
    EAttribute oldModelAttribute = modelAttribute;
    modelAttribute = newModelAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TEXT_VALUE__MODEL_ATTRIBUTE, oldModelAttribute, modelAttribute));
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
      case DslPackage.TEXT_VALUE__TEXT:
        return getText();
      case DslPackage.TEXT_VALUE__MODEL_ATTRIBUTE:
        if (resolve) return getModelAttribute();
        return basicGetModelAttribute();
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
      case DslPackage.TEXT_VALUE__TEXT:
        setText((String)newValue);
        return;
      case DslPackage.TEXT_VALUE__MODEL_ATTRIBUTE:
        setModelAttribute((EAttribute)newValue);
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
      case DslPackage.TEXT_VALUE__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case DslPackage.TEXT_VALUE__MODEL_ATTRIBUTE:
        setModelAttribute((EAttribute)null);
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
      case DslPackage.TEXT_VALUE__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case DslPackage.TEXT_VALUE__MODEL_ATTRIBUTE:
        return modelAttribute != null;
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
    result.append(" (text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //TextValueImpl
