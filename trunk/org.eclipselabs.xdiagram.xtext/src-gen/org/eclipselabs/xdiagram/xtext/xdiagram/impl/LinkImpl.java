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

import org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#isComplex <em>Complex</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#isManhattan <em>Manhattan</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getLinefeatures <em>Linefeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getColorfeatures <em>Colorfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getIntegerfeatures <em>Integerfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl#getDecorators <em>Decorators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends DiagramElementImpl implements Link
{
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
   * The cached value of the '{@link #getLinefeatures() <em>Linefeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinefeatures()
   * @generated
   * @ordered
   */
  protected EList<LineFeature> linefeatures;

  /**
   * The cached value of the '{@link #getColorfeatures() <em>Colorfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorfeatures()
   * @generated
   * @ordered
   */
  protected EList<ColorFeature> colorfeatures;

  /**
   * The cached value of the '{@link #getIntegerfeatures() <em>Integerfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerfeatures()
   * @generated
   * @ordered
   */
  protected EList<IntegerFeature> integerfeatures;

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
  public EList<LineFeature> getLinefeatures()
  {
    if (linefeatures == null)
    {
      linefeatures = new EObjectContainmentEList<LineFeature>(LineFeature.class, this, XdiagramPackage.LINK__LINEFEATURES);
    }
    return linefeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColorFeature> getColorfeatures()
  {
    if (colorfeatures == null)
    {
      colorfeatures = new EObjectContainmentEList<ColorFeature>(ColorFeature.class, this, XdiagramPackage.LINK__COLORFEATURES);
    }
    return colorfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerFeature> getIntegerfeatures()
  {
    if (integerfeatures == null)
    {
      integerfeatures = new EObjectContainmentEList<IntegerFeature>(IntegerFeature.class, this, XdiagramPackage.LINK__INTEGERFEATURES);
    }
    return integerfeatures;
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
      case XdiagramPackage.LINK__LINEFEATURES:
        return ((InternalEList<?>)getLinefeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.LINK__COLORFEATURES:
        return ((InternalEList<?>)getColorfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.LINK__INTEGERFEATURES:
        return ((InternalEList<?>)getIntegerfeatures()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.LINK__LINEFEATURES:
        return getLinefeatures();
      case XdiagramPackage.LINK__COLORFEATURES:
        return getColorfeatures();
      case XdiagramPackage.LINK__INTEGERFEATURES:
        return getIntegerfeatures();
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
      case XdiagramPackage.LINK__LINEFEATURES:
        getLinefeatures().clear();
        getLinefeatures().addAll((Collection<? extends LineFeature>)newValue);
        return;
      case XdiagramPackage.LINK__COLORFEATURES:
        getColorfeatures().clear();
        getColorfeatures().addAll((Collection<? extends ColorFeature>)newValue);
        return;
      case XdiagramPackage.LINK__INTEGERFEATURES:
        getIntegerfeatures().clear();
        getIntegerfeatures().addAll((Collection<? extends IntegerFeature>)newValue);
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
      case XdiagramPackage.LINK__LINEFEATURES:
        getLinefeatures().clear();
        return;
      case XdiagramPackage.LINK__COLORFEATURES:
        getColorfeatures().clear();
        return;
      case XdiagramPackage.LINK__INTEGERFEATURES:
        getIntegerfeatures().clear();
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
      case XdiagramPackage.LINK__LINEFEATURES:
        return linefeatures != null && !linefeatures.isEmpty();
      case XdiagramPackage.LINK__COLORFEATURES:
        return colorfeatures != null && !colorfeatures.isEmpty();
      case XdiagramPackage.LINK__INTEGERFEATURES:
        return integerfeatures != null && !integerfeatures.isEmpty();
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
