// Augusto Kuusberg Elias
// Student Number x24126357
// Week 4 - LAB
// Exercise 3
// Create an application that takes in a number from a user and outputs whether it is odd or even

// INSTANTIABLE CLASS
public class EvenOdd{

    // DECLARE VARIABLES
    private int userNumber;
    private String msg;

    // CONSTRUCTOR
    public EvenOdd(){
        userNumber = 1;
        msg = "";
    }

    // SET
    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }

    // PROCESS
    // we are going to check if the number is odd or even, when we divided by 2 if remainder is 0 that meas is even, if there is remainder it is odd
    public void checkNumber(){
        if(userNumber % 2 == 0){
            msg = "Even"; 
        } 
        else {
            msg = "Odd";
        }
    }

    // GET
    public String getMsg(){
        return msg;
    }
}