package calculatrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Tjlvt
 *
 */
public class DoubleOperatorsListener implements ActionListener {
	String numberText;
	ValueNeeded object;

	/**
	 * This is the constructor of the DoubleOperatorsListener class.
	 * @param i
	 * @param object
	 */
	public DoubleOperatorsListener(String i, ValueNeeded object) {
		this.object = object;
		this.numberText = i;
	}

	/**
	 * In this method we describe the actionPerformed for every buttons from this class.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {

		switch (numberText) {
		case "=":
			object.setOperator2("");
			break;
		case "\u00F7":
			object.setOperator2("/");
			break;
		case "x":
			object.setOperator2("x");
			break;
		case "-":
			object.setOperator2("-");
			break;
		case "+":
			object.setOperator2("+");
			break;
		}

		doubleOperator();
		if (numberText.equals("=")) {
			object.setClicEquals(true);
		}
		object.getResultLabel().requestFocus();

	}

	/**
	 * This is the method used for every doubleOperator Buttons.
	 */
	private void doubleOperator() {
		if (object.isOn() && object.isClicNumber()) {
			if (object.isClicOperator() == false || object.isClicEquals() == true) {
				if (object.isClicEquals() == true && !(object.getOperator2()).equals("")) {
					object.setClicEqualsSpecial(true);
					object.setNumberValue(Double.valueOf(object.getResultLabel().getText()));
				} else {
					object.setClicEqualsSpecial(false);
				}

				if (!(object.getOperator()).equals("") && object.isClicEqualsSpecial() == false) {
					object.calcul();
				} else {
					object.setResultNumber(object.getNumberValue());
				}
				object.getResultLabel().setText(object.format(object.getResultNumber()));
				object.getTextOperatorLabel().setText(object.getOperator2());
				object.setText("");
				object.setClicOperator(true);

				if (object.getOperator2().equals("")) {
					object.getTextOperatorLabel().setText("=");
					object.setOperator2(object.getOperator());
				}
			} else if (object.isClicOperator() == true && object.getOperator2().equals("")) {
				object.setResultNumber(object.getNumberValue());
				object.calcul();
				object.getResultLabel().setText(object.format(object.getResultNumber()));
				object.getTextOperatorLabel().setText("=");
				object.setOperator2(object.getOperator());
			} else {
				object.getTextOperatorLabel().setText(object.getOperator2());
			}
			object.setOperator(object.getOperator2());
			object.setClicEquals(false);
			object.setClicEqualsSpecial(false);
			
		}
	}

}
