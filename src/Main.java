import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    static final String soundPath = "src/alarm_sound.wav";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String inputTime;

        while (alarmTime == null) {
            try {
                System.out.println("Enter alarm time: (HH:mm:ss)");
                inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, dateTimeFormatter);
                System.out.println("alarm set in: " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Enter valid time!");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, soundPath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}