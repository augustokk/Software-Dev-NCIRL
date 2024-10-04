public class CinemaNested{

    // DECLARE VARIABLES
    private String weekDay;
    private int numTickets;
    private int age;
    private String msg;
    private double cost;
    
    // CONSTRUCTOR
    public CinemaNested(){
        weekDay ="";
        numTickets = 0;
        age = 0;
        msg = "";
        cost = 0;
    }

    // SET
    public void setWeekDay(String weekDay){
        this.weekDay = weekDay;
    }

    public void setAge( int age){
        this.age = age;
    }

    public void setNumTicket(int numTickets){
        this.numTickets = numTickets;
    }

    // PROCESS
    public void checkCost(){
        if(age>=18){
            if(weekDay.equalsIgnoreCase("weekend")){
                cost = 10.5 * numTickets;
            }
            else{
                cost = 12.5 * numTickets;
            }
        }
        else{
            if(weekDay.equalsIgnoreCase("weekend")){
                cost = 8 * numTickets;
            }
            else{
                cost = 10 * numTickets;
            }
        }

        msg = "The total is $ " + cost;
    }

    // GET
    public String getMsg(){
        return msg;
    }
}
