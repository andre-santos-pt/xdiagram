/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Image;
import org.eclipselabs.xdiagram.dsl.ImageFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.ImageImpl#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl extends ConnectableElementImpl implements Image
{
  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected ImageFile image;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageImpl()
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
    return DslPackage.Literals.IMAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageFile getImage()
  {
    if (image != null && image.eIsProxy())
    {
      InternalEObject oldImage = (InternalEObject)image;
      image = (ImageFile)eResolveProxy(oldImage);
      if (image != oldImage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.IMAGE__IMAGE, oldImage, image));
      }
    }
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageFile basicGetImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(ImageFile newImage)
  {
    ImageFile oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.IMAGE__IMAGE, oldImage, image));
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
      case DslPackage.IMAGE__IMAGE:
        if (resolve) return getImage();
        return basicGetImage();
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
      case DslPackage.IMAGE__IMAGE:
        setImage((ImageFile)newValue);
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
      case DslPackage.IMAGE__IMAGE:
        setImage((ImageFile)null);
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
      case DslPackage.IMAGE__IMAGE:
        return image != null;
    }
    return super.eIsSet(featureID);
  }

} //ImageImpl
