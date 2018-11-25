package calculator;

/**
 * Enum, to choose the Operator for the calculation.
 * 
 * @author noel.oliveira
 * @since 25.11.2018
 * @version 1.0
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

