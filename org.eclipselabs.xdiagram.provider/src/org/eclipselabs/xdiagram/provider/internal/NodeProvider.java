package org.eclipselabs.xdiagram.provider.internal;

import static org.eclipselabs.xdiagram.provider.internal.FigureProperty.ANCHOR_HORIZ;
import static org.eclipselabs.xdiagram.provider.internal.FigureProperty.FORMAT;
import static org.eclipselabs.xdiagram.provider.internal.FigureProperty.HASHCODE;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.ImageProvider;
import org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures;
import org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl;
import org.osgi.framework.Bundle;

public class NodeProvider extends FigureProvider {
	
	
//	public static enum NodeShape {
//		SQUARE, RECTANGLE, ROUNDEDRECTANGLE, CIRCLE, ELLIPSE, TRIANGLE, RHOMBUS, POLYGON, POLYLINE, LABEL, IMAGE;
//	}	

	public static GraphicsAlgorithm createNodeShape(Diagram diagram, GraphicsAlgorithmContainer container, EObject eObject,
			FigureShape shape, FigureFeatures features, Rectangle limits){
		
		int angle = IntegerProperty.ANGLE.getValue(features); 
		int arc = IntegerProperty.CORNER.getValue(features);

		// TODO: validation
		if (shape==FigureShape.POLYGON && !(features.getPointfeatures().size()>1))
			shape = FigureShape.RECTANGLE;

		GraphicsAlgorithm figure = null;
		
		boolean round = angle>0 || arc>0;
		int xy[] = null;
		int beforeAfter[] = null;
		Point center = new Point(limits.x+limits.width/2, limits.y+limits.height/2);

		switch (shape){	
		case LABEL:					
			figure = Graphiti.getGaService().createMultiText(container);
			Dimension size = setLabelFigure(diagram, eObject, (AbstractText)figure, features, false);
			limits.width = size.width;
			limits.height = size.height;
			break;
		case IMAGE:
			String icon = StringProperty.ICON.getValue(features);
			figure = createImageFigure(container, icon, limits);
			StringProperty.ICON.getValue(figure, eObject, features);
			break;
		case CIRCLE:
			limits.height = limits.width;
		case ELLIPSE:
			figure = Graphiti.getGaService().createPlainEllipse(container);
			break;
		case SQUARE:
			limits.height = limits.width;
			center = new Point(center.x, center.x);
		case ROUNDED_RECTANGLE:
			arc = arc<=0 ? 20 : arc;
			if (angle<=0){
				figure = Graphiti.getGaService().createPlainRoundedRectangle(container, arc, arc);
				break;
			}			
		case RECTANGLE:
			if (round || arc>0)
				xy = new int[] { 0, 0, limits.width, 0, limits.width, limits.height, 0, limits.height };
			else
				figure = Graphiti.getGaService().createPlainRectangle(container);
			break;
		case TRIANGLE:
			limits.height = limits.width;
			xy = new int[] { limits.width/2, 0, 0, limits.height, limits.width, limits.height };
			center = new Point(limits.x+limits.width/2, limits.y+limits.height/2);
			break;
		case RHOMBUS:
			xy = new int[] { limits.width/2, 0, limits.width, limits.height/2, limits.width/2, limits.height, 0, limits.height/2 };
			break;
		case POLYGON:
			if (features.getPointfeatures().size()<3)
				return null;
		case POLYLINE:
			if (features.getPointfeatures().size()<2)
				return null;
			xy = new int [features.getPointfeatures().size()*2];
			for (int p=0; p<features.getPointfeatures().size(); p++){
				int x = features.getPointfeatures().get(p).getX();
				int y = features.getPointfeatures().get(p).getY();
				xy[p*2] = x;
				xy[p*2+1] = y;
			}
			Rectangle bounds = CalculateBounds(xy);
			TranslateFigure(xy, new Point(-bounds.x, -bounds.y));
			limits.width = bounds.width;
			limits.height = bounds.height;
			break;
		default:
			figure = Graphiti.getGaService().createPlainRectangle(container);
			break;
		}

		
		if (figure==null){
			
			beforeAfter = new int[xy.length];
			for (int i=0; i<xy.length; i++)
				beforeAfter[i] = arc;
			
			if (angle>0){
				RotateFigure(xy, center, angle);
				Rectangle bounds = CalculateBounds(xy);
				TranslateFigure(xy, new Point(-bounds.x, -bounds.y));
				limits.width = bounds.width;
				limits.height = bounds.height;
			}			
			
			if (shape==FigureShape.POLYLINE)
				figure = Graphiti.getGaService().createPlainPolyline(container, xy, beforeAfter);
			else
				figure = Graphiti.getGaService().createPlainPolygon(container, xy, beforeAfter);
		}		
		
		Graphiti.getGaService().setLocationAndSize(figure, limits.x, limits.y, limits.width, limits.height);
		setStyleFeatures(diagram, eObject, figure, features);		
		return figure;
		
	}



