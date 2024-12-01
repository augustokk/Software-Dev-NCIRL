import javax.swing.JOptionPane;

public class SubjectsApp {
    public static void main(String args[]) {


        Subjects subCalculator = new Subjects();

        // inputs
        // ask the user how many subjects they have taken
        int numberOfSubjects = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of subjects you have taken:"));
        subCalculator.setNumberOfSubjects(numberOfSubjects);
        subCalculator.setGrades();
        

        // process
        subCalculator.computeAverageGrade();
        subCalculator.computeLetterGrade();

        // OUTPUT
        int averageGrade = subCalculator.getAverageGrade();
        String letterGrade = subCalculator.getLetterGrade();
        JOptionPane.showMessageDialog(null, "Your average grade is: " + averageGrade + " grade: " + letterGrade);
    
        
        subCalculator.printGrades();
    
    }
}
