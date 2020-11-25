package calculatrice;

import java.awt.Color;

import javax.swing.border.BevelBorder;
/**
 * 
 * @author Tjlvt
 *
 */
public class Specials extends Buttons {
/**
 * This is the constructor for the Specials class (buttons ON-C, +/- and CE)
 * @param i
 * @param x
 * @param y
 * @param object
 */
	public Specials(String i, int x, int y, ValueNeeded object) {
		super(x, y);
		if (i.equals("ON-C")) {
			this.setBackground(Color.RED);
			this.setForeground(new Color(255, 255, 255));
			this.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(105, 105, 105), new Color(255, 0, 0),
					new Color(105, 105, 105), new Color(255, 0, 0)));
		}
		
		this.setText(i);
		this.addActionListener(new SpecialsListener(i,object));
	}

}
