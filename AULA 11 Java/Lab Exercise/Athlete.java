// Augusto Kuusberg Elias
// Student Number x24126357
// Week 11 - LAB
// Please check the word document for better explanation of the program

public class Athlete extends Person {

    // DECLARE VARIABLES
    private String sport;
    private int performanceLevel;
    private int randomNumber;
    private String choosenSupplement;

    // CONSTRUCTOR
    // Get the name from the superclass Person
    // All athletes must have a sport
    // They start with performance level at 100
    public Athlete(String name, String sport) {
        super(name); 
        this.sport = sport;
        performanceLevel = 100; 
    }

    // Overridden workOut method
    // Will include the sport the athlete is doing
    // Will decrease the performance level after the workout
    @Override
    public void workOut() {
        System.out.println(getName() + " is doing " + sport + " workout");
        performanceLevel = performanceLevel - 50; // Reduce performance level after workout
    }

    // Method to feed the athlete
    // Create an array with different supplements
    // Random select a supplement from the array
    // That will  increase the performance level
    public void feedAthlete() {
        String[] supplement = {"Protein Shake", "Energy Bar", "Vitamins", "Carbohydrate Drink", "Electrolytes"};
        randomNumber = (int)(Math.random() * supplement.length);
        choosenSupplement = supplement[randomNumber];
        System.out.println(getName() + " eats " + choosenSupplement);
        performanceLevel = performanceLevel + 50; // Increase performance level after eat
    }

    // Method to check how are the levels of performance
    // Depending on the level number, it will suggest what to do
    public void checkPerformance() {
            if (performanceLevel < 50) {
                System.out.println(getName() + " performance is poor, the athlete needs to eat to restore performance");
            } 
            else if (performanceLevel == 50) {
                System.out.println(getName() + " performance is medium, if the athlete eat, he will get a better performance");
            } 
            else if (performanceLevel > 50){
                System.out.println(getName() + " performance is excellent, the athlete can do another workout");
            }
    }
}
