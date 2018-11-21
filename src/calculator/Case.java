/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author noel.oliveira
 */
public class Case {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Case gui = new Case();
            gui.show(true);
        }

        public void show (boolean visible) {
            if (visible) {
                GUI gui = new GUI();
                gui.setVisible(visible);
            } else {
                System.out.println("GUI Visible is false. Please set it to true");
            }
        }    
    
}
