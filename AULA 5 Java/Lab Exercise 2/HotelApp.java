// Augusto Kuusberg Elias
// Student Number x24126357
// Week 5 - LAB
// Exercise 2
// Develop an application that allows the user to book a hotel room. 
// The user should be asked for their name, the required number of nights, and their age. 
// The application should assume that each room costs 90 euro per night and then calculate and output the total cost to confirm the booking. 
// Please note: a booking can only be confirmed if the user is at least 18.

import javax.swing.JOptionPane;
public class HotelApp{
	public static void main(String[] args){
        
        // DECLARE VARIABLES
        int age;
        int numNights;
        String name;
        String msg;


       // DECLARE OBJECT
		Hotel myhotel = new Hotel();

        // INPUT
		age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age: "));

		name = JOptionPane.showInputDialog(null,"Please enter your name: ");

		numNights = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of nights: "));

        // SET
		myhotel.setAge(age);
		myhotel.setNumNights(numNights);
		myhotel.setName(name);

        // PROCESS
		myhotel.finalCost();

        // GET
		msg = myhotel.getMsg();

        // OUTPUT
		JOptionPane.showMessageDialog(null, msg);
	}
}