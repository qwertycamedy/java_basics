import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String soundPath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String soundPath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.soundPath = soundPath;
        this.scanner = scanner;
    }

    private void playSound(String soundPath) {
        File soundFile = new File(soundPath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();) {
            clip.open(audioStream);
            clip.start();

            System.out.println("To stop alarm press *Enter*");
            scanner.nextLine();

            clip.stop();
            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("unsupported alarm audio file!");
        } catch (LineUnavailableException e) {
            System.out.println("Alarm audio is unavailable!");
        } catch (IOException e) {
            System.out.println("something went wrong with alarm audio!");
        }
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                LocalTime now = LocalTime.now();

                System.out.printf(
                        "\r%02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond());

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e);
            }
        }

        System.out.println("\n*ALARM NOISES*");
        playSound(soundPath);
    }
}
