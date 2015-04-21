/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

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

import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.dsl.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#isStyled <em>Styled</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#isReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#isComplex <em>Complex</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl#getDecorators <em>Decorators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends DiagramElementImpl implements Link
{
  /**
   * The default value of the '{@link #isStyled() <em>Styled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStyled()
   * @generated
   * @ordered
   */
  protected static final boolean STYLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStyled() <em>Styled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStyled()
   * @generated
   * @ordered
   */
  protected boolean styled = STYLED_EDEFAULT;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected Style style;

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
   * The default value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected static final boolean REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReference()
   * @generated
   * @ordered
   */
  protected boolean reference = REFERENCE_EDEFAULT;

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
    return DslPackage.Literals.LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStyled()
  {
    return styled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyled(boolean newStyled)
  {
    boolean oldStyled = styled;
    styled = newStyled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINK__STYLED, oldStyled, styled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style getStyle()
  {
    if (style != null && style.eIsProxy())
    {
      InternalEObject oldStyle = (InternalEObject)style;
      style = (Style)eResolveProxy(oldStyle);
      if (style != oldStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.LINK__STYLE, oldStyle, style));
      }
    }
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style basicGetStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(Style newStyle)
  {
    Style oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINK__STYLE, oldStyle, style));
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
      features = new EObjectContainmentEList<Feature>(Feature.class, this, DslPackage.LINK__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(boolean newReference)
  {
    boolean oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINK__REFERENCE, oldReference, reference));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.LINK__MODEL_REFERENCE, oldModelReference, modelReference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINK__MODEL_REFERENCE, oldModelReference, modelReference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINK__COMPLEX, oldComplex, complex));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.LINK__SOURCE_REFERENCE, oldSourceReference, sourceReference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINK__SOURCE_REFERENCE, oldSourceReference, sourceReference));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.LINK__TARGET_REFERENCE, oldTargetReference, targetReference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.LINK__TARGET_REFERENCE, oldTargetReference, targetReference));
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
      decorators = new EObjectContainmentEList<Decorator>(Decorator.class, this, DslPackage.LINK__DECORATORS);
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
      case DslPackage.LINK__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case DslPackage.LINK__DECORATORS:
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
      case DslPackage.LINK__STYLED:
        return isStyled();
      case DslPackage.LINK__STYLE:
        if (resolve) return getStyle();
        return basicGetStyle();
      case DslPackage.LINK__FEATURES:
        return getFeatures();
      case DslPackage.LINK__REFERENCE:
        return isReference();
      case DslPackage.LINK__MODEL_REFERENCE:
        if (resolve) return getModelReference();
        return basicGetModelReference();
      case DslPackage.LINK__COMPLEX:
        return isComplex();
      case DslPackage.LINK__SOURCE_REFERENCE:
        if (resolve) return getSourceReference();
        return basicGetSourceReference();
      case DslPackage.LINK__TARGET_REFERENCE:
        if (resolve) return getTargetReference();
        return basicGetTargetReference();
      case DslPackage.LINK__DECORATORS:
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
      case DslPackage.LINK__STYLED:
        setStyled((Boolean)newValue);
        return;
      case DslPackage.LINK__STYLE:
        setStyle((Style)newValue);
        return;
      case DslPackage.LINK__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case DslPackage.LINK__REFERENCE:
        setReference((Boolean)newValue);
        return;
      case DslPackage.LINK__MODEL_REFERENCE:
        setModelReference((EReference)newValue);
        return;
      case DslPackage.LINK__COMPLEX:
        setComplex((Boolean)newValue);
        return;
      case DslPackage.LINK__SOURCE_REFERENCE:
        setSourceReference((EReference)newValue);
        return;
      case DslPackage.LINK__TARGET_REFERENCE:
        setTargetReference((EReference)newValue);
        return;
      case DslPackage.LINK__DECORATORS:
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
      case DslPackage.LINK__STYLED:
        setStyled(STYLED_EDEFAULT);
        return;
      case DslPackage.LINK__STYLE:
        setStyle((Style)null);
        return;
      case DslPackage.LINK__FEATURES:
        getFeatures().clear();
        return;
      case DslPackage.LINK__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
      case DslPackage.LINK__MODEL_REFERENCE:
        setModelReference((EReference)null);
        return;
      case DslPackage.LINK__COMPLEX:
        setComplex(COMPLEX_EDEFAULT);
        return;
      case DslPackage.LINK__SOURCE_REFERENCE:
        setSourceReference((EReference)null);
        return;
      case DslPackage.LINK__TARGET_REFERENCE:
        setTargetReference((EReference)null);
        return;
      case DslPackage.LINK__DECORATORS:
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
      case DslPackage.LINK__STYLED:
        return styled != STYLED_EDEFAULT;
      case DslPackage.LINK__STYLE:
        return style != null;
      case DslPackage.LINK__FEATURES:
        return features != null && !features.isEmpty();
      case DslPackage.LINK__REFERENCE:
        return reference != REFERENCE_EDEFAULT;
      case DslPackage.LINK__MODEL_REFERENCE:
        return modelReference != null;
      case DslPackage.LINK__COMPLEX:
        return complex != COMPLEX_EDEFAULT;
      case DslPackage.LINK__SOURCE_REFERENCE:
        return sourceReference != null;
      case DslPackage.LINK__TARGET_REFERENCE:
        return targetReference != null;
      case DslPackage.LINK__DECORATORS:
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
    if (baseClass == FeatureContainer.class)
    {
      switch (derivedFeatureID)
      {
        case DslPackage.LINK__STYLED: return DslPackage.FEATURE_CONTAINER__STYLED;
        case DslPackage.LINK__STYLE: return DslPackage.FEATURE_CONTAINER__STYLE;
        case DslPackage.LINK__FEATURES: return DslPackage.FEATURE_CONTAINER__FEATURES;
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
    if (baseClass == FeatureContainer.class)
    {
      switch (baseFeatureID)
      {
        case DslPackage.FEATURE_CONTAINER__STYLED: return DslPackage.LINK__STYLED;
        case DslPackage.FEATURE_CONTAINER__STYLE: return DslPackage.LINK__STYLE;
        case DslPackage.FEATURE_CONTAINER__FEATURES: return DslPackage.LINK__FEATURES;
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
    result.append(" (styled: ");
    result.append(styled);
    result.append(", reference: ");
    result.append(reference);
    result.append(", complex: ");
    result.append(complex);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
