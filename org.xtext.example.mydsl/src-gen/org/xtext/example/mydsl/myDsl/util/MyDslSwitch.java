/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
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
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONNECTABLE_ELEMENT:
      {
        ConnectableElement connectableElement = (ConnectableElement)theEObject;
        T result = caseConnectableElement(connectableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RGB:
      {
        RGB rgb = (RGB)theEObject;
        T result = caseRGB(rgb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMAGE_FILE:
      {
        ImageFile imageFile = (ImageFile)theEObject;
        T result = caseImageFile(imageFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CUSTOM_COLOR:
      {
        CustomColor customColor = (CustomColor)theEObject;
        T result = caseCustomColor(customColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RECTANGLE:
      {
        Rectangle rectangle = (Rectangle)theEObject;
        T result = caseRectangle(rectangle);
        if (result == null) result = caseConnectableElement(rectangle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RHOMBUS:
      {
        Rhombus rhombus = (Rhombus)theEObject;
        T result = caseRhombus(rhombus);
        if (result == null) result = caseConnectableElement(rhombus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ELLIPSE:
      {
        Ellipse ellipse = (Ellipse)theEObject;
        T result = caseEllipse(ellipse);
        if (result == null) result = caseConnectableElement(ellipse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POLYGON:
      {
        Polygon polygon = (Polygon)theEObject;
        T result = casePolygon(polygon);
        if (result == null) result = caseConnectableElement(polygon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATRIBUTE_EXPRESSION:
      {
        AtributeExpression atributeExpression = (AtributeExpression)theEObject;
        T result = caseAtributeExpression(atributeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATRIBUTE_VALUE:
      {
        AtributeValue atributeValue = (AtributeValue)theEObject;
        T result = caseAtributeValue(atributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseConnectableElement(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseConnectableElement(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LINK_ELEMENT:
      {
        LinkElement linkElement = (LinkElement)theEObject;
        T result = caseLinkElement(linkElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COLOR_FEATURE:
      {
        ColorFeature colorFeature = (ColorFeature)theEObject;
        T result = caseColorFeature(colorFeature);
        if (result == null) result = caseFeature(colorFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOREGROUND:
      {
        Foreground foreground = (Foreground)theEObject;
        T result = caseForeground(foreground);
        if (result == null) result = caseColorFeature(foreground);
        if (result == null) result = caseFeature(foreground);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BACKGROUND:
      {
        Background background = (Background)theEObject;
        T result = caseBackground(background);
        if (result == null) result = caseColorFeature(background);
        if (result == null) result = caseFeature(background);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BORDER:
      {
        Border border = (Border)theEObject;
        T result = caseBorder(border);
        if (result == null) result = caseColorFeature(border);
        if (result == null) result = caseFeature(border);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TRANSPARENCY:
      {
        Transparency transparency = (Transparency)theEObject;
        T result = caseTransparency(transparency);
        if (result == null) result = caseFeature(transparency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SIZE:
      {
        Size size = (Size)theEObject;
        T result = caseSize(size);
        if (result == null) result = caseFeature(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = caseFeature(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POSITION:
      {
        Position position = (Position)theEObject;
        T result = casePosition(position);
        if (result == null) result = caseFeature(position);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CORNER:
      {
        Corner corner = (Corner)theEObject;
        T result = caseCorner(corner);
        if (result == null) result = caseFeature(corner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FONT_FACE:
      {
        FontFace fontFace = (FontFace)theEObject;
        T result = caseFontFace(fontFace);
        if (result == null) result = caseFeature(fontFace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FONT_SIZE:
      {
        FontSize fontSize = (FontSize)theEObject;
        T result = caseFontSize(fontSize);
        if (result == null) result = caseFeature(fontSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FONT_STYLE:
      {
        FontStyle fontStyle = (FontStyle)theEObject;
        T result = caseFontStyle(fontStyle);
        if (result == null) result = caseFeature(fontStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LINE_STYLE:
      {
        LineStyle lineStyle = (LineStyle)theEObject;
        T result = caseLineStyle(lineStyle);
        if (result == null) result = caseFeature(lineStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LINE_WIDTH:
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
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
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
   * Returns the result of interpreting the object as an instance of '<em>Image File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageFile(ImageFile object)
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
   * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolygon(Polygon object)
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
   * Returns the result of interpreting the object as an instance of '<em>Link Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkElement(LinkElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Foreground</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreground</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeground(Foreground object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Background</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Background</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBackground(Background object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorder(Border object)
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

} //MyDslSwitch
