package calculatrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author Tjlvt
 *
 */
public class NumbersListener implements ActionListener {
	String numberText;
	ValueNeeded object;
/**
 * This is the constructor for the NumbersListener class
 * @param i
 * @param object
 */
	public NumbersListener(String i, ValueNeeded object) {
		numberText = i;
		this.object = object;
	}

	/*
	 * This describes the actions performed when the user click on a Number button
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		number();
		object.getResultLabel().requestFocus();
	}
/**
 * This method is used for every number buttons
 */
	private void number() {
		if (object.isOn()) {
			if (object.isClicEquals()) {
				object.setOperator("");
				object.setOperator2("");
				object.setClicNumber(true);
				object.setClicEquals(false);
				object.getTextOperatorLabel().setText("");
			}
			
			
			if (numberText.equals(".")) {
				if (object.isClicOperator()) {
					object.setText("0.");
					object.getResultLabel().setText(object.getText());
				} else {
					if ((object.getResultLabel().getText()).equals("")) {
						object.setText("0.");
						object.getResultLabel().setText(object.getText());
					} else {
						if ((object.getResultLabel().getText()).indexOf(numberText) == -1) {
							object.getResultLabel().setText(object.getText() + numberText);
							object.setText(object.getResultLabel().getText());
						}
					}
				}
			} else {
				if (!(object.getResultLabel().getText()).equals("0")) {
					object.getResultLabel().setText(object.getText() + numberText);
				} else {
					object.getResultLabel().setText(numberText);
				}
				object.setText(object.getResultLabel().getText());
				object.setClicOperator(false);
				object.setClicNumber(true);
			}
			object.setNumberValue(Double.valueOf(object.getResultLabel().getText()));
		}
	}

}
