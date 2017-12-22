package org.eclipse.emf.refactor.refactoring.runtime.ltk.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.domain.ICompareEditingDomain;
import org.eclipse.emf.compare.domain.impl.EMFCompareEditingDomain;
import org.eclipse.emf.compare.ide.ui.internal.configuration.EMFCompareConfiguration;
import org.eclipse.emf.compare.ide.ui.internal.editor.ComparisonEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.change.RefactoringChange;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.command.PreviewCommand;
import org.eclipse.ltk.ui.refactoring.ChangePreviewViewerInput;
import org.eclipse.ltk.ui.refactoring.IChangePreviewViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("restriction")
public class RefactoringPreviewViewer implements IChangePreviewViewer {
	
	private Control previewControl;
	private Composite parent;

	@Override
	public void createControl(Composite parent) {
		this.parent = parent;
	}

	@Override
	public Control getControl() {
		return previewControl;
//		return parent;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setInput(ChangePreviewViewerInput input) {
		System.out.println("===>> change: " + input.getChange());
		if (!(input.getChange() instanceof RefactoringChange)) return;
		RefactoringChange change = (RefactoringChange) input.getChange();
		EObject model1 = (EObject) change.getModifiedElement();
		PreviewCommand previewCommand = 
				new PreviewCommand(change.getRefactoringCommand(), model1);
		change.getEditingDomain().getCommandStack().execute(previewCommand);
		EObject model2 = previewCommand.getRootCopy();
		System.out.println("===>> model1: " + model1);
		System.out.println("===>> model2: " + model2);
		EMFCompare compare = EMFCompare.builder().build();
		Comparison comparison = compare.compare(EMFCompare.createDefaultScope(model2, model1));
		ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(model2, model1, null);
		AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		CompareEditorInput compareEditorInput = 
				new ComparisonEditorInput((EMFCompareConfiguration) new CompareConfiguration(),
								comparison, editingDomain, adapterFactory);
		try {
			compareEditorInput.run(new NullProgressMonitor());
			previewControl = compareEditorInput.createContents(parent);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
//	@Override
//	public void setInput(ChangePreviewViewerInput input) {	}

}
