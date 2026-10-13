import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Day day;

            System.out.print("Enter a day name: ");
            String response = scanner.nextLine().toUpperCase();

            day = Day.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESSDAY, THURSDAY, FRIDAY -> {
                    System.out.printf("This day is %d weekday!", day.getDayNumber());
                }
                case SATURDAY, SUNDAY, QCDAY -> {
                    System.out.printf("This day is %d weekend!", day.getDayNumber());
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a valid day on next time!");
        }
    }
}