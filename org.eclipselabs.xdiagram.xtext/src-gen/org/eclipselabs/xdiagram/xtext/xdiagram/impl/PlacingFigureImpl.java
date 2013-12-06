/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placing Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PlacingFigureImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PlacingFigureImpl#getPlacingStatic <em>Placing Static</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PlacingFigureImpl#getPlacingDynamic <em>Placing Dynamic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlacingFigureImpl extends MinimalEObjectImpl.Container implements PlacingFigure
{
  /**
   * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected static final int POS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected int pos = POS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlacingStatic() <em>Placing Static</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacingStatic()
   * @generated
   * @ordered
   */
  protected StaticFigure placingStatic;

  /**
   * The cached value of the '{@link #getPlacingDynamic() <em>Placing Dynamic</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacingDynamic()
   * @generated
   * @ordered
   */
  protected EList<DynamicFigure> placingDynamic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlacingFigureImpl()
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
    return XdiagramPackage.Literals.PLACING_FIGURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPos()
  {
    return pos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPos(int newPos)
  {
    int oldPos = pos;
    pos = newPos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.PLACING_FIGURE__POS, oldPos, pos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticFigure getPlacingStatic()
  {
    return placingStatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlacingStatic(StaticFigure newPlacingStatic, NotificationChain msgs)
  {
    StaticFigure oldPlacingStatic = placingStatic;
    placingStatic = newPlacingStatic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdiagramPackage.PLACING_FIGURE__PLACING_STATIC, oldPlacingStatic, newPlacingStatic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlacingStatic(StaticFigure newPlacingStatic)
  {
    if (newPlacingStatic != placingStatic)
    {
      NotificationChain msgs = null;
      if (placingStatic != null)
        msgs = ((InternalEObject)placingStatic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.PLACING_FIGURE__PLACING_STATIC, null, msgs);
      if (newPlacingStatic != null)
        msgs = ((InternalEObject)newPlacingStatic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.PLACING_FIGURE__PLACING_STATIC, null, msgs);
      msgs = basicSetPlacingStatic(newPlacingStatic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.PLACING_FIGURE__PLACING_STATIC, newPlacingStatic, newPlacingStatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DynamicFigure> getPlacingDynamic()
  {
    if (placingDynamic == null)
    {
      placingDynamic = new EObjectContainmentEList<DynamicFigure>(DynamicFigure.class, this, XdiagramPackage.PLACING_FIGURE__PLACING_DYNAMIC);
    }
    return placingDynamic;
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
      case XdiagramPackage.PLACING_FIGURE__PLACING_STATIC:
        return basicSetPlacingStatic(null, msgs);
      case XdiagramPackage.PLACING_FIGURE__PLACING_DYNAMIC:
        return ((InternalEList<?>)getPlacingDynamic()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.PLACING_FIGURE__POS:
        return getPos();
      case XdiagramPackage.PLACING_FIGURE__PLACING_STATIC:
        return getPlacingStatic();
      case XdiagramPackage.PLACING_FIGURE__PLACING_DYNAMIC:
        return getPlacingDynamic();
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
      case XdiagramPackage.PLACING_FIGURE__POS:
        setPos((Integer)newValue);
        return;
      case XdiagramPackage.PLACING_FIGURE__PLACING_STATIC:
        setPlacingStatic((StaticFigure)newValue);
        return;
      case XdiagramPackage.PLACING_FIGURE__PLACING_DYNAMIC:
        getPlacingDynamic().clear();
        getPlacingDynamic().addAll((Collection<? extends DynamicFigure>)newValue);
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
      case XdiagramPackage.PLACING_FIGURE__POS:
        setPos(POS_EDEFAULT);
        return;
      case XdiagramPackage.PLACING_FIGURE__PLACING_STATIC:
        setPlacingStatic((StaticFigure)null);
        return;
      case XdiagramPackage.PLACING_FIGURE__PLACING_DYNAMIC:
        getPlacingDynamic().clear();
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
      case XdiagramPackage.PLACING_FIGURE__POS:
        return pos != POS_EDEFAULT;
      case XdiagramPackage.PLACING_FIGURE__PLACING_STATIC:
        return placingStatic != null;
      case XdiagramPackage.PLACING_FIGURE__PLACING_DYNAMIC:
        return placingDynamic != null && !placingDynamic.isEmpty();
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
    result.append(" (pos: ");
    result.append(pos);
    result.append(')');
    return result.toString();
  }

} //PlacingFigureImpl
