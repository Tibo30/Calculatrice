package calculatrice;
/**
 * 
 * @author Tjlvt
 *
 */
public class MonoOperators extends Buttons {
/**
 * This is the constructor of the MonoOperators class
 * @param i
 * @param x
 * @param y
 * @param object
 */
	public MonoOperators(String i, int x, int y, ValueNeeded object) {
		super(x, y);
		this.setText(i);
		this.addActionListener(new MonoOperatorsListener(i,object));
		
	}
	
}
