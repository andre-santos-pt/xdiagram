/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.xdiagram.xtext.xdiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage
 * @generated
 */
public class XdiagramSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XdiagramPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XdiagramSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XdiagramPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case XdiagramPackage.XDIAGRAM:
      {
        XDiagram xDiagram = (XDiagram)theEObject;
        T result = caseXDiagram(xDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.IMPORT_STATEMENT:
      {
        ImportStatement importStatement = (ImportStatement)theEObject;
        T result = caseImportStatement(importStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.STYLE:
      {
        Style style = (Style)theEObject;
        T result = caseStyle(style);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.NODE_FIGURE:
      {
        NodeFigure nodeFigure = (NodeFigure)theEObject;
        T result = caseNodeFigure(nodeFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.NODE_CONTAINER:
      {
        NodeContainer nodeContainer = (NodeContainer)theEObject;
        T result = caseNodeContainer(nodeContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.PLACING_FIGURE:
      {
        PlacingFigure placingFigure = (PlacingFigure)theEObject;
        T result = casePlacingFigure(placingFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.DYNAMIC_FIGURE:
      {
        DynamicFigure dynamicFigure = (DynamicFigure)theEObject;
        T result = caseDynamicFigure(dynamicFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.STATIC_FIGURE:
      {
        StaticFigure staticFigure = (StaticFigure)theEObject;
        T result = caseStaticFigure(staticFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.NODE_ANCHOR:
      {
        NodeAnchor nodeAnchor = (NodeAnchor)theEObject;
        T result = caseNodeAnchor(nodeAnchor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.ARROW_ANCHOR:
      {
        ArrowAnchor arrowAnchor = (ArrowAnchor)theEObject;
        T result = caseArrowAnchor(arrowAnchor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.FIGURE_FEATURES:
      {
        FigureFeatures figureFeatures = (FigureFeatures)theEObject;
        T result = caseFigureFeatures(figureFeatures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.CUSTOM_FEATURE:
      {
        CustomFeature customFeature = (CustomFeature)theEObject;
        T result = caseCustomFeature(customFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.STYLE_FEATURE:
      {
        StyleFeature styleFeature = (StyleFeature)theEObject;
        T result = caseStyleFeature(styleFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.LAYOUT_FEATURE:
      {
        LayoutFeature layoutFeature = (LayoutFeature)theEObject;
        T result = caseLayoutFeature(layoutFeature);
        if (result == null) result = caseStyleFeature(layoutFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.CENTER_FEATURE:
      {
        CenterFeature centerFeature = (CenterFeature)theEObject;
        T result = caseCenterFeature(centerFeature);
        if (result == null) result = caseStyleFeature(centerFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.ALIGN_FEATURE:
      {
        AlignFeature alignFeature = (AlignFeature)theEObject;
        T result = caseAlignFeature(alignFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.GRADIENT_FEATURE:
      {
        GradientFeature gradientFeature = (GradientFeature)theEObject;
        T result = caseGradientFeature(gradientFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.POINT_FEATURE:
      {
        PointFeature pointFeature = (PointFeature)theEObject;
        T result = casePointFeature(pointFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.SIZE_FEATURE:
      {
        SizeFeature sizeFeature = (SizeFeature)theEObject;
        T result = caseSizeFeature(sizeFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.POSITION_FEATURE:
      {
        PositionFeature positionFeature = (PositionFeature)theEObject;
        T result = casePositionFeature(positionFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.COLOR_FEATURE:
      {
        ColorFeature colorFeature = (ColorFeature)theEObject;
        T result = caseColorFeature(colorFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.RGB:
      {
        RGB rgb = (RGB)theEObject;
        T result = caseRGB(rgb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.INTEGER_FEATURE:
      {
        IntegerFeature integerFeature = (IntegerFeature)theEObject;
        T result = caseIntegerFeature(integerFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.DOUBLE_FEATURE:
      {
        DoubleFeature doubleFeature = (DoubleFeature)theEObject;
        T result = caseDoubleFeature(doubleFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.STRING_FEATURE:
      {
        StringFeature stringFeature = (StringFeature)theEObject;
        T result = caseStringFeature(stringFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.BOOLEAN_FEATURE:
      {
        BooleanFeature booleanFeature = (BooleanFeature)theEObject;
        T result = caseBooleanFeature(booleanFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.LINE_FEATURE:
      {
        LineFeature lineFeature = (LineFeature)theEObject;
        T result = caseLineFeature(lineFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.ATRIBUTE_EXPRESSION:
      {
        AtributeExpression atributeExpression = (AtributeExpression)theEObject;
        T result = caseAtributeExpression(atributeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XdiagramPackage.ATRIBUTE_VALUE:
      {
        AtributeValue atributeValue = (AtributeValue)theEObject;
        T result = caseAtributeValue(atributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDiagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDiagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDiagram(XDiagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportStatement(ImportStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyle(Style object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeFigure(NodeFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeContainer(NodeContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Placing Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Placing Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlacingFigure(PlacingFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicFigure(DynamicFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticFigure(StaticFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Anchor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Anchor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeAnchor(NodeAnchor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrow Anchor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrow Anchor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrowAnchor(ArrowAnchor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Figure Features</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Figure Features</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFigureFeatures(FigureFeatures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomFeature(CustomFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleFeature(StyleFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutFeature(LayoutFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Center Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Center Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCenterFeature(CenterFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Align Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Align Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignFeature(AlignFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gradient Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gradient Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGradientFeature(GradientFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointFeature(PointFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeFeature(SizeFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionFeature(PositionFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorFeature(ColorFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRGB(RGB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerFeature(IntegerFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleFeature(DoubleFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringFeature(StringFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanFeature(BooleanFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineFeature(LineFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atribute Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atribute Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributeExpression(AtributeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributeValue(AtributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //XdiagramSwitch
