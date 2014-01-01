/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.Label;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#isSource <em>Source</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#isTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#isMiddle <em>Middle</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#getStaticElement <em>Static Element</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecoratorImpl extends MinimalEObjectImpl.Container implements Decorator
{
  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final int POSITION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected int position = POSITION_EDEFAULT;

  /**
   * The default value of the '{@link #isSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSource()
   * @generated
   * @ordered
   */
  protected static final boolean SOURCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSource()
   * @generated
   * @ordered
   */
  protected boolean source = SOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #isTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTarget()
   * @generated
   * @ordered
   */
  protected static final boolean TARGET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTarget()
   * @generated
   * @ordered
   */
  protected boolean target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #isMiddle() <em>Middle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMiddle()
   * @generated
   * @ordered
   */
  protected static final boolean MIDDLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMiddle() <em>Middle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMiddle()
   * @generated
   * @ordered
   */
  protected boolean middle = MIDDLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStaticElement() <em>Static Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticElement()
   * @generated
   * @ordered
   */
  protected ConnectableElement staticElement;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected Label label;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecoratorImpl()
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
    return XdiagramPackage.Literals.DECORATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(int newPosition)
  {
    int oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__POSITION, oldPosition, position));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(boolean newSource)
  {
    boolean oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(boolean newTarget)
  {
    boolean oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMiddle()
  {
    return middle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiddle(boolean newMiddle)
  {
    boolean oldMiddle = middle;
    middle = newMiddle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__MIDDLE, oldMiddle, middle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectableElement getStaticElement()
  {
    return staticElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStaticElement(ConnectableElement newStaticElement, NotificationChain msgs)
  {
    ConnectableElement oldStaticElement = staticElement;
    staticElement = newStaticElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__STATIC_ELEMENT, oldStaticElement, newStaticElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticElement(ConnectableElement newStaticElement)
  {
    if (newStaticElement != staticElement)
    {
      NotificationChain msgs = null;
      if (staticElement != null)
        msgs = ((InternalEObject)staticElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.DECORATOR__STATIC_ELEMENT, null, msgs);
      if (newStaticElement != null)
        msgs = ((InternalEObject)newStaticElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.DECORATOR__STATIC_ELEMENT, null, msgs);
      msgs = basicSetStaticElement(newStaticElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__STATIC_ELEMENT, newStaticElement, newStaticElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs)
  {
    Label oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(Label newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.DECORATOR__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.DECORATOR__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__LABEL, newLabel, newLabel));
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
      case XdiagramPackage.DECORATOR__STATIC_ELEMENT:
        return basicSetStaticElement(null, msgs);
      case XdiagramPackage.DECORATOR__LABEL:
        return basicSetLabel(null, msgs);
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
      case XdiagramPackage.DECORATOR__POSITION:
        return getPosition();
      case XdiagramPackage.DECORATOR__SOURCE:
        return isSource();
      case XdiagramPackage.DECORATOR__TARGET:
        return isTarget();
      case XdiagramPackage.DECORATOR__MIDDLE:
        return isMiddle();
      case XdiagramPackage.DECORATOR__STATIC_ELEMENT:
        return getStaticElement();
      case XdiagramPackage.DECORATOR__LABEL:
        return getLabel();
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
      case XdiagramPackage.DECORATOR__POSITION:
        setPosition((Integer)newValue);
        return;
      case XdiagramPackage.DECORATOR__SOURCE:
        setSource((Boolean)newValue);
        return;
      case XdiagramPackage.DECORATOR__TARGET:
        setTarget((Boolean)newValue);
        return;
      case XdiagramPackage.DECORATOR__MIDDLE:
        setMiddle((Boolean)newValue);
        return;
      case XdiagramPackage.DECORATOR__STATIC_ELEMENT:
        setStaticElement((ConnectableElement)newValue);
        return;
      case XdiagramPackage.DECORATOR__LABEL:
        setLabel((Label)newValue);
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
      case XdiagramPackage.DECORATOR__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case XdiagramPackage.DECORATOR__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case XdiagramPackage.DECORATOR__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case XdiagramPackage.DECORATOR__MIDDLE:
        setMiddle(MIDDLE_EDEFAULT);
        return;
      case XdiagramPackage.DECORATOR__STATIC_ELEMENT:
        setStaticElement((ConnectableElement)null);
        return;
      case XdiagramPackage.DECORATOR__LABEL:
        setLabel((Label)null);
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
      case XdiagramPackage.DECORATOR__POSITION:
        return position != POSITION_EDEFAULT;
      case XdiagramPackage.DECORATOR__SOURCE:
        return source != SOURCE_EDEFAULT;
      case XdiagramPackage.DECORATOR__TARGET:
        return target != TARGET_EDEFAULT;
      case XdiagramPackage.DECORATOR__MIDDLE:
        return middle != MIDDLE_EDEFAULT;
      case XdiagramPackage.DECORATOR__STATIC_ELEMENT:
        return staticElement != null;
      case XdiagramPackage.DECORATOR__LABEL:
        return label != null;
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
    result.append(" (position: ");
    result.append(position);
    result.append(", source: ");
    result.append(source);
    result.append(", target: ");
    result.append(target);
    result.append(", middle: ");
    result.append(middle);
    result.append(')');
    return result.toString();
  }

} //DecoratorImpl
