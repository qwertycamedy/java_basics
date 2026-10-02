import java.util.Scanner;

public class RowsAndColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int cols;
        char symbol = '#';

        System.out.print("Enter quantity of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter quantity of columns: ");
        cols = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }

            System.err.println();
        }

        scanner.close();
    }
}