import javax.swing.JOptionPane;

public class Results {

    // DECLARE VARIABLES
    private String[] students;
    private int numModules;
    private double[][] results;

    // CONSTRUCTOR
    public Results(String[] students, int numModules) {
        this.students = students;
        this.numModules = numModules;
        results = new double[students.length][numModules];
    }

    // SET
    public void setResults() {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < numModules; j++) {
                results[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter result " + (j + 1) + " for the student: " + students[i]));
            }
        }
    }

    // GET
    public String getResults() {
        StringBuilder resultDetails = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < numModules; j++) {
                resultDetails.append(students[i] + " result #" + (j + 1) + " is: " + results[i][j] + "\n");
            }
        }
        return resultDetails.toString();
    }
}
