package calculator;

/**
 * Main class
 * 
 * @author noel.oliveira
 * @since 25.11.18
 * @version 1.0
 */
public class Case {

        public static void main(String[] args) {
            // Starts GUI
            Case gui = new Case();
            gui.show(true);
        }

        /**
         * Function, to show the GUI.
         * 
         * @param visible true if GUI should be opened
         */
        public void show (boolean visible) {
            if (visible) {
                GUI gui = new GUI();
                gui.setVisible(visible);
            } else {
                System.out.println("GUI Visible is false. Please set it to true");
            }
        }    
    
}
