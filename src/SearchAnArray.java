import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "banana", "coconut"};
        String target;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Fruit index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Fruit not found in the array");
        }

        scanner.close();
    }
}