
import javax.swing.JOptionPane;

public class NumbersApp{
    public static void main(String[] args){
        
        // DECLARE VARIABLES
        int[] initialNumbers = new int [3];
        int[] finalNumbers;

        //DECLARE OBJECT
        Numbers n = new Numbers();

        //INPUT
        for (int i = 0; i < initialNumbers.length; i = i + 1) {
            initialNumbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        }

        // SET
        n.setInitialNumbers(initialNumbers);

        // PROCESS
        n.calculateFinalNumbers();

        // GET
        finalNumbers = n.getFinalNumber();

        //OUTPUT
        n.printMsg();

    }
}