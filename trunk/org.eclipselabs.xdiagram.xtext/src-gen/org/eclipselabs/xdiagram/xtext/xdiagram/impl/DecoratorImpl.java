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

import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#isSource <em>Source</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#isTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#isMiddle <em>Middle</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#getPlacingStatic <em>Placing Static</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl#getPlacingDynamic <em>Placing Dynamic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecoratorImpl extends MinimalEObjectImpl.Container implements Decorator
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
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__POS, oldPos, pos));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__PLACING_STATIC, oldPlacingStatic, newPlacingStatic);
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
        msgs = ((InternalEObject)placingStatic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.DECORATOR__PLACING_STATIC, null, msgs);
      if (newPlacingStatic != null)
        msgs = ((InternalEObject)newPlacingStatic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.DECORATOR__PLACING_STATIC, null, msgs);
      msgs = basicSetPlacingStatic(newPlacingStatic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.DECORATOR__PLACING_STATIC, newPlacingStatic, newPlacingStatic));
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
      placingDynamic = new EObjectContainmentEList<DynamicFigure>(DynamicFigure.class, this, XdiagramPackage.DECORATOR__PLACING_DYNAMIC);
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
      case XdiagramPackage.DECORATOR__PLACING_STATIC:
        return basicSetPlacingStatic(null, msgs);
      case XdiagramPackage.DECORATOR__PLACING_DYNAMIC:
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
      case XdiagramPackage.DECORATOR__POS:
        return getPos();
      case XdiagramPackage.DECORATOR__SOURCE:
        return isSource();
      case XdiagramPackage.DECORATOR__TARGET:
        return isTarget();
      case XdiagramPackage.DECORATOR__MIDDLE:
        return isMiddle();
      case XdiagramPackage.DECORATOR__PLACING_STATIC:
        return getPlacingStatic();
      case XdiagramPackage.DECORATOR__PLACING_DYNAMIC:
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
      case XdiagramPackage.DECORATOR__POS:
        setPos((Integer)newValue);
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
      case XdiagramPackage.DECORATOR__PLACING_STATIC:
        setPlacingStatic((StaticFigure)newValue);
        return;
      case XdiagramPackage.DECORATOR__PLACING_DYNAMIC:
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
      case XdiagramPackage.DECORATOR__POS:
        setPos(POS_EDEFAULT);
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
      case XdiagramPackage.DECORATOR__PLACING_STATIC:
        setPlacingStatic((StaticFigure)null);
        return;
      case XdiagramPackage.DECORATOR__PLACING_DYNAMIC:
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
      case XdiagramPackage.DECORATOR__POS:
        return pos != POS_EDEFAULT;
      case XdiagramPackage.DECORATOR__SOURCE:
        return source != SOURCE_EDEFAULT;
      case XdiagramPackage.DECORATOR__TARGET:
        return target != TARGET_EDEFAULT;
      case XdiagramPackage.DECORATOR__MIDDLE:
        return middle != MIDDLE_EDEFAULT;
      case XdiagramPackage.DECORATOR__PLACING_STATIC:
        return placingStatic != null;
      case XdiagramPackage.DECORATOR__PLACING_DYNAMIC:
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
