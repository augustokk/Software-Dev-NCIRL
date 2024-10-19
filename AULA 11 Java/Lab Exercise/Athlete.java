
public class Athlete extends Person {

    // DECLARE VARIABLES
    private String sport;
    private int energyLevel; // New variable to track energy

    // CONSTRUCTOR
    public Athlete(String name, String sport) {
        super(name); // call superclass constructor
        this.sport = sport;
        energyLevel = 100; // full energy at the start
    }

    // Overridden workOut method
    @Override
    public void workOut() {
        // Athlete works out and includes the sport they are doing
        System.out.println(getName() + " is doing " + sport + " workout but still feels okay.");
        energyLevel = energyLevel - 20; // Reduce energy level after workout
    }

    // Method to feed the athlete with a random supplement
    public void feedAthlete() {
        String[] supplements = {"Protein Shake", "Energy Bar", "Vitamins", "Carbohydrate Drink", "Electrolytes"};
        // Randomly select a supplement from the array
        int randomIndex = (int)(Math.random() * supplements.length);
        String selectedSupplement = supplements[randomIndex];

        System.out.println(getName() + " is fed with: " + selectedSupplement);

        energyLevel = energyLevel + 20;
    }

    // New method using nested conditional statements
    public void checkPerformance() {
            if (energyLevel < 40) {
                System.out.println(getName() + " needs a break and their energy level is too low! Performance is poor.");
            } 
            else if (energyLevel >= 40 && energyLevel <= 60) {
                System.out.println(getName() + " needs a break but can still perform moderately.");
            } 
            else {
                System.out.println(getName() + " needs a break but their energy level is good! Performance is still strong.");
            }
    }
}
