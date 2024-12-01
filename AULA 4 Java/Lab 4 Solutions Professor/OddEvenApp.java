import javax.swing.JOptionPane;

public class OddEvenApp {
    public static void main(String[] args) {
        
        OddEven oe = new OddEven();

        // INPUT
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number:"));
        oe.setNumber(number);

        // PROCESS
        oe.computeOddEven();


        // OUTPUT
        // answer will either say odd or even
        String answer = oe.getAnswer();

        JOptionPane.showMessageDialog(null, "The number " + number + " is " + answer);

        


    }
}
