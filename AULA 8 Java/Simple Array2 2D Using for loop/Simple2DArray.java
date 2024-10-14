// creating a simple 2d array using for loop
// output expected:
// 1, 2, 3, 4
// 1, 2, 3, 4
public class Simple2DArray{
    public static void main(String[] args) {
        // DECLARE AND CREATE 2D ARRAY
        int[][] results = new int [2][4];

        //INITIALISE ARRAY (FILL ARRAY) USING NESTED FOR LOOPS

        // for every time the outer loop runs once, the inner loop will run fully
        for(int i = 0; i<2; i = i + 1){ // OUTER LOOP
            for(int j = 0; j < 4; j = j + 1){
                // INNER LOOP 
                //populate the array
                results[i][j]= j+1;
                //attention we dont use println because we dont want to print each item in one line
                System.out.print(results[i][j]);
                System.out.print(",");

            }
        System.out.println("");
        }
    }
}