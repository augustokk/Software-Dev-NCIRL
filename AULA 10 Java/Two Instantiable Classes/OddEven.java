public class OddEven{

    // DECLARE VARIABLES
    private boolean evenCheck;
    private double numberToCheck;

    // COMBINED METHOD
    // nesse metodo ele recebera 1 parametro dentro do parenteses e ira retornar um boolean
    // lembra o estilo de funcoes em python
    public boolean checkIfEven (double numberToCheck){
        this.numberToCheck = numberToCheck; // nao sei pq aqui teve que fazer isso
        if (numberToCheck % 2 == 0){
            evenCheck = true;
        }
        else{
            evenCheck = false;
        }
    
    return evenCheck;
    }

}