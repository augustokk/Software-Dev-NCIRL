import javax.swing.JOptionPane;

public class LargestArrayApp {
    public static void main(String [] args){

        LargestArray la = new LargestArray();

        int [] data = {1, 2, 300, 100, 200, 5};

        // input
        la.setArray(data);

        // process
        la.computeLargest();

        // output
        int largest = la.getLargest();

        JOptionPane.showMessageDialog(null, "The largest in the array is: " + largest);

    }
}
