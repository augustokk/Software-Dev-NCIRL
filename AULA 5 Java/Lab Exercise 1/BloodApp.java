// Augusto Kuusberg Elias
// Student Number x24126357
// Week 5 - LAB
// Exercise 1
// Develop an application that allows a user to enter their age and blood type. 
// The app will then display a message outlining which blood groups the user can donate to and receive from. 
// Please note that only 18+ can donate

import javax.swing.JOptionPane;
public class BloodApp{
    public static void main(String[] args) {
        // DECLARE VARIABLES
        int age;
        String bloodType;
        String msg;

        // DECLARE OBJECT
        Blood b = new Blood();

        // INPUT
        age=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age: "));

		bloodType=JOptionPane.showInputDialog(null,"VALID ENTRIES: \n A \n B \n AB \n O \n \n Please enter your blood type:");

        // SET
        b.setAge(age);
        b.setBloodType(bloodType);

        // PROCESS
        b.donation();

        // GET
        msg = b.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null, "User has blood type: " + bloodType + "\n" + msg);
    
    }
}