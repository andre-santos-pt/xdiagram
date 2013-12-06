/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures;
import org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StaticFigureImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StaticFigureImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StaticFigureImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticFigureImpl extends MinimalEObjectImpl.Container implements StaticFigure
{
  /**
   * The default value of the '{@link #getFigure() <em>Figure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigure()
   * @generated
   * @ordered
   */
  protected static final String FIGURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFigure() <em>Figure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigure()
   * @generated
   * @ordered
   */
  protected String figure = FIGURE_EDEFAULT;

  /**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final String STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected String style = STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected FigureFeatures features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticFigureImpl()
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
    return XdiagramPackage.Literals.STATIC_FIGURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFigure()
  {
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFigure(String newFigure)
  {
    String oldFigure = figure;
    figure = newFigure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.STATIC_FIGURE__FIGURE, oldFigure, figure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(String newStyle)
  {
    String oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.STATIC_FIGURE__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureFeatures getFeatures()
  {
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatures(FigureFeatures newFeatures, NotificationChain msgs)
  {
    FigureFeatures oldFeatures = features;
    features = newFeatures;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdiagramPackage.STATIC_FIGURE__FEATURES, oldFeatures, newFeatures);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatures(FigureFeatures newFeatures)
  {
    if (newFeatures != features)
    {
      NotificationChain msgs = null;
      if (features != null)
        msgs = ((InternalEObject)features).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.STATIC_FIGURE__FEATURES, null, msgs);
      if (newFeatures != null)
        msgs = ((InternalEObject)newFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdiagramPackage.STATIC_FIGURE__FEATURES, null, msgs);
      msgs = basicSetFeatures(newFeatures, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.STATIC_FIGURE__FEATURES, newFeatures, newFeatures));
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
      case XdiagramPackage.STATIC_FIGURE__FEATURES:
        return basicSetFeatures(null, msgs);
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
      case XdiagramPackage.STATIC_FIGURE__FIGURE:
        return getFigure();
      case XdiagramPackage.STATIC_FIGURE__STYLE:
        return getStyle();
      case XdiagramPackage.STATIC_FIGURE__FEATURES:
        return getFeatures();
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
      case XdiagramPackage.STATIC_FIGURE__FIGURE:
        setFigure((String)newValue);
        return;
      case XdiagramPackage.STATIC_FIGURE__STYLE:
        setStyle((String)newValue);
        return;
      case XdiagramPackage.STATIC_FIGURE__FEATURES:
        setFeatures((FigureFeatures)newValue);
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
      case XdiagramPackage.STATIC_FIGURE__FIGURE:
        setFigure(FIGURE_EDEFAULT);
        return;
      case XdiagramPackage.STATIC_FIGURE__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case XdiagramPackage.STATIC_FIGURE__FEATURES:
        setFeatures((FigureFeatures)null);
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
      case XdiagramPackage.STATIC_FIGURE__FIGURE:
        return FIGURE_EDEFAULT == null ? figure != null : !FIGURE_EDEFAULT.equals(figure);
      case XdiagramPackage.STATIC_FIGURE__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case XdiagramPackage.STATIC_FIGURE__FEATURES:
        return features != null;
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
    result.append(" (figure: ");
    result.append(figure);
    result.append(", style: ");
    result.append(style);
    result.append(')');
    return result.toString();
  }

} //StaticFigureImpl
