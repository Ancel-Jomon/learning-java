package Inheritance;

public class Main {

    public static void main(String[] args) {
        Sova sova = new Sova();
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();

        sova.hunt();

        rabbit.flee();
        fish.hunt();
        fish.flee();

    }

}
