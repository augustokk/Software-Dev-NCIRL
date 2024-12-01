/**
 * Create an instantiable class that sorts a given array into a subset array of either even or odd numbers. 
 * The class should have 1 method that accepts 2 parameters:
 * 
 * An array of numbers
 * 
 * An integer representing whether the subset array to be returned will contain odd or even numbers (0= even, 1=odd)
 * 
 * The same method should then sort the given array into a smaller array containing either all odd or all even numbers. 
 * This array should then be returned.
 */

public class SubsetArray {
    
    // this method will look at the data array and return all odd or all evens
    // depending on whether odds is 1 or 0 respectively
    public int [] oddEvenSplit(int [] data, int odds){

        int oddCount = 0;
        int evenCount = 0;
        // let us first count the number of odds or evens (depending on the second parameter in our array)
        // this will tell us how large our output array should be
        for(int d : data){

            // this means that d is even
            if(d % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        int [] output; 
        if(odds == 1){
            output = new int[oddCount];
        }
        else{
            output = new int[evenCount];
        }

        int outputIndex = 0;
        // now we assign all the odds or evens to positions in the array depending on what odds is equal to
        for(int index = 0; index < data.length; index++){

            //if((odds==1 && data[index] % 2 == 1) || (odds == 0 && data[index] % 2 == 0)){
            if (data[index] % 2 == odds){
                output[outputIndex] = data[index];
                outputIndex++;
            }

        }

        return output;

    }

}
