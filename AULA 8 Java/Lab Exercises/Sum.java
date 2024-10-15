// Augusto Kuusberg Elias
// Student Number x24126357
// Week 8 - LAB
// Exercise 3
// Create a 3x3 array and put set values into the array.
// Sum each row
// Sum each column
// Sum the entire array

public class Sum{

    // DECLARE VARIABLES
    private String msgRow;
    private String msgColumn;
    private String msgTotal;
    private double totalSum;
    private double[] sumRow = new double [3]; //Declare and create array for rows
    private double[] sumColumn = new double [3]; //Declare and create array for columns
    private double[][] userArray;

    // CONSTRUCTOR
    public Sum() {
        totalSum = 0;
        msgRow = "";
        msgColumn = "";
        msgTotal = "";
    }

    // SET
    public void setUserArray(double[][] userArray) {
        this.userArray = userArray;
    }

    // PROCESS
    public void calculateSum() {
        totalSum = 0; // // always needs to reset the value otherwise it will sum up
        for (int i = 0; i < userArray.length; i = i + 1) {
            sumRow[i] = 0; // // always needs to reset the value otherwise it will sum up
            for (int j = 0; j < userArray[i].length; j = j + 1) {
                sumRow[i] = sumRow[i] + userArray[i][j]; // Sum for each row
                sumColumn[j] = sumColumn[j] +  userArray[i][j]; // Sum for each column
                totalSum = totalSum + userArray[i][j]; // Sum for the entire array
            }

            // Create messages
            msgRow = (msgRow + "Sum of row " + (i + 1) + " is: " + sumRow[i] + "\n");
        }
        msgTotal = ("Total sum of the array is: " + totalSum);

        for (int j = 0; j < sumColumn.length; j = j + 1) {
            msgColumn = (msgColumn + "Sum of column " + (j + 1) + " is: " + sumColumn[j] + "\n");
        }
    }

    // GET
    public String getMsgRow() {
        return msgRow;
    }

    public String getMsgColumn() {
        return msgColumn;
    }

    public String getMsgTotal() {
        return msgTotal;
    }
}
