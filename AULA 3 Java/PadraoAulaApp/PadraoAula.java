// INSTANTIABLE CLASS

//public class so the PadraoAulaApp can get data from it
public class PadraoAula{

    // DECLARE VARIABLES

    //private because oprotect the state of our objects
    private int number1;
    private int number2;
    private int answer;

    // CONSTRUCTOR
    // serve como valores padroes caso um objeto seja criado e nao seja atribuido um valor para ele quando da criacao
    public PadraoAula(){
        number1 = 0;
        number2 = 0;
        answer = 0;
    }

    //SET
    // acessa caracteristicas / atributos do objeto apos ele ter sido criado
    // precisa ter parametros nesse caso o que esta dentro dos parenteses int number 1
    public void setNumber1(int number1){
        this.number1 = number1;
    }
    
    public void setNumber2(int number2){
        this.number2 = number2;
    }

    // COMPUTE | PROCESS
    // Logic of the program
    public void computeAnswer(){
        answer = number1 + number2;
    }

    // GET 
    // used to retrieve data from a class  require a return type (not void) in this scenario int
    // require return statement, in this scenario answer
    public int getAnswer(){
        return answer;
    }

}    