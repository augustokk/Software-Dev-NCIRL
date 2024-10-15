// Augusto Kuusberg Elias
// Student Number x24126357
// Week 8 - LAB
// Exercise 3
// Create a 3x3 array and put set values into the array.
// Sum each row
// Sum each column
// Sum the entire array

import javax.swing.JOptionPane;

public class SumApp {

    public static void main(String[] args) {

        // DECLARE VARIABLES
        int row = 3;
        int column = 3;
        double userNumber;
        String msgRow;
        String msgColumn;
        String msgTotal;

        // CREATE ARRAY
        double[][] userArray = new double[row][column];

        // DECLARE OBJECT
        Sum s = new Sum();

        // INPUT (and populate array)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                userNumber = Double.parseDouble(JOptionPane.showInputDialog(null, " For column: " + (j + 1) + "\n For row " + (i + 1) + "\n Please enter value:  "));
                userArray[i][j] = userNumber;
            }
        }

        // SET
        s.setUserArray(userArray);

        // PROCESS
        s.calculateSum();

        // GET
        msgRow = s.getMsgRow();
        msgColumn = s.getMsgColumn();
        msgTotal = s.getMsgTotal();

        // OUTPUT
        JOptionPane.showMessageDialog(null, msgRow);
        JOptionPane.showMessageDialog(null, msgColumn);
        JOptionPane.showMessageDialog(null, msgTotal);
    }
}
