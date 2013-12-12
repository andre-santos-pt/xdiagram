/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.xdiagram.xtext.xdiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage
 * @generated
 */
public class XdiagramAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XdiagramPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XdiagramAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XdiagramPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XdiagramSwitch<Adapter> modelSwitch =
    new XdiagramSwitch<Adapter>()
    {
      @Override
      public Adapter caseXDiagram(XDiagram object)
      {
        return createXDiagramAdapter();
      }
      @Override
      public Adapter caseImportStatement(ImportStatement object)
      {
        return createImportStatementAdapter();
      }
      @Override
      public Adapter caseStyle(Style object)
      {
        return createStyleAdapter();
      }
      @Override
      public Adapter caseDiagramElement(DiagramElement object)
      {
        return createDiagramElementAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseNodeFigure(NodeFigure object)
      {
        return createNodeFigureAdapter();
      }
      @Override
      public Adapter caseNodeContainer(NodeContainer object)
      {
        return createNodeContainerAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseDecorator(Decorator object)
      {
        return createDecoratorAdapter();
      }
      @Override
      public Adapter caseDynamicFigure(DynamicFigure object)
      {
        return createDynamicFigureAdapter();
      }
      @Override
      public Adapter caseStaticFigure(StaticFigure object)
      {
        return createStaticFigureAdapter();
      }
      @Override
      public Adapter caseNodeAnchor(NodeAnchor object)
      {
        return createNodeAnchorAdapter();
      }
      @Override
      public Adapter caseArrowAnchor(ArrowAnchor object)
      {
        return createArrowAnchorAdapter();
      }
      @Override
      public Adapter caseFigureFeatures(FigureFeatures object)
      {
        return createFigureFeaturesAdapter();
      }
      @Override
      public Adapter caseStyleFeature(StyleFeature object)
      {
        return createStyleFeatureAdapter();
      }
      @Override
      public Adapter caseLayoutFeature(LayoutFeature object)
      {
        return createLayoutFeatureAdapter();
      }
      @Override
      public Adapter caseCenterFeature(CenterFeature object)
      {
        return createCenterFeatureAdapter();
      }
      @Override
      public Adapter caseAlignFeature(AlignFeature object)
      {
        return createAlignFeatureAdapter();
      }
      @Override
      public Adapter caseGradientFeature(GradientFeature object)
      {
        return createGradientFeatureAdapter();
      }
      @Override
      public Adapter casePointFeature(PointFeature object)
      {
        return createPointFeatureAdapter();
      }
      @Override
      public Adapter caseSizeFeature(SizeFeature object)
      {
        return createSizeFeatureAdapter();
      }
      @Override
      public Adapter casePositionFeature(PositionFeature object)
      {
        return createPositionFeatureAdapter();
      }
      @Override
      public Adapter caseColorFeature(ColorFeature object)
      {
        return createColorFeatureAdapter();
      }
      @Override
      public Adapter caseRGB(RGB object)
      {
        return createRGBAdapter();
      }
      @Override
      public Adapter caseIntegerFeature(IntegerFeature object)
      {
        return createIntegerFeatureAdapter();
      }
      @Override
      public Adapter caseStringFeature(StringFeature object)
      {
        return createStringFeatureAdapter();
      }
      @Override
      public Adapter caseBooleanFeature(BooleanFeature object)
      {
        return createBooleanFeatureAdapter();
      }
      @Override
      public Adapter caseLineFeature(LineFeature object)
      {
        return createLineFeatureAdapter();
      }
      @Override
      public Adapter caseAtributeExpression(AtributeExpression object)
      {
        return createAtributeExpressionAdapter();
      }
      @Override
      public Adapter caseAtributeValue(AtributeValue object)
      {
        return createAtributeValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram <em>XDiagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram
   * @generated
   */
  public Adapter createXDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement
   * @generated
   */
  public Adapter createImportStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Style
   * @generated
   */
  public Adapter createStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement <em>Diagram Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement
   * @generated
   */
  public Adapter createDiagramElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure <em>Node Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure
   * @generated
   */
  public Adapter createNodeFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer <em>Node Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer
   * @generated
   */
  public Adapter createNodeContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator <em>Decorator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator
   * @generated
   */
  public Adapter createDecoratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure <em>Dynamic Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure
   * @generated
   */
  public Adapter createDynamicFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure <em>Static Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure
   * @generated
   */
  public Adapter createStaticFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor <em>Node Anchor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor
   * @generated
   */
  public Adapter createNodeAnchorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor <em>Arrow Anchor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor
   * @generated
   */
  public Adapter createArrowAnchorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures <em>Figure Features</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures
   * @generated
   */
  public Adapter createFigureFeaturesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature <em>Style Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature
   * @generated
   */
  public Adapter createStyleFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LayoutFeature <em>Layout Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LayoutFeature
   * @generated
   */
  public Adapter createLayoutFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature <em>Center Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature
   * @generated
   */
  public Adapter createCenterFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature <em>Align Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature
   * @generated
   */
  public Adapter createAlignFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature <em>Gradient Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature
   * @generated
   */
  public Adapter createGradientFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature <em>Point Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature
   * @generated
   */
  public Adapter createPointFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature <em>Size Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature
   * @generated
   */
  public Adapter createSizeFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature <em>Position Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature
   * @generated
   */
  public Adapter createPositionFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature
   * @generated
   */
  public Adapter createColorFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.RGB
   * @generated
   */
  public Adapter createRGBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature <em>Integer Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature
   * @generated
   */
  public Adapter createIntegerFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature <em>String Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature
   * @generated
   */
  public Adapter createStringFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature <em>Boolean Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature
   * @generated
   */
  public Adapter createBooleanFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature <em>Line Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature
   * @generated
   */
  public Adapter createLineFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression <em>Atribute Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression
   * @generated
   */
  public Adapter createAtributeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue <em>Atribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue
   * @generated
   */
  public Adapter createAtributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XdiagramAdapterFactory
