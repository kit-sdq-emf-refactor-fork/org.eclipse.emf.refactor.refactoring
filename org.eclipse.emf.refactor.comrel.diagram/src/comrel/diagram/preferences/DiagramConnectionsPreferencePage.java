/*
 * 
 */
package comrel.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import comrel.diagram.part.ComrelDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(ComrelDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
