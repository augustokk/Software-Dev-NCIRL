public class Leap {
    private int year;
    private String message;

    // setter
    public void setYear(int year){
        this.year = year;
    }

    // compute if it is a leap year or not
    public void computeLeap(){

        // if(year % 4 ==0){
        //     if(year % 400 ==0){
        //         message = "is a leap year";
        //     }
        //     else if(year % 100 ==0){
        //         message = "Not a leap year";    
        //     }
        //     else{
        //         message = "is a leap year";
        //     }  
        // }
        // else{
        //     message = "Not a leap year";
        // }

        // this checks if it is not divisible by 4
        // or if it is divisible then check if it's divible by 100
        // but not 400
        if(year % 4 != 0 || (year % 100 == 0 && year % 400 !=0 )){
            message = "Not a leap year";
        }
        else{
            message = "Leap year";
        }

    }

    // getter
    public String getMessage(){
        return message;
    }
}
