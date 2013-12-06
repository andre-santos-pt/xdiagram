/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures;
import org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getLinefeatures <em>Linefeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getCenterfeatures <em>Centerfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getAlignfeatures <em>Alignfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getGradientfeatures <em>Gradientfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getPointfeatures <em>Pointfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getSizefeatures <em>Sizefeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getPositionfeatures <em>Positionfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getColorfeatures <em>Colorfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getIntegerfeatures <em>Integerfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getBooleanfeatures <em>Booleanfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getStringfeatures <em>Stringfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl#getCustomfeatures <em>Customfeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureFeaturesImpl extends MinimalEObjectImpl.Container implements FigureFeatures
{
  /**
   * The cached value of the '{@link #getLinefeatures() <em>Linefeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinefeatures()
   * @generated
   * @ordered
   */
  protected EList<LineFeature> linefeatures;

  /**
   * The cached value of the '{@link #getCenterfeatures() <em>Centerfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenterfeatures()
   * @generated
   * @ordered
   */
  protected EList<CenterFeature> centerfeatures;

  /**
   * The cached value of the '{@link #getAlignfeatures() <em>Alignfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignfeatures()
   * @generated
   * @ordered
   */
  protected EList<AlignFeature> alignfeatures;

  /**
   * The cached value of the '{@link #getGradientfeatures() <em>Gradientfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGradientfeatures()
   * @generated
   * @ordered
   */
  protected EList<GradientFeature> gradientfeatures;

  /**
   * The cached value of the '{@link #getPointfeatures() <em>Pointfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointfeatures()
   * @generated
   * @ordered
   */
  protected EList<PointFeature> pointfeatures;

  /**
   * The cached value of the '{@link #getSizefeatures() <em>Sizefeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizefeatures()
   * @generated
   * @ordered
   */
  protected EList<SizeFeature> sizefeatures;

  /**
   * The cached value of the '{@link #getPositionfeatures() <em>Positionfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPositionfeatures()
   * @generated
   * @ordered
   */
  protected EList<PositionFeature> positionfeatures;

  /**
   * The cached value of the '{@link #getColorfeatures() <em>Colorfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorfeatures()
   * @generated
   * @ordered
   */
  protected EList<ColorFeature> colorfeatures;

  /**
   * The cached value of the '{@link #getIntegerfeatures() <em>Integerfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerfeatures()
   * @generated
   * @ordered
   */
  protected EList<IntegerFeature> integerfeatures;

  /**
   * The cached value of the '{@link #getBooleanfeatures() <em>Booleanfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanfeatures()
   * @generated
   * @ordered
   */
  protected EList<BooleanFeature> booleanfeatures;

  /**
   * The cached value of the '{@link #getStringfeatures() <em>Stringfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringfeatures()
   * @generated
   * @ordered
   */
  protected EList<StringFeature> stringfeatures;

  /**
   * The cached value of the '{@link #getCustomfeatures() <em>Customfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomfeatures()
   * @generated
   * @ordered
   */
  protected EList<CustomFeature> customfeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FigureFeaturesImpl()
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
    return XdiagramPackage.Literals.FIGURE_FEATURES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LineFeature> getLinefeatures()
  {
    if (linefeatures == null)
    {
      linefeatures = new EObjectContainmentEList<LineFeature>(LineFeature.class, this, XdiagramPackage.FIGURE_FEATURES__LINEFEATURES);
    }
    return linefeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CenterFeature> getCenterfeatures()
  {
    if (centerfeatures == null)
    {
      centerfeatures = new EObjectContainmentEList<CenterFeature>(CenterFeature.class, this, XdiagramPackage.FIGURE_FEATURES__CENTERFEATURES);
    }
    return centerfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AlignFeature> getAlignfeatures()
  {
    if (alignfeatures == null)
    {
      alignfeatures = new EObjectContainmentEList<AlignFeature>(AlignFeature.class, this, XdiagramPackage.FIGURE_FEATURES__ALIGNFEATURES);
    }
    return alignfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GradientFeature> getGradientfeatures()
  {
    if (gradientfeatures == null)
    {
      gradientfeatures = new EObjectContainmentEList<GradientFeature>(GradientFeature.class, this, XdiagramPackage.FIGURE_FEATURES__GRADIENTFEATURES);
    }
    return gradientfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PointFeature> getPointfeatures()
  {
    if (pointfeatures == null)
    {
      pointfeatures = new EObjectContainmentEList<PointFeature>(PointFeature.class, this, XdiagramPackage.FIGURE_FEATURES__POINTFEATURES);
    }
    return pointfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SizeFeature> getSizefeatures()
  {
    if (sizefeatures == null)
    {
      sizefeatures = new EObjectContainmentEList<SizeFeature>(SizeFeature.class, this, XdiagramPackage.FIGURE_FEATURES__SIZEFEATURES);
    }
    return sizefeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PositionFeature> getPositionfeatures()
  {
    if (positionfeatures == null)
    {
      positionfeatures = new EObjectContainmentEList<PositionFeature>(PositionFeature.class, this, XdiagramPackage.FIGURE_FEATURES__POSITIONFEATURES);
    }
    return positionfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColorFeature> getColorfeatures()
  {
    if (colorfeatures == null)
    {
      colorfeatures = new EObjectContainmentEList<ColorFeature>(ColorFeature.class, this, XdiagramPackage.FIGURE_FEATURES__COLORFEATURES);
    }
    return colorfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerFeature> getIntegerfeatures()
  {
    if (integerfeatures == null)
    {
      integerfeatures = new EObjectContainmentEList<IntegerFeature>(IntegerFeature.class, this, XdiagramPackage.FIGURE_FEATURES__INTEGERFEATURES);
    }
    return integerfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BooleanFeature> getBooleanfeatures()
  {
    if (booleanfeatures == null)
    {
      booleanfeatures = new EObjectContainmentEList<BooleanFeature>(BooleanFeature.class, this, XdiagramPackage.FIGURE_FEATURES__BOOLEANFEATURES);
    }
    return booleanfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StringFeature> getStringfeatures()
  {
    if (stringfeatures == null)
    {
      stringfeatures = new EObjectContainmentEList<StringFeature>(StringFeature.class, this, XdiagramPackage.FIGURE_FEATURES__STRINGFEATURES);
    }
    return stringfeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomFeature> getCustomfeatures()
  {
    if (customfeatures == null)
    {
      customfeatures = new EObjectContainmentEList<CustomFeature>(CustomFeature.class, this, XdiagramPackage.FIGURE_FEATURES__CUSTOMFEATURES);
    }
    return customfeatures;
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
      case XdiagramPackage.FIGURE_FEATURES__LINEFEATURES:
        return ((InternalEList<?>)getLinefeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__CENTERFEATURES:
        return ((InternalEList<?>)getCenterfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__ALIGNFEATURES:
        return ((InternalEList<?>)getAlignfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__GRADIENTFEATURES:
        return ((InternalEList<?>)getGradientfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__POINTFEATURES:
        return ((InternalEList<?>)getPointfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__SIZEFEATURES:
        return ((InternalEList<?>)getSizefeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__POSITIONFEATURES:
        return ((InternalEList<?>)getPositionfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__COLORFEATURES:
        return ((InternalEList<?>)getColorfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__INTEGERFEATURES:
        return ((InternalEList<?>)getIntegerfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__BOOLEANFEATURES:
        return ((InternalEList<?>)getBooleanfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__STRINGFEATURES:
        return ((InternalEList<?>)getStringfeatures()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.FIGURE_FEATURES__CUSTOMFEATURES:
        return ((InternalEList<?>)getCustomfeatures()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.FIGURE_FEATURES__LINEFEATURES:
        return getLinefeatures();
      case XdiagramPackage.FIGURE_FEATURES__CENTERFEATURES:
        return getCenterfeatures();
      case XdiagramPackage.FIGURE_FEATURES__ALIGNFEATURES:
        return getAlignfeatures();
      case XdiagramPackage.FIGURE_FEATURES__GRADIENTFEATURES:
        return getGradientfeatures();
      case XdiagramPackage.FIGURE_FEATURES__POINTFEATURES:
        return getPointfeatures();
      case XdiagramPackage.FIGURE_FEATURES__SIZEFEATURES:
        return getSizefeatures();
      case XdiagramPackage.FIGURE_FEATURES__POSITIONFEATURES:
        return getPositionfeatures();
      case XdiagramPackage.FIGURE_FEATURES__COLORFEATURES:
        return getColorfeatures();
      case XdiagramPackage.FIGURE_FEATURES__INTEGERFEATURES:
        return getIntegerfeatures();
      case XdiagramPackage.FIGURE_FEATURES__BOOLEANFEATURES:
        return getBooleanfeatures();
      case XdiagramPackage.FIGURE_FEATURES__STRINGFEATURES:
        return getStringfeatures();
      case XdiagramPackage.FIGURE_FEATURES__CUSTOMFEATURES:
        return getCustomfeatures();
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
      case XdiagramPackage.FIGURE_FEATURES__LINEFEATURES:
        getLinefeatures().clear();
        getLinefeatures().addAll((Collection<? extends LineFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__CENTERFEATURES:
        getCenterfeatures().clear();
        getCenterfeatures().addAll((Collection<? extends CenterFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__ALIGNFEATURES:
        getAlignfeatures().clear();
        getAlignfeatures().addAll((Collection<? extends AlignFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__GRADIENTFEATURES:
        getGradientfeatures().clear();
        getGradientfeatures().addAll((Collection<? extends GradientFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__POINTFEATURES:
        getPointfeatures().clear();
        getPointfeatures().addAll((Collection<? extends PointFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__SIZEFEATURES:
        getSizefeatures().clear();
        getSizefeatures().addAll((Collection<? extends SizeFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__POSITIONFEATURES:
        getPositionfeatures().clear();
        getPositionfeatures().addAll((Collection<? extends PositionFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__COLORFEATURES:
        getColorfeatures().clear();
        getColorfeatures().addAll((Collection<? extends ColorFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__INTEGERFEATURES:
        getIntegerfeatures().clear();
        getIntegerfeatures().addAll((Collection<? extends IntegerFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__BOOLEANFEATURES:
        getBooleanfeatures().clear();
        getBooleanfeatures().addAll((Collection<? extends BooleanFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__STRINGFEATURES:
        getStringfeatures().clear();
        getStringfeatures().addAll((Collection<? extends StringFeature>)newValue);
        return;
      case XdiagramPackage.FIGURE_FEATURES__CUSTOMFEATURES:
        getCustomfeatures().clear();
        getCustomfeatures().addAll((Collection<? extends CustomFeature>)newValue);
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
      case XdiagramPackage.FIGURE_FEATURES__LINEFEATURES:
        getLinefeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__CENTERFEATURES:
        getCenterfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__ALIGNFEATURES:
        getAlignfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__GRADIENTFEATURES:
        getGradientfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__POINTFEATURES:
        getPointfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__SIZEFEATURES:
        getSizefeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__POSITIONFEATURES:
        getPositionfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__COLORFEATURES:
        getColorfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__INTEGERFEATURES:
        getIntegerfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__BOOLEANFEATURES:
        getBooleanfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__STRINGFEATURES:
        getStringfeatures().clear();
        return;
      case XdiagramPackage.FIGURE_FEATURES__CUSTOMFEATURES:
        getCustomfeatures().clear();
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
      case XdiagramPackage.FIGURE_FEATURES__LINEFEATURES:
        return linefeatures != null && !linefeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__CENTERFEATURES:
        return centerfeatures != null && !centerfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__ALIGNFEATURES:
        return alignfeatures != null && !alignfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__GRADIENTFEATURES:
        return gradientfeatures != null && !gradientfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__POINTFEATURES:
        return pointfeatures != null && !pointfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__SIZEFEATURES:
        return sizefeatures != null && !sizefeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__POSITIONFEATURES:
        return positionfeatures != null && !positionfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__COLORFEATURES:
        return colorfeatures != null && !colorfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__INTEGERFEATURES:
        return integerfeatures != null && !integerfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__BOOLEANFEATURES:
        return booleanfeatures != null && !booleanfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__STRINGFEATURES:
        return stringfeatures != null && !stringfeatures.isEmpty();
      case XdiagramPackage.FIGURE_FEATURES__CUSTOMFEATURES:
        return customfeatures != null && !customfeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FigureFeaturesImpl
