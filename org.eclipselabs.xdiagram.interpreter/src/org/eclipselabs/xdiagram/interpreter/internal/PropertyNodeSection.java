/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipselabs.xdiagram.interpreter.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.internal.features.UpdateNodeFeature;

public class PropertyNodeSection extends GFPropertySection implements ITabbedPropertyConstants {

	private TabbedPropertySheetWidgetFactory factory;
	private Composite composite;
	//	private Text nameText;
	private List<Control> attValues;
	private List<Label> attLabels;

	//	private GraphicsProvider graphicsProvider;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		factory = getWidgetFactory();
		composite = factory.createPlainComposite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));


		// factory.createCLabel(composite, "ToString:"); //$NON-NLS-1$

		//		nameText = factory.createText(composite, ""); //$NON-NLS-1$
		//		nameText.setEditable(false);



		//		try{
		//			Object obj = this.getDiagramTypeProvider().getFeatureProvider();
		//			GenericFeatureProvider provider = (GenericFeatureProvider)obj;
		//			IUpdateFeature update = provider.getUpdateFeature(null);
		//		}
		//		catch(Exception ex){
		//			ex.printStackTrace();
		//		}
	}

	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			EObject eObject = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);

			if (eObject == null)
				return;

			EClass eClass = eObject.eClass();
			if(attLabels == null) {
				attLabels = new ArrayList<Label>();
				attValues = new ArrayList<Control>();
			}
			else {
				for(Label label : attLabels)
					label.dispose();

				for(Control control : attValues)
					control.dispose();

				attLabels.clear();
				attValues.clear();
			}

			String name = eObject.toString();

			Label toStringLabel =  new Label(composite, SWT.NONE);
			toStringLabel.setText("To String:");
			attLabels.add(toStringLabel);

			Text toStringText = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
			toStringText.setText(name == null ? "" : name);
			attValues.add(toStringText);

			for(EAttribute att : eClass.getEAllAttributes()) {
				//				attLabels.add(factory.createCLabel(composite, att.getName() + ":"));
				Label l = new Label(composite, SWT.NONE);
				l.setText(att.getName() + ":");
				attLabels.add(l);
				createControl(eObject, att);
			}

			//$NON-NLS-1$

			composite.layout();
			composite.getParent().redraw();
			composite.getParent().layout();
		}
	}

	private void createControl(final EObject eObject, final EAttribute att) {
		Control control = null;

		Object obj = eObject.eGet(att);
		if(att.getEAttributeType().getInstanceClass().equals(boolean.class)) {
			//	control = factory.createButton(composite, "", SWT.CHECK);
			control = new Button(composite, SWT.PUSH);

			final Button button = (Button) control;
			button.setSelection((Boolean) obj);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					executeSetCommand(eObject, att, button.getSelection());
				}
			});
		}

		else if(att.getEAttributeType() instanceof EEnum) {
			//control = factory.createCCombo(composite, SWT.DROP_DOWN);
			final CCombo combo = (CCombo) control;
			EEnum eenum = (EEnum)att.getEAttributeType();
			int pos=0, index=0;
			for ( EEnumLiteral literal : eenum.getELiterals()){
				combo.add(literal.getName());
				if ( literal.getName().equals(obj.toString()) )
					index = pos;
				pos++;
			}
			combo.select(index);
			combo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {					
					EEnum eenum = (EEnum)att.getEAttributeType();
					for ( EEnumLiteral literal : eenum.getELiterals())
						if ( literal.getName().equals(combo.getItem(combo.getSelectionIndex())) )
							executeSetCommand(eObject, att, literal.getInstance());
				}
			});
		}

		// list / enum
		else {
			//			control = factory.createText(composite, obj == null ? "null" : obj.toString());
			final Text text = new Text(composite, SWT.BORDER);
			text.setText(obj == null ? "null" : obj.toString());

			control = text;
			text.setEditable(att.getEAttributeType().getInstanceClass().equals(String.class));
			if(text.getEditable()) {
				control.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.keyCode == SWT.CR) {
							executeSetCommand(eObject, att, text.getText());
						}
					}
				});
			}
			
			final Adapter adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification notification) {
					if(att.equals(notification.getFeature()))
						text.setText(notification.getNewStringValue());
				}
			};
			
			eObject.eAdapters().add(adapter);
			text.addDisposeListener(new DisposeListener() {
				
				@Override
				public void widgetDisposed(DisposeEvent e) {
					eObject.eAdapters().remove(adapter);
				}
			});
		}
		attValues.add(control);	
	}

	private void executeSetCommand(final EObject eObject, final EAttribute att, final Object value) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eObject);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				eObject.eSet(att, value);
			}
		});

		//		domain.getCommandStack().execute(new RecordingCommand(domain) {
		//			
		//			@Override
		//			protected void doExecute() {
		//				try{	
		//					eObject.eSet(att, value);
		//				}
		//				catch(Exception ex){
		//					ex.printStackTrace();
		//				}
		//			}
		//		});

		//		domain.getCommandStack().execute(new RecordingCommand(domain) {
		//			
		//			@Override
		//			protected void doExecute() {
		//				//---------------------------
		//				try{	
		//					eObject.eSet(att, value);
		//				}catch(Exception ex){
		//				}
		//				
		//				//this.getDiagramEditor().refreshRenderingDecorators(pe);
		//				try{					
		//					PictogramElement pe = getSelectedPictogramElement();
		//					for (UpdateNodeFeature feature :  UpdateNodeFeature.getInstances()){
		//						//feature.update(pe);
		//						feature.update(new UpdateContext(pe));
		////						getDiagramEditor().executeFeature(feature, new UpdateContext(pe));
		//					}
		//					
		//					//new MoveShapeContext((Shape) pe);
		//					
		//					
		//					for (GenericFeatureProvider provider :  UpdateNodeFeature.getProviders()){
		//						//provider.getGraphicsProvider().updateNodeFigure(getDiagram(), (ContainerShape) pe);
		//					}
		//					
		////					getDiagramEditor().refresh();
		//					
		//					//updatePictogramElement(pe);
		////					ContainerShape container0 = ((Shape) pe).getContainer(); //(ContainerShape) pe;
		////					ContainerShape container = (ContainerShape) pe;
		////					graphicsProvider.updateNodeFigure(getDiagram(), container);
		//				}catch (Exception ex){
		//					
		//				}
		//				//this.getDiagramTypeProvider().getFeatureProvider().updateIfPossible(null);
		////				GraphicsAlgorithm figure = context.getPictogramElement().getGraphicsAlgorithm();
		////		    	figure.setX(context.getX());
		////		        figure.setY(context.getY());
		////		    	ContainerShape container = (ContainerShape) context.getPictogramElement();
		////		    	provider.getGraphicsProvider().updateNodeFigure(getDiagram(), container);
		//				//---------------------------
		//				
		//			}
		//		});
	}
}
