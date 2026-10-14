import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // создание нового потока
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // ставим true в setDaemon, если хотим, чтобы наш поток завершился вместе с
        // завершением main потока
        thread.setDaemon(true);

        String name;

        System.out.println("У тебя 5 секунд, чтобы ввести свое имя!");

        // вызываем наш поток для параллельного выполнения (есть еще run, который
        // заставит вести код не параллельно, а в основном потоке вместе с main)
        thread.start();

        System.out.print("Введи свое имя: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}