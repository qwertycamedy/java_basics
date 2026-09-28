// импорт пакета Сканера
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // создание нового сканера, с помощью которого мы сможем вводить свои значения в консоли
        Scanner scanner = new Scanner(System.in);

        /*
             при инпуте int/double нужно добавлять scanner.nextLine(), чтобы не было автозаполнения
             и можно было вписать новое значение
         */
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("You're " + age + " old");
        System.out.println("Your name is " + name);

        // обязательно нужно закрывать сканнер по окончании отрабатывания нужного функционала,
        // чтобы он случайно не переннеся в другую программу
        scanner.close();
    }
}