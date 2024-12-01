import javax.swing.JOptionPane;

public class BloodApp {
    public static void main(String[] args) {
        
        Blood bloodChecker = new Blood();

        // input from user
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));
        String bloodType = JOptionPane.showInputDialog(null, "Please enter your blood type");

        bloodChecker.setAge(age);
        bloodChecker.setBloodType(bloodType);


        // process
        bloodChecker.computeBloodMessages();

        // output
        String bloodReceiveMessage = bloodChecker.getBloodGroupsReceive();
        String bloodDonateMessage = bloodChecker.getBloodGroupsDonate();

        JOptionPane.showMessageDialog(null, bloodReceiveMessage);
        JOptionPane.showMessageDialog(null, bloodDonateMessage);


    }
}
