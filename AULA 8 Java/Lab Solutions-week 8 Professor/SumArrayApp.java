import javax.swing.JOptionPane;

public class SumArrayApp {
    public static void main(String[] args) {
        
        // INPUT 
        // gather data from the user to fill a 3x3 array
        int [][] data = {
            {1,2,3}, // row 0 should equal 6
            {4,5,6}, // row 1 should equal 15
            {7,8,9}  // row 2 should equal 24
        };

        // col 0 should equal 12
        // col 1 should equal 15
        // col 2 should equal 18

        // overall sum should equal 45

        SumArray sa = new SumArray(data);

        // PROCESS
        // compute the sum of the rows
        sa.computeRowSum();

        // sum of the columns
        sa.computeColSum();

        // overall sum
        sa.computeOverallSum();
        


        // OUTPUT
        // display the row sum
        int [] rowSum = sa.getRowSum();
        for(int rowIndex = 0; rowIndex < 3; rowIndex++){
            JOptionPane.showMessageDialog(null, "The sum for row number " + rowIndex + " equals: " + rowSum[rowIndex]);
        }


        // display the column sum
        int [] colSum = sa.getColSum();
        for(int colIndex = 0; colIndex < 3; colIndex++){
            JOptionPane.showMessageDialog(null, "The sum for column number " + colIndex + " equals: " + colSum[colIndex]);
        }

        // display the overall sum
        int overallSum = sa.getOverallSum();
        JOptionPane.showMessageDialog(null, "The overall sum is: " + overallSum);



    }
}
