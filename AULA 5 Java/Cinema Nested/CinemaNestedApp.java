import javax.swing.JOptionPane;
public class CinemaNestedApp{
    public static void main(String[] args) {
        // DECLARE VARIABLES
        String weekDay;
        int numTickets;
        int age;
        String msg;

        // DECLARE OBJECT
        CinemaNested c = new CinemaNested();

        // INPUT
        weekDay = JOptionPane.showInputDialog(null, "Enter option: weekday or weekend ");

        age =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter user age: "));

        numTickets =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of tickets:  "));

        // SET
        c.setAge(age);
        c.setNumTicket(numTickets);
        c.setWeekDay(weekDay);

        // PROCESS
        c.checkCost();

        // GET
        msg = c.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null, msg);
    
    }
}