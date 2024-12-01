/**
 * Create an instantiable class that generates and returns an array of random numbers based on 3 parameters:
 * How large the array should be
 * Where the random number range should start
 * Where the random number range should end
 */


public class RandomArray {
    private int size; // how large the array is
    private int randStart; // smallest random number
    private int randEnd; // largest random number
    private int [] data;

    RandomArray(){
    }

    // SETTERS

    public void setSize(int size){
        this.size = size;
        data = new int[size]; // when we get the size we also instantiate an array of that size
    }

    public void setRandStart(int randStart){
        this.randStart = randStart;
    }

    public void setRandEnd(int randEnd){
        this.randEnd = randEnd;
    }

    // generate this random array
    // this assumes that the three variables above have been set
    public void computeRandomArray(){

        // loop to generate a random number for each position inside the array
        for(int index = 0; index < size; index++){
            data[index] = randStart + (int)((randEnd - randStart) * Math.random());
        }
    }

    // print each item inside the array
    public void printArray(){

        // iterate through each piece of data in the array so we can print it
        for(int d : data){
            System.out.println(d);
        }

    }

    // GETTER
    public int [] getData(){
        return data; 
    }

}
