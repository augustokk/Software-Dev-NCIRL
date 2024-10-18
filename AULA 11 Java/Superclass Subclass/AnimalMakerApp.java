//AGORA NESSE FILE EH AONDE IREMOS CRIAR NOSSOS OBJETOS

public class AnimalMakerApp{
    public static void main (String [] args){
        //criando nosso primeiro obejto Dog
        Dog dog1 = new Dog("Labrador"); // adicionar a raca eh algo obrigatorio, uma vez que definimos isso no contructor method

        // na nossa classe dog definimos um nome padrao para os cachorros, caso nenhum nome seja adicionado ao objeto, enato nesse caso ira mostart o nome padrao definido no constructor
        System.out.println(dog1.getName());

        // AGORA MESMO NAO SENDO METODOS DA CLASSE DOG, POR DOG SER UMS SUBCLASS DE ANIMALS, PODEMOS CHAMAR METODOS DA CLASSE ANIMALS
        dog1.hungerCheck();
        // E ESSES METODOS FUNCIONARAO COMO DEVERIAM FUNCIONAR SE FOSSE DA PROPRIA CLASSE DOG
        dog1.feed();
        dog1.hungerCheck();

        // IMPORTANTE !!
        // se eu tentar chamar um metodo da class Animal que foi override pela classe Dog, ele nao funcionara corretamente, pois o metodo que foi chamado necessita de coisas diferentes uma vez que ele foi override
        // ao chamar esse metodo: animalNoise(String noise) ira aparecer uma falha logica
        //dog1.animalNoise("AUUUUUUUUUUU");
        // isso ocorre nesse caso, pq ao fazermos o override na classe dog, o metodo animalNoise ira precisar da variable chosen noise, portanto, precisamos coletar essa variavel (choosenNoise), para  o metodo animalNoise
        dog1.animalNoise(dog1.dogNoise());


        //TAMBEM PODEMOS CRIAR OBJETOS DA SUPERCLASS ANIMAL
        Animal animal1 = new Animal();

        // e usar os metodos que temos na classe animal
        System.out.println("\n \nGeneric Animal \n ");
        animal1.hungerCheck();
        animal1.feed();
        animal1.hungerCheck();

        // COMO PARA A CLASSE ANIMAL NAO TEM NENHUM OVERRIDE, PODEMOS CHAMAR O METODO DIRETO SEM ERRO
        animal1.animalNoise("AUUUUUUUUUUU");
    }
}