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

import org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor;
import org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile;
import org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.Style;
import org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getColors <em>Colors</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl#getImages <em>Images</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XDiagramImpl extends MinimalEObjectImpl.Container implements XDiagram
{
  /**
   * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected String importURI = IMPORT_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportStatement> imports;

  /**
   * The cached value of the '{@link #getModelClass() <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelClass()
   * @generated
   * @ordered
   */
  protected EClass modelClass;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> nodes;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<Link> links;

  /**
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected EList<Style> styles;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XDiagramImpl()
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
    return XdiagramPackage.Literals.XDIAGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportURI()
  {
    return importURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportURI(String newImportURI)
  {
    String oldImportURI = importURI;
    importURI = newImportURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.XDIAGRAM__IMPORT_URI, oldImportURI, importURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportStatement> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportStatement>(ImportStatement.class, this, XdiagramPackage.XDIAGRAM__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelClass()
  {
    if (modelClass != null && modelClass.eIsProxy())
    {
      InternalEObject oldModelClass = (InternalEObject)modelClass;
      modelClass = (EClass)eResolveProxy(oldModelClass);
      if (modelClass != oldModelClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XdiagramPackage.XDIAGRAM__MODEL_CLASS, oldModelClass, modelClass));
      }
    }
    return modelClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetModelClass()
  {
    return modelClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelClass(EClass newModelClass)
  {
    EClass oldModelClass = modelClass;
    modelClass = newModelClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdiagramPackage.XDIAGRAM__MODEL_CLASS, oldModelClass, modelClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Node>(Node.class, this, XdiagramPackage.XDIAGRAM__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Link> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<Link>(Link.class, this, XdiagramPackage.XDIAGRAM__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Style> getStyles()
  {
    if (styles == null)
    {
      styles = new EObjectContainmentEList<Style>(Style.class, this, XdiagramPackage.XDIAGRAM__STYLES);
    }
    return styles;
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
      colors = new EObjectContainmentEList<CustomColor>(CustomColor.class, this, XdiagramPackage.XDIAGRAM__COLORS);
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
      images = new EObjectContainmentEList<ImageFile>(ImageFile.class, this, XdiagramPackage.XDIAGRAM__IMAGES);
    }
    return images;
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
      case XdiagramPackage.XDIAGRAM__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.XDIAGRAM__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.XDIAGRAM__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.XDIAGRAM__STYLES:
        return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.XDIAGRAM__COLORS:
        return ((InternalEList<?>)getColors()).basicRemove(otherEnd, msgs);
      case XdiagramPackage.XDIAGRAM__IMAGES:
        return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
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
      case XdiagramPackage.XDIAGRAM__IMPORT_URI:
        return getImportURI();
      case XdiagramPackage.XDIAGRAM__IMPORTS:
        return getImports();
      case XdiagramPackage.XDIAGRAM__MODEL_CLASS:
        if (resolve) return getModelClass();
        return basicGetModelClass();
      case XdiagramPackage.XDIAGRAM__NODES:
        return getNodes();
      case XdiagramPackage.XDIAGRAM__LINKS:
        return getLinks();
      case XdiagramPackage.XDIAGRAM__STYLES:
        return getStyles();
      case XdiagramPackage.XDIAGRAM__COLORS:
        return getColors();
      case XdiagramPackage.XDIAGRAM__IMAGES:
        return getImages();
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
      case XdiagramPackage.XDIAGRAM__IMPORT_URI:
        setImportURI((String)newValue);
        return;
      case XdiagramPackage.XDIAGRAM__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportStatement>)newValue);
        return;
      case XdiagramPackage.XDIAGRAM__MODEL_CLASS:
        setModelClass((EClass)newValue);
        return;
      case XdiagramPackage.XDIAGRAM__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Node>)newValue);
        return;
      case XdiagramPackage.XDIAGRAM__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends Link>)newValue);
        return;
      case XdiagramPackage.XDIAGRAM__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends Style>)newValue);
        return;
      case XdiagramPackage.XDIAGRAM__COLORS:
        getColors().clear();
        getColors().addAll((Collection<? extends CustomColor>)newValue);
        return;
      case XdiagramPackage.XDIAGRAM__IMAGES:
        getImages().clear();
        getImages().addAll((Collection<? extends ImageFile>)newValue);
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
      case XdiagramPackage.XDIAGRAM__IMPORT_URI:
        setImportURI(IMPORT_URI_EDEFAULT);
        return;
      case XdiagramPackage.XDIAGRAM__IMPORTS:
        getImports().clear();
        return;
      case XdiagramPackage.XDIAGRAM__MODEL_CLASS:
        setModelClass((EClass)null);
        return;
      case XdiagramPackage.XDIAGRAM__NODES:
        getNodes().clear();
        return;
      case XdiagramPackage.XDIAGRAM__LINKS:
        getLinks().clear();
        return;
      case XdiagramPackage.XDIAGRAM__STYLES:
        getStyles().clear();
        return;
      case XdiagramPackage.XDIAGRAM__COLORS:
        getColors().clear();
        return;
      case XdiagramPackage.XDIAGRAM__IMAGES:
        getImages().clear();
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
      case XdiagramPackage.XDIAGRAM__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
      case XdiagramPackage.XDIAGRAM__IMPORTS:
        return imports != null && !imports.isEmpty();
      case XdiagramPackage.XDIAGRAM__MODEL_CLASS:
        return modelClass != null;
      case XdiagramPackage.XDIAGRAM__NODES:
        return nodes != null && !nodes.isEmpty();
      case XdiagramPackage.XDIAGRAM__LINKS:
        return links != null && !links.isEmpty();
      case XdiagramPackage.XDIAGRAM__STYLES:
        return styles != null && !styles.isEmpty();
      case XdiagramPackage.XDIAGRAM__COLORS:
        return colors != null && !colors.isEmpty();
      case XdiagramPackage.XDIAGRAM__IMAGES:
        return images != null && !images.isEmpty();
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
    result.append(" (importURI: ");
    result.append(importURI);
    result.append(')');
    return result.toString();
  }

} //XDiagramImpl
