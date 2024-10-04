import javax.swing.JOptionPane;

public class LoginApp{
    public static void main(String[] args) {
        // DECLARE VARIABLES
        String userName;
        String msg;
        int age;

        // DECLARE OBJECT
        Login l = new Login();

        // INPUT
        userName = JOptionPane.showInputDialog(null, "Enter user name: ");

        age =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter user age: "));

        // SET
        l.setUserName(userName);
        l.setAge(age);

        // PROCESS
        l.computeMsg();

        // GET
        msg = l.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null, msg);
    }
    
    }