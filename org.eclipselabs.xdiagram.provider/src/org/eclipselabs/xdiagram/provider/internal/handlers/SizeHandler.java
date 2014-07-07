package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
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
			System.out.println(element.getClass() + " --- " + notification);
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


	@Override
	public void handle(final FeatureContainer element, final Feature feature, final EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, final GraphicsAlgorithm figure) {
		final Size size = (Size) feature;

		if(element instanceof Triangle) {
			ElementCreation.updateTriangleSize((Polygon)figure, size);
		}
		else if(element instanceof Rhombus) {
			ElementCreation.updateRhombusSize((Polygon)figure, size);
		}
		else {
			setSize(element, figure, eObject, new Dim(size));
			handleSizeListener(eObject, element, figure, new Dim(size));
		}
	}


	private void setSize(final FeatureContainer element, final GraphicsAlgorithm figure, final EObject eObject, final Dim dim) {
		if(element instanceof Rectangle && ((Rectangle) element).isSquare() ||
				element instanceof Ellipse && ((Ellipse) element).isCircle()) {
			dim.setDimToMax();
		}

		maximize(figure, dim);
		Graphiti.getGaService().setSize(figure, dim.width, dim.height);
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
			IDimension dim = Graphiti.getGaService().calculateSize(ga);
			int x = ga.getX() + dim.getWidth();
			int y = ga.getY() + dim.getHeight();
			dimension.expandTo(x, y);
		}
	}




	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		setSize(element, figure, eObject, new Dim(100,50));
		handleSizeListener(eObject, element, figure, new Dim(100,50));
	}


	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof ConnectableElement;
	}


}
