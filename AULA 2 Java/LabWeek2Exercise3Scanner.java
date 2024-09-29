// A farmer has asked you to create an application that takes in a number of eggs that has been laid. The application should calculate and output how many 6-egg boxes the farmer needs to purchase to hold the eggs, and how many eggs will be left over.

// import Scanner library
import java.util.Scanner;
public class LabWeek2Exercise3Scanner {
public static void main(String args[]){
// create a class for the Scanner called sc
Scanner sc = new Scanner(System.in);

// write a message in the terminal for the user
System.out.println("Please provide the number of eggs laid: ");

//collect user data using scanner
int numberOfEggs = sc.nextInt();

// constant egg box size
int eggBoxSize = 6;

// process to check how many boxes are needed
int numberOfBoxes = numberOfEggs / eggBoxSize;

// process to check how many eggs will be left over
int eggLeftOver = numberOfEggs % eggBoxSize;

// print how many boxes are needed
System.out.println("Total of boxes needed are: " + numberOfBoxes);

// print how many eggs are left over
System.out.println("Total of eggs left over are: " + eggLeftOver);

    }
}