/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Size;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.SizeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.SizeImpl#isWidthRelative <em>Width Relative</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.SizeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.SizeImpl#isHeightRelative <em>Height Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeImpl extends FeatureImpl implements Size
{
  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #isWidthRelative() <em>Width Relative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWidthRelative()
   * @generated
   * @ordered
   */
  protected static final boolean WIDTH_RELATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWidthRelative() <em>Width Relative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWidthRelative()
   * @generated
   * @ordered
   */
  protected boolean widthRelative = WIDTH_RELATIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #isHeightRelative() <em>Height Relative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeightRelative()
   * @generated
   * @ordered
   */
  protected static final boolean HEIGHT_RELATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeightRelative() <em>Height Relative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeightRelative()
   * @generated
   * @ordered
   */
  protected boolean heightRelative = HEIGHT_RELATIVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SizeImpl()
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
    return DslPackage.Literals.SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SIZE__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWidthRelative()
  {
    return widthRelative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidthRelative(boolean newWidthRelative)
  {
    boolean oldWidthRelative = widthRelative;
    widthRelative = newWidthRelative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SIZE__WIDTH_RELATIVE, oldWidthRelative, widthRelative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SIZE__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeightRelative()
  {
    return heightRelative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeightRelative(boolean newHeightRelative)
  {
    boolean oldHeightRelative = heightRelative;
    heightRelative = newHeightRelative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SIZE__HEIGHT_RELATIVE, oldHeightRelative, heightRelative));
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
      case DslPackage.SIZE__WIDTH:
        return getWidth();
      case DslPackage.SIZE__WIDTH_RELATIVE:
        return isWidthRelative();
      case DslPackage.SIZE__HEIGHT:
        return getHeight();
      case DslPackage.SIZE__HEIGHT_RELATIVE:
        return isHeightRelative();
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
      case DslPackage.SIZE__WIDTH:
        setWidth((Integer)newValue);
        return;
      case DslPackage.SIZE__WIDTH_RELATIVE:
        setWidthRelative((Boolean)newValue);
        return;
      case DslPackage.SIZE__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case DslPackage.SIZE__HEIGHT_RELATIVE:
        setHeightRelative((Boolean)newValue);
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
      case DslPackage.SIZE__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case DslPackage.SIZE__WIDTH_RELATIVE:
        setWidthRelative(WIDTH_RELATIVE_EDEFAULT);
        return;
      case DslPackage.SIZE__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case DslPackage.SIZE__HEIGHT_RELATIVE:
        setHeightRelative(HEIGHT_RELATIVE_EDEFAULT);
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
      case DslPackage.SIZE__WIDTH:
        return width != WIDTH_EDEFAULT;
      case DslPackage.SIZE__WIDTH_RELATIVE:
        return widthRelative != WIDTH_RELATIVE_EDEFAULT;
      case DslPackage.SIZE__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case DslPackage.SIZE__HEIGHT_RELATIVE:
        return heightRelative != HEIGHT_RELATIVE_EDEFAULT;
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
    result.append(" (width: ");
    result.append(width);
    result.append(", widthRelative: ");
    result.append(widthRelative);
    result.append(", height: ");
    result.append(height);
    result.append(", heightRelative: ");
    result.append(heightRelative);
    result.append(')');
    return result.toString();
  }

} //SizeImpl
