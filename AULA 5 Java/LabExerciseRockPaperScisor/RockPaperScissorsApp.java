import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissorsApp {
    public static void main(String args[])
    {
        // DECLARE VARIABLES
        int userChoice;
        int computerChoice;
        String msg;

        // DECLARE OBJECT
        RockPaperScissors game = new RockPaperScissors();
        // CREATE RANDOM OBJECT
        Random random = new Random();

        // INPUT
        userChoice=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your choice:\n 1 - Rock\n 2 - Paper\n 3 - Scissors\n"));

        computerChoice = random.nextInt(3) + 1;


        // SET
        game.setUserChoice(userChoice);
        game.setComputerChoice(computerChoice);


        // PROCESS
        game.resultGame();

        // GET
        msg = game.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null, "User choice: " + userChoice + " computer choice: " + computerChoice + " " + msg);

    }
}