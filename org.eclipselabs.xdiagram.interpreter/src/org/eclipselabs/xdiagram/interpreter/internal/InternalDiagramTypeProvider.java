package org.eclipselabs.xdiagram.interpreter.internal;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.platform.IDiagramBehavior;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.eclipselabs.xdiagram.interpreter.internal.Activator.LanguageDescription;


public class InternalDiagramTypeProvider extends AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] providers;

	private GenericFeatureProvider featureProvider;

	public InternalDiagramTypeProvider() {
		featureProvider = new GenericFeatureProvider(this);
		setFeatureProvider(featureProvider);
	}

	@Override
	public final IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		String diagramType = getDiagram().getDiagramTypeId();
		LanguageDescription desc = Activator.getInstance().getLanguageDescription(diagramType);

		if (providers == null)
			providers = new IToolBehaviorProvider[] { new ToolBehaviorProvider(this, desc.createProvider()) };

		return providers;
	}

	@Override
	public final boolean isAutoUpdateAtStartup() {
		return true;
	}

	@Override
	public final boolean isAutoUpdateAtRuntimeWhenEditorIsSaved() {
		return super.isAutoUpdateAtRuntimeWhenEditorIsSaved();
	}

	@Override
	public void init(final Diagram diagram, IDiagramBehavior diagramBehavior) {
		super.init(diagram, diagramBehavior);	

		EObject tmp = FileUtil.loadContents(diagram);

		featureProvider.init();

		// file does not exist
		if(tmp == null) {
			EClass eClass =  featureProvider.getRootClass();
			tmp = eClass.getEPackage().getEFactoryInstance().create(eClass);
		}

		EObject root = tmp;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				try {
					FileUtil.persistEObjectIfEmpty(root, diagram);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		removeUnlinkedShapes(diagram, domain);
		// TODO add shapes?
		featureProvider.getGraphicsProvider().loadDiagram(diagram, root, featureProvider);
	}


	// TODO remove links
	private void removeUnlinkedShapes(final Diagram diagram,
			TransactionalEditingDomain domain) {

		for(Iterator<Shape> it = diagram.getChildren().iterator(); it.hasNext();) {
			Shape shape = it.next();
			PictogramLink link = shape.getLink(); 
			List<EObject> l = link.getBusinessObjects();
			if(l.get(0).eIsProxy()) {
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					public void doExecute() {
						shape.setLink(null);
						removeConnections(diagram, shape);
						diagram.getPictogramLinks().remove(link);
						it.remove();
					}

					private void removeConnections(final Diagram diagram, Shape shape) {
						for(Connection c : Graphiti.getPeService().getAllConnections(shape)) {
							removeLink(diagram, c);
							c.getStart().getOutgoingConnections().remove(c);
							c.getEnd().getIncomingConnections().remove(c);
							diagram.getConnections().remove(c);
						}
					}

					private void removeLink(final Diagram diagram, Connection c) {
						PictogramLink clink = c.getLink();
						if(clink != null)
							diagram.getPictogramLinks().remove(clink);
					}
				});
			}
		}
	}

}
