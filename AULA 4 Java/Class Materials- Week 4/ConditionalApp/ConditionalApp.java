// LESSON EXERCISE

import javax.swing.JOptionPane;
public class ConditionalApp{

    public static void main(String[] args){
        // DECLARE VARIABLES
        int age;
        String msg;

        // DECLARE AND CREATE OBJECTS
        Conditional c = new Conditional();

        // INPUTS
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your current age"));

        // SET 
        c.setAge(age);

        // COMPUTE
        c.computeMsg();

        // GET
        msg=c.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null, msg);

    }

}