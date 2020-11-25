package calculatrice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author Tjlvt
 *
 */
public class SpecialsListener implements ActionListener {
	ValueNeeded object;
	String special;
/**
 * This is the constructor for the SpecialsListener class
 * @param i
 * @param object
 */
	public SpecialsListener(String i, ValueNeeded object) {
		special = i;
		this.object = object;
	}

	/**
	 * This describes the actions performed when the user click on a special button
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (special.equals("ON-C")) {
			object.setText("");
			object.getResultLabel().setText(object.getText());
			object.setNumber(0);
			object.setNumberValue(0);
			object.setOperator("");
			object.setOperator2("");
			object.getTextOperatorLabel().setText(object.getOperator());
			object.setOn(true);
			object.setClicNumber(false);
			object.setClicOperator(false);
			object.setClicEquals(false);
			object.getResultPanel().setBackground(new Color(173, 216, 230));
			

		} else if (special.equals("+/-")) {
			if (object.isOn()) {
				if (!(object.getResultLabel().getText()).equals("0")) {
					object.setNumberSign(Double.valueOf(object.getResultLabel().getText()));
					object.setNumberSign(-object.getNumberSign());
					object.getResultLabel().setText(Double.toString(object.getNumberSign()));
				}
				object.setText(object.getResultLabel().getText());
				object.setNumberValue(object.getNumberSign());
				if (object.isClicEquals()==true) {
					object.setOperator("");
				}
			}

		} else if (special.equals("CE")) {
			if (object.isOn()) {
				object.setNumberValue(0);
				object.setText("0");
				object.getResultLabel().setText(object.getText());
			}
		}
		object.getResultLabel().requestFocus();
	}

}
