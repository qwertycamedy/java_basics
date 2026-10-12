import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (count > 0) {

                    System.out.println(count);
                    count--;
                } else {
                    System.out.println("Bipp Bipp!!!");
                    timer.cancel();
                }
            }
        };

        welcome();
        count = setCount();
        timer.schedule(task, 0, 1000);

        scanner.close();
    }

    static void welcome() {
        System.out.println("-----------");
        System.out.println("Java Timer!");
    }

    static int setCount() {
        System.out.println("-----------");
        System.out.print("Enter a quantity of seconds for your timer: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }
}
