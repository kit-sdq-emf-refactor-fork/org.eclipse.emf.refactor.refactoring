package comrel.util;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import org.eclipse.swt.graphics.Color;

public class Colors {

	/**
	 * Liefert der drei Grundfarben "Red", "Green" und "Blue"
	 * 
	 * @return Liste der Grundfarben
	 */
	public static ArrayList<Color> groundColors() {
		ArrayList<Color> result = new ArrayList<Color>();
		result.add(new Color(null, 255, 0, 0));
		result.add(new Color(null, 0, 255, 0));
		result.add(new Color(null, 0, 0, 255));
		return result;
	}

	/**
	 * Liefert die Mischfarben der drei Grundfarben "Magenta", "Yellow" und
	 * "Cyen"
	 * 
	 * @return Liste aller Mischfarben aus den drei Grundfarben
	 */
	public static ArrayList<Color> groundColors2() {
		ArrayList<Color> result = new ArrayList<Color>();
		result.add(new Color(null, 255, 255, 0));
		result.add(new Color(null, 0, 255, 255));
		result.add(new Color(null, 255, 0, 255));
		return result;
	}

	/**
	 * Liefert zu einem Index eine hier berechnete Farbe Als Grundlage wird der
	 * Farbkreis genommen, indem die Farben zwischen den Farben aus den
	 * einzelnen Mischungen erstellt werden. Jedoch liefert die Methode alle
	 * Farben als Liste, angefangen mit den drei Grundfarben, gefolgt von den
	 * drei Mischfarben, gefolgt von den Mischfarben dieser Farben etc.
	 * 
	 * @param i Index
	 * @return Farbkreis als selbstdefinierte Liste
	 */
	public static ArrayList<Color> getColors(int i) {
		ArrayList<Color> result = new ArrayList<Color>();
		/** mergeList entspricht dem Farbkreis*/
		ArrayList<Color> mergeList = mergeLists(groundColors(), groundColors2());
		result.addAll(groundColors());
		result.addAll(groundColors2());
		int k = 2;
		ArrayList<Color> newColors;
		Color newColor;
		int r;
		int g;
		int b;
		Color one;
		Color two;
		
		/** In der folgenden Schleife werden die Farben des Farbkreises gemischt */
		while (k < i) { // Schleife endet, wenn genug Farben gemisch worden sind
			newColors = new ArrayList<Color>();
			for (int j = 0; j < mergeList.size(); j++) {
				one = mergeList.get(j);
				if (j + 1 < mergeList.size()) {
					two = mergeList.get((j + 1));
				} else {
					two = mergeList.get(0);
				}
				r = (one.getRed() + two.getRed()) / 2;
				b = (one.getBlue() + two.getBlue()) / 2;
				g = (one.getGreen() + two.getGreen()) / 2;
				newColor = new Color(null, r, g, b);
				newColors.add(newColor);
				k++;
				if (k >= i) {
					break;
				}

			}
			mergeList = mergeLists(mergeList, newColors);
			result.addAll(newColors);
		}
		return result;
	}

	/**
	 * Merged zwei Listen gleicher Länge
	 * @param old
	 * @param newColors
	 * @return
	 */
	private static ArrayList<Color> mergeLists(ArrayList<Color> old,
			ArrayList<Color> newColors) {
		ArrayList<Color> result = new ArrayList<Color>();
		result.addAll(old);
		int i = 1;
		for (Color color : newColors) {
			if (i < result.size()) {
				result.add(i, color);
				i += 2;
			} else {
				result.add(color);
			}
		}
		return result;

	}

	
	/**
	 * Mainmethode zum Testen
	 * @param args
	 */
	public static void main(String... args) {

		JFrame frame = new JFrame();

		AttributedTextPane pane = new AttributedTextPane();

		frame.add(pane);
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		int i = 1;
		for (Color color : getColors(200)) {
			String s = "        ";
			if (i++ % 10 == 0) {
				s += "\n";
			}
			pane.append(s, color);
		}

	}

	/** subclass of JTextPane allowing color attributes */
	static class AttributedTextPane extends JTextPane {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1725425425133024244L;
		private DefaultStyledDocument m_defaultStyledDocument = new DefaultStyledDocument();

		/** constructor */
		public AttributedTextPane() {
			this.setDocument(m_defaultStyledDocument);
		}

		/** append text */
		public void append(String string, Color color) {
			try {
				SimpleAttributeSet attr = new SimpleAttributeSet();
				StyleConstants.setBackground(attr,
						new java.awt.Color(color.getRed(), color.getGreen(),
								color.getBlue()));
				StyleConstants.setFontSize(attr, 20);
				m_defaultStyledDocument.insertString(
						m_defaultStyledDocument.getLength(), string, attr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** append text in default color */
		public void append(String string) {
			append(string, new Color(null, 255, 255, 255));
		}
	}
}
