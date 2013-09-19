package org.eclipse.emf.refactor.refactoring.core;

import java.util.LinkedList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.refactor.refactoring.interfaces.IController;
import org.eclipse.emf.refactor.refactoring.interfaces.IGuiHandler;

public class RefactoringLoader {

	/**
	 * Loads a list of Refactoring objects out of the descriptions of
	 * the corresponding extension point servings.
	 * @return Created list of Refactoring objects.
	 */
	public static LinkedList<Refactoring> loadRefactorings() {
		LinkedList<Refactoring> r = new LinkedList<Refactoring>();
		IConfigurationElement[] rawRefactorings = 
				Platform.getExtensionRegistry()
					.getConfigurationElementsFor(ExtensionPointTags.EXTENSION_POINT_NAME);		
		for(IConfigurationElement e : rawRefactorings){
			try {
				if(e.getName().equals(ExtensionPointTags.REFACTORING_TAG)){
					Refactoring ref = createRefactoring(e);
					if(null != ref)r.add(ref);
				}				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		java.util.Collections.sort(r);
		return r;
	}
	
	/**
	 * Creates an Refactoring object out of the description of
	 * the corresponding extension point serving.
	 * @param rawRefactoring description of the corresponding extension 
	 * point serving. 
	 * @return Created Refactoring object.
	 */
	private static Refactoring createRefactoring
									(IConfigurationElement rawRefactoring){	
		try {
			final String id = rawRefactoring.getAttribute(ExtensionPointTags.REFACTORING_ID_TAG);
			final String name = rawRefactoring.getAttribute(ExtensionPointTags.REFACTORING_MENULABEL_TAG);
			IController controller = null;
			IGuiHandler gui = null;
			final String controllerClassName = 
								rawRefactoring.getAttribute(ExtensionPointTags.REFACTORING_CONTROLLER_TAG);
			final String guiClassName = 
								rawRefactoring.getAttribute(ExtensionPointTags.REFACTORING_GUI_TAG);
			final String namespaceUri = 
								rawRefactoring.getAttribute(ExtensionPointTags.REFACTORING_NSURI_TAG);		
			if(controllerClassName.equals(guiClassName)){				
				controller = (IController)rawRefactoring
								.createExecutableExtension(ExtensionPointTags.REFACTORING_CONTROLLER_TAG);
				gui = (IGuiHandler)controller;				
				return 
					new Refactoring
								(id, name, namespaceUri, gui, controller);
				
			} else {
				//Only create gui, controller is lazy loaded:
				gui = (IGuiHandler)rawRefactoring
										.createExecutableExtension(ExtensionPointTags.REFACTORING_GUI_TAG);	
				return 
					new Refactoring
								(id, name, namespaceUri, gui, rawRefactoring);			
			}	
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}
}
