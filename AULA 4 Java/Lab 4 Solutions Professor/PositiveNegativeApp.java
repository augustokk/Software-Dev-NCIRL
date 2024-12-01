import javax.swing.JOptionPane;

public class PositiveNegativeApp {
    public static void main(String[] args) {
        
        
        // INPUT
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number:"));
        PositiveNegative pn = new PositiveNegative();

        pn.setNumber(number);

        // PROCESS
        pn.computePositiveNegative();

        // OUTPUT
        // answer will either say positive, negative, or zero
        String answer = pn.getAnswer();

        JOptionPane.showMessageDialog(null, "The number " + number + " is " + answer);

    }
}
