// Augusto Kuusberg Elias
// Student Number x24126357
// Week 10 - LAB
// Exercise 1
// Create an instantiable class that generates and returns an array of random numbers based on 3 parameters:
// How large the array should be
// Where the random number range should start
// Where the random number range should end

import java.util.concurrent.ThreadLocalRandom;

public class Array{

    // DECLARE VARIABLES
    private int [] randomNumbers;
    private int arraySize;
    private int startRandom;
    private int finishRandom;
    private String arrayNumbers;
    private String msg;

    // CONSTRUCTOR
    public Array(){
        arraySize = 0;
        startRandom = 0;
        finishRandom = 0;
        arrayNumbers = "";
        msg = "";
    }

    // COMBINED METHODS
    // created a method that receives 3 parameters and returns an array
    // the size of the array is the first thing to be defined by the user
    // then we populate the array with random numbers based on a start and end range defined by the user
    // important to add 1 to the variable finishRandom to avoid exclude the last number
    public int [] createArray(int arraySize, int startRandom, int finishRandom){
      randomNumbers = new int [arraySize];

      for (int i = 0; i < randomNumbers.length; i = i + 1) {
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(startRandom, (finishRandom + 1));
        }
        return randomNumbers;
    }

    // created a method that receives 4 parameters and returns an String
    // as we already collected the data from the user and populated the array, now we are going to create the output message to the user
    public String createMsg(int arraySize, int startRandom, int finishRandom, int [] randomNumbers){
        for(int i = 0; i < randomNumbers.length; i = i + 1) {
            arrayNumbers = arrayNumbers + randomNumbers[i] + "  ";
        }
        msg = (" The size of the array is " + arraySize + " \n Using random numbers from " + startRandom + " to " + finishRandom + "\n\n The numbers in the array are: \n " + arrayNumbers);
        return msg; 
    }

}
