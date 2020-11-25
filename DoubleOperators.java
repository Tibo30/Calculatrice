package calculatrice;

/**
 * 
 * @author Tjlvt
 *
 */
public class DoubleOperators extends Buttons {

	/**
	 * This is the constructor for the class DoubleOperators
	 * @param i
	 * @param x
	 * @param y
	 * @param object
	 */
	public DoubleOperators(String i, int x, int y, ValueNeeded object) {
		super(x, y);
		if (i.equals("+")) {
			this.setBounds(x, y, 57, 91);
		}
		if (i.equals("=")) {
			this.setVisible(true);
		}
		this.setText(i);
		// We add an ActionListener for when the user click on the button
		this.addActionListener(new DoubleOperatorsListener(i, object));
	}

}
