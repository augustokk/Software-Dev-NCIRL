// Augusto Kuusberg Elias
// Student Number x24126357
// Week 5 - LAB
// Exercise 2
// Develop an application that allows the user to book a hotel room. 
// The user should be asked for their name, the required number of nights, and their age. 
// The application should assume that each room costs 90 euro per night and then calculate and output the total cost to confirm the booking. 
// Please note: a booking can only be confirmed if the user is at least 18.

public class Hotel{

    // DECLARE VARIABLES
	private int age;
    private int numNights;
	private String name;
	private double cost;
    private String msg;

    // CONSTRUCTOR
	public Hotel(){
		age = 0;
		name = "Client";
		cost = 0.0;
		numNights = 0;
        msg = "Error";
	}

    // SET
	public void setAge(int age){
		this.age = age;
	}

	public void setNumNights(int numNights){
		this.numNights = numNights;
	}

	public void setName(String name){
		this.name = name;
	}

    // PROCESS
	// We are going to check the user age, if he is older than 18, then we will calculate the final price
    // if user is younger than 18 a message will be printed
    // if user select age below 0 error message will be printed
	public void finalCost(){
		if(age>=18){
            cost = numNights * 90;
            msg = name + " the total is $" + cost + " for the total of nigths:" + numNights;
		}
        else if (age< 18 && age > 0){
            msg = "Client must be older than 18";
        }
		else{
            msg = "Invalid entry";
		}
	}

    // GET
	public String getMsg(){
		return msg;
	}
}