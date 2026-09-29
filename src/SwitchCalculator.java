import java.util.Scanner;

public class SwitchCalculator {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        double first;
        char operator;
        double second;
        double result;

        System.out.print("First: ");
        first = scanner.nextDouble();

        System.out.print("Choose an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Second: ");
        second = scanner.nextDouble();

        switch (operator) {
            case '+' -> {
                result = first + second;
            }
            case '-' -> {
                result = first - second;
            }
            case '*' -> {
                result = first * second;
            }
            case '/' -> {
                result = first / second;
            }
            default -> {
                result = 0;
                System.out.print("Unexceptable operator");
            }
        }

        System.out.printf("Result: %.2f", result);

        scanner.close();
    }
}