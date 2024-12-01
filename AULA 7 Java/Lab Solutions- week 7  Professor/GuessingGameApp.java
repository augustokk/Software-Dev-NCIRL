import javax.swing.JOptionPane;

public class GuessingGameApp {
    public static void main(String[] args) {
        
        GuessingGame gg = new GuessingGame();


        while(gg.getKeepPlaying() && gg.getCorrect() == false){
            // INPUT
            int number  = Integer.parseInt(JOptionPane.showInputDialog("Please enter a guess for our guessing game (numbers 1 - 10)"));
            gg.setUserNumber(number);

            // PROCESS
            gg.computeResult();

            // OUTPUT
            String answer = gg.getAnswer();
            int computerNumber = gg.getComputerNumber();

            JOptionPane.showMessageDialog(null, "The computer number was " + computerNumber +  ". Your guess gave the following result: " + answer);

            if(!gg.getCorrect()){
                // ask the user if they want to keep playing? if they do not, then set keep playing to false
                String playerWantsToPlay = JOptionPane.showInputDialog(null,"Do you want to keep playing, type y for yes:");
                if(!playerWantsToPlay.equalsIgnoreCase("y")){
                    gg.setKeepPlaying(false);
                }
            }
            

        }

        gg.printGuesses();
        
    }
}
