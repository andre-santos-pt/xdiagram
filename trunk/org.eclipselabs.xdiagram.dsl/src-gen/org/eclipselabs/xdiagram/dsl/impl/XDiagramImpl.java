/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

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

import org.eclipselabs.xdiagram.dsl.CustomColor;
import org.eclipselabs.xdiagram.dsl.CustomFigure;
import org.eclipselabs.xdiagram.dsl.Diagram;
import org.eclipselabs.xdiagram.dsl.DiagramElement;
import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.ImportStatement;
import org.eclipselabs.xdiagram.dsl.Style;
import org.eclipselabs.xdiagram.dsl.ToolGroup;
import org.eclipselabs.xdiagram.dsl.XDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getColors <em>Colors</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl#getFigures <em>Figures</em>}</li>
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
   * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiagram()
   * @generated
   * @ordered
   */
  protected Diagram diagram;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<ToolGroup> groups;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<DiagramElement> elements;

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
   * The cached value of the '{@link #getFigures() <em>Figures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigures()
   * @generated
   * @ordered
   */
  protected EList<CustomFigure> figures;

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
    return DslPackage.Literals.XDIAGRAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.XDIAGRAM__IMPORT_URI, oldImportURI, importURI));
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
      imports = new EObjectContainmentEList<ImportStatement>(ImportStatement.class, this, DslPackage.XDIAGRAM__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram getDiagram()
  {
    return diagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs)
  {
    Diagram oldDiagram = diagram;
    diagram = newDiagram;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.XDIAGRAM__DIAGRAM, oldDiagram, newDiagram);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiagram(Diagram newDiagram)
  {
    if (newDiagram != diagram)
    {
      NotificationChain msgs = null;
      if (diagram != null)
        msgs = ((InternalEObject)diagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.XDIAGRAM__DIAGRAM, null, msgs);
      if (newDiagram != null)
        msgs = ((InternalEObject)newDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.XDIAGRAM__DIAGRAM, null, msgs);
      msgs = basicSetDiagram(newDiagram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.XDIAGRAM__DIAGRAM, newDiagram, newDiagram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ToolGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<ToolGroup>(ToolGroup.class, this, DslPackage.XDIAGRAM__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiagramElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, DslPackage.XDIAGRAM__ELEMENTS);
    }
    return elements;
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
      styles = new EObjectContainmentEList<Style>(Style.class, this, DslPackage.XDIAGRAM__STYLES);
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
      colors = new EObjectContainmentEList<CustomColor>(CustomColor.class, this, DslPackage.XDIAGRAM__COLORS);
    }
    return colors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomFigure> getFigures()
  {
    if (figures == null)
    {
      figures = new EObjectContainmentEList<CustomFigure>(CustomFigure.class, this, DslPackage.XDIAGRAM__FIGURES);
    }
    return figures;
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
      case DslPackage.XDIAGRAM__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case DslPackage.XDIAGRAM__DIAGRAM:
        return basicSetDiagram(null, msgs);
      case DslPackage.XDIAGRAM__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
      case DslPackage.XDIAGRAM__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case DslPackage.XDIAGRAM__STYLES:
        return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
      case DslPackage.XDIAGRAM__COLORS:
        return ((InternalEList<?>)getColors()).basicRemove(otherEnd, msgs);
      case DslPackage.XDIAGRAM__FIGURES:
        return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
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
      case DslPackage.XDIAGRAM__IMPORT_URI:
        return getImportURI();
      case DslPackage.XDIAGRAM__IMPORTS:
        return getImports();
      case DslPackage.XDIAGRAM__DIAGRAM:
        return getDiagram();
      case DslPackage.XDIAGRAM__GROUPS:
        return getGroups();
      case DslPackage.XDIAGRAM__ELEMENTS:
        return getElements();
      case DslPackage.XDIAGRAM__STYLES:
        return getStyles();
      case DslPackage.XDIAGRAM__COLORS:
        return getColors();
      case DslPackage.XDIAGRAM__FIGURES:
        return getFigures();
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
      case DslPackage.XDIAGRAM__IMPORT_URI:
        setImportURI((String)newValue);
        return;
      case DslPackage.XDIAGRAM__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportStatement>)newValue);
        return;
      case DslPackage.XDIAGRAM__DIAGRAM:
        setDiagram((Diagram)newValue);
        return;
      case DslPackage.XDIAGRAM__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends ToolGroup>)newValue);
        return;
      case DslPackage.XDIAGRAM__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends DiagramElement>)newValue);
        return;
      case DslPackage.XDIAGRAM__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends Style>)newValue);
        return;
      case DslPackage.XDIAGRAM__COLORS:
        getColors().clear();
        getColors().addAll((Collection<? extends CustomColor>)newValue);
        return;
      case DslPackage.XDIAGRAM__FIGURES:
        getFigures().clear();
        getFigures().addAll((Collection<? extends CustomFigure>)newValue);
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
      case DslPackage.XDIAGRAM__IMPORT_URI:
        setImportURI(IMPORT_URI_EDEFAULT);
        return;
      case DslPackage.XDIAGRAM__IMPORTS:
        getImports().clear();
        return;
      case DslPackage.XDIAGRAM__DIAGRAM:
        setDiagram((Diagram)null);
        return;
      case DslPackage.XDIAGRAM__GROUPS:
        getGroups().clear();
        return;
      case DslPackage.XDIAGRAM__ELEMENTS:
        getElements().clear();
        return;
      case DslPackage.XDIAGRAM__STYLES:
        getStyles().clear();
        return;
      case DslPackage.XDIAGRAM__COLORS:
        getColors().clear();
        return;
      case DslPackage.XDIAGRAM__FIGURES:
        getFigures().clear();
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
      case DslPackage.XDIAGRAM__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
      case DslPackage.XDIAGRAM__IMPORTS:
        return imports != null && !imports.isEmpty();
      case DslPackage.XDIAGRAM__DIAGRAM:
        return diagram != null;
      case DslPackage.XDIAGRAM__GROUPS:
        return groups != null && !groups.isEmpty();
      case DslPackage.XDIAGRAM__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case DslPackage.XDIAGRAM__STYLES:
        return styles != null && !styles.isEmpty();
      case DslPackage.XDIAGRAM__COLORS:
        return colors != null && !colors.isEmpty();
      case DslPackage.XDIAGRAM__FIGURES:
        return figures != null && !figures.isEmpty();
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
