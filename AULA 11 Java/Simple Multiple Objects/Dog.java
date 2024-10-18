// aqui vamos criar uma simples classe que podera ser usada para criar varios tipos de cachorro, eh o blueprint

public class Dog{
    //VARIABLES
    private String name;
    private String breed;

    //CONSTRUCTOR
    public Dog (String breed){ // nesse caso ao criar um novo obejto Dog eh obrigatorio adicionar uma raca (breed) em forma de String
    this.breed = breed;
    name = "Toto"; // aqui foi adicionado um nome padrao, ou seja sempre que for criado um Dog ele recebera o nome padrao Toto, porem esse nome pode ser mudado usando o metodo set name
    }
    // SET
    public void setName(String name){
        this.name = name;
    }

    //COMPUTE 
    public void bark(){
        System.out.println("AU AU AU");
    }
    // GET
    public String getName(){
        return name;
    }
}