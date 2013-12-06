package org.eclipselabs.xdiagram.provider.internal;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class UItest {

    protected Shell shell;
    private Label   label;

    public static void main(String[] args) {
        try {
            UItest window = new UItest();
            window.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void open() {
        Display display = Display.getDefault();
        createContents();
        shell.open();
        shell.layout();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }

    protected void createContents() {
        shell = new Shell();
        shell.setSize(450, 300);
        shell.setText("SWT Application");
        shell.setLayout(new GridLayout(1, false));

        Button button = new Button(shell, SWT.NONE);
        button.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent arg0) {
                label.setText(label.getText() + " " + label.getText());
                shell.layout(); // ADDED THIS
            }
        });
        button.setText("New Button");

        label = new Label(shell, SWT.WRAP);
        // SET HORIZONTAL GRAB ON LABEL (FIRST TRUE IN GridData CONSTRUCTOR)
        label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        label.setText("New Label");

        List list = new List(shell, SWT.BORDER);
        list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

    }

    protected Label getLabel() {
        return label;
    }
}