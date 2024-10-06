// Augusto Kuusberg Elias
// Student Number x24126357
// Week 7 - LAB
// Exercise 5
// Return the mean and sum of an array of numbers

import javax.swing.JOptionPane;
public class MeanAndSumArray{

    // DECLARE VARIABLES
    private int sum;
    private double mean;
    private int arraySize;
    private int [] userNumbers;
    private String msg;

    // CONSTRUCTOR
    public MeanAndSumArray(){
    sum = 0;
    mean = 0;
    arraySize = 0;
    msg = "";
    }

    // SET
    // we need to initialize the array
    public void setArraySize(int arraySize){
        this.arraySize = arraySize;
        userNumbers = new int [arraySize];
    }

    // PROCESS
    // we are going to populate the array (userNumbers) with numbers selected by the user
    // we are going to sum each number the user store in the array in the variable sum
    // we are going to calculate the mean of the array dividing the sum by the size of the array
    public void populateArray(){
        for (int i = 0; i < arraySize; i = i + 1){
            userNumbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number: "));
            sum = sum + userNumbers[i];
        }
        mean = sum / arraySize;
        msg = ("\n The total sum is: " + sum + "\n The mean is: " + mean);
    }

    public String getMsg(){
        return msg;
    }
}