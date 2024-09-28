import javax.swing.JOptionPane;
// first we need to import the JOption Pane

public class MessageDialogOutput {
    public static void main(String args[])
    {
        //as we imported the JOptionPane we are going to be able to create a dialog box intstead of message shows in the terminal
        String name = "Augusto" ;

        JOptionPane.showMessageDialog(null, name);
        
    }
}