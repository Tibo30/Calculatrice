package calculatrice;
/**
 * 
 * @author Tjlvt
 *
 */
public class Memory extends Buttons {
/**
 * This is the constructor for the Memory class
 * @param i
 * @param x
 * @param y
 * @param object
 */
	public Memory(String i, int x, int y, ValueNeeded object) {
		super(x, y);
		this.setText(i);
		this.addActionListener(new MemoryListener(i,object));
	}

}
