public class BottlesOfBeerApp{
    public static void main(String[] args) {
        

        // // create a counter to keep track of the number of bottles of beer on the wall
        // int bottleCount = 99; 

        // // using a loop we will recite the lyrics of the bottles of beer song
        // while(bottleCount > 0){

        //     // there's a different line in this song once we run out of bottles
        //     if(bottleCount>1){
        //         System.out.println(bottleCount + " bottles of beer on the wall, " + bottleCount + " bottles of beer");
        //         // there should be one less bottle of beer on the wall each time we sing a song
        //         bottleCount--;
        //         System.out.println("Take one down and pass it around, " + bottleCount +" bottles of beer on the wall");
        //     }
        //     else{
        //         System.out.println(bottleCount + " bottle of beer on the wall, " + bottleCount + " bottle of beer");
        //         bottleCount--;
        //         System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
        //     }            
        // }

        for(int bottleCount=99; bottleCount>0; bottleCount--){
            
            if(bottleCount>1){
                System.out.println(bottleCount + " bottles of beer on the wall, " + bottleCount + " bottles of beer");
                // there should be one less bottle of beer on the wall each time we sing a song
                System.out.println("Take one down and pass it around, " + (bottleCount-1) +" bottles of beer on the wall");
            }
            else{
                System.out.println(bottleCount + " bottle of beer on the wall, " + bottleCount + " bottle of beer");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
            }            
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");

    }
}