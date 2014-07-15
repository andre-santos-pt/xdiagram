package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;

public class UpdateDiagramFeature extends AbstractUpdateFeature {
 
private GraphicsProvider provider;
	
	public UpdateDiagramFeature(IFeatureProvider fp, GraphicsProvider provider) {
		super(fp);
		this.provider = provider;
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		return context.getPictogramElement() instanceof Diagram;
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {

		if(context.getPictogramElement() instanceof Diagram)
			return Reason.createTrueReason();
		else
			return Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		Diagram diagram = (Diagram) context.getPictogramElement();
		provider.update(diagram);
		return true;
	}
} 