public class NightOut {
    private String programme;
    private int year;
    private String location;

    // setters
    public void setProgramme(String programme){
        this.programme = programme;
    }

    public void setYear(int year){
        this.year = year;
    }

    // compute
    public void computeLocation(){

        if(year == 1){
            if(programme.equalsIgnoreCase("HDAIML")){
                location = "Lagoona";
            }
            else if(programme.equalsIgnoreCase("HDBC")){
                location = "Harbourmaster";
            }
        }
        else if(year == 2){
            if(programme.equalsIgnoreCase("HDAIML")){
                location = "Harbourmaster";
            }
            else if(programme.equalsIgnoreCase("HDBC")){
                location = "Lagoona";
            }
        }
    }

    // getter
    public String getLocation(){
        return location; 
    }
}
