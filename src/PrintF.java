public class PrintF {
    public static void main() {
        int age = 23;
        String name = "Adil";
        char firstLetter = 'A';
        double height = 183.3;

        System.out.printf("%s is %d years old and his name's first letter is %c and his height is %.1fsm ", name, age,
                firstLetter, height);
    }
}