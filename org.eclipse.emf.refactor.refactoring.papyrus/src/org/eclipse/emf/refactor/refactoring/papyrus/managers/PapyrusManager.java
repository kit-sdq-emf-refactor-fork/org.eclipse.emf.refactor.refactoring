package org.eclipse.emf.refactor.refactoring.papyrus.managers;

import org.eclipse.gmf.runtime.notation.Diagram;

public class PapyrusManager {

	private static PapyrusManager instance;
	private Diagram diagram;
	
	private PapyrusManager() {
		setDiagram(null);
		System.out.println("PapyrusManager initialized!");
	}
	
	public static PapyrusManager getInstance() {
		if (instance == null) {
			instance = new PapyrusManager();
		}
		return instance;
	}

	public Diagram getDiagram() {
		return diagram;
	}

	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;
	}
}
