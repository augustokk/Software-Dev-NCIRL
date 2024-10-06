// Augusto Kuusberg Elias
// Student Number x24126357
// Week 7 - LAB
// Exercise 3
// Create an application that generates an array of 5 random numbers 1-10. The user should then guess a number and the app will tell them how many time that number exists within the array.

import javax.swing.JOptionPane;

public class GuessNumberApp{
    public static void main(String[] args){
        
        // DECLARE VARIABLES
        int userNumber;
        int totalGuessed;
        String msg;

        //DECLARE OBJECT
        GuessNumber n = new GuessNumber();

        //INPUT
        userNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));

        // SET
        n.setUserNumber(userNumber);

        // PROCESS
        n.populateArray();

        // GET
        totalGuessed = n.getTotalGuessed();
        msg = n.getMsg();

        //OUTPUT
        JOptionPane.showMessageDialog(null, " This is the user number: " + userNumber +  "\n This are the computer numbers: " + msg + "\n This are the total guessed: " + totalGuessed );
    }
}