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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.xdiagram.xtext.xdiagram.Anchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl#isResizable <em>Resizable</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl#getMainFigure <em>Main Figure</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl#getAnchors <em>Anchors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends DiagramElementImpl implements Node
{
  /**
   * The default value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResizable()
   * @generated
   * @ordered
   */
  protected static final boolean RESIZABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResizable()
   * @generated
   * @ordered
   */
  protected boolean resizable = RESIZABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMainFigure() <em>Main Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainFigure()
   * @generated
   * @ordered
   */
  protected ConnectableElement mainFigure;

  /**
   * The cached value of the '{@link #getAnchors() <em>Anchors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnchors()
   * @generated
   * @ordered
   */
  protected EList<Anchor> anchors;

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
    return XdiagramPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResizable()
  {
    return resizable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResizable(boolean newResizable)
  {
    boolean oldResizable = resizable;
    resizable = newResizable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE__RESIZABLE, oldResizable, resizable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectableElement getMainFigure()
  {
    return mainFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainFigure(ConnectableElement newMainFigure, NotificationChain msgs)
  {
    ConnectableElement oldMainFigure = mainFigure;
    mainFigure = newMainFigure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE__MAIN_FIGURE, oldMainFigure, newMainFigure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainFigure(ConnectableElement newMainFigure)
  {
    if (newMainFigure != mainFigure)
    {
      NotificationChain msgs = null;
      if (mainFigure != null)
        msgs = ((InternalEObject)mainFigure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.NODE__MAIN_FIGURE, null, msgs);
      if (newMainFigure != null)
        msgs = ((InternalEObject)newMainFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.NODE__MAIN_FIGURE, null, msgs);
      msgs = basicSetMainFigure(newMainFigure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE__MAIN_FIGURE, newMainFigure, newMainFigure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Anchor> getAnchors()
  {
    if (anchors == null)
    {
      anchors = new EObjectContainmentEList<Anchor>(Anchor.class, this, XdiagramPackage.NODE__ANCHORS);
    }
    return anchors;
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
      case XdiagramPackage.NODE__MAIN_FIGURE:
        return basicSetMainFigure(null, msgs);
      case XdiagramPackage.NODE__ANCHORS:
        return ((InternalEList<?>)getAnchors()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.NODE__RESIZABLE:
        return isResizable();
      case XdiagramPackage.NODE__MAIN_FIGURE:
        return getMainFigure();
      case XdiagramPackage.NODE__ANCHORS:
        return getAnchors();
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
      case XdiagramPackage.NODE__RESIZABLE:
        setResizable((Boolean)newValue);
        return;
      case XdiagramPackage.NODE__MAIN_FIGURE:
        setMainFigure((ConnectableElement)newValue);
        return;
      case XdiagramPackage.NODE__ANCHORS:
        getAnchors().clear();
        getAnchors().addAll((Collection<? extends Anchor>)newValue);
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
      case XdiagramPackage.NODE__RESIZABLE:
        setResizable(RESIZABLE_EDEFAULT);
        return;
      case XdiagramPackage.NODE__MAIN_FIGURE:
        setMainFigure((ConnectableElement)null);
        return;
      case XdiagramPackage.NODE__ANCHORS:
        getAnchors().clear();
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
      case XdiagramPackage.NODE__RESIZABLE:
        return resizable != RESIZABLE_EDEFAULT;
      case XdiagramPackage.NODE__MAIN_FIGURE:
        return mainFigure != null;
      case XdiagramPackage.NODE__ANCHORS:
        return anchors != null && !anchors.isEmpty();
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
    result.append(" (resizable: ");
    result.append(resizable);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
