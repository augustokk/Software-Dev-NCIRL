/**
 * Write a program that allows a user to enter 5 results for each year of a 4 year course. The app should:

Give an average for each year

Give a total average
 */

import javax.swing.JOptionPane; 

public class GradesApp {
    public static void main(String[] args) {
        

        // INPUT
        // collect user data and store this in an 2D array
        // each year is a row
        // each columns is a separate subject
        int [][] grades = new int[4][5]; // 4 rows for each year and 5 columns for each subject


        // outer loop keeps track of what year I am currently entering data for
        for(int yearIndex=0; yearIndex < grades.length; yearIndex++){

            JOptionPane.showMessageDialog(null, "Please enter grades for year number: " + yearIndex);
            // inner loop keeps track of what subject I am entering a grade for
            for(int subjectIndex=0; subjectIndex<grades[yearIndex].length; subjectIndex++){
                grades[yearIndex][subjectIndex] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a grade for subject number:" + subjectIndex));
            }
        }
        

        // PROCESS
        Grades gr = new Grades();
        gr.setGrades(grades);

        // compute the average for each year (each row of the array)
        gr.computeAnnualAverage();


        // compute the overall average (do this for every index inside the array)
        gr.computeOverallAverage();


        // OUTPUT
        // this should just be the annual average grade
        int [] annualAverage = gr.getAnnualAverage();
        
        for(int yearIndex=0; yearIndex < annualAverage.length; yearIndex++){
            JOptionPane.showMessageDialog(null, "The average grade for year " + yearIndex + " was: " + annualAverage[yearIndex]);
        }

        // also the overall average from all years
        int overallAverage = gr.getOverallAverage();
        JOptionPane.showMessageDialog(null, "The overall average grade is: " + overallAverage);

    }
}
