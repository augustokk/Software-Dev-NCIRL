// Augusto Kuusberg Elias
// Student Number x24126357
// Week 6 - LAB
// Exercise 4
// Create a guessing game where the computer comes up with a random number and the user guesses (output winner or loser) make it so that a user has 3 turns
// Bonus: The loop should stop if the user gets the correct answer
// Bonus: The game should alter the random number each turn

import java.util.Random;
import javax.swing.JOptionPane;

public class GameApp{
    public static void main(String[] args) {

        // DECLARE VARIABLES
        int userChoice;
        int computerChoice;
        int numUserChances;
        String msg;
        boolean userIsCorrect = false;

        // DECLARE OBJECT
        Random random = new Random();

        // PROCESS
        // Computer change the number each turn (bonus)
        numUserChances = 3;
        while (numUserChances > 0 && !userIsCorrect) {
            computerChoice = random.nextInt(10) + 1;

            // INPUT
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number (1 to 10):"));

            // Check if user selection was acceptable
            if (userChoice >=1 && userChoice <=10){

                // Compare the user number and computer numbers
                // user is correct
                if (userChoice == computerChoice) {
                    msg =  ("You guessed the correct number: \n User choice: " + userChoice + " =  Computer choice: " + computerChoice );
                    userIsCorrect = true; // The loop should stop if the user gets the correct answer (bonus)
                } 

                // user is wrong, reduce 1 chance
                else {
                    numUserChances = numUserChances - 1;
                    msg =  ("Incorrect number \n Your choice: " + userChoice + "\n Computer choice:  " + computerChoice + "\n You have " + numUserChances + " chances");
                }

            // OUTPUT
            JOptionPane.showMessageDialog(null, msg);
            }

            // User select a number bigger than 10 or lower than 1
            else{
                JOptionPane.showMessageDialog(null, "Invalid entry");
            }
        }
    }
}
