// Augusto Kuusberg Elias
// Student Number x24126357
// Week 11 - LAB
// Please check the word document for better explanation of the program

public class Person {

    // VARIABLES
    private boolean energy;
    private String name;
    private int count;
    private char lowerChar;

    // CONSTRUCTOR
    // Every person need to have a name when created
    // Every person do not have energy when created
    public Person(String name) {
        this.name = name;
        energy = false;
        count = 0;
        lowerChar = ' ';
    }

    // SET
    public void setName(String name) {
        this.name = name;
    }

    // COMPUTE
    // Change the boolean energy when a person sleep well
    public void sleepWell() {
        System.out.println(name + " has a good nigth of sleep");
        energy = true;
    }

    // Change the boolean energy when a person exercise too much
    public void workOut() {
        System.out.println(name + " is doing too much exercises");
        energy = false;
    }

    // Check if the person is tired
    public void checkEnergy() {
        if (energy == true) {
            System.out.println(name + " has energy");
        } 
        else {
            System.out.println(name + " is tired");
        }
    }

    // Method that receive one parameter (character)
    // And returns an int (count)
    // It will check how many specific characters are in the name of the Person
    // independent if is lower or upper case
    public int countCharInName(char character) {
        lowerChar = Character.toLowerCase(character);
        for (int i = 0; i < name.length(); i = i + 1) {
            if (Character.toLowerCase(name.charAt(i)) == lowerChar) {
                count = count + 1;
            }
        }
        return count;
    }

    // GET
    public String getName() {
        return name;
    }

}
