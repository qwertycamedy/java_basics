import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // runtime (dynamic) polymorphism = исполняемому объекту дается нужный класс во
        // время выполнения программы
        Vehicle vehicle;

        System.out.println("car or bike? Enter your choice: (1/2)");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            vehicle = new Car();
        } else if (choice.equals("2")) {
            vehicle = new Bike();
        } else {
            vehicle = new Car();
        }

        vehicle.go();

        scanner.close();
    }
}
