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

        // Draw if both choose same
        if(userChoice == computerChoice){
            msg = "Draw";
        }
        // Check each possibility the user has
        // Select all possibilities that user wins
        else if((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)){
                msg = "User Wins";
                }

        // Check each possibility the computer has
        // Select all possibilities that computer wins
        else if((computerChoice == 1 && userChoice == 3) ||
                (computerChoice == 2 && userChoice == 1) ||
                (computerChoice == 3 && userChoice == 2)){
                msg = "Computer Wins";
                }

        // Check if user selecte an invalid option
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