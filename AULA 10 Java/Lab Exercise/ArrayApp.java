// Augusto Kuusberg Elias
// Student Number x24126357
// Week 10 - LAB
// Exercise 1
// Create an instantiable class that generates and returns an array of random numbers based on 3 parameters:
// How large the array should be
// Where the random number range should start
// Where the random number range should end

import javax.swing.JOptionPane;

public class ArrayApp{
    public static void main(String[] args){
        
        // DECLARE VARIABLES
        int [] randomNumbers;
        int arraySize;
        int startRandom;
        int finishRandom;
        String msg;

        //DECLARE OBJECT
        Array a = new Array();

        //INPUTS
        // How large the array should be
        // Where the random number range should start
        // Where the random number range should end
        arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of the array: "));
        startRandom = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number from where the random numbers range should start to populate the array: ")); 
        finishRandom= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number from where the random numbers range should finish to populate the array: "));

        // SET , COMPUTE AND GET 
        randomNumbers = a.createArray(arraySize, startRandom, finishRandom);

        msg = a.createMsg(arraySize, startRandom, finishRandom, randomNumbers);

        // OUTPUT
        JOptionPane.showMessageDialog(null, msg);

    }
}