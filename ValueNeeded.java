package calculatrice;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * This class is used to have access to all the values needed in the other classes
 * @author Tjlvt
 *
 */
public class ValueNeeded {
	protected boolean memory = false, clicOperator = false, clicNumber = false, clicEquals = false,
			clicEqualsSpecial = false;
	protected boolean on = false;
	protected double resultNumber, number1, numberSign, numberValue;
	protected String operator = "", operator2 = "", text = "";
	JLabel ResultLabel;
	JLabel TextOperatorLabel;
	JPanel ResultPanel;

	public double getResultNumber() {
		return resultNumber;
	}

	public void setResultNumber(double resultNumber) {
		this.resultNumber = resultNumber;
	}

	public double getNumberValue() {
		return numberValue;
	}

	public void setNumberValue(double numberValue) {
		this.numberValue = numberValue;
	}

	public boolean isClicEquals() {
		return clicEquals;
	}

	public void setClicEquals(boolean clicEquals) {
		this.clicEquals = clicEquals;
	}

	public boolean isClicEqualsSpecial() {
		return clicEqualsSpecial;
	}

	public void setClicEqualsSpecial(boolean clicEqualsSpecial) {
		this.clicEqualsSpecial = clicEqualsSpecial;
	}

	public JPanel getResultPanel() {
		return ResultPanel;
	}

	public void setResultPanel(JPanel resultPanel) {
		ResultPanel = resultPanel;
	}

	public JLabel getResultLabel() {
		return ResultLabel;
	}

	public void setResultLabel(JLabel resultLabel) {
		ResultLabel = resultLabel;
	}

	public JLabel getTextOperatorLabel() {
		return TextOperatorLabel;
	}

	public void setTextOperatorLabel(JLabel textOperatorLabel) {
		TextOperatorLabel = textOperatorLabel;
	}

	public double getNumber() {
		return resultNumber;
	}

	public void setNumber(double number) {
		this.resultNumber = number;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumberSign() {
		return numberSign;
	}

	public void setNumberSign(double numberSign) {
		this.numberSign = numberSign;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator2() {
		return operator2;
	}

	public void setOperator2(String operator2) {
		this.operator2 = operator2;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;		
	}

	public ValueNeeded() {
		// TODO Auto-generated constructor stub
	}

	public boolean isMemory() {
		return memory;
	}

	public void setMemory(boolean memory) {
		this.memory = memory;
	}

	public boolean isClicOperator() {
		return clicOperator;
	}

	public void setClicOperator(boolean clicOperator) {
		this.clicOperator = clicOperator;
	}

	public boolean isClicNumber() {
		return clicNumber;
	}

	public void setClicNumber(boolean clicNumber) {
		this.clicNumber = clicNumber;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	/**
	 * This method is used to calculate according to the operator
	 */
	protected void calcul() {
		if (operator.equals("+")) {
			resultNumber += numberValue;
		}

		if (operator.equals("-")) {
			resultNumber -= numberValue;
		}

		if (operator.equals("x")) {
			resultNumber = resultNumber * numberValue;
		}

		if (operator.equals("/")) {
			try {
				resultNumber = resultNumber / numberValue;
			} catch (ArithmeticException e) {
				ResultLabel.setText("0");
			}
		}
	}
	
	/**
	 * This method is used to format the number (used to not display 2.0 but 2)
	 * @param number
	 * @return
	 */
	public String format(double number) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.##########", otherSymbols); 
        String resultFormat = df.format(number);
        return resultFormat;
    }
	
	
}
