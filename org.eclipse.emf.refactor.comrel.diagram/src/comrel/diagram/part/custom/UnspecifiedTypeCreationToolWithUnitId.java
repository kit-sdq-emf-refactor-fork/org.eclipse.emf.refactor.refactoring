package comrel.diagram.part.custom;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import comrel.diagram.part.ComrelPaletteFactory;

/**
 * erstellt einen unspezifiziertes CreationTool mit UnitId
 * @author Gerrit
 *
 */
public class UnspecifiedTypeCreationToolWithUnitId extends UnspecifiedTypeCreationTool {

	String unitId ="";
	
	public UnspecifiedTypeCreationToolWithUnitId(List elementTypes, String unitId) {
		super(elementTypes);
		this.unitId = unitId;
	}
	
	public String getUnitId(){
		return this.unitId;
	}
	
	/**
	 * Erstellt einen Request, fügt ihm vorher noch die UNIT_ID hinzu
	 */
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		request.getExtendedData().put(ComrelPaletteFactory.UNIT_ID, unitId);
		return request;
	}
	
}