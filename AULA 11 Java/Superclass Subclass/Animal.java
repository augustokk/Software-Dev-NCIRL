// THIS IS A EXAMPLE OF SUPERCLASS SO THAT GENERALIZES WHAT ANIMALS CAN DO FOR EXAMPLE

public class Animal{

    //VARIABLES
    private boolean hunger;
    private String noise;

    // CONSTRUCTOR
    public Animal(){
        hunger = true; // we are setting this as pattern
    }

    // METHODS
    // noise that animal emmits, that receives a parameter and outputs that parameter
    public void animalNoise(String noise){
        this.noise = noise;
        System.out.println(noise);
    }

    // when that method is called a message will e printed and then the pattern hunger = true will be redefined for hunger = false
    public void feed(){
        System.out.println("You feed the animal");
        hunger = false;
    }

    // this method when called will print a message depending of the satet of hunger condition
    public void hungerCheck(){
        if(hunger == true){
            System.out.println("This animal looks hungry");
        }
        else{
            System.out.println("This animal looks satisfied");
        }
    }
}