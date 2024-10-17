public class Cinema{
    private int numberOfTickets;
    private int age;
    private int overallTicketPrice;

    // setters
    public void setNumberOfTickets(int numberOfTickets){
        this.numberOfTickets = numberOfTickets;
    }

    public void setAge(int age){
        this.age = age;
    }

    // compute the overall ticket price
    // this should be the individual price times the number of tickets
    // the individual price varies based on the age of the person buying it
    // 18 >= should be 15 euro, < 18 should be 10 euro
    public void computeOverallPrice(){
        int individualPrice = 0;
        
        if(age >= 18){
            individualPrice = 15;
        }
        else{
            individualPrice = 10;
        }

        overallTicketPrice = individualPrice * numberOfTickets;
    }  

    // Getter
    public int getOverallTicketPrice(){
        return overallTicketPrice;
    }
}