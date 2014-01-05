/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.NodeImpl#getRootFigure <em>Root Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends DiagramElementImpl implements Node
{
  /**
   * The cached value of the '{@link #getRootFigure() <em>Root Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootFigure()
   * @generated
   * @ordered
   */
  protected ConnectableElement rootFigure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
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
    return DslPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectableElement getRootFigure()
  {
    return rootFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootFigure(ConnectableElement newRootFigure, NotificationChain msgs)
  {
    ConnectableElement oldRootFigure = rootFigure;
    rootFigure = newRootFigure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.NODE__ROOT_FIGURE, oldRootFigure, newRootFigure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootFigure(ConnectableElement newRootFigure)
  {
    if (newRootFigure != rootFigure)
    {
      NotificationChain msgs = null;
      if (rootFigure != null)
        msgs = ((InternalEObject)rootFigure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.NODE__ROOT_FIGURE, null, msgs);
      if (newRootFigure != null)
        msgs = ((InternalEObject)newRootFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.NODE__ROOT_FIGURE, null, msgs);
      msgs = basicSetRootFigure(newRootFigure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.NODE__ROOT_FIGURE, newRootFigure, newRootFigure));
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
      case DslPackage.NODE__ROOT_FIGURE:
        return basicSetRootFigure(null, msgs);
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
      case DslPackage.NODE__ROOT_FIGURE:
        return getRootFigure();
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
      case DslPackage.NODE__ROOT_FIGURE:
        setRootFigure((ConnectableElement)newValue);
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
      case DslPackage.NODE__ROOT_FIGURE:
        setRootFigure((ConnectableElement)null);
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
      case DslPackage.NODE__ROOT_FIGURE:
        return rootFigure != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeImpl
