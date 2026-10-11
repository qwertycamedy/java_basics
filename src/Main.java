import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // read files
        // читать файлы мы можем с помощью трех популярных способов
        // Buffered reader + File Reader = лучший способ чтения текстовых файлов
        // lineByLine
        // FileInputStream = binary files (e.g., images, audio files);
        // RandomAccessFile = Best for read/write specific portions of a large file

        String path = "/Users/qwertycamedy/Documents/dev/JavaFirstProject/test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
