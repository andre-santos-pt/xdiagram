/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.FontProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.FontPropertiesImpl#getFace <em>Face</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.FontPropertiesImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.FontPropertiesImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.FontPropertiesImpl#isItalics <em>Italics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FontPropertiesImpl extends FeatureImpl implements FontProperties
{
  /**
   * The default value of the '{@link #getFace() <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
  protected static final String FACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFace() <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
  protected String face = FACE_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBold()
   * @generated
   * @ordered
   */
  protected static final boolean BOLD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBold()
   * @generated
   * @ordered
   */
  protected boolean bold = BOLD_EDEFAULT;

  /**
   * The default value of the '{@link #isItalics() <em>Italics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItalics()
   * @generated
   * @ordered
   */
  protected static final boolean ITALICS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isItalics() <em>Italics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItalics()
   * @generated
   * @ordered
   */
  protected boolean italics = ITALICS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontPropertiesImpl()
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
    return DslPackage.Literals.FONT_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFace()
  {
    return face;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFace(String newFace)
  {
    String oldFace = face;
    face = newFace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FONT_PROPERTIES__FACE, oldFace, face));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FONT_PROPERTIES__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBold()
  {
    return bold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBold(boolean newBold)
  {
    boolean oldBold = bold;
    bold = newBold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FONT_PROPERTIES__BOLD, oldBold, bold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isItalics()
  {
    return italics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItalics(boolean newItalics)
  {
    boolean oldItalics = italics;
    italics = newItalics;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FONT_PROPERTIES__ITALICS, oldItalics, italics));
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
      case DslPackage.FONT_PROPERTIES__FACE:
        return getFace();
      case DslPackage.FONT_PROPERTIES__SIZE:
        return getSize();
      case DslPackage.FONT_PROPERTIES__BOLD:
        return isBold();
      case DslPackage.FONT_PROPERTIES__ITALICS:
        return isItalics();
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
      case DslPackage.FONT_PROPERTIES__FACE:
        setFace((String)newValue);
        return;
      case DslPackage.FONT_PROPERTIES__SIZE:
        setSize((Integer)newValue);
        return;
      case DslPackage.FONT_PROPERTIES__BOLD:
        setBold((Boolean)newValue);
        return;
      case DslPackage.FONT_PROPERTIES__ITALICS:
        setItalics((Boolean)newValue);
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
      case DslPackage.FONT_PROPERTIES__FACE:
        setFace(FACE_EDEFAULT);
        return;
      case DslPackage.FONT_PROPERTIES__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case DslPackage.FONT_PROPERTIES__BOLD:
        setBold(BOLD_EDEFAULT);
        return;
      case DslPackage.FONT_PROPERTIES__ITALICS:
        setItalics(ITALICS_EDEFAULT);
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
      case DslPackage.FONT_PROPERTIES__FACE:
        return FACE_EDEFAULT == null ? face != null : !FACE_EDEFAULT.equals(face);
      case DslPackage.FONT_PROPERTIES__SIZE:
        return size != SIZE_EDEFAULT;
      case DslPackage.FONT_PROPERTIES__BOLD:
        return bold != BOLD_EDEFAULT;
      case DslPackage.FONT_PROPERTIES__ITALICS:
        return italics != ITALICS_EDEFAULT;
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
    result.append(" (face: ");
    result.append(face);
    result.append(", size: ");
    result.append(size);
    result.append(", bold: ");
    result.append(bold);
    result.append(", italics: ");
    result.append(italics);
    result.append(')');
    return result.toString();
  }

} //FontPropertiesImpl
