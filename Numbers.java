package calculatrice;
/**
 * 
 * @author Tjlvt
 *
 */
public class Numbers extends Buttons {
/**
 * This is the constructor for the Numbers class
 * @param i
 * @param x
 * @param y
 * @param object
 */
	public Numbers(String i, int x, int y, ValueNeeded object) {
		super(x, y);
		this.setText(i);
		this.addActionListener(new NumbersListener(i,object));

	}

}
