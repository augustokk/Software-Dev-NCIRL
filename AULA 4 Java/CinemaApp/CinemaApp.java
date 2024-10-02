//a program that takes in a user's age and a number of cinema tickets they need. Display the price it will cost for them to buy their tickets based on below
//Under 18: 10 euro
//Over 18: 15 euro

import javax.swing.JOptionPane;

public class CinemaApp{
    public static void main(String[] args) {

        // DECLARE VARIABLES
        int userAge;
        int numTickets;
        String msg;

        // DECLARE AND CREATE OBJECTS
        Cinema c = new Cinema();

        // INPUTS
        userAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your current age"));

        numTickets = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number of tickets"));

        // SET
        c.setUserAge(userAge);
        c.setNumTickets(numTickets);

        // COMPUTE
        c.calculateCost();

        // GET
        msg = c.getMsg();

        //OUTPUT
        JOptionPane.showMessageDialog(null, msg);

    } 
}