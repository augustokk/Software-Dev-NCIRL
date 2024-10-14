import javax.swing.JOptionPane;

public class ResultsApp {
    public static void main(String[] args) {

        // DECLARE VARIABLES
        String[] students = {"Augusto", "Kenia", "Karen"};
        int numModules = 4;

        // DECLARE AND CREATE OBJECTS
        Results results = new Results(students, numModules);

        // INPUT and SET
        results.setResults();

        // GET and OUTPUT
        String output = results.getResults();
        JOptionPane.showMessageDialog(null, output);
    }
}
