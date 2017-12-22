/*
 * 
 */
package comrel.diagram.providers;

import comrel.diagram.part.ComrelDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ComrelDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ComrelDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
