import javax.swing.JOptionPane;
// first we need to import the JOption Pane

public class MessageDialogInputInteger {
    public static void main(String args[])
    {
        //as we imported the JOptionPane we are going to be able to create a dialog box intstead of message shows in the terminal
        // here we are going to ask for the user to write an integer
        int num1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Please type an integer:") );

        // here  we are going to show his number in a dialog box
        JOptionPane.showMessageDialog(null, num1);

        // here we are going to ask for the user to write an double
        double num2 =Double.parseDouble(JOptionPane.showInputDialog(null, "Please type an double:") );

        // here  we are going to show his number in a dialog box
        JOptionPane.showMessageDialog(null, num2);
        
    }
}