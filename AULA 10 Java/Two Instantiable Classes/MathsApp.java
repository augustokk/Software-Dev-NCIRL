// Quando vai fazer algo assim com mais de uma classe talvez comecar pela classe APP pode ser um bom caminho, eh preciso pensar e se planejar bem para conseguir fazer isso de forma correta

import javax.swing.JOptionPane;

public class MathsApp{

    public static void main (String [] args){

        // DECLARE VARIABLES
        double number1;
        double number2;
        String operation;
        double result;
        boolean evenCheck;

        // DECLARE AND CREATE OBJECTS
        Calculator calc = new Calculator();
        OddEven oe = new OddEven();

        // INPUTS
        number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number: "));
        number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number: "));
        operation = (JOptionPane.showInputDialog(null, 
        " Enter a for add \n Enter s for subtract \n Enter m for multiply \n Enter d for divide: "));

        // Prestar atencao nos valores de variaveis que voce precisa ter dentro dos parametros para seguir uma ordem cronologica
        // SET , COMPUTE AND GET (Calculator)
        result = calc.doMaths(number1, number2, operation);

        // SET , COMPUTE AND GET (OddEven)
        evenCheck = oe.checkIfEven(result);

        // OUTPUT

        // Calculator
        JOptionPane.showMessageDialog(null,"Your answer is: " + result);

        // OddEven
        JOptionPane.showMessageDialog(null,"Your answer is even? " + evenCheck);
        
    }
}