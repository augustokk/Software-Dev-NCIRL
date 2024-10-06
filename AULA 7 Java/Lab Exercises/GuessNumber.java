// Augusto Kuusberg Elias
// Student Number x24126357
// Week 7 - LAB
// Exercise 3
// Create an application that generates an array of 5 random numbers 1-10. The user should then guess a number and the app will tell them how many time that number exists within the array.

import java.util.Random;
public class GuessNumber{

    // DECLARE VARIABLES
    private int userNumber;
    private int totalGuessed;
    private int [] computerNumbers = new int 
    [5];
    private String msg;


    // CONSTRUCTOR
    public GuessNumber(){
        userNumber = 0;
        totalGuessed = 0;
        msg = "";
        }

    // DECLARE OBJECT 
    // to be able to select a random number
    Random random = new Random();

    // SET
    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }

    // PROCESS
    // we are going to populate the array (computerNumbers) with 5 random numbers from 1 to 10
    // we are going to store that numbers also in a string (msg) to be able to present to the user the computer random numbers
    // using the conditional statement we are going to count how many times that user number exists within the array(totalGuessed).
    public void populateArray(){
        for (int i = 0; i < computerNumbers.length; i = i + 1){
            computerNumbers[i] = random.nextInt(10) + 1;
            msg = (computerNumbers[i] + " ; " + msg);
        }
        
        for(int i = 0; i < computerNumbers.length; i = i + 1 ){
            if (computerNumbers[i] == userNumber){
            totalGuessed = totalGuessed + 1;
            }
        }
    }

    // GET
    public int getTotalGuessed(){
        return totalGuessed;
    }

    public String getMsg(){
        return msg;
    }

}