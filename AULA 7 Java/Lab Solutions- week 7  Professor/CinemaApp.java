import javax.swing.JOptionPane;
public class CinemaApp {
    public static void main(String[] args) {
        
        Cinema transaction = new Cinema();

        //INPUT
        
        int numberOfTickets = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of tickets you require:"));

        transaction.setNumberOfTickets(numberOfTickets);

        for(int currentTicket=0; currentTicket < numberOfTickets; currentTicket++){
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));
            transaction.setAge(age);
            transaction.addTicket();
        }

        
       

        // PROCESS
        transaction.computeOverallPrice();

        // OUTPUT
        String receipt = transaction.printReceipt();
        JOptionPane.showMessageDialog(null, receipt);

    }
}
