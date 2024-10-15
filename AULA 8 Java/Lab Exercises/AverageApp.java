// Augusto Kuusberg Elias
// Student Number x24126357
// Week 8 - LAB
// Exercise 2
// Write a program that allows a user to enter 5 results for each year of a 4 year course.
// The app should:
// Give an average for each year
// Give a total average

import javax.swing.JOptionPane;
public class AverageApp {

    public static void main(String[] args) {

        // DECLARE VARIABLES
        int numberOfYears = 4;
        int numberOfResults = 5;
        int rows = numberOfYears;
        int columns = numberOfResults;
        double userResult;
        String msgYear;
        String msgTotal;

        // CREATE ARRAY (Without hardcode)
        double[][] results;
        results = new double[rows][columns];

        // DECLARE OBJECT
        Average a = new Average();

        // INPUT (and populate array)
        for (int i = 0; i < rows; i = i + 1) {
            for (int j = 0; j < columns; j = j + 1) {
                userResult =Double.parseDouble(JOptionPane.showInputDialog(null, "Enter result " + (j + 1) + " for the year: " + (i + 1)));
                results[i][j] = userResult;
            }
        }

        // SET
        a.setResults(results);

        // PROCESS
        a.calculateAverage();

        // GET
        msgYear = a.getMsgYear();
        msgTotal = a.getMsgTotal();

        // OUTPUT
        JOptionPane.showMessageDialog(null, msgYear);
        JOptionPane.showMessageDialog(null, msgTotal);
    }
}
