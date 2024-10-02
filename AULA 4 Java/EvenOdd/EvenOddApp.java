// Augusto Kuusberg Elias
// Student Number x24126357
// Week 4 - LAB
// Exercise 3
// Create an application that takes in a number from a user and outputs whether it is odd or even

import javax.swing.JOptionPane;
public class EvenOddApp{

    public static void main(String[] args){
        // DECLARE VARIABLES
        int userNumber;
        String msg;

        // DECLARE AND CREATE OBJECTS
        EvenOdd e = new EvenOdd();

        // INPUTS 
        userNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type any number: "));

        // SET
        e.setUserNumber(userNumber);

        // COMPUTE
        e.checkNumber();

        // GET
        msg = e.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null,"The number that you selected "+ userNumber + " is " + msg);

    }   
}