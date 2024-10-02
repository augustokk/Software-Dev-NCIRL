//a program that takes in a user's age and a number of cinema tickets they need. Display the price it will cost for them to buy their tickets based on below
//Under 18: 10 euro
//Over 18: 15 euro

// INSTANTIABLE CLASS

public class Cinema{

    // DECLARE VARIABLES
    private int userAge;
    private int numTickets;
    private double finalCost;
    private String msg;

    // CONSTRUCTOR
    public Cinema(){
    userAge = 0;
    numTickets = 0;
    finalCost = 0;
    msg = "";
    }

    // SET
    public void setUserAge(int userAge){
        this.userAge = userAge;
    }

    public void setNumTickets(int numTickets){
        this.numTickets = numTickets;
    }

    // PROCESS
    public void calculateCost(){
        if(userAge >= 18){
            finalCost = numTickets * 15;
            msg =( "Final cost is " + finalCost);
        }
        else{
            finalCost = numTickets * 10;
            msg =( "Final cost is " + finalCost);
        }
    }

    // GET
    public String getMsg(){
        return msg;
    }

}