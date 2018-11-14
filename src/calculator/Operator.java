/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author noel.oliveira
 */
public enum Operator {
    ADDITION ( 0 ),
    SUBTRACTION ( 1 ),
    MULTIPLICATION ( 2 ),
    DIVISION ( 3 ),
    POWER ( 4 );

    private int id;

    Operator( int id ) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

