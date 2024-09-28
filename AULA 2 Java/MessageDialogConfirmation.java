import javax.swing.JOptionPane;
// first we need to import the JOption Pane

public class MessageDialogConfirmation {
    public static void main(String args[])
    {
        //as we imported the JOptionPane we are going to be able to create a dialog box intstead of message shows in the terminal
        // here we are going to ask for the user to write his name 
        String name = JOptionPane.showInputDialog(null, "Please type your name:");

        // here  we are going to show his name in a dialog box
        JOptionPane.showMessageDialog(null, name);
        
        // here we are going to present a dialogue box to confirm his option
        // it is smart to store tha answer as int so we can use it later in if/ else statements, for example
        // as default, yes = 0 no = 1 cancel = 2
        int choice = JOptionPane.showConfirmDialog(null, "Your name was correct printed?");

        // If you want you can see the result of the click of the user as int as mentioned earlier
        JOptionPane.showMessageDialog(null, choice);
    }
}