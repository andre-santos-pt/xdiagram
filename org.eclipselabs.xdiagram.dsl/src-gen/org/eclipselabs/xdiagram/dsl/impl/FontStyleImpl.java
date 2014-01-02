/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.FontStyle;
import org.eclipselabs.xdiagram.dsl.FontStyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.FontStyleImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontStyleImpl extends FeatureImpl implements FontStyle
{
  /**
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected EList<FontStyleType> styles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontStyleImpl()
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
    return DslPackage.Literals.FONT_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FontStyleType> getStyles()
  {
    if (styles == null)
    {
      styles = new EDataTypeEList<FontStyleType>(FontStyleType.class, this, DslPackage.FONT_STYLE__STYLES);
    }
    return styles;
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
      case DslPackage.FONT_STYLE__STYLES:
        return getStyles();
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
      case DslPackage.FONT_STYLE__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends FontStyleType>)newValue);
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
      case DslPackage.FONT_STYLE__STYLES:
        getStyles().clear();
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
      case DslPackage.FONT_STYLE__STYLES:
        return styles != null && !styles.isEmpty();
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
    result.append(" (styles: ");
    result.append(styles);
    result.append(')');
    return result.toString();
  }

} //FontStyleImpl
