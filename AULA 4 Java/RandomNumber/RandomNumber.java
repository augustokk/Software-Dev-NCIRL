// Create an application that generates a random number 
// The application should then output whether this random number is above or below 10

public class RandomNumber{

    // DECLARE VARIABLES
    private int randomNum;
    private String msg;

    // CONSTRUCTOR
    public RandomNumber(){
        randomNum=1;
        msg = "";
    }

    // SET
    public void setRandomNum(int randomNum){
        this.randomNum=randomNum;
    }

    // PROCESS
    public void checkNumber(){
        if (randomNum >= 10){
            msg = "above or equal 10";
        }
        else if (randomNum < 10){
            msg = "below 10";
        }
    }

    // GET
    public String getMsg(){
        return msg;
    }
}