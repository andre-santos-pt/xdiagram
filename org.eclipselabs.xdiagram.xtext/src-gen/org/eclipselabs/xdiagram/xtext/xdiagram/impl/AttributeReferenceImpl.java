/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.xdiagram.xtext.xdiagram.AttributeReference;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeReferenceImpl#getModelAttribute <em>Model Attribute</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeReferenceImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeReferenceImpl extends MinimalEObjectImpl.Container implements AttributeReference
{
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
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected EList<AttributeReference> path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeReferenceImpl()
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
    return XdiagramPackage.Literals.ATTRIBUTE_REFERENCE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XdiagramPackage.ATTRIBUTE_REFERENCE__MODEL_ATTRIBUTE, oldModelAttribute, modelAttribute));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.ATTRIBUTE_REFERENCE__MODEL_ATTRIBUTE, oldModelAttribute, modelAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeReference> getPath()
  {
    if (path == null)
    {
      path = new EObjectContainmentEList<AttributeReference>(AttributeReference.class, this, XdiagramPackage.ATTRIBUTE_REFERENCE__PATH);
    }
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XdiagramPackage.ATTRIBUTE_REFERENCE__PATH:
        return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case XdiagramPackage.ATTRIBUTE_REFERENCE__MODEL_ATTRIBUTE:
        if (resolve) return getModelAttribute();
        return basicGetModelAttribute();
      case XdiagramPackage.ATTRIBUTE_REFERENCE__PATH:
        return getPath();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XdiagramPackage.ATTRIBUTE_REFERENCE__MODEL_ATTRIBUTE:
        setModelAttribute((EAttribute)newValue);
        return;
      case XdiagramPackage.ATTRIBUTE_REFERENCE__PATH:
        getPath().clear();
        getPath().addAll((Collection<? extends AttributeReference>)newValue);
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
      case XdiagramPackage.ATTRIBUTE_REFERENCE__MODEL_ATTRIBUTE:
        setModelAttribute((EAttribute)null);
        return;
      case XdiagramPackage.ATTRIBUTE_REFERENCE__PATH:
        getPath().clear();
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
      case XdiagramPackage.ATTRIBUTE_REFERENCE__MODEL_ATTRIBUTE:
        return modelAttribute != null;
      case XdiagramPackage.ATTRIBUTE_REFERENCE__PATH:
        return path != null && !path.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AttributeReferenceImpl
