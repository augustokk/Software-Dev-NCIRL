import javax.swing.JOptionPane;

public class MeanSumArrayApp {
    public static void main(String [] args){

        MeanSumArray la = new MeanSumArray();

        int [] data = {50, 50, 50, 50, 50, 50};

        // input
        la.setArray(data);

        // process
        la.computeSum();
        la.computeMean();

        // output
        int sum = la.getSum();
        int mean = la.getMean();

        JOptionPane.showMessageDialog(null, "The sum of the array is: " + sum);
        JOptionPane.showMessageDialog(null, "The mean of the array is: " + mean);

    }
}
