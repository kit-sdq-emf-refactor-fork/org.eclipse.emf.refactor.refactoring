package org.eclipse.emf.refactor.refactoring.xtext.interfaces;

import org.eclipse.emf.refactor.refactoring.interfaces.IDataManagement;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

public interface IXtextDataManagement extends IDataManagement {
	
	public XtextDocument getXtextDocument();

}
