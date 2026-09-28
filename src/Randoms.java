import java.util.Random;

public class Randoms {
    public static void main() {
        Random random = new Random();

        // int number = random.nextInt(1, 7);
        // double decimal = random.nextDouble();
        boolean bool = random.nextBoolean();

        System.out.println(bool);
    }
}