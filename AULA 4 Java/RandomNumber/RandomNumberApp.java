
// Create an application that generates a random number 
// The application should then output whether this random number is above or below 10

import javax.swing.JOptionPane;
public class RandomNumberApp{

    public static void main(String[] args){
        // DECLARE VARIABLES
        int randomNum;
        String msg;

        // DECLARE AND CREATE OBJECTS
        RandomNumber rn = new RandomNumber();

        // INPUTS
        randomNum = (int) (Math.random() * 20);
    
        // SET 
        rn.setRandomNum(randomNum);

        // COMPUTE
        rn.checkNumber();

        // GET 
        msg= rn.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null, ("The random number is " + randomNum + " and it is " + msg));
    }

    }

