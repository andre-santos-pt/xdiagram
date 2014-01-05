/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.Custom;
import org.eclipselabs.xdiagram.dsl.CustomFigure;
import org.eclipselabs.xdiagram.dsl.DslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.CustomImpl#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomImpl extends ConnectableElementImpl implements Custom
{
  /**
   * The cached value of the '{@link #getFigure() <em>Figure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigure()
   * @generated
   * @ordered
   */
  protected CustomFigure figure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomImpl()
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
    return DslPackage.Literals.CUSTOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomFigure getFigure()
  {
    if (figure != null && figure.eIsProxy())
    {
      InternalEObject oldFigure = (InternalEObject)figure;
      figure = (CustomFigure)eResolveProxy(oldFigure);
      if (figure != oldFigure)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.CUSTOM__FIGURE, oldFigure, figure));
      }
    }
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomFigure basicGetFigure()
  {
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFigure(CustomFigure newFigure)
  {
    CustomFigure oldFigure = figure;
    figure = newFigure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CUSTOM__FIGURE, oldFigure, figure));
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
      case DslPackage.CUSTOM__FIGURE:
        if (resolve) return getFigure();
        return basicGetFigure();
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
      case DslPackage.CUSTOM__FIGURE:
        setFigure((CustomFigure)newValue);
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
      case DslPackage.CUSTOM__FIGURE:
        setFigure((CustomFigure)null);
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
      case DslPackage.CUSTOM__FIGURE:
        return figure != null;
    }
    return super.eIsSet(featureID);
  }

} //CustomImpl
