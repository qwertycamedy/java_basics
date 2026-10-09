public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();
        Fish fish = new Fish();

        wolf.hunt();
        rabbit.flee();
        System.out.println();

        fish.hunt();
        fish.flee();
    }
}
