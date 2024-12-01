public class RPS {
    private int plOption;
    private int compOption;
    private String result; 

    // setter
    public void setPlOption(int plOption){
        this.plOption = plOption;
    }

    // compute the result of the game
    public void computeGame(){

        compOption = (int)(Math.random() * 3) + 1;

        // if they match
        if(plOption == compOption){
            result = "draw";
        }
        // if the user picks rock and they dont match
        else if(plOption == 1){
            if(compOption == 2){
                result = "Lose, You picked rock and computer picked paper";
            }
            else{
                result = "Win, You picked rock and computer picked scissors";
            }
        }
        // if the user picks paper and they dont match
        else if(plOption == 2){
            if(compOption == 3){
                result = "Lose, You picked paper and computer picked scissors";
            }
            else{
                result = "Win, You picked paper and computer picked rock";
            }
        }
        // if the user picks scissors and they dont match
        else{
            System.out.println(plOption);
            if(compOption == 1){
                result = "Lose, You picked scissors and computer picked rock";
                
            }
            else{
                result = "Win, You picked scissors and computer picked paper";
            }
        }

    }

    // getter
    public String getResult(){
        return result; 
    }
}
