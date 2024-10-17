
import javax.swing.JOptionPane;

//In that code we are reversing the string given by a user and replace any space with a -

public class ReverseApp{

    public static void main(String[] args){

        // VARIABLES
        String userInput;
        String reversed;

        // CREATE OBJECT
        Reverse rev = new Reverse();

        // INPUT
        userInput = JOptionPane.showInputDialog(null, "Enter a message to be reversed: ");

        // SET 
        rev.setUserInput(userInput);

        // COMPUTE
        rev.reverseString();

        // GET
        reversed = rev.getReversed();

        // OUTPUT
        JOptionPane.showMessageDialog(null, reversed);
    }
}