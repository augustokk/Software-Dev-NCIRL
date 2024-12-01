/**
 * Create an instantiable class that returns the details of an array of numbers. 
 * The class should contain 3 methods:
 * 
 * a method that accepts as a parameter an array of integers. 
 * This method should also calculate the sum of the array and the max value in the array
 * 
 * a method that returns the max
 * 
 * a method that returns the sum
 */

public class ArrayOps {
    // private int [] data; 
    private int max; 
    private int sum; 

    // create a method that accepts an array and computes the max and sum
    public void computeMaxSum(int [] data){
        max = data[0];
        sum = 0; 

        for(int d : data){

            // if we find a larger value in the array 
            // then we overwrite max
            if(d > max){
                max = d; 
            }

            // every iteration we add d to the sum
            sum += d; 
        }
    }

    // GETTERS

    public int getMax(){
        return max;
    }

    public int getSum(){
        return sum;
    }
}
