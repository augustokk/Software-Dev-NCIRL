
import javax.swing.JOptionPane;

public class DoWhileLoopExample{
    public static void main(String[] args){
        int userInput;

        do{
            userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
            System.out.println("Your number is " + userInput );
        }
        while(userInput < 10);
        
    }
}
