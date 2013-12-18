/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDsl.AtributeExpression;
import org.xtext.example.mydsl.myDsl.AtributeValue;
import org.xtext.example.mydsl.myDsl.Background;
import org.xtext.example.mydsl.myDsl.Border;
import org.xtext.example.mydsl.myDsl.Color;
import org.xtext.example.mydsl.myDsl.ColorFeature;
import org.xtext.example.mydsl.myDsl.ConnectableElement;
import org.xtext.example.mydsl.myDsl.Corner;
import org.xtext.example.mydsl.myDsl.CustomColor;
import org.xtext.example.mydsl.myDsl.DefaultColor;
import org.xtext.example.mydsl.myDsl.Ellipse;
import org.xtext.example.mydsl.myDsl.Feature;
import org.xtext.example.mydsl.myDsl.FontFace;
import org.xtext.example.mydsl.myDsl.FontFaceType;
import org.xtext.example.mydsl.myDsl.FontSize;
import org.xtext.example.mydsl.myDsl.FontStyle;
import org.xtext.example.mydsl.myDsl.FontStyleType;
import org.xtext.example.mydsl.myDsl.Foreground;
import org.xtext.example.mydsl.myDsl.Image;
import org.xtext.example.mydsl.myDsl.ImageFile;
import org.xtext.example.mydsl.myDsl.Label;
import org.xtext.example.mydsl.myDsl.LineStyle;
import org.xtext.example.mydsl.myDsl.LineType;
import org.xtext.example.mydsl.myDsl.LineWidth;
import org.xtext.example.mydsl.myDsl.LinkElement;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Point;
import org.xtext.example.mydsl.myDsl.Polygon;
import org.xtext.example.mydsl.myDsl.Position;
import org.xtext.example.mydsl.myDsl.Rectangle;
import org.xtext.example.mydsl.myDsl.Rhombus;
import org.xtext.example.mydsl.myDsl.Size;
import org.xtext.example.mydsl.myDsl.Transparency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rectangleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rhombusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ellipseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass polygonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foregroundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backgroundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transparencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cornerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontFaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontSizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineWidthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum defaultColorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fontFaceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fontStyleTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lineTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Colors()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Images()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Links()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectableElement()
  {
    return connectableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectableElement_Features()
  {
    return (EReference)connectableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGB()
  {
    return rgbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_R()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_G()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_B()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageFile()
  {
    return imageFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageFile_Name()
  {
    return (EAttribute)imageFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageFile_Src()
  {
    return (EAttribute)imageFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Custom()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColor_Rgb()
  {
    return (EReference)colorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Default()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomColor()
  {
    return customColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomColor_Name()
  {
    return (EAttribute)customColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomColor_Rgb()
  {
    return (EReference)customColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRectangle()
  {
    return rectangleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_Rectangle()
  {
    return (EAttribute)rectangleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_Square()
  {
    return (EAttribute)rectangleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Expression()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRhombus()
  {
    return rhombusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEllipse()
  {
    return ellipseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Ellipse()
  {
    return (EAttribute)ellipseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Circle()
  {
    return (EAttribute)ellipseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolygon()
  {
    return polygonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolygon_Polygon()
  {
    return (EAttribute)polygonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolygon_Polyline()
  {
    return (EAttribute)polygonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributeExpression()
  {
    return atributeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeExpression_Key()
  {
    return (EAttribute)atributeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeExpression_Operator()
  {
    return (EAttribute)atributeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtributeExpression_Value()
  {
    return (EReference)atributeExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributeValue()
  {
    return atributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueINT()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueDEC()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueID()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueBOOL()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueSTRING()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueDAY()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueMONTH()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueYEAR()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Editable()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImage_Image()
  {
    return (EReference)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkElement()
  {
    return linkElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkElement_LineType()
  {
    return (EAttribute)linkElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkElement_Features()
  {
    return (EReference)linkElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorFeature()
  {
    return colorFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFeature_Color()
  {
    return (EReference)colorFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeground()
  {
    return foregroundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackground()
  {
    return backgroundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorder()
  {
    return borderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransparency()
  {
    return transparencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransparency_Percent()
  {
    return (EAttribute)transparencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSize()
  {
    return sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Width()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Height()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_X()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Y()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPosition()
  {
    return positionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPosition_X()
  {
    return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPosition_Y()
  {
    return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCorner()
  {
    return cornerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorner_Angle()
  {
    return (EAttribute)cornerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontFace()
  {
    return fontFaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontFace_Face()
  {
    return (EAttribute)fontFaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontSize()
  {
    return fontSizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontSize_Size()
  {
    return (EAttribute)fontSizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontStyle()
  {
    return fontStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontStyle_Styles()
  {
    return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineStyle()
  {
    return lineStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineStyle_Style()
  {
    return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineWidth()
  {
    return lineWidthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineWidth_Width()
  {
    return (EAttribute)lineWidthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDefaultColor()
  {
    return defaultColorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFontFaceType()
  {
    return fontFaceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFontStyleType()
  {
    return fontStyleTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLineType()
  {
    return lineTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__COLORS);
    createEReference(modelEClass, MODEL__IMAGES);
    createEReference(modelEClass, MODEL__ELEMENTS);
    createEReference(modelEClass, MODEL__LINKS);

    connectableElementEClass = createEClass(CONNECTABLE_ELEMENT);
    createEReference(connectableElementEClass, CONNECTABLE_ELEMENT__FEATURES);

    rgbEClass = createEClass(RGB);
    createEAttribute(rgbEClass, RGB__R);
    createEAttribute(rgbEClass, RGB__G);
    createEAttribute(rgbEClass, RGB__B);

    imageFileEClass = createEClass(IMAGE_FILE);
    createEAttribute(imageFileEClass, IMAGE_FILE__NAME);
    createEAttribute(imageFileEClass, IMAGE_FILE__SRC);

    colorEClass = createEClass(COLOR);
    createEAttribute(colorEClass, COLOR__CUSTOM);
    createEReference(colorEClass, COLOR__RGB);
    createEAttribute(colorEClass, COLOR__DEFAULT);

    customColorEClass = createEClass(CUSTOM_COLOR);
    createEAttribute(customColorEClass, CUSTOM_COLOR__NAME);
    createEReference(customColorEClass, CUSTOM_COLOR__RGB);

    rectangleEClass = createEClass(RECTANGLE);
    createEAttribute(rectangleEClass, RECTANGLE__RECTANGLE);
    createEAttribute(rectangleEClass, RECTANGLE__SQUARE);

    featureEClass = createEClass(FEATURE);
    createEReference(featureEClass, FEATURE__EXPRESSION);

    rhombusEClass = createEClass(RHOMBUS);

    ellipseEClass = createEClass(ELLIPSE);
    createEAttribute(ellipseEClass, ELLIPSE__ELLIPSE);
    createEAttribute(ellipseEClass, ELLIPSE__CIRCLE);

    polygonEClass = createEClass(POLYGON);
    createEAttribute(polygonEClass, POLYGON__POLYGON);
    createEAttribute(polygonEClass, POLYGON__POLYLINE);

    atributeExpressionEClass = createEClass(ATRIBUTE_EXPRESSION);
    createEAttribute(atributeExpressionEClass, ATRIBUTE_EXPRESSION__KEY);
    createEAttribute(atributeExpressionEClass, ATRIBUTE_EXPRESSION__OPERATOR);
    createEReference(atributeExpressionEClass, ATRIBUTE_EXPRESSION__VALUE);

    atributeValueEClass = createEClass(ATRIBUTE_VALUE);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_INT);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_DEC);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_ID);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_BOOL);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_STRING);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_DAY);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_MONTH);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_YEAR);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__EDITABLE);

    imageEClass = createEClass(IMAGE);
    createEReference(imageEClass, IMAGE__IMAGE);

    linkElementEClass = createEClass(LINK_ELEMENT);
    createEAttribute(linkElementEClass, LINK_ELEMENT__LINE_TYPE);
    createEReference(linkElementEClass, LINK_ELEMENT__FEATURES);

    colorFeatureEClass = createEClass(COLOR_FEATURE);
    createEReference(colorFeatureEClass, COLOR_FEATURE__COLOR);

    foregroundEClass = createEClass(FOREGROUND);

    backgroundEClass = createEClass(BACKGROUND);

    borderEClass = createEClass(BORDER);

    transparencyEClass = createEClass(TRANSPARENCY);
    createEAttribute(transparencyEClass, TRANSPARENCY__PERCENT);

    sizeEClass = createEClass(SIZE);
    createEAttribute(sizeEClass, SIZE__WIDTH);
    createEAttribute(sizeEClass, SIZE__HEIGHT);

    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__X);
    createEAttribute(pointEClass, POINT__Y);

    positionEClass = createEClass(POSITION);
    createEAttribute(positionEClass, POSITION__X);
    createEAttribute(positionEClass, POSITION__Y);

    cornerEClass = createEClass(CORNER);
    createEAttribute(cornerEClass, CORNER__ANGLE);

    fontFaceEClass = createEClass(FONT_FACE);
    createEAttribute(fontFaceEClass, FONT_FACE__FACE);

    fontSizeEClass = createEClass(FONT_SIZE);
    createEAttribute(fontSizeEClass, FONT_SIZE__SIZE);

    fontStyleEClass = createEClass(FONT_STYLE);
    createEAttribute(fontStyleEClass, FONT_STYLE__STYLES);

    lineStyleEClass = createEClass(LINE_STYLE);
    createEAttribute(lineStyleEClass, LINE_STYLE__STYLE);

    lineWidthEClass = createEClass(LINE_WIDTH);
    createEAttribute(lineWidthEClass, LINE_WIDTH__WIDTH);

    // Create enums
    defaultColorEEnum = createEEnum(DEFAULT_COLOR);
    fontFaceTypeEEnum = createEEnum(FONT_FACE_TYPE);
    fontStyleTypeEEnum = createEEnum(FONT_STYLE_TYPE);
    lineTypeEEnum = createEEnum(LINE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    rectangleEClass.getESuperTypes().add(this.getConnectableElement());
    rhombusEClass.getESuperTypes().add(this.getConnectableElement());
    ellipseEClass.getESuperTypes().add(this.getConnectableElement());
    polygonEClass.getESuperTypes().add(this.getConnectableElement());
    labelEClass.getESuperTypes().add(this.getConnectableElement());
    imageEClass.getESuperTypes().add(this.getConnectableElement());
    colorFeatureEClass.getESuperTypes().add(this.getFeature());
    foregroundEClass.getESuperTypes().add(this.getFeature());
    foregroundEClass.getESuperTypes().add(this.getColorFeature());
    backgroundEClass.getESuperTypes().add(this.getFeature());
    backgroundEClass.getESuperTypes().add(this.getColorFeature());
    borderEClass.getESuperTypes().add(this.getColorFeature());
    transparencyEClass.getESuperTypes().add(this.getFeature());
    sizeEClass.getESuperTypes().add(this.getFeature());
    pointEClass.getESuperTypes().add(this.getFeature());
    positionEClass.getESuperTypes().add(this.getFeature());
    cornerEClass.getESuperTypes().add(this.getFeature());
    fontFaceEClass.getESuperTypes().add(this.getFeature());
    fontSizeEClass.getESuperTypes().add(this.getFeature());
    fontStyleEClass.getESuperTypes().add(this.getFeature());
    lineStyleEClass.getESuperTypes().add(this.getFeature());
    lineWidthEClass.getESuperTypes().add(this.getFeature());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Colors(), this.getCustomColor(), null, "colors", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Images(), this.getImageFile(), null, "images", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Elements(), this.getConnectableElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Links(), this.getLinkElement(), null, "links", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectableElementEClass, ConnectableElement.class, "ConnectableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectableElement_Features(), this.getFeature(), null, "features", null, 0, -1, ConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rgbEClass, org.xtext.example.mydsl.myDsl.RGB.class, "RGB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGB_R(), ecorePackage.getEInt(), "R", null, 0, 1, org.xtext.example.mydsl.myDsl.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_G(), ecorePackage.getEInt(), "G", null, 0, 1, org.xtext.example.mydsl.myDsl.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_B(), ecorePackage.getEInt(), "B", null, 0, 1, org.xtext.example.mydsl.myDsl.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageFileEClass, ImageFile.class, "ImageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageFile_Src(), ecorePackage.getEString(), "src", null, 0, 1, ImageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColor_Custom(), ecorePackage.getEBoolean(), "custom", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColor_Rgb(), this.getCustomColor(), null, "rgb", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColor_Default(), this.getDefaultColor(), "default", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customColorEClass, CustomColor.class, "CustomColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomColor_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomColor_Rgb(), this.getRGB(), null, "rgb", null, 0, 1, CustomColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRectangle_Rectangle(), ecorePackage.getEBoolean(), "rectangle", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRectangle_Square(), ecorePackage.getEBoolean(), "square", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeature_Expression(), this.getAtributeExpression(), null, "expression", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rhombusEClass, Rhombus.class, "Rhombus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEllipse_Ellipse(), ecorePackage.getEBoolean(), "ellipse", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEllipse_Circle(), ecorePackage.getEBoolean(), "circle", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolygon_Polygon(), ecorePackage.getEBoolean(), "polygon", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolygon_Polyline(), ecorePackage.getEBoolean(), "polyline", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributeExpressionEClass, AtributeExpression.class, "AtributeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributeExpression_Key(), ecorePackage.getEString(), "key", null, 0, 1, AtributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, AtributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtributeExpression_Value(), this.getAtributeValue(), null, "value", null, 0, 1, AtributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributeValueEClass, AtributeValue.class, "AtributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributeValue_ValueINT(), ecorePackage.getEInt(), "valueINT", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueDEC(), ecorePackage.getEInt(), "valueDEC", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueID(), ecorePackage.getEString(), "valueID", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueBOOL(), ecorePackage.getEString(), "valueBOOL", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueSTRING(), ecorePackage.getEString(), "valueSTRING", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueDAY(), ecorePackage.getEInt(), "valueDAY", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueMONTH(), ecorePackage.getEInt(), "valueMONTH", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueYEAR(), ecorePackage.getEInt(), "valueYEAR", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImage_Image(), this.getImageFile(), null, "image", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkElementEClass, LinkElement.class, "LinkElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinkElement_LineType(), this.getLineType(), "lineType", null, 0, 1, LinkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinkElement_Features(), this.getFeature(), null, "features", null, 0, -1, LinkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorFeatureEClass, ColorFeature.class, "ColorFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorFeature_Color(), this.getColor(), null, "color", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foregroundEClass, Foreground.class, "Foreground", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(backgroundEClass, Background.class, "Background", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(borderEClass, Border.class, "Border", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transparencyEClass, Transparency.class, "Transparency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransparency_Percent(), ecorePackage.getEString(), "percent", null, 0, 1, Transparency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSize_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSize_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPosition_X(), ecorePackage.getEInt(), "x", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPosition_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cornerEClass, Corner.class, "Corner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCorner_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, Corner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontFaceEClass, FontFace.class, "FontFace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontFace_Face(), this.getFontFaceType(), "face", null, 0, 1, FontFace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontSizeEClass, FontSize.class, "FontSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontSize_Size(), ecorePackage.getEInt(), "size", null, 0, 1, FontSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontStyleEClass, FontStyle.class, "FontStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontStyle_Styles(), this.getFontStyleType(), "styles", null, 0, -1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineStyle_Style(), this.getLineType(), "style", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineWidthEClass, LineWidth.class, "LineWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineWidth_Width(), ecorePackage.getEInt(), "width", null, 0, 1, LineWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(defaultColorEEnum, DefaultColor.class, "DefaultColor");
    addEEnumLiteral(defaultColorEEnum, DefaultColor.RED);
    addEEnumLiteral(defaultColorEEnum, DefaultColor.BLUE);
    addEEnumLiteral(defaultColorEEnum, DefaultColor.YELLOW);

    initEEnum(fontFaceTypeEEnum, FontFaceType.class, "FontFaceType");
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.ARIAL);
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.VERDANA);
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.TIMES);
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.COURIER);

    initEEnum(fontStyleTypeEEnum, FontStyleType.class, "FontStyleType");
    addEEnumLiteral(fontStyleTypeEEnum, FontStyleType.ITALICS);
    addEEnumLiteral(fontStyleTypeEEnum, FontStyleType.BOLD);
    addEEnumLiteral(fontStyleTypeEEnum, FontStyleType.UNDERLINE);

    initEEnum(lineTypeEEnum, LineType.class, "LineType");
    addEEnumLiteral(lineTypeEEnum, LineType.SOLID);
    addEEnumLiteral(lineTypeEEnum, LineType.DASH);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
