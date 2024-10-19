// Augusto Kuusberg Elias
// Student Number x24126357
// Week 11 - LAB
// Please check the word document for better explanation of the program

import javax.swing.JOptionPane;

public class PersonMakerApp {

    public static void main(String[] args) {

        // DECLARE VARIABLES
        String userInput = "";
        Character checkChar = ' ';

        // Create a person object
        Person person1 = new Person("John");

        // Create an Athlete object
        Athlete athlete1 = new Athlete("Augusto", "Football");
        Athlete athlete2 = new Athlete("William", "Bodybuilding");

        // INPUT
        // Use while loop, so until the user select only one character, it will keep running
        while (userInput.length() != 1 || !Character.isLetter(checkChar)) {
            userInput = JOptionPane.showInputDialog(null, "Enter one letter to check if there is it in the name:");
            if (userInput == null || userInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a letter."); 
                continue; 
            }
            if (userInput.length() != 1) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter only one letter.");
            }
            checkChar = (char) userInput.charAt(0);
        }

        //STEP 1
        // Check differences or not between methods called with person1 (Superclass) and athlete1 (subclass)

        // Check person1 energy before and after sleep
        System.out.println(person1.getName() + " energy before and after sleep:");
        person1.checkEnergy();
        person1.sleepWell();
        person1.checkEnergy();
        System.out.println("\n");

        // Check person1 energy before and after workout
        System.out.println(person1.getName() + " energy before and after workout:");
        person1.checkEnergy();
        person1.workOut();
        person1.checkEnergy();
        System.out.println("\n");

        // Check how many specific letter is in person1 name
        System.out.println("Number of " + checkChar + " in the name of " + person1.getName() + " : " + person1.countCharInName(checkChar));
        System.out.println("\n");


        // Use inherited methods from Person superclass with athlete object
        // Check athlete1 energy before and after sleep
        System.out.println(athlete1.getName() + " energy before and after sleep:");
        athlete1.checkEnergy();
        athlete1.sleepWell();
        athlete1.checkEnergy();
        System.out.println("\n");

        // Check athlete1 energy before and after workout
        // This will be displayed different result from person, because we override the methos in Athlete subclass
        System.out.println(athlete1.getName() + " energy before and after workout:");
        athlete1.checkEnergy();
        athlete1.workOut();
        athlete1.checkEnergy();
        System.out.println("\n");

        // Check how many specific letter is in athlete1 name
        System.out.println("Number of " + checkChar + " in the name of " + athlete1.getName()  + " : " +  athlete1.countCharInName(checkChar));
        System.out.println("\n");

        // STEP 2
        // Check methods that are specific for athletes
        
        // Check the performance level of athlete2 before and after 1 session of workout
        System.out.println("Check the performance level of " + athlete2.getName() + " before and after 1 session of workout" );
        athlete2.checkPerformance();
        athlete2.workOut();
        athlete2.checkPerformance();
        System.out.println("\n");

        // Check the performance level of athlete2 if he does another session of workout
        System.out.println("Check the performance level of " + athlete2.getName() + " after the second session of workout" );
        athlete2.workOut();
        athlete2.checkPerformance();
        System.out.println("\n");

        // Check the performance level of athlete2 before and after he eats, and what he eats
        System.out.println("Check the performance level of " + athlete2.getName() + " before and after he eats" );
        athlete2.checkPerformance();
        athlete2.feedAthlete();
        athlete2.checkPerformance();
        System.out.println("\n");

        
        // Check the performance level of athlete2 if he eats again, and what he eats
        System.out.println("Check the performance level of " + athlete2.getName() + " after he eats again" );
        athlete2.feedAthlete();
        athlete2.checkPerformance();
        System.out.println("\n");
        
    }
}
