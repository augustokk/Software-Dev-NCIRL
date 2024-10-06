// Augusto Kuusberg Elias
// Student Number x24126357
// Week 7 - LAB
// Exercise 5
// Return the mean and sum of an array of numbers

import javax.swing.JOptionPane;
public class MeanAndSumArrayApp{
    public static void main(String[] args) {
        
        // DECLARE VARIABLES
        int arraySize;
        String msg;

        // DECLARE OBJECT
        MeanAndSumArray m = new MeanAndSumArray();

        //INPUT
        // The user will determine the size of the array
        arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the size of array: "));

        // SET
        m.setArraySize(arraySize);

        // PROCESS
        m.populateArray();

        // GET
        msg = m.getMsg();

        //OUTPUT
        JOptionPane.showMessageDialog(null, msg);

    }
}