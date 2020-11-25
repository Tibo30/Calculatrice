package calculatrice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
/**
 * 
 * @author Tjlvt
 *
 */
public class Buttons extends JButton{
	/**
	 * This is the constructor for the class Buttons
	 * @param x
	 * @param y
	 */
	public Buttons(int x, int y) {
		this.setForeground(Color.BLACK);
		this.setFont(new Font("Tahoma", Font.PLAIN, 22));
		this.setBorder(BorderFactory.createBevelBorder(0));
		this.setBackground(new Color(169, 169, 169));
		this.setBounds(x,y,57,39);
	}

}
