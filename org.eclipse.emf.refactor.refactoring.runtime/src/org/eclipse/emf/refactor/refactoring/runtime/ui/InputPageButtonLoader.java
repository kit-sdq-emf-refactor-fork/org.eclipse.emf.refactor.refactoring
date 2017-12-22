package org.eclipse.emf.refactor.refactoring.runtime.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class InputPageButtonLoader {
	
	private static final String EMF_REFACTOR_INPUT_PAGE_BUTTON = "org.eclipse.emf.refactor.inputpagebutton";
	private static final Object INPUT_PAGE_BUTTON_CREATOR_TAG = "inputpagebuttoncreator";
	private static final String CREATOR_CLASS_TAG = "creatorclass";
	public static final InputPageButtonLoader iNSTANCE = new InputPageButtonLoader();
	private List<IInputPageButtonCreator> inputPageButtonCreatorClasses;
	
	private InputPageButtonLoader() {
		this.inputPageButtonCreatorClasses = loadInputPageButtonCreatorClasses();
	}
	
	private List<IInputPageButtonCreator> loadInputPageButtonCreatorClasses() {
		ArrayList<IInputPageButtonCreator> creatorClasses = new ArrayList<IInputPageButtonCreator>();
		IConfigurationElement[] metricEntry = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(EMF_REFACTOR_INPUT_PAGE_BUTTON);
		
		for (IConfigurationElement element : metricEntry) {
			try {
				if (element.getName().equals(INPUT_PAGE_BUTTON_CREATOR_TAG)) {
					final IInputPageButtonCreator creatorClass = (IInputPageButtonCreator)element.createExecutableExtension(CREATOR_CLASS_TAG);
					creatorClasses.add(creatorClass);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return creatorClasses;
	}

	public List<IInputPageButtonCreator> getInputPageButtonCreatorClasses() {
		return inputPageButtonCreatorClasses;
	}	
}
