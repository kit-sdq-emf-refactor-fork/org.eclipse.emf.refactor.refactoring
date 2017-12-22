package org.eclipse.emf.refactor.refactoring.runtime.ui;

import org.eclipse.emf.refactor.refactoring.interfaces.IController;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.ui.AbstractRefactoringWizard;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public interface IInputPageButtonCreator {
	
	public Button createButton(
			Composite parent, 
			IController refactoringControler, 
			AbstractRefactoringWizard wizard);
}
