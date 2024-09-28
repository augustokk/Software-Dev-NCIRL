
import javax.swing.JOptionPane;
// first we need to import the JOption Pane


public class MessageDialogInput {
    public static void main(String args[])
    {
        //as we imported the JOptionPane we are going to be able to create a dialog box intstead of message shows in the terminal
        // here we are going to ask for the user to write his name 
        String name = JOptionPane.showInputDialog(null, "Please type your name:") ;

        // here  we are going to show his name in a dialog box
        JOptionPane.showMessageDialog(null, name);
        
    }
}