// Augusto Kuusberg Elias
// Student Number x24126357
// Week 3 Lab 
// Convert any previous example we have done to use instantiable classes
// Create an application that takes in two variables from a user; their age and the current year. The application should then output the year that they were born.

// INSTANTIABLE CLASS

public class BirthYear{

    // DECLARE VARIABLES
    private int currentYear;
    private int userAge;
    private int birthYear;

    // CONSTRUCTOR (default values)
    public BirthYear(){
        currentYear = 0;
        userAge = 0;
        birthYear = 0;
    }

    // SET (data that I will collect from the user)
    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    }

    public void setUserAge(int userAge){
        this.userAge = userAge;
    }

    // COMPUTE | PROCESS
    // calculation to discover what year the user was born
    public void calculateBirthYear(){
        birthYear = currentYear - userAge;
    }

    // GET (retrieve data from the calculation)
    public int getBirthYear(){
        return birthYear;
    }

}


