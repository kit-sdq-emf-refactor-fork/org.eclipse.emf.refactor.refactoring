package comrel.diagram.edit.parts.custom;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;

/**
 * Selbstdefinierte Labels
 * @author Gerrit
 *
 */
public class Labels {

	public static Label getHelperLabel(){
		Label l = new Label();
		l.setText("Helper Units");
		return l;
	}
	
	public static Label getRefactoringUnitLabel(boolean singular){
		String text = "Refactoring Unit";
		if(!singular) {
			text += "s";
		}
		Label l = new Label();
		l.setText(text);
		return l;
	}
	
	
	public static void setLabels(RectangleFigure compHelper, RectangleFigure compRef,boolean singular) {
		Dimension maximumSize = new Dimension();
		maximumSize.height = 15;
		maximumSize.width = compHelper.getMaximumSize().width;

		Label helperLabel = getHelperLabel();
		helperLabel.setMaximumSize(maximumSize);
		compHelper.add(helperLabel);
		compHelper.setToolTip(getHelperLabel());
		Label refLabel = getRefactoringUnitLabel(singular);
		refLabel.setMaximumSize(maximumSize);

		compRef.add(refLabel);
		compRef.setToolTip(getRefactoringUnitLabel(singular));
	}
}
