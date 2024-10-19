
public class Person {

    // VARIABLES
    private boolean energy;
    private String name;

    // CONSTRUCTOR
    // Every person need to have a name when created
    // Every person do not have energy when created
    public Person(String name) {
        this.name = name;
        energy = false;
    }

    // SET
    public void setName(String name) {
        this.name = name;
    }

    // COMPUTE
    // Check if the person is tired
    public void checkEnergy() {
        if (energy == true) {
            System.out.println(name + " has energy");
        } 
        else {
            System.out.println(name + " is tired");
        }
    }

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

    // GET
    public String getName() {
        return name;
    }

}
