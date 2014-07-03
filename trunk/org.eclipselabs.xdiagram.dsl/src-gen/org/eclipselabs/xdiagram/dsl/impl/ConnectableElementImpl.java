/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.ContainerLayout;
import org.eclipselabs.xdiagram.dsl.DslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.ConnectableElementImpl#isComposite <em>Composite</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.ConnectableElementImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.ConnectableElementImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectableElementImpl extends FeatureContainerImpl implements ConnectableElement
{
  /**
   * The default value of the '{@link #isComposite() <em>Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComposite()
   * @generated
   * @ordered
   */
  protected static final boolean COMPOSITE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isComposite() <em>Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComposite()
   * @generated
   * @ordered
   */
  protected boolean composite = COMPOSITE_EDEFAULT;

  /**
   * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected static final ContainerLayout LAYOUT_EDEFAULT = ContainerLayout.FREE;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected ContainerLayout layout = LAYOUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<ConnectableElement> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectableElementImpl()
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
    return DslPackage.Literals.CONNECTABLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isComposite()
  {
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposite(boolean newComposite)
  {
    boolean oldComposite = composite;
    composite = newComposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONNECTABLE_ELEMENT__COMPOSITE, oldComposite, composite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerLayout getLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(ContainerLayout newLayout)
  {
    ContainerLayout oldLayout = layout;
    layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONNECTABLE_ELEMENT__LAYOUT, oldLayout, layout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConnectableElement> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<ConnectableElement>(ConnectableElement.class, this, DslPackage.CONNECTABLE_ELEMENT__CHILDREN);
    }
    return children;
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
      case DslPackage.CONNECTABLE_ELEMENT__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case DslPackage.CONNECTABLE_ELEMENT__COMPOSITE:
        return isComposite();
      case DslPackage.CONNECTABLE_ELEMENT__LAYOUT:
        return getLayout();
      case DslPackage.CONNECTABLE_ELEMENT__CHILDREN:
        return getChildren();
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
      case DslPackage.CONNECTABLE_ELEMENT__COMPOSITE:
        setComposite((Boolean)newValue);
        return;
      case DslPackage.CONNECTABLE_ELEMENT__LAYOUT:
        setLayout((ContainerLayout)newValue);
        return;
      case DslPackage.CONNECTABLE_ELEMENT__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends ConnectableElement>)newValue);
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
      case DslPackage.CONNECTABLE_ELEMENT__COMPOSITE:
        setComposite(COMPOSITE_EDEFAULT);
        return;
      case DslPackage.CONNECTABLE_ELEMENT__LAYOUT:
        setLayout(LAYOUT_EDEFAULT);
        return;
      case DslPackage.CONNECTABLE_ELEMENT__CHILDREN:
        getChildren().clear();
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
      case DslPackage.CONNECTABLE_ELEMENT__COMPOSITE:
        return composite != COMPOSITE_EDEFAULT;
      case DslPackage.CONNECTABLE_ELEMENT__LAYOUT:
        return layout != LAYOUT_EDEFAULT;
      case DslPackage.CONNECTABLE_ELEMENT__CHILDREN:
        return children != null && !children.isEmpty();
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
    result.append(" (composite: ");
    result.append(composite);
    result.append(", layout: ");
    result.append(layout);
    result.append(')');
    return result.toString();
  }

} //ConnectableElementImpl
