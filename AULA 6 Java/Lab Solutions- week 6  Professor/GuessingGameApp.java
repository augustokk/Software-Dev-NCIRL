import javax.swing.JOptionPane;

public class GuessingGameApp {
    public static void main(String[] args) {
        
        GuessingGame gg = new GuessingGame();


        for(int guessCount = 0; guessCount < 3 && gg.getCorrect() == false; guessCount++){
            // INPUT
            int number  = Integer.parseInt(JOptionPane.showInputDialog("Please enter a guess for our guessing game (numbers 1 - 10)"));
            gg.setUserNumber(number);

            // PROCESS
            gg.computeResult();

            // OUTPUT
            String answer = gg.getAnswer();
            int computerNumber = gg.getComputerNumber();

            JOptionPane.showMessageDialog(null, "The computer number was " + computerNumber +  ". Your guess gave the following result: " + answer);

        }
        
    }
}
