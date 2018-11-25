package calculator;

import java.text.DecimalFormat;

/**
 * Calculation logic is implemented in this class.
 * 
 * @author noel.oliveira
 * @since 25.11.18
 * @version 1.0
 */
public class Calculator {
    
    private double number1;
    private Operator operator;

    public void setoperator(Operator operator) {
        this.operator = operator;
    }
    
    /**
     * reset the whole calculation, is used for de CA Button
     */
    public void resetCalc() {
        this.number1 = 0;
        this.operator = null;
    }

    /**
     * Sets the first number and the calculator.
     * 
     * @param number1 first number to be calculated
     * @param operator operator for the calculation
     */
    public void setNumber(double number1, Operator operator) {
        this.number1 = number1;
        this.operator = operator;
    }

    /**
     * Makes the calculation with the second number, 
     * depending on which case for operator.
     * 
     * @param number2 second number to be calculated
     */
    public void calculate(double number2) {
        int id = this.operator.getId();

        switch (id) {
            case 0:
                this.number1 += number2;
                break;
            case 1:
                this.number1 -= number2;
                break;
            case 2:
                this.number1 *= number2;
                break;
            case 3:
                this.number1 /= number2;
                break;
            case 4:
                this.number1 *= this.number1;
                break;
        }
    }

    /**
     * @return returns the result, with max. 4 digits after comma
     */
    public String returnResult() {
        DecimalFormat numberFormat = new DecimalFormat("0.####");
        return numberFormat.format(this.number1);
    }
}

