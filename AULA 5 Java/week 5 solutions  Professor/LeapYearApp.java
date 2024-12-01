import javax.swing.JOptionPane;

public class LeapYearApp {
    public static void main(String[] args) {
        
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a year"));

        // leap calculator
        Leap leapCalculator = new Leap();

        leapCalculator.setYear(year);

        // compute the result i.e. if it is leap or not
        leapCalculator.computeLeap();

        // get message to say if it is leap or not
        String message = leapCalculator.getMessage();

        JOptionPane.showMessageDialog(null, message);

    }
}
