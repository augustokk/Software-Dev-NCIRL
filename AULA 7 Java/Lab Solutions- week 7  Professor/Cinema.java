public class Cinema{
    private int numberOfTickets;
    private int age;
    private int overallTicketPrice;
    private int [] tickets;
    private int ticketIndex;

    Cinema(){
        ticketIndex = 0;
    }

    // setters
    public void setNumberOfTickets(int numberOfTickets){
        this.numberOfTickets = numberOfTickets;
        tickets = new int[numberOfTickets];
    }

    public void setAge(int age){
        this.age = age;
    }

    // each time we add a ticket to our total number of tickets
    // the age is checked and we add the cost to the total cost.
    public void addTicket(){
        int individualPrice = 0;
        
        if(age > 18){
            individualPrice = 15;
        }
        else{
            individualPrice = 10;
        }

        tickets[ticketIndex] = individualPrice;
        ticketIndex++;  
    }

    

    // compute the overall ticket price
    // this should be the individual price times the number of tickets
    // the individual price varies based on the age of the person buying it
    // 18 >= should be 15 euro, < 18 should be 10 euro
    public void computeOverallPrice(){
        
        overallTicketPrice = 0;

        for(int index = 0; index < tickets.length; index++){
            overallTicketPrice += tickets[index];
        }

    }  

    // Getter
    public int getOverallTicketPrice(){
        return overallTicketPrice;
    }

    public String printReceipt(){

        String receipt = "The cost of your tickets were as follows:\n"; 

        // we use these variables to track the different types of tickets
        String adultTickets = "Adult tickets x"; 
        int numberOfAdults = 0; 

        String childTickets = "Child tickets x";
        int numberOfChildren = 0; 


        // here we count how many of each type of ticket was used
        for(int index = 0; index < tickets.length; index++){
            if(tickets[index] == 15){
                numberOfAdults++;
            }     
            else{
                numberOfChildren++;
            }
        }


        //here we add the cost of each type of ticket to the receipt
        if(numberOfAdults>0){
            receipt += adultTickets + numberOfAdults + "\n"; 

            int subtotal = numberOfAdults * 15; 
            receipt += "subtotal: " + subtotal + "\n";
        }
        if(numberOfChildren >0){
            receipt += childTickets + numberOfChildren + "\n"; 

            int subtotal = numberOfChildren * 10; 
            receipt += "subtotal: " + subtotal + "\n";
        }


        // finally we show the total cost
        receipt += "Total cost: " + overallTicketPrice;
        
        return receipt;

    }
}