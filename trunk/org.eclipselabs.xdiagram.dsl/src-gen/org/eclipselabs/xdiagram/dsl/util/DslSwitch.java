/**
 */
package org.eclipselabs.xdiagram.dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.xdiagram.dsl.*;

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
 * @see org.eclipselabs.xdiagram.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
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
      case DslPackage.XDIAGRAM:
      {
        XDiagram xDiagram = (XDiagram)theEObject;
        T result = caseXDiagram(xDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.IMPORT_STATEMENT:
      {
        ImportStatement importStatement = (ImportStatement)theEObject;
        T result = caseImportStatement(importStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DIAGRAM:
      {
        Diagram diagram = (Diagram)theEObject;
        T result = caseDiagram(diagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DIAGRAM_ELEMENT:
      {
        DiagramElement diagramElement = (DiagramElement)theEObject;
        T result = caseDiagramElement(diagramElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.STYLE:
      {
        Style style = (Style)theEObject;
        T result = caseStyle(style);
        if (result == null) result = caseFeatureContainer(style);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FEATURE_CONTAINER:
      {
        FeatureContainer featureContainer = (FeatureContainer)theEObject;
        T result = caseFeatureContainer(featureContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FEATURE_CONDITIONAL:
      {
        FeatureConditional featureConditional = (FeatureConditional)theEObject;
        T result = caseFeatureConditional(featureConditional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = caseDiagramElement(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = caseDiagramElement(link);
        if (result == null) result = caseFeatureContainer(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DECORATOR:
      {
        Decorator decorator = (Decorator)theEObject;
        T result = caseDecorator(decorator);
        if (result == null) result = caseFeature(decorator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONNECTABLE_ELEMENT:
      {
        ConnectableElement connectableElement = (ConnectableElement)theEObject;
        T result = caseConnectableElement(connectableElement);
        if (result == null) result = caseFeatureContainer(connectableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ANCHOR:
      {
        Anchor anchor = (Anchor)theEObject;
        T result = caseAnchor(anchor);
        if (result == null) result = caseFeature(anchor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CUSTOM_COLOR:
      {
        CustomColor customColor = (CustomColor)theEObject;
        T result = caseCustomColor(customColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CUSTOM_FIGURE:
      {
        CustomFigure customFigure = (CustomFigure)theEObject;
        T result = caseCustomFigure(customFigure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CUSTOM:
      {
        Custom custom = (Custom)theEObject;
        T result = caseCustom(custom);
        if (result == null) result = caseConnectableElement(custom);
        if (result == null) result = caseFeatureContainer(custom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.RECTANGLE:
      {
        Rectangle rectangle = (Rectangle)theEObject;
        T result = caseRectangle(rectangle);
        if (result == null) result = caseConnectableElement(rectangle);
        if (result == null) result = caseFeatureContainer(rectangle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.RHOMBUS:
      {
        Rhombus rhombus = (Rhombus)theEObject;
        T result = caseRhombus(rhombus);
        if (result == null) result = caseConnectableElement(rhombus);
        if (result == null) result = caseFeatureContainer(rhombus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ELLIPSE:
      {
        Ellipse ellipse = (Ellipse)theEObject;
        T result = caseEllipse(ellipse);
        if (result == null) result = caseConnectableElement(ellipse);
        if (result == null) result = caseFeatureContainer(ellipse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.POLYLINE:
      {
        Polyline polyline = (Polyline)theEObject;
        T result = casePolyline(polyline);
        if (result == null) result = caseConnectableElement(polyline);
        if (result == null) result = caseFeatureContainer(polyline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRIANGLE:
      {
        Triangle triangle = (Triangle)theEObject;
        T result = caseTriangle(triangle);
        if (result == null) result = caseConnectableElement(triangle);
        if (result == null) result = caseFeatureContainer(triangle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LINE:
      {
        Line line = (Line)theEObject;
        T result = caseLine(line);
        if (result == null) result = caseConnectableElement(line);
        if (result == null) result = caseFeatureContainer(line);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONTAINS:
      {
        Contains contains = (Contains)theEObject;
        T result = caseContains(contains);
        if (result == null) result = caseFeature(contains);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseValue(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DOUBLE_VALUE:
      {
        DoubleValue doubleValue = (DoubleValue)theEObject;
        T result = caseDoubleValue(doubleValue);
        if (result == null) result = caseValue(doubleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.BOOLEAN_VALUE:
      {
        BooleanValue booleanValue = (BooleanValue)theEObject;
        T result = caseBooleanValue(booleanValue);
        if (result == null) result = caseValue(booleanValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ENUM_VALUE:
      {
        EnumValue enumValue = (EnumValue)theEObject;
        T result = caseEnumValue(enumValue);
        if (result == null) result = caseValue(enumValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseConnectableElement(label);
        if (result == null) result = caseFeatureContainer(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseConnectableElement(image);
        if (result == null) result = caseFeatureContainer(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.INVISIBLE:
      {
        Invisible invisible = (Invisible)theEObject;
        T result = caseInvisible(invisible);
        if (result == null) result = caseConnectableElement(invisible);
        if (result == null) result = caseFeatureContainer(invisible);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COLOR_FEATURE:
      {
        ColorFeature colorFeature = (ColorFeature)theEObject;
        T result = caseColorFeature(colorFeature);
        if (result == null) result = caseFeature(colorFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRANSPARENCY:
      {
        Transparency transparency = (Transparency)theEObject;
        T result = caseTransparency(transparency);
        if (result == null) result = caseFeature(transparency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SIZE:
      {
        Size size = (Size)theEObject;
        T result = caseSize(size);
        if (result == null) result = caseFeature(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = caseFeature(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.POSITION:
      {
        Position position = (Position)theEObject;
        T result = casePosition(position);
        if (result == null) result = caseFeature(position);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CORNER:
      {
        Corner corner = (Corner)theEObject;
        T result = caseCorner(corner);
        if (result == null) result = caseFeature(corner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TEXT_VALUE:
      {
        TextValue textValue = (TextValue)theEObject;
        T result = caseTextValue(textValue);
        if (result == null) result = caseFeature(textValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FONT_FACE:
      {
        FontFace fontFace = (FontFace)theEObject;
        T result = caseFontFace(fontFace);
        if (result == null) result = caseFeature(fontFace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FONT_SIZE:
      {
        FontSize fontSize = (FontSize)theEObject;
        T result = caseFontSize(fontSize);
        if (result == null) result = caseFeature(fontSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FONT_STYLE:
      {
        FontStyle fontStyle = (FontStyle)theEObject;
        T result = caseFontStyle(fontStyle);
        if (result == null) result = caseFeature(fontStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LINE_STYLE:
      {
        LineStyle lineStyle = (LineStyle)theEObject;
        T result = caseLineStyle(lineStyle);
        if (result == null) result = caseFeature(lineStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LINE_WIDTH:
      {
        LineWidth lineWidth = (LineWidth)theEObject;
        T result = caseLineWidth(lineWidth);
        if (result == null) result = caseFeature(lineWidth);
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
   * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiagram(Diagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiagramElement(DiagramElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureContainer(FeatureContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Conditional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Conditional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureConditional(FeatureConditional object)
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
   * Returns the result of interpreting the object as an instance of '<em>Decorator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decorator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecorator(Decorator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectableElement(ConnectableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnchor(Anchor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomColor(CustomColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomFigure(CustomFigure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustom(Custom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRectangle(Rectangle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rhombus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rhombus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRhombus(Rhombus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEllipse(Ellipse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolyline(Polyline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Triangle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triangle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriangle(Triangle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContains(Contains object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleValue(DoubleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValue(BooleanValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumValue(EnumValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImage(Image object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invisible</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invisible</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvisible(Invisible object)
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
   * Returns the result of interpreting the object as an instance of '<em>Transparency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transparency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransparency(Transparency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSize(Size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePosition(Position object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Corner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Corner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCorner(Corner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextValue(TextValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Face</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Face</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontFace(FontFace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontSize(FontSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontStyle(FontStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineStyle(LineStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Width</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Width</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineWidth(LineWidth object)
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

} //DslSwitch
