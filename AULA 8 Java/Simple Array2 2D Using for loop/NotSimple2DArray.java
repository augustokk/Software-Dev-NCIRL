
import javax.swing.JOptionPane;

public class NotSimple2DArray{
    public static void main(String[] args){

        //DECLARE VARIABLES

        // isso aqui ajuda para nao ter que fazer hard code no numero de linhas que iremos usar na array
        String[] students = {"Augusto", "Kenia", "Karen"};
        int rows = students.length;

        // isso aqui ajuda para nao ter que fazer hard code no numero de colunas que iremos usar na array
        int numModules = 4;
        int columns = numModules;

        //DECLARE ARRAY
        double [][] results;

        //CREATE ARRAY sem fazer o hardcode, usando variables
        results = new double [rows][columns];

        //INPUT and populate array (initialise)
        for(int i = 0; i<rows; i = i + 1){
            for(int j =0; j<columns; j = j+1){
                results[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter result " + (j+1) + " for the student: " + students[i]));
            }
        }

        //OUTPUT 
        for(int i = 0; i<rows; i = i + 1){
            for(int j =0; j<columns; j = j+1){
                System.out.println(students[i] + " result #" + (j+1) + " is : " + results[i][j]);
            }
        }
    }

}