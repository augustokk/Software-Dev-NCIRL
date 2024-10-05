// Augusto Kuusberg Elias
// Student Number x24126357
// Week 6 - LAB
// Exercise 2
// Create an application that asks a user how many subjects they take, and will then ask what marks (0-100) they got in each subject. 
// The application should then output their average result
// Bonus: Tell the user their grade from A-F based on their results

import javax.swing.JOptionPane;

public class AverageResultApp {
    public static void main(String[] args) {

        // DECLARE VARIABLES
        int numSubjects;
        int marks;
        double sumMarks = 0;
        double average;
        String grade;

        // INPUT
        numSubjects = Integer.parseInt(JOptionPane.showInputDialog("How many subjects are you taking?"));
        
        // PROCESS
        // Check if user selection was acceptable
        if(numSubjects > 0){

            // Collect marks for each subject and sum them
            for (int i = 1; i <= numSubjects; i = i + 1) {
                marks = Integer.parseInt(JOptionPane.showInputDialog("Please enter mark for subject " + i + " (0-100):"));

                // Check if user selection was acceptable and add to sum of marks
                if(marks >= 0 && marks <=100){
                    sumMarks = sumMarks + marks;
                }

                // do not add 1 on the loop if mark is wrong
                else{
                    i = i - 1;
                    JOptionPane.showMessageDialog(null, "Invalid entry");
                }
            }

            // Calculate average
            average = sumMarks / numSubjects;

        // https://www.irelandassignmenthelp.com/blogs/grading-system-ireland/
        // Give grade from A-F based on the average of results (Bonus)
        if (average >= 70) {
            grade = "A";
        } 
        else if (average >= 60 && average <= 69) {
            grade = "B";
        } 
        else if (average >= 50 && average <= 59) {
            grade = "C";
        } 
        else if (average >= 45 && average <= 49) {
            grade = "D'";
        } 
        else if (average >= 40 && average <= 44) {
            grade = "E";
        } 
        else {
            grade = "F";
        }

        // OUTPUT
        JOptionPane.showMessageDialog(null, "Your average marks is: " + average + " \n Your final grade is: " + grade);
        }

        // User select 0 or negative number
        else{
            JOptionPane.showMessageDialog(null, "Invalid entry");
        }

    }
}
