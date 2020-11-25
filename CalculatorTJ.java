package calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 * 
 * @author Tjlvt
 *
 */
public class CalculatorTJ extends JFrame {
	JLabel ResultLabel;
	JLabel TextOperatorLabel;
	JPanel CalculatePanel = new JPanel();
	JPanel ResultPanel = new JPanel();
	protected JPanel NumbersPanel = new JPanel();
	protected JPanel TwoOpPanel = new JPanel();
	protected JPanel OneOpPanel = new JPanel();
	protected JPanel SolarPanel = new JPanel();
	protected ValueNeeded object = new ValueNeeded(); // The class ValueNeeded is used to have access, by the object
														// from the class, to the values needed for the program

	// We first create a list with the names of the calculator's buttons
	private static final String[] tab_string = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+/-", "ON-C",
			"+", "-", "x", "\u00F7", "=", "%", "\u221A", "CE", "M+", "M-", "MRC" };

	// We then create a list with the coordinates (X and Y) of these buttons
	private static final int[] coordX = { 0, 0, 70, 140, 0, 70, 140, 0, 70, 140, 70, 140, 296, 0, 70, 0, 70, 70, 0, 70,
			226, 86, 156, 16 };
	private static final int[] coordY = { 152, 100, 100, 100, 49, 49, 49, 0, 0, 0, 152, 152, 156, 51, 51, 0, 0, 103, 0,
			0, 156, 156, 156, 156 };

	// We create a table of object buttons from the Buttons class
	private Buttons[] tab_button = new Buttons[tab_string.length];

	/**
	 * this is the method that creates the JFrame CalculatorTJ
	 */
	public CalculatorTJ() {

		this.getContentPane().setLocation(-226, -202);
		this.setBounds(10, 10, 380, 445);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		this.getContentPane().add(CalculatePanel, BorderLayout.CENTER);
		this.setVisible(true);

	}

	/**
	 * Method that creates the display inside the JFrame
	 */
	private void initialize() {

		CalculatePanel.setBackground(Color.DARK_GRAY);
		CalculatePanel.setLayout(null);

		SolarPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, new Color(0, 0, 0), null));
		SolarPanel.setBackground(Color.GRAY);
		SolarPanel.setBounds(110, 10, 150, 39);
		CalculatePanel.add(SolarPanel);
		SolarPanel.setLayout(null);

		ResultPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ResultPanel.setBackground(new Color(95, 158, 160));
		ResultPanel.setBounds(16, 71, 337, 53);
		CalculatePanel.add(ResultPanel);
		ResultPanel.setLayout(null);

		TwoOpPanel.setBorder(null);
		TwoOpPanel.setBackground(Color.DARK_GRAY);
		TwoOpPanel.setBounds(226, 254, 127, 142);
		CalculatePanel.add(TwoOpPanel);
		TwoOpPanel.setLayout(null);

		OneOpPanel.setBorder(null);
		OneOpPanel.setBackground(Color.DARK_GRAY);
		OneOpPanel.setBounds(226, 205, 127, 39);
		CalculatePanel.add(OneOpPanel);
		OneOpPanel.setLayout(null);

		NumbersPanel.setBorder(null);
		NumbersPanel.setBackground(Color.DARK_GRAY);
		NumbersPanel.setBounds(16, 205, 203, 191);
		CalculatePanel.add(NumbersPanel);
		NumbersPanel.setLayout(null);

		ResultLabel = new JLabel("");
		ResultLabel.setForeground(Color.BLUE);
		ResultLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		ResultLabel.setBounds(40, 10, 293, 33);
		ResultPanel.add(ResultLabel);
		ResultLabel.setHorizontalAlignment(JTextField.RIGHT);

		TextOperatorLabel = new JLabel("");
		TextOperatorLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		TextOperatorLabel.setBounds(10, 10, 45, 33);
		ResultPanel.add(TextOperatorLabel);

		object.setResultLabel(ResultLabel);
		object.setTextOperatorLabel(TextOperatorLabel);
		object.setResultPanel(ResultPanel);

		/* This For loop is used to create every buttons.
		According to i (index of tables), each button is created with tab_string,
		coordX, coordY, object by using classes.
		 */
		for (int i = 0; i < tab_string.length; i++) {
			if (i >= 0 && i < 11) {
				tab_button[i] = new Numbers(tab_string[i], coordX[i], coordY[i], object);
				NumbersPanel.add(tab_button[i]);

			} else if (i >= 13 && i <= 16) {
				tab_button[i] = new DoubleOperators(tab_string[i], coordX[i], coordY[i], object);
				TwoOpPanel.add(tab_button[i]);
			} else if (i == 18 || i == 19) {
				tab_button[i] = new MonoOperators(tab_string[i], coordX[i], coordY[i], object);
				OneOpPanel.add(tab_button[i]);
			} else if (i >= 21) {
				tab_button[i] = new Memory(tab_string[i], coordX[i], coordY[i], object);
				CalculatePanel.add(tab_button[i]);
			} else if (i == 17) {
				tab_button[i] = new DoubleOperators(tab_string[i], coordX[i], coordY[i], object);
				TwoOpPanel.add(tab_button[i]);
			} else if (i == 11) {
				tab_button[i] = new Specials(tab_string[i], coordX[i], coordY[i], object);
				NumbersPanel.add(tab_button[i]);
			} else {
				tab_button[i] = new Specials(tab_string[i], coordX[i], coordY[i], object);
				CalculatePanel.add(tab_button[i]);
			}
		}

		// the keyListener is used to have access to the Keyboard
		this.ResultLabel.addKeyListener(new Keyboard(tab_button));
	}
}
