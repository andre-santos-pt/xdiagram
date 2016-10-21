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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class PropertyNodeSection extends GFPropertySection implements ITabbedPropertyConstants {

	private TabbedPropertySheetWidgetFactory factory;
	private Composite composite;
	private Label label;
	private List<Control> attValues;
	private List<Label> attLabels;


	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		factory = getWidgetFactory();
		
		composite = factory.createPlainComposite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));

		label = new Label(composite, SWT.NONE);
		new Label(composite,SWT.HORIZONTAL);
		
		attLabels = new ArrayList<Label>();
		attValues = new ArrayList<Control>();
	}


	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null && pe.getLink() != null) {
			EObject eObject = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			EClass eClass = eObject.eClass();
			
			clear();
			label.setText(eClass.getName());
			//			addToStringDebug(eObject);

			for(EAttribute att : eClass.getEAllAttributes()) {
				Label l = new Label(composite, SWT.NONE);
				l.setText(att.getName());
				l.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
				attLabels.add(l);
				createControl(eObject, att);
			}
		}
		else {
			clear();
		}
		composite.layout();
		composite.update();		
		composite.getParent().layout();
		composite.getParent().pack();

	}



	private void addToStringDebug(EObject eObject) {
		String name = eObject.toString();
		Label toStringLabel =  new Label(composite, SWT.NONE);
		toStringLabel.setText("To String:");
		attLabels.add(toStringLabel);

		Text toStringText = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		toStringText.setText(name == null ? "" : name);
		attValues.add(toStringText);
	}

	private void clear() {
		label.setText("");
		for(Label label : attLabels)
			label.dispose();

		for(Control control : attValues)
			control.dispose();

		attLabels.clear();
		attValues.clear();
	}

	// TODO number support
	private void createControl(final EObject eObject, final EAttribute att) {
		Control control = null;
		Object obj = eObject.eGet(att);

		if(att.getEAttributeType().getInstanceClass().equals(boolean.class))
			control = handleBooleanElement(eObject, att, obj);

		else if(att.getEAttributeType() instanceof EEnum)
			control = handleEnumElement(eObject, att, obj);

		else if(att.getEAttributeType().getInstanceClass().equals(String.class))
			control = handleStringElement(eObject, att, obj);

		attValues.add(control);		
	}


	private Control handleEnumElement(final EObject eObject,
			final EAttribute att, Object obj) {
		Control control;
		control = factory.createCCombo(composite, SWT.DROP_DOWN);
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
		return control;
	}

	private Control handleBooleanElement(final EObject eObject,
			final EAttribute att, Object obj) {
		Control control = factory.createButton(composite, "", SWT.CHECK);
		final Button button = (Button) control;
		button.setSelection((Boolean) obj);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeSetCommand(eObject, att, button.getSelection());
			}
		});
		Adapter adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				if(att.equals(notification.getFeature()))
					button.setSelection(notification.getNewBooleanValue());
			}
		};
		addDisposeListener(eObject, control, adapter);
		return control;
	}

	private Control handleStringElement(final EObject eObject,
			final EAttribute att, Object obj) {
		final Text text = factory.createText(composite, obj == null ? "null" : obj.toString());
		Control control = text;
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
//		GridData data = new GridData(SWT.FILL, SWT.CENTER, true, true);
//		data.horizontalAlignment = GridData.FILL;

//		text.setLayoutData(data);
//		data.horizontalAlignment = GridData.FILL;

		final Adapter adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				if(att.equals(notification.getFeature()))
					text.setText(notification.getNewStringValue());
			}
		};

		addDisposeListener(eObject, control, adapter);
		return control;
	}

	private void addDisposeListener(final EObject eObject, final Control control, final Adapter adapter) {
		eObject.eAdapters().add(adapter);
		control.addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(DisposeEvent e) {
				eObject.eAdapters().remove(adapter);
			}
		});
	}

	private void executeSetCommand(final EObject eObject, final EAttribute att, final Object value) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eObject);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				eObject.eSet(att, value);
			}
		});

	}
}
