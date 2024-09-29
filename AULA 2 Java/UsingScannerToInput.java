// here we are going to use the scanner library to get inputs from the user

//Create an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour

// import Scanner library
import java.util.Scanner;
public class UsingScannerToInput
{
public static void main(String args[]){
// create a class for the Scanner called sc
Scanner sc = new Scanner(System.in);

// write a message in the terminal for the user
System.out.println("Please provide your monthly wage: ");
//collect user data using scanner
int monthlyWage = sc.nextInt();


// write a message in the terminal for the user
System.out.println("Please provide how many hours per week do you work ");
//collect user data using scanner
int weeklyHours = sc.nextInt();


// do the maths to see how much user make per year
int yearSalary = monthlyWage * 12;

// do the maths to see how much user make per week
int weeklySalary = yearSalary / 52;

// do the maths to see how much user make per hour
int hourSalary = weeklySalary / weeklyHours;


//print the value that user receives per year
System.out.println("The user receives per year " + yearSalary);

//print the value that user receives per hour
System.out.println("The user receives per hour " + hourSalary);

 }
}