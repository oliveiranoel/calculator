package calculator;

import javax.swing.JTextField;

/**
 * handles the textfield for the calculator
 * 
 * @author noel.oliveira
 * @since 25.11.18
 * @version 1.0
 */
public class Display {

    private String digit = "";
    private JTextField textfield;
    private boolean negative;

    public Display(JTextField textfield) {
        this.textfield = textfield;
    }

    /**
     * display the number, which is entered from the user.
     * Checks for lenght, negativity and if the number is 0
     * 
     * @param number number, who is entered from the user
     */
    public void displayNumber(int number) {
        if (!this.digit.equals("") || number != 0) {
            this.digit += String.valueOf(number);
            if (this.digit.length() < 13) {
                if (negative) {
                    textfield.setText("-" + this.digit);
                } else {
                    textfield.setText(this.digit);
                }
            } else {
                textfield.setText("NUMBER TOO BIG");
            }
        }
    }

    /**
     * Used for the CA Button, resets Display and Calculation
     */
    public void deleteDisplay() {
        Calculator calc = new Calculator();
        calc.resetCalc();
        resetDigit();
        textfield.setText("0");
    }

    /**
     * reset the numbers, who are displayed
     */
    public void resetDigit() {
        this.digit = "";
    }

    /**
     * changes the sign for the +/- button
     * 
     * @param negate if the operation should be negate or not
     */
    public void negate(boolean negate) {
        if (!negate) {
            changeSign();
            this.negative = true;
        } else {
            changeSign();
            this.negative = false;
        }
    }

    /**
     * changes the sign in the textfield and calculates it with -1, 
     * to make negative number
     */
    private void changeSign() {
        if("0".equals(textfield.getText())) {
            textfield.setText("-0");
        } else {
            int number = Integer.parseInt(textfield.getText()) * -1;
            textfield.setText(String.valueOf(number));
        }
    }
    
    /**
     * reset the sign, after every operation to be positive number
     */
    public void resetSign() {
        this.negative = false;
    }
}
