public class Calculator{

    // DECLARE VARIABLES
    private double number1;
    private double number2;
    private String operation;
    private double result;

    // COMBINED METHODS
    // nesse metodo ele recebera 3 parametros dentro do parenteses e ira retornar um numero 
    // lembra o estilo de funcoes em python
    public double doMaths(double number1, double number2, String operation){
        if(operation.equalsIgnoreCase("a")){ //add
            result = number1 + number2;
        }
        else if(operation.equalsIgnoreCase("s")){ //subtract
            result = number1 - number2;
        }
        else if(operation.equalsIgnoreCase("m")){ //multiply
            result = number1 * number2;
        }
        else if(operation.equalsIgnoreCase("d")){ // divide
            result = number1 / number2;
        }
        
        return result;
    }

}