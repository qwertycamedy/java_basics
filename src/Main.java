import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/qwertycamedy/Documents/dev/JavaFirstProject/src/song.wav";
        File file = new File(path);

        try (
                Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();) {

            clip.open(audioStream);
            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P - play");
                System.out.println("S - stop");
                System.out.println("R - reset");
                System.out.println("Q - quit");
                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!\n");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("File format is unsupported!");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access file!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("Bye Bye! :)");
        }
    }
}
