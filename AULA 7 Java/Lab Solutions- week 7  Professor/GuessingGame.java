import javax.swing.JOptionPane;

public class GuessingGame {
    private int userNumber;
    private int computerNumber;
    private String answer;     
    private boolean correct; 
    private boolean keepPlaying;
    private int [] oldGuesses;
    private int guessCounter; // this keeps track of how many guesses the user has made

    // this should create a random number between 1 and 10
    GuessingGame(){
        // setting computer number between 1-10
        computerNumber = (int)(Math.random() * 10);
        correct = false;
        keepPlaying = true;
        oldGuesses = new int[100];
        guessCounter = 0;
    }

    // SETTER
    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
        oldGuesses[guessCounter] = userNumber;

        guessCounter++;
    }

    public void setKeepPlaying(boolean keepPlaying){
        this.keepPlaying = keepPlaying;
    }

    // Compute
    // for the computerNumber to store
    // then this method should check if it matches the userNumber
    public void computeResult(){
        
         // setting computer number between 1-10
         computerNumber = (int)(Math.random() * 10);

        if(userNumber == computerNumber){
            answer = "Win";
            correct = true;
        }
        else{
            answer = "Lose";
        }
    }

    // getters
    public String getAnswer(){
        return answer;
    }

    public int getComputerNumber(){
        return computerNumber;
    }

    public boolean getCorrect(){
        return correct;
    }

    public boolean getKeepPlaying(){
        return keepPlaying;
    }

    public void printGuesses(){

        String guesses = "These are your previous guesses:\n";

        for(int guessIndex = 0; guessIndex < guessCounter; guessIndex++){

            guesses += "Guess number " + guessIndex + " was: "+ oldGuesses[guessIndex] + "\n";
        }

        JOptionPane.showMessageDialog(null, guesses);

    }   

}
