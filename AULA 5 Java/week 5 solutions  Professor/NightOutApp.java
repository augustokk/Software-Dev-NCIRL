import javax.swing.JOptionPane;

public class NightOutApp {
    public static void main(String[] args) {
        
        // compute the location of a night out
        NightOut no = new NightOut();

        // getting the input from the user
        String programme =           JOptionPane.showInputDialog(null, "Please enter name of the programme you are studying under");
        int year =    Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the year of study"));
        
        no.setProgramme(programme);
        no.setYear(year);

        // process
        no.computeLocation();

        // output
        String location = no.getLocation();

        JOptionPane.showMessageDialog(null, "The location for your night out is: " + location);



    }


}