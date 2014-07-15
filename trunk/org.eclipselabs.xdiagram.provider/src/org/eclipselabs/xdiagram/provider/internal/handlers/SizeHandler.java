package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsPackage;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipselabs.xdiagram.dsl.Arrow;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.Line;
import org.eclipselabs.xdiagram.dsl.Rectangle;
import org.eclipselabs.xdiagram.dsl.Rhombus;
import org.eclipselabs.xdiagram.dsl.Size;
import org.eclipselabs.xdiagram.dsl.Triangle;
import org.eclipselabs.xdiagram.provider.internal.ElementCreation;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class SizeHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Size.class;
	}

	private Map<GraphicsAlgorithm, GraphicsAlgorithm> noresize;
	
	public SizeHandler() {
		noresize = new WeakHashMap<>();
	}

	private final class SizeListener extends AdapterImpl {
		private final EObject eObject;
		private final FeatureContainer element;
		private final Dim dim;
		private final GraphicsAlgorithm figure;

		private SizeListener(EObject eObject, FeatureContainer element,
				Dim dim, GraphicsAlgorithm figure) {
			this.eObject = eObject;
			this.element = element;
			this.dim = dim;
			this.figure = figure;
		}

		@Override
		public void notifyChanged(Notification notification) {
			setSize(element, figure, eObject, dim);
		}
	}


	private static class Dim {
		int width;
		int height;

		Dim(int w, int h) {
			width = w;
			height = h;
		}
		Dim(Size size) {
			width = size.getWidth();
			height = size.getHeight();
		}
		void expandTo(int w, int h) {
			if(w > width)
				width = w;

			if(h > height)
				height = h;
		}
		void setDimToMax() {
			int max = Math.max(width, height);
			width = max;
			height = max;
		}
	}


	// TODO validation decorator no relative dimension

	@Override
	public void handle(final FeatureContainer element, final Feature feature, final EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, final GraphicsAlgorithm figure) {
		final Size size = (Size) feature;

		final Dim dimension = new Dim(size);

		if(figure.eContainer() instanceof ContainerShape) {
			final ContainerShape parent = (ContainerShape) figure.eContainer();
			GraphicsAlgorithm parentFig = ((ContainerShape) parent.eContainer()).getGraphicsAlgorithm();

			// TODO only one adapter per fig
			if(size.isWidthRelative()) {
				noresize.put(figure, figure);
				parentFig.eAdapters().add(new AdapterImpl() {
					@Override
					public void notifyChanged(Notification msg) {
						if(msg.getFeature().equals(AlgorithmsPackage.eINSTANCE.getGraphicsAlgorithm_Width())) {
							//int w = (int) (msg.getNewIntValue() * (size.getWidth()/100.0)) - PositionHandler.DEFAULT_MARGIN*2;
							int w = msg.getNewIntValue() - size.getWidth() - figure.getX();
							
							setSize(element, figure, eObject, new Dim(w,-1));
						}
					}
				});
			}

			if(size.isHeightRelative()){
				noresize.put(figure, figure);
				parentFig.eAdapters().add(new AdapterImpl() {
					@Override
					public void notifyChanged(Notification msg) {
						if(msg.getFeature().equals(AlgorithmsPackage.eINSTANCE.getGraphicsAlgorithm_Height())) {
//							int h = (int) (msg.getNewIntValue() * (size.getHeight()/100.0)) - PositionHandler.DEFAULT_MARGIN*2;
							int h = msg.getNewIntValue() - size.getHeight() - figure.getY();
							setSize(element, figure, eObject, new Dim(-1,h));
						}
					}
				});
			}
		}

		setSize(element, figure, eObject, dimension);
		
		if(!size.isResizable())
			noresize.put(figure, figure);
		
//		handleSizeListener(eObject, element, figure, dimension);
	}


	private void setSizeRelative(final FeatureContainer element,
			final EObject eObject, final GraphicsAlgorithm figure,
			final Size size, Dim dimension, ContainerShape parent) {
		//		IDimension dim = Graphiti.getGaService().calculateSize(parent.getGraphicsAlgorithm(), true);
		int w = size.isWidthRelative() ? (int) (dimension.width * (size.getWidth()/100.0)) : size.getWidth();
		int h = size.isHeightRelative() ? (int) (dimension.height *(size.getHeight()/100.0)) : size.getHeight();
		setSize(element, figure, eObject, new Dim(w, h));
	}


	private void setSize(final FeatureContainer element, final GraphicsAlgorithm figure, final EObject eObject, final Dim dim) {
		if(element instanceof Line) {
			ElementCreation.updateLineSize((Polyline)figure, dim.width, ((Line) element).isHorizontal());
		}
		else if(element instanceof Arrow) {
			ElementCreation.updateArrowSize((Polyline)figure, dim.width, dim.height);
		}
		else if(element instanceof Triangle) {
			ElementCreation.updateTriangleSize((Polygon)figure, dim.width, dim.height);
		}
		else if(element instanceof Rhombus) {
			ElementCreation.updateRhombusSize((Polygon)figure, dim.width, dim.height);
		}
		
		else {
//			if(element instanceof Rectangle && ((Rectangle) element).isSquare() ||
//					element instanceof Ellipse && ((Ellipse) element).isCircle()) {
//				dim.setDimToMax();
//			}
//			maximize(figure, dim);

			if(dim.width != -1)
				Graphiti.getGaService().setWidth(figure, dim.width);

			if(dim.height != -1)
				Graphiti.getGaService().setHeight(figure, dim.height);
		}
	}

	private void handleSizeListener(EObject eObject, FeatureContainer element, GraphicsAlgorithm figure, Dim dim) {
		if(eObject == null)
			return;

		for(Adapter o : eObject.eAdapters())
			if(o instanceof SizeListener)
				return;

		eObject.eAdapters().add(new SizeListener(eObject, element, dim, figure));
	}


	private void maximize(GraphicsAlgorithm figure, Dim dimension) {
		if(!(figure.eContainer() instanceof ContainerShape))
			return;

		ContainerShape cont = (ContainerShape) figure.eContainer();

		for(Shape child : cont.getChildren()) {
			GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
			IDimension dim = Graphiti.getGaService().calculateSize(ga, true);
			int x = ga.getX() + dim.getWidth();
			int y = ga.getY() + dim.getHeight();
			dimension.expandTo(x, y);
		}
	}




	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Dim dim = new Dim(100,50);
	
		if(element instanceof Label) {
			AbstractText text = (AbstractText) figure;
			IDimension tDim = GraphitiUi.getUiLayoutService().calculateTextSize(text);
			if(tDim != null)
				dim = new Dim(tDim.getWidth(), tDim.getHeight());
		}
		setSize(element, figure, eObject, dim);		
	}


	@Override
	public boolean accept(FeatureContainer element) {
		return true;
	}


	public boolean isResizable(GraphicsAlgorithm element) {
		return !noresize.containsKey(element);
	}


}
