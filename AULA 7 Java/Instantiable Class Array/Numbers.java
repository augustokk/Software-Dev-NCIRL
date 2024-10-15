
import javax.swing.JOptionPane;

public class Numbers{

    // DECLARE VARIABLES
    private int [] initialNumbers;
    private int [] finalNumbers = new int 
    [3];
    // ESSA PARTE NAO ENTENDI MUITO BEM, O PORQUE O FINAL TEM QUE SER INICIADO AQUI, DANDO O TAMANHO FINAL DA ARRAY E O INICIAL EH INICIADO NO OUTRO FILE
    // ALGO ME DIZ QUE ISSO TEM RELACAO COM O QUE IREMOS USAR NO PROCESSO, AFINAL A PRIMEIRA VARIABLE QUE APARECE AQUI NO PROCESSO EH O finalNumbers, TVZ PARA USAR ELE, ELE PRECISA TER UM TAMANHO ESPECIFICO JAH, O MESMO OCORRE NO OUTRO FILE

    // CONSTRUCTOR
    public Numbers(){
        // PRECISAMOS "INICIALIZAR" ARRAYS AQUI? NO EXEMPLO ELE NAO COLOCA NADA
        }
    // SET
    public void setInitialNumbers(int [] initialNumbers){
        this.initialNumbers = initialNumbers;
    }

    // PROCESS
    public void calculateFinalNumbers(){
        for(int i = 0; i <initialNumbers.length; i = i + 1){
            finalNumbers[i] = initialNumbers [i] * 9;
        } 
    }

    public void printMsg(){
        for(int i = 0; i < initialNumbers.length; i = i + 1) {
            JOptionPane.showMessageDialog(null, initialNumbers[i] + " times 9 is " + finalNumbers [i]);
        }
    }

    // GET
    public int [] getFinalNumber(){
        return finalNumbers;
    }
    
}