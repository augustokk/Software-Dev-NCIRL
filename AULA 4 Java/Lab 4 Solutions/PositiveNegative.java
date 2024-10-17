public class PositiveNegative {
    private int number;
    private String answer; 

    // SETTERS
    public void setNumber(int number){
        this.number = number; 
    }

    // COMPUTE method
    // depending on if the number is > 0
    // then we say positive is our answer
    // < 0 then negative is our answer
    // equal to zero, we will just say it is zero
    public void computePositiveNegative(){
        if(number > 0){
            answer = "Positive";
        }
        else if(number < 0){
            answer = "Negative";
        }
        else{
            answer = "Zero";
        }
    }

    // Getter
    public String getAnswer(){
        return answer; 
    }
}
