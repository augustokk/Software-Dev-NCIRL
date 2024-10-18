// Aqui irei demonstart como criar mais de um objeto vindo da mesma classe (Dog) pode ser criado um ou mais objetos e usar ou nao as variaveis e metodos que estao dentro da classe Dog

public class DogApp{
    public static void main(String[] args) {
        // first object created
        Dog dog1 = new Dog ("Labrador"); // adicionar a raca eh algo obrigatorio, uma vez que definimos isso no contructor method

        // second object created
        // o nome (variavel) precis ser diferente
        Dog dog2 = new Dog("Vira - Lata");

        // methods and output
        // na nossa classe dog definimos um nome padrao para os cachorros, caso nenhum nome seja adicionado ao objeto, enato nesse caso ira mostart o nome padrao definido no constructor
        System.out.println(dog1.getName());
        // aqui iremos chamar outro metodo da classe Dog
        dog1.bark();

        //para o segundo cachorro nos iremos dar um nome e entao iremos printa-lo na tela:
        dog2.setName("Lassie");
        System.out.println(dog2.getName());

        // e para o segundo cachorro decidimos que nao iremos chamar mais nenhum metodo.
        // isso foi feito para mostrar como essa relacao entre objeto e classe pode ser usada de acordo com as necessidade


        
    }
}