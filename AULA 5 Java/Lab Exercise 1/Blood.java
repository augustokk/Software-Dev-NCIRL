// Augusto Kuusberg Elias
// Student Number x24126357
// Week 5 - LAB
// Exercise 1
// Develop an application that allows a user to enter their age and blood type. 
// The app will then display a message outlining which blood groups the user can donate to and receive from. 
// Please note that only 18+ can donate

// INSTANTIABLE CLASS
public class Blood{

    // DECLARE VARIABLES
    private int age;
    private String bloodType;
    private String msg;

    // CONSTRUCTOR
    public Blood(){
        age = 0;
        bloodType = "";
        msg = "Error";
    }

    // SET
    public void setAge(int age){
        this.age = age;
    }

    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }

    // PROCESS
    // We are going to check the user age, if he is older than 18, then we will check the conditions for donation
    // if user is younger than 18 a message will be printed
    // if user select age below 0 or blood type different from A,B,O,AB an error message will be printed
    public void donation(){
        if (age >= 18){

            if (bloodType.equalsIgnoreCase("A")){
            msg = " User can donate to blood types A and AB \n User can receive blood from types A and O";
            }

            else if (bloodType.equalsIgnoreCase("B")){
                msg = " User can donate to blood types B and AB \n User can receive blood from types B and O";
            }

            else if (bloodType.equalsIgnoreCase("AB")){
                msg = " User can donate to blood type AB \n User can receive blood from types A, B, AB and O";
            }

            else if (bloodType.equalsIgnoreCase("O")){
                msg = " User can donate to blood types A, B, O and AB \n User can receive blood from type O";
            }

            else{
                msg = "Invalid blood type entry";
            }
        }

        else if (age < 18 && age > 0){
            msg = "User must be older than 18";
        }

        else{
            msg = "Invalid age entry";
        }
    }

    // GET
    public String getMsg(){
        return msg;
    }
}