	public static Rectangle createNodeFigure(Diagram diagram, GraphicsAlgorithmContainer container, 
			EObject eObject, GraphicsAlgorithm parentFigure, EList<NodeFigure> figures, String style){
		return createNodeFigure(diagram, container, eObject, parentFigure, figures, null, style);
	}

	public static Rectangle createNodeFigure(Diagram diagram, GraphicsAlgorithmContainer container, 
			EObject eObject, GraphicsAlgorithm parentFigure, EList<NodeFigure> figures, Rectangle bounds, String style){

		if (bounds==null)
			bounds = new Rectangle(Integer.MAX_VALUE, Integer.MAX_VALUE, 
					Integer.MIN_VALUE, Integer.MIN_VALUE);		
				
		ArrayList<GraphicsAlgorithm> shapes = new ArrayList<GraphicsAlgorithm>();

		for (int i=0; i<figures.size(); i++){
			
			FigureShape shape = figures.get(i).getFigure();
//			shape = NodeShape.valueOf(figures.get(i).getFigure().name());
			boolean main = figures.get(i).getOption()!=null;
			FigureFeatures features = figures.get(i).getFeatures();		
			if (features==null){
				for (Constructor<?> constructor : FigureFeaturesImpl.class.getDeclaredConstructors()){
					if (constructor.getParameterTypes().length==0){
						constructor.setAccessible(true);
						try {
							features = (FigureFeaturesImpl) constructor.newInstance(new Object[0]);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}	
			}
			
			FigureProvider.setStyle(figures.get(i).getStyle()!=null && figures.get(i).getStyle().length()>0 ?
					figures.get(i).getStyle() : style, features);
			if (features!=null && features.getSizefeatures()!=null)
				for (SizeFeature sf : features.getSizefeatures()){
					IntegerProperty.WIDTH.addNewValue(features.getIntegerfeatures(), sf.getWidth(), true);
					IntegerProperty.HEIGHT.addNewValue(features.getIntegerfeatures(), sf.getHeight(), true);
				}
			if (features!=null && features.getPositionfeatures()!=null)
				for (PositionFeature pf : features.getPositionfeatures()){
					IntegerProperty.TOP.addNewValue(features.getIntegerfeatures(), pf.getY(), true);
					IntegerProperty.LEFT.addNewValue(features.getIntegerfeatures(), pf.getX(), true);
				}
			

			Rectangle limits = new Rectangle(
					IntegerProperty.LEFT.getValue(features),
					IntegerProperty.TOP.getValue(features), 
					IntegerProperty.WIDTH.getValue(features), 
					IntegerProperty.HEIGHT.getValue(features));

			
			GraphicsAlgorithmContainer object = container;
			if (container instanceof ContainerShape)
				object = Graphiti.getPeCreateService().createShape((ContainerShape) container, false);
			GraphicsAlgorithm figure = createNodeShape(diagram, object, eObject, shape, features, limits);
			shapes.add(figure);			
			Point limit = new Point(limits.x+limits.width, limits.y+limits.height);

			if (shape == FigureShape.LABEL)
				FigureProperty.CAN_RESIZE.set(parentFigure, "1");
			if (main)
				FigureProperty.MAIN.set(figure, "1");
			
			if ( features==null || features.getCenterfeatures().size()==0 || 
					features.getCenterfeatures().get(0).getValue().equalsIgnoreCase("VERTICAL") ){
				bounds.x = limits.x<bounds.x ? limits.x : bounds.x;
				bounds.width = limit.x>bounds.width ? limit.x : bounds.width;
			}
			if ( features==null || features.getCenterfeatures().size()==0 || 
					features.getCenterfeatures().get(0).getValue().equalsIgnoreCase("HORIZONTAL") ){
				bounds.y = limits.y<bounds.y ? limits.y : bounds.y;
				bounds.height = limit.y>bounds.height ? limit.y : bounds.height;
			}


			//-----------------------------------

			GraphicsAlgorithmContainer txtshape = container;
			if (container instanceof ContainerShape)
				txtshape = Graphiti.getPeCreateService().createShape((ContainerShape) container, false);
			MultiText text = Graphiti.getGaService().createMultiText(txtshape);
			if (features!=null)
				setLabelFigure(diagram, eObject, text, features, shape == FigureShape.LABEL);
			if (text.getValue().length()>0)
				FigureProperty.CAN_RESIZE.set(text, "1");
			text.setForeground(Graphiti.getGaService().manageColor(diagram, Colors.BLACK));
			shapes.add(text);
			Graphiti.getGaService().setLocationAndSize(text, limits.x, limits.y, limits.width, limits.height);


		}


		for (GraphicsAlgorithm shape : shapes){
			shape.setX(shape.getX()-bounds.x);
			shape.setY(shape.getY()-bounds.y);
		}
		bounds.width -= bounds.x;
		bounds.height -= bounds.y;
		bounds.translate(-bounds.x, -bounds.y);

		if (bounds.width < minValue)
			bounds.width = minValue;
		if (bounds.height < minValue)
			bounds.height = minValue;


		for (int p=0, i=0, j=0; p<figures.size(); p++, i+=2){
			j=i+1;
			if ( figures.get(p).getFeatures()!=null && figures.get(p).getFeatures().getCenterfeatures().size()>0 && 
					!figures.get(p).getFeatures().getCenterfeatures().get(0).getValue().equalsIgnoreCase("VERTICAL") ){
				int locX = (int)(bounds.width/2.0-shapes.get(i).getWidth()/2.0);
				shapes.get(i).setX(locX);
				shapes.get(j).setX(locX);
				if (shapes.get(i).getX()<bounds.x)					
					bounds.x = shapes.get(i).getX();
				int limit = shapes.get(i).getX()+shapes.get(i).getWidth();
				if (limit>bounds.width)					
					bounds.width = limit;
			}
			if ( figures.get(p).getFeatures()!=null && figures.get(p).getFeatures().getCenterfeatures().size()>0 && 
					!figures.get(p).getFeatures().getCenterfeatures().get(0).getValue().equalsIgnoreCase("HORIZONTAL") ){
				int locY = (int)(bounds.height/2.0-shapes.get(i).getHeight()/2.0);
				shapes.get(i).setY(locY);
				shapes.get(j).setY(locY);
				if (shapes.get(i).getY()<bounds.y)					
					bounds.y = shapes.get(i).getY();
				int limit = shapes.get(i).getY()+shapes.get(i).getHeight();
				if (limit>bounds.height)					
					bounds.height = limit;
			}
		}
		
		for (GraphicsAlgorithm shape : shapes){
			shape.setX(shape.getX()-bounds.x);
			shape.setY(shape.getY()-bounds.y);
			FigureProperty.setProperties(shape);
		}
		bounds.width -= bounds.x;
		bounds.height -= bounds.y;
		bounds.translate(-bounds.x, -bounds.y);	

		return bounds;
		//Graphiti.getGaService().calculateSize(parent);

	}
	
	
	
	
	public static void updateNodeFigure(Diagram diagram, ContainerShape container){
		resizeNodeFigure(diagram, container, null);
	}

	public static void resizeNodeFigure(Diagram diagram, ContainerShape container, Dimension size){

		GraphicsAlgorithm parent = container.getGraphicsAlgorithm();			

		int anchor_left = Integer.parseInt( FigureProperty.ANCHOR_LEFT.get(parent) );
		int anchor_up = Integer.parseInt( FigureProperty.ANCHOR_UP.get(parent) );
		int anchor_right = Integer.parseInt( FigureProperty.ANCHOR_RIGHT.get(parent) );
		int anchor_down = Integer.parseInt( FigureProperty.ANCHOR_DOWN.get(parent) );
		int anchor_width = anchor_left+anchor_right;
		int anchor_height = anchor_up+anchor_down;

		Point location = new Point(anchor_left, anchor_up);

		if (size==null)
			size = new Dimension(parent.getWidth()-anchor_width, parent.getHeight()-anchor_height);
		else
			size = new Dimension(size.width-anchor_width, size.height-anchor_height);

		if (size.width < minValue)
			size.width = minValue;
		if (size.height < minValue)
			size.height = minValue;


		resizeShapes(diagram, container, size);

		int remainig = 0;
		int vertical = 0;
		
		//calcular tamanho final das shapes
		for (Shape shape : container.getChildren()){
			GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();				
			if (figure != null && !isBaseContainer(figure)){
				
				String name = FigureProperty.CONTAINER.get(figure);
				if (name.length()>0){
					String width = FigureProperty.FORMAT.get(figure);
					Dimension position = new Dimension(0, 0);
					resizeContainer(diagram, figure, position);

					if (!"%".equals(width)){
						int height = Integer.parseInt( FigureProperty.VERTICAL.get(figure) );
						if (height>position.height)
							position.height = height;							
						remainig += position.height;
					}

					if (position.width > size.width)
						size.width = position.width;
					vertical += position.height;
				}
			}
		}

		if (vertical>size.height)
			size.height = vertical;

		remainig = size.height - remainig;
		int left = size.height - vertical; //ver se tamanho final ultrupassa actual			


		vertical = 0;
		for (Shape shape : container.getChildren()){
			GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();				
			if (figure != null && !isBaseContainer(figure)){

				String name = FigureProperty.CONTAINER.get(figure);
				if (name.length()>0){
					String width = FigureProperty.FORMAT.get(figure);
					int height = figure.getHeight();
					if ("%".equals(width)){
						int vheight = Integer.parseInt( FigureProperty.VERTICAL.get(figure) );
						vheight = (int)((double)vheight / 100.0 * (double)remainig);
						if (vheight>height){
							left += height;
							if (vheight>left)
								height = left;
							else
								height = vheight;
							left -= height;
						}
					}else{
						int vheight = Integer.parseInt( FigureProperty.VERTICAL.get(figure) );
						if (vheight>height)
							height = vheight;
					}

					figure.setX(location.x);
					figure.setY(location.y+vertical);
					Dimension position = new Dimension(size.width, height);
					resizeContainer(diagram, figure, position);

					vertical += position.height;
					if (vertical>size.height)
						size.height = vertical;
					if (position.width>size.width)
						size.width = position.width;

				}
			}
		}
		
		resizeShapes(diagram, container, location, size);

		
		//reposicionar ancoras
		for ( Anchor anchors : container.getAnchors() ){
			GraphicsAlgorithm inner = anchors.getGraphicsAlgorithm();
			if (anchors instanceof FixPointAnchor){
				FixPointAnchor anchor = (FixPointAnchor)anchors;
				String format = Graphiti.getPeService().getPropertyValue(inner, 
						ANCHOR_HORIZ.toString());
				int value = Integer.parseInt(
						Graphiti.getPeService().getPropertyValue(inner, 
								FORMAT.toString()) );
				if (format.equals("lf"))
					anchor.getLocation().setX(anchor_left-value);
				else if (format.equals("rg"))
					anchor.getLocation().setX(anchor_left+size.width+value-inner.getWidth());
				else if (format.equals("%")){
					int pos = (int)(size.width*value/100.0-inner.getWidth()/2.0);
					if (pos<0)
						pos = 0;
					if (pos+inner.getWidth()>size.width)
						pos = size.width-inner.getWidth();
					anchor.getLocation().setX(anchor_left+pos);
				}


				format = FigureProperty.ANCHOR_VERT.get(inner);
				value = Integer.parseInt( FigureProperty.VERTICAL.get(inner) );

				if (format.equals("up"))
					anchor.getLocation().setY(anchor_up-value);
				else if (format.equals("dw"))
					anchor.getLocation().setY(anchor_up+size.height+value-inner.getHeight());
				else if (format.equals("%")){
					int pos = (int)(size.height*value/100.0-inner.getHeight()/2.0);
					if (pos<0)
						pos = 0;
					if (pos+inner.getHeight()>size.height)
						pos = size.height-inner.getHeight();
					anchor.getLocation().setY(anchor_up+pos);
				}

			}

			EList<GraphicsAlgorithm> algoritms = inner.getGraphicsAlgorithmChildren();
			for (int i=0; i<algoritms.size(); i++){
				GraphicsAlgorithm child = algoritms.get(i);								
				updateStyleFeatures(diagram, child);
			}


		}
		parent.setWidth(size.width+anchor_width);
		parent.setHeight(size.height+anchor_height);

		
		//update de filhos no interior
		String root = FigureProperty.PARENT.get(parent);
		if (root!=null && root.length()>0){
			for (PictogramLink link : diagram.getPictogramLinks()){
				GraphicsAlgorithm child = link.getPictogramElement().getGraphicsAlgorithm();
				if (root.equals(getHashCode(child)))
					updateNodeFigure(diagram, (ContainerShape)link.getPictogramElement());
			}
		}


	}
	
	

	public static void resizeContainer(Diagram diagram, GraphicsAlgorithm parent, Dimension size){
		resizeContainer(diagram, parent, new Point(0,0), size);
	}	

	public static void resizeContainer(Diagram diagram, GraphicsAlgorithm parent, Point location, Dimension size){

		String name = FigureProperty.CONTAINER.get(parent);
		String children = FigureProperty.CHILDREN.get(parent);
		boolean canmove = !"stack".equals(FigureProperty.TYPE.get(parent));

		//int dx = 0;
		int dy = 9999;
		if (!(children==null) && children.length()>0){
			int vertical = parent.getY();
			for (PictogramLink link : diagram.getPictogramLinks()){
				for (EObject eobject : link.getBusinessObjects()){
					boolean isInstance = eobject.eClass().getName().equals(name);
					for (EClass eclass : eobject.eClass().getEAllSuperTypes())
						if (eclass.getName().equals(name))
							isInstance = true;
					if (isInstance){
						GraphicsAlgorithm child = link.getPictogramElement().getGraphicsAlgorithm();
						if (children.contains(getHashCode(child))){
							if (!canmove){
								child.setX(parent.getX());
								child.setY(vertical);
								FigureProperty.CAN_MOVE.set(child, canmove);
							}else{
								if (child.getX()<parent.getX())
									child.setX(parent.getX());
								if (child.getY()<parent.getY())
									child.setY(parent.getY());
								if (child.getY()<dy)
									dy = child.getY();
							}
							vertical += child.getHeight();
							int max_x = child.getX()+child.getWidth()-parent.getX();
							if (max_x > size.width)
								size.width = max_x;								
							int max_y = child.getY()+child.getHeight()-parent.getY();
							if (max_y > size.height)
								size.height = max_y;
						}						
					}	
				}
			}
			dy -= parent.getY();

		}

		resizeShapes(diagram, parent.getPictogramElement(), location, size);

	}





	public static void resizeShapes(Diagram diagram, PictogramElement pe, Dimension size){
		resizeShapes(diagram, pe, new Point(0,0), size);
	}

	public static void resizeShapes(Diagram diagram, PictogramElement pe, Point location, Dimension size){

		GraphicsAlgorithm parent = pe.getGraphicsAlgorithm();
		parent.setHeight(size.height);
		parent.setWidth(size.width);

		int dx = Integer.parseInt( FigureProperty.WIDTH.get(parent) );
		int dy = Integer.parseInt( FigureProperty.HEIGHT.get(parent) );			
		double fx = parent.getWidth() / (double)dx;
		double fy = parent.getHeight() / (double)dy;
		double zx = fx;
		double zy = fy;

		boolean root = pe instanceof ContainerShape;			
		ArrayList<GraphicsAlgorithm> figures = getChildFigures(pe);

		for (GraphicsAlgorithm figure : figures){
			updateStyleFeatures(diagram, figure);
			int dim = getLabelWidth(figure);
			if (dim > size.width)
				size.width = dim;
		}

		for (GraphicsAlgorithm figure : figures){
			if (figure != null && !isBaseContainer(figure)){
				String name = FigureProperty.CONTAINER.get(figure);
				if (!root || name.length()==0){
					int x = Integer.parseInt( FigureProperty.X.get(figure) );
					int y = Integer.parseInt( FigureProperty.Y.get(figure) );
					int width = Integer.parseInt( FigureProperty.WIDTH.get(figure) );
					int height = Integer.parseInt( FigureProperty.HEIGHT.get(figure) );
					if ( figure instanceof Polyline ){
						String[] str_points = FigureProperty.POINTS.get(figure).split("\\|");
						EList<org.eclipse.graphiti.mm.algorithms.styles.Point> points = ((Polyline) figure).getPoints();
						for (int i=0; i<points.size(); i++){
							String[] coord = str_points[i].split(",");
							points.get(i).setX((int)(Integer.parseInt(coord[0])*fx));
							points.get(i).setY((int)(Integer.parseInt(coord[1])*fy));						
						}
						FigureProperty.ZOOM_X.set(figure, fx);
						FigureProperty.ZOOM_Y.set(figure, fy);
					}
					if ( figure instanceof Image )
						zx = zy = 1.0;
					
					String value = FigureProperty.TEXT.get(figure);
					String canresize = FigureProperty.CAN_RESIZE.get(figure);
					if ( figure instanceof MultiText && value!=null && canresize==null )
						Graphiti.getGaService().setLocationAndSize(figure, 
								location.x+0, location.y+(int)(y*fy), 
								size.width, (int)(height*zy));
					else
						Graphiti.getGaService().setLocationAndSize(figure, 
								location.x+(int)(x*fx), location.y+(int)(y*fy), 
								(int)(width*zx), (int)(height*zy));

				}
			}
		}

	}
	
	
	public static void updateContainerFigures(EObject eObject, ContainerShape container, GraphicsAlgorithm child){
		FigureProperty.PARENT.set(child, expressionSeperator + 
				HASHCODE.get(container.getGraphicsAlgorithm()) + expressionSeperator);		
		for (Shape shape : container.getChildren()){
			GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();				
			if (figure != null && !isBaseContainer(figure)){
				String name = FigureProperty.CONTAINER.get(figure);
				boolean isInstance = false;
				if (name.length()>0){
					isInstance = name.equals(eObject.eClass().getName());
					for (EClass eclass : eObject.eClass().getEAllSuperTypes())
						if (eclass.getName().equals(name))
							isInstance = true;
				}
				if (isInstance){
					String children = FigureProperty.CHILDREN.get(figure);
					if (children==null || children.length()==0)
						children = "|";
					children += child.hashCode() + "|";
					FigureProperty.CHILDREN.set(figure, children);
				}
			}
		}
	}


	public static void removeContainerFigures(Diagram diagram, GraphicsAlgorithm figure) {
		
		GraphicsAlgorithm parent = figure;
		String name = FigureProperty.HASHCODE.get(parent);
		String root = FigureProperty.PARENT.get(parent);
		
		if (!(root==null) && root.length()>0){
			for (PictogramLink link : diagram.getPictogramLinks()){
				GraphicsAlgorithm child = link.getPictogramElement().getGraphicsAlgorithm();
				String hashcode = FigureProvider.getHashCode(child) ;
				if (root.equals(hashcode)){

					for (Shape shape : ((ContainerShape)link.getPictogramElement()).getChildren() ){
						GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
						if (ga != null && !isBaseContainer(ga)){
							String content = FigureProperty.CONTAINER.get(ga);
							if (content.length()>0){
								String children = FigureProperty.CHILDREN.get(ga);
								if (children!=null){
									children = children.replace(name +expressionSeperator, "");
									if (children.length()<2)
										children = null;
									FigureProperty.CHILDREN.set(ga, children);
								}
							}
						}
					}					
					updateNodeFigure(diagram, (ContainerShape)link.getPictogramElement());
				}
			}
		}
	}
	
	
	public static void registerNodeImages(Map<String, String> properties, Bundle bundle, EList<Node> nodes){
		for (Node node : nodes){
			if (node.getIcon()!=null){
				try{
					String icon = properties.get(node.getIcon());
					Dimension size = null;
					if (icon!=null)
						size = ImageProvider.addImageFile(node.getIcon(), icon, bundle);
					if (size!=null && !imageSizes.containsKey(node.getIcon()))
						imageSizes.put(node.getIcon(), size);
				}catch (Exception ex){
					System.err.println(ex.getMessage());
				}
			}
			for (NodeFigure figure : node.getFigures()){
				if ( figure.getFeatures()!=null && figure.getFeatures().getStringfeatures()!=null ){
					for (StringFeature key : figure.getFeatures().getStringfeatures()){
						if (isSameFeature (key.getKey(), StringProperty.ICON.name())){
							try{
								String icon = properties.get(key.getValue());
								Dimension size = null;
								if (icon!=null)
									size = ImageProvider.addImageFile(key.getValue(), icon, bundle);
								if (size!=null && !imageSizes.containsKey(key.getValue()))
									imageSizes.put(key.getValue(), size);
							}catch (Exception ex){
								System.err.println(ex.getMessage());
							}
						}
					}
				}
			}
		}
	}
	

}