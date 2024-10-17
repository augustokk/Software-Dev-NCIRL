import javax.swing.JOptionPane;
public class CinemaApp {
    public static void main(String[] args) {
        
        Cinema transaction = new Cinema();

        //INPUT
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));
        int numberOfTickets = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of tickets you require:"));

        transaction.setAge(age);
        transaction.setNumberOfTickets(numberOfTickets);

        // PROCESS
        transaction.computeOverallPrice();

        // OUTPUT
        int price = transaction.getOverallTicketPrice();
        JOptionPane.showMessageDialog(null, "This transaction cost: " + price);

    }
}
