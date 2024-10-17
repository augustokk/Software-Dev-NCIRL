//In that code we are reversing the string given by a user and replace any space with a -

public class Reverse{

    // DECLARE VARIABLES
    private String userInput;
    private String reversed;
    private StringBuffer strBuff; // declare object

    // CONSTRUCTOR
    public Reverse(){
        userInput = "";
        reversed = "";
        strBuff = new StringBuffer();  // create object
    }

    // SET
    public void setUserInput(String userInput){
        this.userInput = userInput;
    }

    // PROCESS
    public void reverseString(){
        // we are going to check the String from the last position until the first position
        // poe o length -1 pq senao escap do tamanho total, pq conta o 0
        for(int i = userInput.length()-1; i >=0; i = i - 1){
            // we are replace empty spcae with -
            if(userInput.charAt(i) == ' '){
                strBuff.append('-');
            }
            else{
                strBuff.append(userInput.charAt(i));
            }
        }
        // remember must be converted to string
        reversed = strBuff.toString();
    }

    // GET
    public String getReversed(){
        return reversed;
    }   
}