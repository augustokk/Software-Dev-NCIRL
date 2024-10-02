// Augusto Kuusberg Elias
// Student Number x24126357
// Week 4 - LAB
// Exercise 2
// Create an application that takes in a number from a user and outputs whether it is positive or negative

// INSTANTIABLE CLASS
public class PositiveNegative{

    // DECLARE VARIABLES
    private int userNumber;
    private String msg;

    // CONSTRUCTOR
    public PositiveNegative(){
        userNumber = 1;
        msg = "";
    }

    // SET
    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }

    // PROCESS
    // we are going to check if the number is higher or lower than 0 that will determine if is positive or negative, if user selects 0 will tell the user that is a neutral number
    public void checkNumber(){
        if(userNumber > 0){
            msg = "Positive";
        }
        else if(userNumber ==0){
            msg = "Neutral neither positive nor negative";
        }
        else{
            msg = "Negative";
        }
    }

    // GET
    public String getMsg(){
        return msg;
    }
}