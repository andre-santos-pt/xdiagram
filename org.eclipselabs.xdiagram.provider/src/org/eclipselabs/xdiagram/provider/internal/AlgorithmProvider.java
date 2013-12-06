package org.eclipselabs.xdiagram.provider.internal;
//package org.eclipselabs.threedsl.provider.internal;
//
//import java.awt.Point;
//import java.lang.reflect.InvocationTargetException;
//import java.util.HashMap;
//
//import org.eclipse.emf.common.notify.Adapter;
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.common.util.TreeIterator;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EOperation;
//import org.eclipse.emf.ecore.EReference;
//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.graphiti.mm.Property;
//import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
//import org.eclipse.graphiti.mm.algorithms.MultiText;
//import org.eclipse.graphiti.mm.algorithms.Rectangle;
//import org.eclipse.graphiti.mm.algorithms.Text;
//import org.eclipse.graphiti.mm.algorithms.impl.GraphicsAlgorithmImpl;
//import org.eclipse.graphiti.mm.algorithms.styles.Color;
//import org.eclipse.graphiti.mm.algorithms.styles.Font;
//import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
//import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
//import org.eclipse.graphiti.mm.algorithms.styles.RenderingStyle;
//import org.eclipse.graphiti.mm.algorithms.styles.Style;
//import org.eclipse.graphiti.mm.pictograms.PictogramElement;
//import org.eclipselabs.threedsl.provider.internal.FeaturesProvider.DrawShape;
//
//public class AlgorithmProvider {
//	
//	//http://www.eclipse.org/forums/index.php/m/714808/
//	public static HashMap<EObject, AlgorithmProvider> COLORS;
//	
//	GraphicsAlgorithm object;
//	DrawShape[] shapes = null;
//
//	public AlgorithmProvider(GraphicsAlgorithm object) {
//		this.object = object;		
//	}
//
//	public DrawShape[] getShapes() {
//		return shapes;
//	}
//
//	public void setShapes(DrawShape[] shapes) {
//		this.shapes = shapes;
//	}
//	
//	public void resizeShapes() {
//		Point minSize = new Point(999, 999);
//		Point maxSize = new Point(-999, -999);
//		for (DrawShape shape : shapes){
//			minSize.x = shape.Location.x<minSize.x ? shape.Location.x : minSize.x;
//			minSize.y = shape.Location.y<minSize.y ? shape.Location.y : minSize.y;
//			maxSize.x = shape.Size.x>maxSize.x ? shape.Size.x : maxSize.x;
//			maxSize.y = shape.Size.y>maxSize.y ? shape.Size.y : maxSize.y;
//		}
//		double fx = (double)(maxSize.x-minSize.x)/(double)this.getWidth();
//		double fy = (double)(maxSize.y-minSize.y)/(double)this.getHeight();
//		for (DrawShape shape : shapes){
//			shape.Figure.setHeight(200);
//		}
//
//	}
//	
//	public int getWidth() {
//		// TODO Auto-generated method stub
//		return object.getWidth();
//	}
//
//	public void setWidth(int value) {
//		// TODO Auto-generated method stub
//		object.setWidth(value);
//	}
//
//	public int getHeight() {
//		// TODO Auto-generated method stub
//		return object.getHeight();
//	}
//
//}
