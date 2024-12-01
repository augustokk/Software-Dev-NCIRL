public class MeanSumArray {
    private int [] data; 
    private int mean;
    private int sum;
    
    MeanSumArray(){
    }

    // setter
    public void setArray(int [] data){
        this.data = data; 
    }

    public void computeSum(){
        sum = 0;
        
        // go through each index within the array
        for(int dataIndex = 0; dataIndex < data.length; dataIndex++){

            sum += data[dataIndex];
        }
    }

    public void computeMean(){
        mean = sum / data.length;
    }

    // getter
    public int getSum(){
        return sum;
    }

    public int getMean(){
        return mean;
    }
}
