public class Methods {
    public static void main(String[] args) {
        helloWorld();

        String name = "Adil";
        int age = 23;

        int mySquare = square(3);
        System.out.println(mySquare);

        double myCube = cube(3);
        System.out.println(myCube);

        System.out.println(happyBirthday(name, age));

        if (canAuth(age)) {
            System.out.println("You are can auth");
        } else {
            System.out.println("You are can't auth");
        }
    }

    // returns nothing
    static void helloWorld() {
        System.out.println("Hello World");
    }

    // returns decimals
    static int square(int number) {
        return number * number;
    }

    // returns floats
    static double cube(double number) {
        return number * number * number;
    }

    static String happyBirthday(String name, int age) {
        return "Happy birthday dear " + name + "! You are " + age + " old!";
    }

    static boolean canAuth(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}