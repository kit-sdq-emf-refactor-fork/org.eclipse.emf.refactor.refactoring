package comrel.figures;


import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

import comrel.PortMapping;

public class PortMappingFigure extends PolylineConnectionEx {

	PortMapping mapping;

	public PortMapping getMapping() {
		return mapping;
	}

	public void setMapping(PortMapping mapping) {
		this.mapping = mapping;
		mapping.setFigure(this);
	}	

}