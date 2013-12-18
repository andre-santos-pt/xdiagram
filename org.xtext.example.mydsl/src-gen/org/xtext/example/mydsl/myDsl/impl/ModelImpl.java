/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.ConnectableElement;
import org.xtext.example.mydsl.myDsl.CustomColor;
import org.xtext.example.mydsl.myDsl.ImageFile;
import org.xtext.example.mydsl.myDsl.LinkElement;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getColors <em>Colors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getImages <em>Images</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getColors() <em>Colors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColors()
   * @generated
   * @ordered
   */
  protected EList<CustomColor> colors;

  /**
   * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImages()
   * @generated
   * @ordered
   */
  protected EList<ImageFile> images;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<ConnectableElement> elements;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<LinkElement> links;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MyDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomColor> getColors()
  {
    if (colors == null)
    {
      colors = new EObjectContainmentEList<CustomColor>(CustomColor.class, this, MyDslPackage.MODEL__COLORS);
    }
    return colors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImageFile> getImages()
  {
    if (images == null)
    {
      images = new EObjectContainmentEList<ImageFile>(ImageFile.class, this, MyDslPackage.MODEL__IMAGES);
    }
    return images;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConnectableElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<ConnectableElement>(ConnectableElement.class, this, MyDslPackage.MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LinkElement> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<LinkElement>(LinkElement.class, this, MyDslPackage.MODEL__LINKS);
    }
    return links;
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
      case MyDslPackage.MODEL__COLORS:
        return ((InternalEList<?>)getColors()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__IMAGES:
        return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.MODEL__COLORS:
        return getColors();
      case MyDslPackage.MODEL__IMAGES:
        return getImages();
      case MyDslPackage.MODEL__ELEMENTS:
        return getElements();
      case MyDslPackage.MODEL__LINKS:
        return getLinks();
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
      case MyDslPackage.MODEL__COLORS:
        getColors().clear();
        getColors().addAll((Collection<? extends CustomColor>)newValue);
        return;
      case MyDslPackage.MODEL__IMAGES:
        getImages().clear();
        getImages().addAll((Collection<? extends ImageFile>)newValue);
        return;
      case MyDslPackage.MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends ConnectableElement>)newValue);
        return;
      case MyDslPackage.MODEL__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends LinkElement>)newValue);
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
      case MyDslPackage.MODEL__COLORS:
        getColors().clear();
        return;
      case MyDslPackage.MODEL__IMAGES:
        getImages().clear();
        return;
      case MyDslPackage.MODEL__ELEMENTS:
        getElements().clear();
        return;
      case MyDslPackage.MODEL__LINKS:
        getLinks().clear();
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
      case MyDslPackage.MODEL__COLORS:
        return colors != null && !colors.isEmpty();
      case MyDslPackage.MODEL__IMAGES:
        return images != null && !images.isEmpty();
      case MyDslPackage.MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case MyDslPackage.MODEL__LINKS:
        return links != null && !links.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
