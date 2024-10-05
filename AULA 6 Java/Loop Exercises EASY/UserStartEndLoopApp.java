import javax.swing.JOptionPane;
public class UserStartEndLoopApp{
	public static void main(String[] args){

        //DECLARE VARIABLES
        int startLoop;
        int endLoop;
        String msg;

        // DECLARE OBJECT
        UserStartEndLoop l = new UserStartEndLoop();

        // INPUT
        startLoop = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number to start: "));

        endLoop = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number to finish: "));

        //SET
        l.setStartLoop(startLoop);
        l.setEndLoop(endLoop);

        // PROCESS
        l.computeMsg();
        
        //GET
        msg = l.getMsg();

        // OUTPUT
		JOptionPane.showMessageDialog(null, "Numbers choosen to start: " + startLoop + " and to finish: " + endLoop + " \n List of numbers: \n " +  msg);


    }
}