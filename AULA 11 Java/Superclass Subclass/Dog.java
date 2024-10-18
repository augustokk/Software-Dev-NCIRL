// DOG IS GOING TO BE A SUBCLASS FROM ANIMAL, THAT MEANS DOG CLASS CAN INHERIT ALL THE DETAISL FROM THE ANIMAL CLASS
// IN THAT SCENARIO DOG CAN DO ALL WHAT ANIMALS CAN DO BUT EVEN MORE IF NECESSARY 
// FOR THAT IS NECESSARY TO USE THE KEYWORD extends

public class Dog extends Animal{
   
    //DECLARE VARIABLES
    private String name;
    private String breed;
    private int randomBark;
    private String choosenNoise;

    //CONSTRUCTOR
    public Dog (String breed){ // nesse caso ao criar um novo obejto Dog eh obrigatorio adicionar uma raca (breed) em forma de String
    this.breed = breed;
    name = "Toto"; // aqui foi adicionado um nome padrao, ou seja sempre que for criado um Dog ele recebera o nome padrao Toto, porem esse nome pode ser mudado usando o metodo set name
    }
    
    // SET
    public void setName(String name){
        this.name = name;
    }

    // GET
    public String getName(){
        return name;
    }

    // METHODS 
    public String dogNoise(){
        // create an array to store possible dog sounds:
        String [] barkNoise = {"AU AU", "WOLF WOLF", "Caim caim"};
        // create a random function to set a number 0, 1 or 2 corresponding to the array indexes
        randomBark = (int)(Math.random()*3);
        // now set that random choice to be the choosen noise
        choosenNoise = barkNoise[randomBark];
        
        return choosenNoise;
    } 

    // AGORA AO INVES DE USARMOS UM METODO EXATAMENTE COMO O QUE TEMOS NA SUPERCLASS ANIMAL, GOSTARIAMOS DE FAZER UMAS MUDANCAS NELE, PARA QUE TODOS OS CACHORROS QUE SEJAM CRIADOS USEM ESSE METODO AO INVES DO METODO GERAL PARA ANIMAIS, PARA ISSO PRECISAMOS ESCREVER A KEY WORd @Override

    @Override
    public void animalNoise(String noise){
        // nesse caso ao inves de fazer uma vez apenas o barulho, como eh na superclass animal, queremos que ele faca 3 vezes o barulho, como padrao para todos os Dogs
        for(int i = 0; i < 3; i = i + 1){
            // para identificarmos o metodo que estamos usando da superclass precisamos antes de chama-lo, escrever a keyword super
            super.animalNoise(choosenNoise); 
        }
    }

}