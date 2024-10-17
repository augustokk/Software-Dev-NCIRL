public class GuessingGame {
    private int userNumber;
    private int computerNumber;
    private String answer;     

    // this should create a random number between 1 and 10
    GuessingGame(){
        // setting computer number between 1-10
        computerNumber = (int)(Math.random() * 10);
    }

    // SETTER
    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }

    // Compute
    // for the computerNumber to store
    // then this method should check if it matches the userNumber
    public void computeResult(){
        
        if(userNumber == computerNumber){
            answer = "Win";
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

}
