/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.text.DecimalFormat;

/**
 *
 * @author noel.oliveira
 */
public class Calculator {
    
    private double number1;
    private Operator operator;

    public void setoperator(Operator operator) {
        this.operator = operator;
    }
    
    public void resetCalc() {
        this.number1 = 0;
        this.operator = null;
    }

    public void setNumber(double number1, Operator operator) {
        this.number1 = number1;
        this.operator = operator;
    }

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

    public String returnResult() {
        DecimalFormat numberFormat = new DecimalFormat("0.####");
        return numberFormat.format(this.number1);
    }
}

