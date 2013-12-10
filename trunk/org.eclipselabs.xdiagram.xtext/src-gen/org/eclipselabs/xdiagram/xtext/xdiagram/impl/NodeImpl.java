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

import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl#isResizable <em>Resizable</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl#getContainers <em>Containers</em>}</li>
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
   * The cached value of the '{@link #getFigures() <em>Figures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigures()
   * @generated
   * @ordered
   */
  protected EList<NodeFigure> figures;

  /**
   * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainers()
   * @generated
   * @ordered
   */
  protected EList<NodeContainer> containers;

  /**
   * The cached value of the '{@link #getAnchors() <em>Anchors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnchors()
   * @generated
   * @ordered
   */
  protected EList<NodeAnchor> anchors;

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
  public EList<NodeFigure> getFigures()
  {
    if (figures == null)
    {
      figures = new EObjectContainmentEList<NodeFigure>(NodeFigure.class, this, XdiagramPackage.NODE__FIGURES);
    }
    return figures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeContainer> getContainers()
  {
    if (containers == null)
    {
      containers = new EObjectContainmentEList<NodeContainer>(NodeContainer.class, this, XdiagramPackage.NODE__CONTAINERS);
    }
    return containers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeAnchor> getAnchors()
  {
    if (anchors == null)
    {
      anchors = new EObjectContainmentEList<NodeAnchor>(NodeAnchor.class, this, XdiagramPackage.NODE__ANCHORS);
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
      case XdiagramPackage.NODE__FIGURES:
        return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.NODE__CONTAINERS:
        return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.NODE__FIGURES:
        return getFigures();
      case XdiagramPackage.NODE__CONTAINERS:
        return getContainers();
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
      case XdiagramPackage.NODE__FIGURES:
        getFigures().clear();
        getFigures().addAll((Collection<? extends NodeFigure>)newValue);
        return;
      case XdiagramPackage.NODE__CONTAINERS:
        getContainers().clear();
        getContainers().addAll((Collection<? extends NodeContainer>)newValue);
        return;
      case XdiagramPackage.NODE__ANCHORS:
        getAnchors().clear();
        getAnchors().addAll((Collection<? extends NodeAnchor>)newValue);
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
      case XdiagramPackage.NODE__FIGURES:
        getFigures().clear();
        return;
      case XdiagramPackage.NODE__CONTAINERS:
        getContainers().clear();
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
      case XdiagramPackage.NODE__FIGURES:
        return figures != null && !figures.isEmpty();
      case XdiagramPackage.NODE__CONTAINERS:
        return containers != null && !containers.isEmpty();
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
