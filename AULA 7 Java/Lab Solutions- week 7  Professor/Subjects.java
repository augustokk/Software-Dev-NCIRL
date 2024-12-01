import javax.swing.JOptionPane;

public class Subjects {
    int numberOfSubjects;
    int sumOfGrades; 
    int averageGrade; // the average = sum / total number of grades (subjects)
    String letterGrade; 
    int [] grades;

    // SETTERS
    public void setNumberOfSubjects(int numberOfSubjects){
        this.numberOfSubjects = numberOfSubjects;
        this.grades = new int[numberOfSubjects];
    }

    public void setGrades(){

        // keep track of each grade and add it to the total number of grades
        // this will be used to calculate the average later in the compute method below
        for(int subjectNumber = 0; subjectNumber < numberOfSubjects; subjectNumber++){
            int grade = Integer.parseInt(JOptionPane.showInputDialog(null,"What grade did you get in subject number " + (subjectNumber+1) +":"));
            sumOfGrades += grade; 
            grades[subjectNumber] = grade; 
        }
    }

    // compute the average grades
    // the average = sum / total number of grades (subjects)
    public void computeAverageGrade(){
        averageGrade = sumOfGrades / numberOfSubjects; 
    }

    public void computeLetterGrade(){
        if(averageGrade >= 80){
            letterGrade = "A";
        }
        else if(averageGrade >= 70){
            letterGrade = "B";
        }
        else if(averageGrade >= 60){
            letterGrade = "C";
        }
        else if(averageGrade >= 40){
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }
    }

    // GETTERS
    public int getAverageGrade(){
        return averageGrade;
    }

    public String getLetterGrade(){
        return letterGrade;
    }

    public void printGrades(){


        String feedback = "These are the previous grades you have gotten:\n";
        for(int subjectNumber = 0; subjectNumber < numberOfSubjects; subjectNumber++){   
            feedback += "Grade number " + subjectNumber + ": " + grades[subjectNumber] + "\n"; 
        }
        
        computeAverageGrade();
        feedback += "The average grade is: " + averageGrade;

        JOptionPane.showMessageDialog(null, feedback);
    }

}
