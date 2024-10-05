import javax.swing.JOptionPane;
public class LoopAsk5NumbersApp{
	public static void main(String[] args){
        // DECLARE VARIABLES
        int userChoice;
        String msg;

        // DECLARE OBJECT
        LoopAsk5Numbers l = new LoopAsk5Numbers();

        //INPUT
        // NOT SURE IF THIS IS THE CORRECT APPROACH
        userChoice = 0;

        // SET
        l.setUserChoice(userChoice);

        // PROCESS
        l.calculateTotal();

        // GET
        msg = l.getMsg();

        // OUTPUT
        		JOptionPane.showMessageDialog(null, msg);
    }
    }
