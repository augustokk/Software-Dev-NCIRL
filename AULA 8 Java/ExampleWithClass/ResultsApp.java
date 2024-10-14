import javax.swing.JOptionPane;
public class ResultsApp {
    public static void main(String[] args) {

        // DECLARE VARIABLES
        String[] students = {"Augusto", "Kenia", "Karen"};
        int numModules = 4;
        double[][] results = new double [3][4];
        String msg;

        // DECLARE AND CREATE OBJECTS
        Results r = new Results();

        // SET
        r.setNumModules(numModules);
        r.setStudents(students);
        r.setResults(results);

        // COMPUTE
        r.calculateResult();

        // GET 
        msg = r.getMsg();

        // OUTPUT
        JOptionPane.showMessageDialog(null, msg);
    }
}
