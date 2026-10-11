import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // write files
        // есть четыре способа делать это
        // в этом уроке будет самый простой для легких-средних текстовых файлов
        String path = "/Users/qwertycamedy/Downloads/";
        String name = "test.txt";
        String textContent = """
                New file with some text
                Hello world
                Hello file
                        """;

        try (FileWriter fileWriter = new FileWriter(path + name)) {
            fileWriter.write(textContent);
            System.out.println("file has been written");
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file location");
        } catch (IOException e) {
            System.out.println("could not write file");
        }
    }
}
