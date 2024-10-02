// Augusto Kuusberg Elias
// Student Number x24126357
// Week 4 -LAB
// Exercise 2
// Create an application that takes in a number from a user and outputs whether it is positive or negative

import javax.swing.JOptionPane;
public class PositiveNegativeApp{

    public static void main(String[] args){
        // DECLARE VARIABLES
        int userNumber;
        String msg;

        // DECLARE AND CREATE OBJECTS
        PositiveNegative p = new PositiveNegative();

        // INPUTS 
        userNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type any number: "));

        // SET
        p.setUserNumber(userNumber);

        // COMPUTE
        p.checkNumber();

        // GET
        msg = p.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null,"The number that you selected "+ userNumber + " is " + msg);

    }   
}