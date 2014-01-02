package org.eclipselabs.xdiagram.provider.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.xtext.xdiagram.Background;
import org.eclipselabs.xdiagram.xtext.xdiagram.Color;
import org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Foreground;
import org.eclipselabs.xdiagram.xtext.xdiagram.RGB;

public class ColorHandler implements FeatureHandler {

	
	@Override
	public boolean accept(Element element, Feature feature, ContainerShape container) {
		return feature instanceof ColorFeature;
	}

	@Override
	public void handle(Element element, Feature feature, EObject eObject, Diagram diagram, ContainerShape container, GraphicsAlgorithm figure) {

		ColorFeature colorFeature = (ColorFeature) feature;
		Color c = colorFeature.getColor();
		org.eclipse.graphiti.mm.algorithms.styles.Color cg = null;
		if(c.getCustom() != null) {
			RGB rgb = c.getCustom().getRgb();
			cg = Graphiti.getGaService().manageColor(diagram, (new ColorConstant(rgb.getR(), rgb.getG(), rgb.getB())));
		}
		else {
			cg = Graphiti.getGaService().manageColor(diagram, (DefColor.valueOf(c.getDefault().name().toUpperCase())));
		}

		if(colorFeature instanceof Background)
			figure.setBackground(cg);
		else if(colorFeature instanceof Foreground)
			figure.setForeground(cg);


		

	}



	private static enum DefColor implements IColorConstant {
		WHITE(IColorConstant.WHITE), 
		BLACK(IColorConstant.BLACK), 
		GRAY(IColorConstant.GRAY), 
		BLUE(IColorConstant.BLUE), 
		GREEN(IColorConstant.GREEN), 
		RED(IColorConstant.RED), 
		YELLOW(IColorConstant.YELLOW), 
		CYAN(IColorConstant.CYAN),
		ORANGE(IColorConstant.ORANGE);

		private final int r, g, b;

		private DefColor(IColorConstant color) {
			this.r = color.getRed();
			this.g = color.getGreen();
			this.b = color.getBlue();
		}

		@Override
		public int getRed() {
			return r;
		}

		@Override
		public int getGreen() {
			return g;
		}

		@Override
		public int getBlue() {
			return b;
		}		

	}


	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram) {
		figure.setBackground(Graphiti.getGaService().manageColor(diagram, DefColor.GRAY));
		figure.setForeground(Graphiti.getGaService().manageColor(diagram, DefColor.BLACK));
	}

	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, ContainerShape container) {
		return true;
	}



}
