/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.iscte.xdiagram.dsl.model.Custom;
import pt.iscte.xdiagram.dsl.model.CustomFigure;
import pt.iscte.xdiagram.dsl.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.CustomImpl#getFigure <em>Figure</em>}</li>
 * </ul>
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
    return ModelPackage.Literals.CUSTOM;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CUSTOM__FIGURE, oldFigure, figure));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOM__FIGURE, oldFigure, figure));
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
      case ModelPackage.CUSTOM__FIGURE:
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
      case ModelPackage.CUSTOM__FIGURE:
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
      case ModelPackage.CUSTOM__FIGURE:
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
      case ModelPackage.CUSTOM__FIGURE:
        return figure != null;
    }
    return super.eIsSet(featureID);
  }

} //CustomImpl
