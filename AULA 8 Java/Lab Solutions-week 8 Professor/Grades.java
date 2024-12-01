import javax.swing.JOptionPane;

public class Grades {
    int [][] grades;
    int [] annualAverage;
    int overallAverage;
    


    // SETTER
    public void setGrades(int [][] grades){
        this.grades = grades; 
        this.annualAverage = new int[grades.length];
    }

    // COMPUTE the annual average
    public void computeAnnualAverage(){
        // outer loop keeps track of what year I am currently entering data for
        for(int yearIndex=0; yearIndex < grades.length; yearIndex++){

            int sum = 0;
            
            // inner loop keeps track of what subject I am entering a grade for
            for(int subjectIndex=0; subjectIndex<grades[yearIndex].length; subjectIndex++){
                sum += grades[yearIndex][subjectIndex]; // adding the grades for that particular year
            }

            annualAverage[yearIndex] = sum / grades[yearIndex].length; // compute the average and store it in an array for that year
        }
    }

    public void computeOverallAverage(){
        int sum = 0;

        int gradeCount = 0; 
        // outer loop keeps track of what year I am currently entering data for
        for(int yearIndex=0; yearIndex < grades.length; yearIndex++){

            // inner loop keeps track of what subject I am entering a grade for
            for(int subjectIndex=0; subjectIndex<grades[yearIndex].length; subjectIndex++){
                sum += grades[yearIndex][subjectIndex]; // adding the grades for that particular year
                gradeCount++;
            }
        }

        overallAverage = sum / gradeCount; // if you wanted you could get grade count by multiplying the number of rows by number of columns
        
    }


    // GETTERS
    public int[] getAnnualAverage(){
        return annualAverage;
    }

    public int getOverallAverage(){
        return overallAverage;
    }    
}
