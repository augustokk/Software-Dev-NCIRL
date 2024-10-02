
import javax.swing.JOptionPane;

// create objects file
// that is the program that we will real run
public class PadraoAulaApp{
public static void main(String[] args) {
    
    // VARIABLES
    int number1;
    int number2;
    int answer;

    // OBJECTS
    PadraoAula add = new PadraoAula();

    // INPUTS
    number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));

    number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a second number"));

    // SET
    add.setNumber1(number1);
    add.setNumber2(number2);

    // COMPUTE
    add.computeAnswer();

    // GET
    answer = add.getAnswer();

    // OUTPUT
    JOptionPane.showMessageDialog(null, answer);

    
}

}