public class Login{

    // DECLARE VARIABLES
    private String userName;
    private String msg;
    private int age;

    // CONSTRUCTOR
    public Login(){
        userName = "User";
        age = 0;
        msg = "Error";
    }

    // SET
    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setAge(int age){
        this.age = age;
    }

    // PROCESS
    public void computeMsg(){
    if(age>=18){
        if(userName.equalsIgnoreCase("Sam")){
            msg = "Welcome Sam";
        }
        else{
            msg = "Sorry " + userName + " you must be named Sam!";
        }
    }
    else{
        msg = "Sorry you must be over 18";
    }
    }

    // GET
    public String getMsg(){
    return msg;
    }



}