package comrel.diagram.part.custom;

import java.util.Comparator;

import org.eclipse.gef.palette.ToolEntry;

/**
 * Comparator zum sortieren von ToolEntrys
 * @author Gerrit
 *
 */
public class ToolEntryComparator implements Comparator<ToolEntry> {

	@Override
	public int compare(ToolEntry arg0, ToolEntry arg1) {
		int result = 0;
		result = arg0.getLabel().compareTo(arg1.getLabel());
		if(result == 0) {
			result = arg0.getDescription().compareTo(arg1.getDescription());
		}
		if(result == 0) {
			result = arg0.getId().compareTo(arg1.getId());
		}
		return result;
	}

}
