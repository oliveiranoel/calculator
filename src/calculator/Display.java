/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JTextField;

/**
 *
 * @author noel.oliveira
 */
public class Display {
    private String digit = "";
    private JTextField text1;
    private boolean negative;

    public Display(JTextField text1) {
        this.text1 = text1;
    }
    
    public void displayNumber(int number) {
        if ( !this.digit.equals("") || number != 0 ) {
            this.digit += String.valueOf(number);
            if (negative) {
                text1.setText("-" + this.digit);
            } else {
                text1.setText(this.digit);
            }
        }
    }
    
    public void deleteDisplay() {
        Calculator calc = new Calculator();
        calc.resetCalc();
        resetDigit();
        text1.setText("0");
    }
    
    public void resetDigit() {
        this.digit = "";
    }
    
   /**
    * 
    * @param negate 
    */
    public void negate ( boolean negate )
    {
        if ( !negate ) {
            changeSign();
            this.negative = true;
        } else {
            changeSign();
            this.negative = false;
        }
    }
    
    private void changeSign () {
        int number = Integer.parseInt(text1.getText()) * -1;
        text1.setText(String.valueOf(number));
    }
}
