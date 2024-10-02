// Augusto Kuusberg Elias
// Student Number x24126357
// Week 3 Lab 
// Convert any previous example we have done to use instantiable classes
// // Create an application that takes in two variables from a user; their age and the current year. The application should then output the year that they were born.


// that is the program that we will real run
import javax.swing.JOptionPane;
public class BirthYearApp{
public static void main(String[] args) {
    
    // DECLARE VARIABLES
    int currentYear;
    int userAge;
    int birthYear;

    // OBJECT (create new object called add)
    BirthYear birthYearCalculator = new BirthYear();

    // INPUTS (collect user input from box dialog)
    currentYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the current year"));

    userAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your current age"));

    // SET (passing the values of the variables)
    birthYearCalculator.setCurrentYear(currentYear);
    birthYearCalculator.setUserAge(userAge);

    // COMPUTE | PROCESS (calling the method)
    birthYearCalculator.calculateBirthYear();
    
    // GET (retrieve data from the calculation)
    birthYear = birthYearCalculator.getBirthYear();

    // OUTPUT
    JOptionPane.showMessageDialog(null, birthYear);
} 
}