public class LargestArray {
    private int [] data; 
    private int largest;
    
    LargestArray(){
    }

    public void setArray(int [] data){
        this.data = data; 
    }

    public void computeLargest(){
        largest = data[0];
        
        // go through each index within the array
        for(int dataIndex = 0; dataIndex < data.length; dataIndex++){

            // if we find a data item larger than the biggest one we have seen
            // so far, the we overwrite what the old largest was. 
            if(largest < data[dataIndex]){
                largest = data[dataIndex];
            }
        }
    }

    public int getLargest(){
        return largest;
    }
}
