import javax.swing.JOptionPane;
public class LoopAsk5Numbers{

    //DECLARE VARIABLES
    private int userChoice;
    private String msg;

    // CONSTRUCTOR
    public LoopAsk5Numbers(){
        userChoice = 0;
        msg = "";
    }

    // SET
    public void setUserChoice(int userChoice){
        this.userChoice = userChoice;
    }

    //PROCESS
    public void calculateTotal(){
        userChoice = 0;
        for(int i = 1; i <=5; i = i + 1){
			userChoice = userChoice + Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number "+(i)));
        }
        msg = ("the sum of all user choices is: " + userChoice);
        
    }

    // GET
    public String getMsg(){
        return msg;
    }
}