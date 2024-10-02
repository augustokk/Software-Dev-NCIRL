// INSTANTIABLE CLASS
// LESSON EXERCISE
public class Conditional{

    // DECLARE VARIABLES
    private int age;
    private String msg;

    // CONSTRUCTOR
    public Conditional (){
        age=0;
        msg="";
    }

    // SET
    public void setAge(int age){
        this.age = age;
    }

    // PROCESS
    public void computeMsg(){
        if(age>=18 && age<30){
            msg="You are over 18";
        }
        else if(age>=30){
            msg="You are over 30";
        }
        else{
            msg="You are under 18";
        }
    }

    // GET
    public String getMsg(){
        return msg;
    }


}