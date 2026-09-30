import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        // int age = enterAge(scanner);

        // while (age < 1) {
        // System.out.println("Age must be greater than 0");
        // age = enterAge(scanner);
        // }

        do {
            age = enterAge(scanner);

            if (age < 0) {
                System.out.println("Age must be greater than 0");
            }
        } while (age < 0);

        System.out.printf("Your age is - %d", age);

        scanner.close();
    }

    public static int enterAge(Scanner scanner) {
        System.out.print("Enter your age: ");
        return scanner.nextInt();
    }
}