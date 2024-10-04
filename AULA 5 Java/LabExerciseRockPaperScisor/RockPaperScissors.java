public class RockPaperScissors{

    // DECLARE VARIABLES
    private int userChoice;
    private int computerChoice;
    private String msg;

    // CONSTRUCTOR
    public RockPaperScissors(){
        userChoice=0;
        computerChoice=0;
        msg="Error";
    }

    // SET
    public void setUserChoice(int userChoice){
        this.userChoice = userChoice;
    }

    public void setComputerChoice(int computerChoice){
        this.computerChoice = computerChoice;
    }

    // PROCESS
    // How the game works
    // Rock is 1, Paper is 2, and Scissors is 3.
    // Rock wins over Scissors
    // Paper wins over Rock
    // Scissors wins over Paper
    // Draw if both choose same

    public void resultGame(){
        if(userChoice == 1){
            if(computerChoice == 1){
                msg = "Draw \n (user) Rock x Rock (computer)";
            }
            else if(computerChoice == 2){
                msg = "Computer wins \n (user) Rock x Papper (computer)";
            }
            else{
                msg = "User wins \n (user) Rock x Scissors(computer)";
            }
        }
        else if(userChoice == 2){
            if(computerChoice == 2){
                msg = "Draw \n (user) Papper x Papper (computer)";
            }
            else if(computerChoice == 3){
                msg = "Computer wins \n (user) Papper x Scissors (computer)";
            }
            else{
                msg = "User wins \n (user) Papper x Rock(computer)";
            }
        }

        else if(userChoice == 3){
            if(computerChoice == 3){
                msg = "Draw \n (user) Scissors x Scissors(computer)";
            }
            else if(computerChoice == 1 ){
                msg = "Computer wins \n (user) Scissors x Rock (computer)";
            }
            else{
                msg = "User wins \n (user) Scissors x Paper(computer)";
            }
        }

        else{
            System.out.println("Invalid entry");
            msg = ("Invalid entry");
        }
    }

    // GET
    public String getMsg(){
        return msg;
    }
}