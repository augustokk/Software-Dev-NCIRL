
/*@Override

    Create an application that generates an array of 5 random numbers 1-10. 
    The user should then guess a number and the app will tell them how many 
    time that number exists within the array.
} */

public class ArrayGuessingGame {
    private int userNumber;
    private int [] computerNumbers;
    private int matches;

    // constructor
    ArrayGuessingGame(){
        matches = 0;
        computerNumbers = new int [5];

        // this loop goes through each index within the array, and sets it to a random number between 1 and 10
        for(int randIndex = 0; randIndex < 5; randIndex++){
            computerNumbers[randIndex] = 1 + (int)(Math.random() * 10);
        }
    }


    // setters
    public void setUserGuess(int userNumber){
        this.userNumber = userNumber;
    }

    // here we need to count how many numbers match
    public void computeUserGuessVsComputer(){

        // this loop creates an index for each position within the array
        for(int randIndex = 0; randIndex < 5; randIndex++){

            // only increment the number of matches if you find a match within the array
            if(computerNumbers[randIndex] == userNumber){
                matches++;
            }
        }
    }

    public int getMatches(){
        return matches;
    }
}
