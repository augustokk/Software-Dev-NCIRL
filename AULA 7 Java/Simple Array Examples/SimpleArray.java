import javax.swing.JOptionPane;
public class SimpleArray{
    public static void main(String[] args){
        //EXAMPLE 1
        //DECLARE, CREATE AND INITIALISE ARRAY
        String [] ingredients = {"Milk", "Sugar", "Eggs"};
        // OUTPUT RESULTS
        System.out.println("The ingredients on the array are:");
        System.out.println(ingredients[0]);
        System.out.println(ingredients[1]);
        System.out.println(ingredients[2]);


        //EXAMPLE 2
        //DECLARE ARRAY
        int [] results;
        //CREATE ARRAY
        results = new int [5];
        //INITIALISE ARRAY USING USER INPUTS
        for(int i = 0; i < results.length; i = i + 1){
            results[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        }
        // OUTPUT VALUES
        System.out.println("The numbers are: \n");
        for(int i = 0; i < results.length; i = i + 1){
            System.out.println(results[i]);
        }
    }
}