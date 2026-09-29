public class SwitchCase {
    public static void main() {
        String currentDay = "Sunday";

        switch (currentDay) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.print("Weekday");
            case "Saturday", "Sunday" -> System.out.print("Weekend");
            default -> System.out.print(currentDay + " is not a day");
        }
    }
}