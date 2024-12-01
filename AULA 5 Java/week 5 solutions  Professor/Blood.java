public class Blood{
    int age;
    String bloodType;
    String bloodGroupsRecive;
    String bloodGroupsDonate;

    public Blood(){
        bloodGroupsRecive = "can receive blood from ";
        bloodGroupsDonate = "can give blood to ";
    }

    // setters
    public void setAge(int age){
        this.age = age;
    }

    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }

    // compute messages
    public void computeBloodMessages(){ 

        if(bloodType.equals( "AB")){
            // check if under 18 and deliver a different message if they are too young
            if(age < 18){
                bloodGroupsDonate = "cannot donate, too young"; //bloodGroupsDonate = bloodGroupsDonate + "cannot donate, too young";    
            }
            else{
                bloodGroupsDonate += "AB";
            }

            bloodGroupsRecive += "AB, A, B, and O";
        }
        else if(bloodType.equals("A")){
            if(age < 18){
                bloodGroupsDonate = "cannot donate, too young";    
            }
            else{
                bloodGroupsDonate += "A and AB";
            }    
            bloodGroupsRecive += "A and O";
        }
        else if(bloodType.equals("B")){
            if(age < 18){
                bloodGroupsDonate = "cannot donate, too young";    
            }
            else{
                bloodGroupsDonate += "B and AB";
            }    
            bloodGroupsRecive += "B and O";
        }
        else if(bloodType.equals("O")){
            if(age < 18){
                bloodGroupsDonate = "cannot donate, too young";    
            }
            else{
                bloodGroupsDonate += "AB, A, B, and O";
            }    
            bloodGroupsRecive += "O";
        }
        else{
            bloodGroupsDonate = "Invalid blood group given";
            bloodGroupsRecive = "Invalid blood group given";
        }
                
    }

    // getters
    public String getBloodGroupsReceive(){
        return bloodGroupsRecive;
    }

    public String getBloodGroupsDonate(){
        return bloodGroupsDonate;
    }
}