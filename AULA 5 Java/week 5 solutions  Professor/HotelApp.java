import javax.swing.JOptionPane;

public class HotelApp {
    public static void main(String[] args) {
        
        // compute prices of the night out with this object
        Hotel h = new Hotel();

        // getting the input from the user
        String name =           JOptionPane.showInputDialog(null, "Please enter your name");
        int numberOfNights =    Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of nights you wish to stay"));
        int age =               Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age"));

        h.setName(name);
        h.setNumberOfNights(numberOfNights);
        h.setAge(age);


        // process
        // this message should display how much the night out will cost, and display an error message if the person is too young
        h.computePriceMessage();

        // get the output
        // this should just be the final message computed above
        String message = h.getPriceMessage();

        JOptionPane.showMessageDialog(null, message);

    }
}
