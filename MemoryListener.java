package calculatrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author Tjlvt
 *
 */
public class MemoryListener implements ActionListener {
	ValueNeeded object;
	String memory;
/**
 * This is the constructor for the MemoryListener class
 * @param i
 * @param object
 */
	public MemoryListener(String i, ValueNeeded object) {
		memory = i;
		this.object = object;
	}
/**
 * This describes the actions performed when the user click on a memory button
 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (memory.equals("M+")) {
			if (object.isOn() && object.isClicNumber()) {
				object.setNumber1(object.getNumber1() + Double.valueOf(object.getResultLabel().getText()));
				object.setMemory(true);
				object.setText("");
				object.setOperator("");
			}
		} else if (memory.equals("M-")) {
			if (object.isOn() && object.isClicNumber()) {
				object.setNumber1(object.getNumber1() - Double.valueOf(object.getResultLabel().getText()));
				object.setMemory(true);
				object.setText("");
				object.setOperator("");
			}
		} else if (memory.equals("MRC")) {
			if (object.isOn()) {
				if (object.isMemory()) {
					object.setNumberValue(object.getNumber1());
					object.getResultLabel().setText(object.format(object.getNumberValue()));
					object.setText("");
					object.setClicOperator(false);
					object.setClicNumber(true);
				}
			}
		}
		object.getResultLabel().requestFocus();
	}

}
