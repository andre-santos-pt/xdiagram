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

import org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Anchor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getPassX <em>Pass X</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getFormatX <em>Format X</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getPassY <em>Pass Y</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getFormatY <em>Format Y</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl#getArrows <em>Arrows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeAnchorImpl extends MinimalEObjectImpl.Container implements NodeAnchor
{
  /**
   * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected String object = OBJECT_EDEFAULT;

  /**
   * The default value of the '{@link #getPassX() <em>Pass X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassX()
   * @generated
   * @ordered
   */
  protected static final String PASS_X_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassX() <em>Pass X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassX()
   * @generated
   * @ordered
   */
  protected String passX = PASS_X_EDEFAULT;

  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getFormatX() <em>Format X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatX()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_X_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormatX() <em>Format X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatX()
   * @generated
   * @ordered
   */
  protected String formatX = FORMAT_X_EDEFAULT;

  /**
   * The default value of the '{@link #getPassY() <em>Pass Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassY()
   * @generated
   * @ordered
   */
  protected static final String PASS_Y_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassY() <em>Pass Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassY()
   * @generated
   * @ordered
   */
  protected String passY = PASS_Y_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getFormatY() <em>Format Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatY()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_Y_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormatY() <em>Format Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatY()
   * @generated
   * @ordered
   */
  protected String formatY = FORMAT_Y_EDEFAULT;

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
   * The cached value of the '{@link #getArrows() <em>Arrows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrows()
   * @generated
   * @ordered
   */
  protected EList<ArrowAnchor> arrows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeAnchorImpl()
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
    return XdiagramPackage.Literals.NODE_ANCHOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(String newObject)
  {
    String oldObject = object;
    object = newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE_ANCHOR__OBJECT, oldObject, object));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassX()
  {
    return passX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassX(String newPassX)
  {
    String oldPassX = passX;
    passX = newPassX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE_ANCHOR__PASS_X, oldPassX, passX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE_ANCHOR__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormatX()
  {
    return formatX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormatX(String newFormatX)
  {
    String oldFormatX = formatX;
    formatX = newFormatX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE_ANCHOR__FORMAT_X, oldFormatX, formatX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassY()
  {
    return passY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassY(String newPassY)
  {
    String oldPassY = passY;
    passY = newPassY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE_ANCHOR__PASS_Y, oldPassY, passY));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE_ANCHOR__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormatY()
  {
    return formatY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormatY(String newFormatY)
  {
    String oldFormatY = formatY;
    formatY = newFormatY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.NODE_ANCHOR__FORMAT_Y, oldFormatY, formatY));
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
      figures = new EObjectContainmentEList<NodeFigure>(NodeFigure.class, this, XdiagramPackage.NODE_ANCHOR__FIGURES);
    }
    return figures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrowAnchor> getArrows()
  {
    if (arrows == null)
    {
      arrows = new EObjectContainmentEList<ArrowAnchor>(ArrowAnchor.class, this, XdiagramPackage.NODE_ANCHOR__ARROWS);
    }
    return arrows;
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
      case XdiagramPackage.NODE_ANCHOR__FIGURES:
        return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.NODE_ANCHOR__ARROWS:
        return ((InternalEList<?>)getArrows()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.NODE_ANCHOR__OBJECT:
        return getObject();
      case XdiagramPackage.NODE_ANCHOR__PASS_X:
        return getPassX();
      case XdiagramPackage.NODE_ANCHOR__X:
        return getX();
      case XdiagramPackage.NODE_ANCHOR__FORMAT_X:
        return getFormatX();
      case XdiagramPackage.NODE_ANCHOR__PASS_Y:
        return getPassY();
      case XdiagramPackage.NODE_ANCHOR__Y:
        return getY();
      case XdiagramPackage.NODE_ANCHOR__FORMAT_Y:
        return getFormatY();
      case XdiagramPackage.NODE_ANCHOR__FIGURES:
        return getFigures();
      case XdiagramPackage.NODE_ANCHOR__ARROWS:
        return getArrows();
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
      case XdiagramPackage.NODE_ANCHOR__OBJECT:
        setObject((String)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__PASS_X:
        setPassX((String)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__X:
        setX((Integer)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__FORMAT_X:
        setFormatX((String)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__PASS_Y:
        setPassY((String)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__Y:
        setY((Integer)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__FORMAT_Y:
        setFormatY((String)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__FIGURES:
        getFigures().clear();
        getFigures().addAll((Collection<? extends NodeFigure>)newValue);
        return;
      case XdiagramPackage.NODE_ANCHOR__ARROWS:
        getArrows().clear();
        getArrows().addAll((Collection<? extends ArrowAnchor>)newValue);
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
      case XdiagramPackage.NODE_ANCHOR__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case XdiagramPackage.NODE_ANCHOR__PASS_X:
        setPassX(PASS_X_EDEFAULT);
        return;
      case XdiagramPackage.NODE_ANCHOR__X:
        setX(X_EDEFAULT);
        return;
      case XdiagramPackage.NODE_ANCHOR__FORMAT_X:
        setFormatX(FORMAT_X_EDEFAULT);
        return;
      case XdiagramPackage.NODE_ANCHOR__PASS_Y:
        setPassY(PASS_Y_EDEFAULT);
        return;
      case XdiagramPackage.NODE_ANCHOR__Y:
        setY(Y_EDEFAULT);
        return;
      case XdiagramPackage.NODE_ANCHOR__FORMAT_Y:
        setFormatY(FORMAT_Y_EDEFAULT);
        return;
      case XdiagramPackage.NODE_ANCHOR__FIGURES:
        getFigures().clear();
        return;
      case XdiagramPackage.NODE_ANCHOR__ARROWS:
        getArrows().clear();
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
      case XdiagramPackage.NODE_ANCHOR__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case XdiagramPackage.NODE_ANCHOR__PASS_X:
        return PASS_X_EDEFAULT == null ? passX != null : !PASS_X_EDEFAULT.equals(passX);
      case XdiagramPackage.NODE_ANCHOR__X:
        return x != X_EDEFAULT;
      case XdiagramPackage.NODE_ANCHOR__FORMAT_X:
        return FORMAT_X_EDEFAULT == null ? formatX != null : !FORMAT_X_EDEFAULT.equals(formatX);
      case XdiagramPackage.NODE_ANCHOR__PASS_Y:
        return PASS_Y_EDEFAULT == null ? passY != null : !PASS_Y_EDEFAULT.equals(passY);
      case XdiagramPackage.NODE_ANCHOR__Y:
        return y != Y_EDEFAULT;
      case XdiagramPackage.NODE_ANCHOR__FORMAT_Y:
        return FORMAT_Y_EDEFAULT == null ? formatY != null : !FORMAT_Y_EDEFAULT.equals(formatY);
      case XdiagramPackage.NODE_ANCHOR__FIGURES:
        return figures != null && !figures.isEmpty();
      case XdiagramPackage.NODE_ANCHOR__ARROWS:
        return arrows != null && !arrows.isEmpty();
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
    result.append(" (object: ");
    result.append(object);
    result.append(", passX: ");
    result.append(passX);
    result.append(", X: ");
    result.append(x);
    result.append(", formatX: ");
    result.append(formatX);
    result.append(", passY: ");
    result.append(passY);
    result.append(", Y: ");
    result.append(y);
    result.append(", formatY: ");
    result.append(formatY);
    result.append(')');
    return result.toString();
  }

} //NodeAnchorImpl
