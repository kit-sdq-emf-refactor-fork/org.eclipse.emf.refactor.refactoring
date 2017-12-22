/*
 * 
 */
package comrel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import comrel.diagram.part.ComrelVisualIDRegistry;

/**
 * @generated
 */
public class ComrelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7086;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7085;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ComrelNavigatorItem) {
			ComrelNavigatorItem item = (ComrelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ComrelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
