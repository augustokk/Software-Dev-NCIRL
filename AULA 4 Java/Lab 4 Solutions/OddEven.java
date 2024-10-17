public class OddEven {
    
    private int number;
    private String answer; 

    // SETTERS
    public void setNumber(int number){
        this.number = number; 
    }

    // COMPUTE method
    // depending on if the number is divisible by two
    // if it is divisible by two the answer is even
    // otherwise it is odd
    public void computeOddEven(){

        if(number % 2 == 0){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }

    }

    // Getter
    public String getAnswer(){
        return answer; 
    }

}
