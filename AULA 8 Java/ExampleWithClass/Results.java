import javax.swing.JOptionPane;

public class Results {

    // DECLARE VARIABLES
    private String[] students;
    private int numModules;
    private double[][] results;
    private String msg;

    // CONSTRUCTOR
    public Results() {
        numModules = 0;
        msg = "";
    }

    // SET
    public void setNumModules(int numModules){
        this.numModules = numModules;
    }

    public void setStudents(String [] students){
        this.students = students;
    }

    public void setResults(double [][] results){
        this.results = results;
    }


    // PROCESS
    public void calculateResult() {
        for (int i = 0; i < students.length; i = i + 1) {
            for (int j = 0; j < numModules; j = j + 1) {
                results[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter result " + (j + 1) + " for the student: " + students[i]));
            }
        }
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < numModules; j++) {
                msg = msg + (students[i] + " result #" + (j + 1) + " is: " + results[i][j] + "\n");
            }
        }
    }

    // GET
    public String getMsg() {
        return msg;
    }
}
