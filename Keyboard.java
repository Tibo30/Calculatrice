package calculatrice;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
/**
 * 
 * @author Tjlvt
 *
 */
public class Keyboard implements KeyListener {
Buttons[] tab_button;
	/**
	 * This is the constructor for the Keyboard class
	 * @param tab_button
	 */
	public Keyboard(Buttons[] tab_button) {
		this.tab_button=tab_button;
		
	}

	/**
	 * This describes the action according to the key pressed
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD0 || e.getKeyCode() == KeyEvent.VK_0) {
			tab_button[0].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD1 || e.getKeyCode() == KeyEvent.VK_1) {
			tab_button[1].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD2 || e.getKeyCode() == KeyEvent.VK_2) {
			tab_button[2].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD3 || e.getKeyCode() == KeyEvent.VK_3) {
			tab_button[3].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD4 || e.getKeyCode() == KeyEvent.VK_4) {
			tab_button[4].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD5 || e.getKeyCode() == KeyEvent.VK_5) {
			tab_button[5].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD6 || e.getKeyCode() == KeyEvent.VK_6) {
			tab_button[6].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD7 || e.getKeyCode() == KeyEvent.VK_7) {
			tab_button[7].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD8 || e.getKeyCode() == KeyEvent.VK_8) {
			tab_button[8].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD9 || e.getKeyCode() == KeyEvent.VK_9) {
			tab_button[9].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
			tab_button[16].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
			tab_button[15].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_ADD) {
			tab_button[13].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
			tab_button[14].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			tab_button[17].doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_DECIMAL) {
			tab_button[10].doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
