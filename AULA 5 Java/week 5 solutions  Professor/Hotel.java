public class Hotel {
    private String name;
    private int age;
    private int numberOfNights;
    private String message; 

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public void setAge(int age){
        this.age = age;
    }

    // compute 
    public void computePriceMessage(){
        if(age < 18){
            message = "You are too young and cannot book this stay";
        }
        else{
            message = "Welcome " + name + ", the cost of your stay will be " + (numberOfNights * 90);
        }
    }

    // getter
    public String getPriceMessage(){
        return message; 
    }

}
