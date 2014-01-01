/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#isComplex <em>Complex</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#isManhattan <em>Manhattan</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getDecorators <em>Decorators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends DiagramElementImpl implements Link
{
  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * The cached value of the '{@link #getModelReference() <em>Model Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelReference()
   * @generated
   * @ordered
   */
  protected EReference modelReference;

  /**
   * The default value of the '{@link #isComplex() <em>Complex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComplex()
   * @generated
   * @ordered
   */
  protected static final boolean COMPLEX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isComplex() <em>Complex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComplex()
   * @generated
   * @ordered
   */
  protected boolean complex = COMPLEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceReference()
   * @generated
   * @ordered
   */
  protected EReference sourceReference;

  /**
   * The cached value of the '{@link #getTargetReference() <em>Target Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetReference()
   * @generated
   * @ordered
   */
  protected EReference targetReference;

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
   * The cached value of the '{@link #getDecorators() <em>Decorators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecorators()
   * @generated
   * @ordered
   */
  protected EList<Decorator> decorators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkImpl()
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
    return XdiagramPackage.Literals.LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, XdiagramPackage.LINK__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelReference()
  {
    if (modelReference != null && modelReference.eIsProxy())
    {
      InternalEObject oldModelReference = (InternalEObject)modelReference;
      modelReference = (EReference)eResolveProxy(oldModelReference);
      if (modelReference != oldModelReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XdiagramPackage.LINK__MODEL_REFERENCE, oldModelReference, modelReference));
      }
    }
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetModelReference()
  {
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelReference(EReference newModelReference)
  {
    EReference oldModelReference = modelReference;
    modelReference = newModelReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.LINK__MODEL_REFERENCE, oldModelReference, modelReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isComplex()
  {
    return complex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComplex(boolean newComplex)
  {
    boolean oldComplex = complex;
    complex = newComplex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.LINK__COMPLEX, oldComplex, complex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSourceReference()
  {
    if (sourceReference != null && sourceReference.eIsProxy())
    {
      InternalEObject oldSourceReference = (InternalEObject)sourceReference;
      sourceReference = (EReference)eResolveProxy(oldSourceReference);
      if (sourceReference != oldSourceReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XdiagramPackage.LINK__SOURCE_REFERENCE, oldSourceReference, sourceReference));
      }
    }
    return sourceReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetSourceReference()
  {
    return sourceReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceReference(EReference newSourceReference)
  {
    EReference oldSourceReference = sourceReference;
    sourceReference = newSourceReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.LINK__SOURCE_REFERENCE, oldSourceReference, sourceReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTargetReference()
  {
    if (targetReference != null && targetReference.eIsProxy())
    {
      InternalEObject oldTargetReference = (InternalEObject)targetReference;
      targetReference = (EReference)eResolveProxy(oldTargetReference);
      if (targetReference != oldTargetReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XdiagramPackage.LINK__TARGET_REFERENCE, oldTargetReference, targetReference));
      }
    }
    return targetReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetTargetReference()
  {
    return targetReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetReference(EReference newTargetReference)
  {
    EReference oldTargetReference = targetReference;
    targetReference = newTargetReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.LINK__TARGET_REFERENCE, oldTargetReference, targetReference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.LINK__MANHATTAN, oldManhattan, manhattan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decorator> getDecorators()
  {
    if (decorators == null)
    {
      decorators = new EObjectContainmentEList<Decorator>(Decorator.class, this, XdiagramPackage.LINK__DECORATORS);
    }
    return decorators;
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
      case XdiagramPackage.LINK__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.LINK__DECORATORS:
        return ((InternalEList<?>)getDecorators()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.LINK__FEATURES:
        return getFeatures();
      case XdiagramPackage.LINK__MODEL_REFERENCE:
        if (resolve) return getModelReference();
        return basicGetModelReference();
      case XdiagramPackage.LINK__COMPLEX:
        return isComplex();
      case XdiagramPackage.LINK__SOURCE_REFERENCE:
        if (resolve) return getSourceReference();
        return basicGetSourceReference();
      case XdiagramPackage.LINK__TARGET_REFERENCE:
        if (resolve) return getTargetReference();
        return basicGetTargetReference();
      case XdiagramPackage.LINK__MANHATTAN:
        return isManhattan();
      case XdiagramPackage.LINK__DECORATORS:
        return getDecorators();
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
      case XdiagramPackage.LINK__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case XdiagramPackage.LINK__MODEL_REFERENCE:
        setModelReference((EReference)newValue);
        return;
      case XdiagramPackage.LINK__COMPLEX:
        setComplex((Boolean)newValue);
        return;
      case XdiagramPackage.LINK__SOURCE_REFERENCE:
        setSourceReference((EReference)newValue);
        return;
      case XdiagramPackage.LINK__TARGET_REFERENCE:
        setTargetReference((EReference)newValue);
        return;
      case XdiagramPackage.LINK__MANHATTAN:
        setManhattan((Boolean)newValue);
        return;
      case XdiagramPackage.LINK__DECORATORS:
        getDecorators().clear();
        getDecorators().addAll((Collection<? extends Decorator>)newValue);
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
      case XdiagramPackage.LINK__FEATURES:
        getFeatures().clear();
        return;
      case XdiagramPackage.LINK__MODEL_REFERENCE:
        setModelReference((EReference)null);
        return;
      case XdiagramPackage.LINK__COMPLEX:
        setComplex(COMPLEX_EDEFAULT);
        return;
      case XdiagramPackage.LINK__SOURCE_REFERENCE:
        setSourceReference((EReference)null);
        return;
      case XdiagramPackage.LINK__TARGET_REFERENCE:
        setTargetReference((EReference)null);
        return;
      case XdiagramPackage.LINK__MANHATTAN:
        setManhattan(MANHATTAN_EDEFAULT);
        return;
      case XdiagramPackage.LINK__DECORATORS:
        getDecorators().clear();
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
      case XdiagramPackage.LINK__FEATURES:
        return features != null && !features.isEmpty();
      case XdiagramPackage.LINK__MODEL_REFERENCE:
        return modelReference != null;
      case XdiagramPackage.LINK__COMPLEX:
        return complex != COMPLEX_EDEFAULT;
      case XdiagramPackage.LINK__SOURCE_REFERENCE:
        return sourceReference != null;
      case XdiagramPackage.LINK__TARGET_REFERENCE:
        return targetReference != null;
      case XdiagramPackage.LINK__MANHATTAN:
        return manhattan != MANHATTAN_EDEFAULT;
      case XdiagramPackage.LINK__DECORATORS:
        return decorators != null && !decorators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        case XdiagramPackage.LINK__FEATURES: return XdiagramPackage.ELEMENT__FEATURES;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        case XdiagramPackage.ELEMENT__FEATURES: return XdiagramPackage.LINK__FEATURES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (complex: ");
    result.append(complex);
    result.append(", manhattan: ");
    result.append(manhattan);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
