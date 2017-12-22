package comrel.figures;



import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

import comrel.InputPort;

public abstract class InputPortFigure extends RectangleFigure {

	private InputPort port;
	private Label portLabel=null;

	public InputPort getPort() {
		return port;
	}

	public void setPort(InputPort port) {
		this.port = port;
		this.port.setFigure(this);
//		updateFigure();
	}
	
	public void setLabel(String text){
		if(portLabel == null) {
			portLabel = new Label();
			portLabel.setSize(this.getMinimumSize());
			this.removeAll();
			FontData fd = new FontData();
			fd.setHeight(5);
			fd.setStyle(SWT.NORMAL);
			Font f = new Font(null, fd);		
			portLabel.setFont(f);
			this.add(portLabel);
		}
		portLabel.setVisible(true);
		portLabel.setEnabled(true);
		portLabel.setText(text);
	}
	
	public Label getLabel() {
		return portLabel;
	}

	public void updateFigure() {
		if (port != null) {
			String name = port.getName();
			Class type = port.getType();
			String typeName = "";
			if(name == null) {
				name = "";
			}
			if (type != null) {
				typeName = type.getSimpleName();
			}
			setLabel(name + ":" + typeName);
		}
	}	
}
