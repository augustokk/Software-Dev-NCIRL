// Augusto Kuusberg Elias
// Student Number x24126357
// Week 8 - LAB
// Exercise 2
// Write a program that allows a user to enter 5 results for each year of a 4 year course.
// The app should:
// Give an average for each year
// Give a total average

public class Average {

    // DECLARE VARIABLES
    private double total;
    private double totalAverage;
    private double yearAverage;
    private double yearTotal;
    private String msgTotal;
    private String msgYear;

    // DECLARE ARRAY
    private double[][] results;

    // CONSTRUCTOR
    public Average() {
        total = 0;
        totalAverage = 0;
        yearAverage = 0;
        msgTotal = "";
        msgYear = "";
    }

    // SET
    public void setResults(double[][] results) {
        this.results = results;
    }

    // PROCESS
    public void calculateAverage() {
        total = 0; // always needs to reset the value otherwise it will sum up
        for (int i = 0; i < results.length; i = i + 1) {
            yearTotal = 0;  // always needs to reset the value otherwise it will sum up
            for (int j = 0; j < results[i].length; j++) {
                yearTotal = yearTotal + results[i][j]; 
                total = total + results[i][j];
            }
            // To calculate the year average we divided the yearTotal by the total number of columns ( results[i].length)
            yearAverage = yearTotal / results[i].length;
            // Create messages
            msgYear = (msgYear +  "The average for year: " + (i + 1) + " is: " + yearAverage + "\n");
        }
        // To calculate total average based on all results we divided the total by the multiplication of total number of rows (results.length) and total number of columns (results[0].length)
        totalAverage = total / (results.length * results[0].length);
        // Create messages
        msgTotal = ("The total average is: " + totalAverage);
    }

    // GET
    public String getMsgYear() {
        return msgYear;
    }

    public String getMsgTotal() {
        return msgTotal;
    }
}
