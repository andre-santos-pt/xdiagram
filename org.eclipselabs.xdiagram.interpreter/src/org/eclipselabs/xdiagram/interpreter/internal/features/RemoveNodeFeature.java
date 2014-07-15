package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.xdiagram.interpreter.internal.GenericFeatureProvider;

public class RemoveNodeFeature extends DefaultRemoveFeature {

	private GenericFeatureProvider provider;

	public RemoveNodeFeature(GenericFeatureProvider provider) {
		super(provider);
		this.provider = provider;
	}
	
	@Override
	public boolean canRemove(IRemoveContext context) {
		PictogramElement pe = context.getPictogramElement();
		return pe.getLink() != null;
	}

	@Override
	public void preRemove(IRemoveContext context) {
		PictogramElement pe = context.getPictogramElement();
		provider.getGraphicsProvider().removeNodeFigure(getDiagram(), pe.getGraphicsAlgorithm());        
		super.preRemove(context);
	}

}
