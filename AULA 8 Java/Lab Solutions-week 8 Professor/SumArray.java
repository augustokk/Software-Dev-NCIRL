public class SumArray {
    int [][] data;
    int [] rowSum;
    int [] colSum; 
    int overallSum; 

    // the data is set during initialization of the SumArray object using data as an argument
    SumArray(int [][] data){
        this.data = data; 
        rowSum = new int[data.length];
        colSum = new int[data[0].length];
        overallSum = 0;
    }
    
    // go through each row and store the sum
    public void computeRowSum(){
        
        // outer loop goes through each row index of the array
        for(int rowIndex = 0; rowIndex < data.length; rowIndex++){

            rowSum[rowIndex] = 0;
            // inner loop iterates through each column within the row
            // we will add all the column data for each specific row
            for(int colIndex = 0; colIndex < data[rowIndex].length; colIndex++){

                // this will add each individual cell in the array for that specific row
                rowSum[rowIndex] += data[rowIndex][colIndex];
            }
        }
    }

    // go through each column and store the sum
    public void computeColSum(){
        
        // outer loop goes through each col index of the array
        for(int colIndex = 0; colIndex < data[0].length; colIndex++){

            colSum[colIndex] = 0;
            // inner loop iterates through each row within the column
            // we will add all the column data for each specific row
            for(int rowIndex = 0; rowIndex < data.length; rowIndex++){

                // this will add each individual cell in the array for that specific row
                colSum[colIndex] += data[rowIndex][colIndex];
            }
        }
    }

    public void computeOverallSum(){
        // outer loop goes through each row index of the array
        for(int rowIndex = 0; rowIndex < data.length; rowIndex++){

           
            // inner loop iterates through each column within the row
            for(int colIndex = 0; colIndex < data[rowIndex].length; colIndex++){

                // this will add each individual cell in the array to the overall sum
                overallSum += data[rowIndex][colIndex];
            }
        }
    }

    // GETTERS
    public int[] getRowSum(){
        return rowSum;
    }

    public int[] getColSum(){
        return colSum;
    }

    public int getOverallSum(){
        return overallSum;
    }
        

}
