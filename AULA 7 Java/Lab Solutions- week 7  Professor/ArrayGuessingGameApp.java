import javax.swing.JOptionPane;

public class ArrayGuessingGameApp {
    public static void main(String args[]){

        ArrayGuessingGame agg = new ArrayGuessingGame();

        // input
        int userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a guess between 1-10 and see how many matches you get with our computer (the computer makes 5 random numbers)"));
        agg.setUserGuess(userGuess);

        // process
        agg.computeUserGuessVsComputer();

        // output
        int matches = agg.getMatches();
        JOptionPane.showMessageDialog(null, "The number of matches was: " + matches);
    }
}
