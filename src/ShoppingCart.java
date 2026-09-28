import java.util.Scanner;

public class ShoppingCart {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        double itemPrice;
        int itemQuantity;

        System.out.println("Enter item name: ");
        itemName = scanner.nextLine();

        System.out.println("Enter price: ");
        itemPrice = scanner.nextDouble();

        System.out.println("Enter quantity: ");
        itemQuantity = scanner.nextInt();

        System.out.println("Your cart: " + itemQuantity + " " + itemName + " - $" + itemPrice * itemQuantity);

        scanner.close();
    }
}