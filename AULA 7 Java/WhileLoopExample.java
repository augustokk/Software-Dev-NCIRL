
import javax.swing.JOptionPane;

public class WhileLoopExample{
    public static void main(String[] args){
        int userInput = 0;

        while(userInput < 10){
            userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
            System.out.println("Your number is " + userInput );
        }
        
    }
}