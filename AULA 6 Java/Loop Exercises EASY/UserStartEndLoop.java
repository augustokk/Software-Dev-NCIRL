// Take in 2 numbers from a user and print all numbers between these 2

public class UserStartEndLoop{

    // DECLARE VARIABLES
    private int startLoop;
    private int endLoop;
    private String msg;

    // CONSTRUCTOR
    public UserStartEndLoop(){
        startLoop = 0;
        endLoop = 0;
        msg = "";
    }

    //SET
    public void setStartLoop(int startLoop){
        this.startLoop = startLoop;
    }

    public void setEndLoop(int endLoop){
        this.endLoop = endLoop;
    }

    //PROCESS
    public void computeMsg(){
        for(int i = startLoop; i<=endLoop; i = i +1){
            msg = msg + ("#" + i + "\n");
        }
    }

    //GET
    public String getMsg(){
        return msg;
    }
}