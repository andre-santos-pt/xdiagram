/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model.impl;

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

import pt.iscte.xdiagram.dsl.model.Colors;
import pt.iscte.xdiagram.dsl.model.CustomFigure;
import pt.iscte.xdiagram.dsl.model.Diagram;
import pt.iscte.xdiagram.dsl.model.DiagramElement;
import pt.iscte.xdiagram.dsl.model.MetaModel;
import pt.iscte.xdiagram.dsl.model.ModelPackage;
import pt.iscte.xdiagram.dsl.model.XDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.XDiagramImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.XDiagramImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.XDiagramImpl#getCustomColors <em>Custom Colors</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.XDiagramImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.XDiagramImpl#getFigures <em>Figures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XDiagramImpl extends MinimalEObjectImpl.Container implements XDiagram
{
  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected MetaModel metamodel;

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
   * The cached value of the '{@link #getCustomColors() <em>Custom Colors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomColors()
   * @generated
   * @ordered
   */
  protected Colors customColors;

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
    return ModelPackage.Literals.XDIAGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaModel getMetamodel()
  {
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetamodel(MetaModel newMetamodel, NotificationChain msgs)
  {
    MetaModel oldMetamodel = metamodel;
    metamodel = newMetamodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.XDIAGRAM__METAMODEL, oldMetamodel, newMetamodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetamodel(MetaModel newMetamodel)
  {
    if (newMetamodel != metamodel)
    {
      NotificationChain msgs = null;
      if (metamodel != null)
        msgs = ((InternalEObject)metamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.XDIAGRAM__METAMODEL, null, msgs);
      if (newMetamodel != null)
        msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.XDIAGRAM__METAMODEL, null, msgs);
      msgs = basicSetMetamodel(newMetamodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDIAGRAM__METAMODEL, newMetamodel, newMetamodel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.XDIAGRAM__DIAGRAM, oldDiagram, newDiagram);
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
        msgs = ((InternalEObject)diagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.XDIAGRAM__DIAGRAM, null, msgs);
      if (newDiagram != null)
        msgs = ((InternalEObject)newDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.XDIAGRAM__DIAGRAM, null, msgs);
      msgs = basicSetDiagram(newDiagram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDIAGRAM__DIAGRAM, newDiagram, newDiagram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Colors getCustomColors()
  {
    return customColors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCustomColors(Colors newCustomColors, NotificationChain msgs)
  {
    Colors oldCustomColors = customColors;
    customColors = newCustomColors;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.XDIAGRAM__CUSTOM_COLORS, oldCustomColors, newCustomColors);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomColors(Colors newCustomColors)
  {
    if (newCustomColors != customColors)
    {
      NotificationChain msgs = null;
      if (customColors != null)
        msgs = ((InternalEObject)customColors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.XDIAGRAM__CUSTOM_COLORS, null, msgs);
      if (newCustomColors != null)
        msgs = ((InternalEObject)newCustomColors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.XDIAGRAM__CUSTOM_COLORS, null, msgs);
      msgs = basicSetCustomColors(newCustomColors, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDIAGRAM__CUSTOM_COLORS, newCustomColors, newCustomColors));
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
      elements = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, ModelPackage.XDIAGRAM__ELEMENTS);
    }
    return elements;
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
      figures = new EObjectContainmentEList<CustomFigure>(CustomFigure.class, this, ModelPackage.XDIAGRAM__FIGURES);
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
      case ModelPackage.XDIAGRAM__METAMODEL:
        return basicSetMetamodel(null, msgs);
      case ModelPackage.XDIAGRAM__DIAGRAM:
        return basicSetDiagram(null, msgs);
      case ModelPackage.XDIAGRAM__CUSTOM_COLORS:
        return basicSetCustomColors(null, msgs);
      case ModelPackage.XDIAGRAM__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case ModelPackage.XDIAGRAM__FIGURES:
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
      case ModelPackage.XDIAGRAM__METAMODEL:
        return getMetamodel();
      case ModelPackage.XDIAGRAM__DIAGRAM:
        return getDiagram();
      case ModelPackage.XDIAGRAM__CUSTOM_COLORS:
        return getCustomColors();
      case ModelPackage.XDIAGRAM__ELEMENTS:
        return getElements();
      case ModelPackage.XDIAGRAM__FIGURES:
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
      case ModelPackage.XDIAGRAM__METAMODEL:
        setMetamodel((MetaModel)newValue);
        return;
      case ModelPackage.XDIAGRAM__DIAGRAM:
        setDiagram((Diagram)newValue);
        return;
      case ModelPackage.XDIAGRAM__CUSTOM_COLORS:
        setCustomColors((Colors)newValue);
        return;
      case ModelPackage.XDIAGRAM__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends DiagramElement>)newValue);
        return;
      case ModelPackage.XDIAGRAM__FIGURES:
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
      case ModelPackage.XDIAGRAM__METAMODEL:
        setMetamodel((MetaModel)null);
        return;
      case ModelPackage.XDIAGRAM__DIAGRAM:
        setDiagram((Diagram)null);
        return;
      case ModelPackage.XDIAGRAM__CUSTOM_COLORS:
        setCustomColors((Colors)null);
        return;
      case ModelPackage.XDIAGRAM__ELEMENTS:
        getElements().clear();
        return;
      case ModelPackage.XDIAGRAM__FIGURES:
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
      case ModelPackage.XDIAGRAM__METAMODEL:
        return metamodel != null;
      case ModelPackage.XDIAGRAM__DIAGRAM:
        return diagram != null;
      case ModelPackage.XDIAGRAM__CUSTOM_COLORS:
        return customColors != null;
      case ModelPackage.XDIAGRAM__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case ModelPackage.XDIAGRAM__FIGURES:
        return figures != null && !figures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XDiagramImpl
