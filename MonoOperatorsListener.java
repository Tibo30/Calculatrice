package calculatrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author Tjlvt
 *
 */
public class MonoOperatorsListener implements ActionListener {
	String numberText, value;
	ValueNeeded object;
/**
 * This is the constructor of the MonoOperatorsListener class
 * @param i
 * @param object
 */
	public MonoOperatorsListener(String i, ValueNeeded object) {
		numberText = i;
		this.object = object;
	}

	/**
	 * This describe the actions performed when the user click on a mono operator button
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (numberText.equals("%")) {
			value = "1";
		} else if (numberText.equals("\u221A")) {
			value = "2";
		}
		
		monoOperator(value);
		object.getResultLabel().requestFocus();
	}
/**
 * This method is used for every monoOperator button
 * @param value
 */
	private void monoOperator(String value) {
		if (object.isOn() && object.isClicNumber()) {
			double temporaryResult = 0;
			if (object.isClicOperator() == false || object.isClicEquals() == true) {
				if (value == "1") {
					temporaryResult = Double.valueOf(object.getResultLabel().getText()) / 100;
					object.getResultLabel().setText(object.format(temporaryResult));
				} else if (value == "2") {
					if (object.getNumberValue() < 0) {
						object.getResultLabel().setText("Error");
					} else {
						temporaryResult = Math.sqrt(Double.valueOf(object.getResultLabel().getText()));
						object.getResultLabel().setText(object.format(temporaryResult));
					}
				}
				if (object.isClicEquals() == true) {
					object.setResultNumber(temporaryResult);
					object.setClicEqualsSpecial(true);
				} else {
					object.setNumberValue(Double.valueOf(object.getResultLabel().getText()));
				}

			}
			object.setText("");
		}
	}
}
