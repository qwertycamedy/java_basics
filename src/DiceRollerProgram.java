import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    public static void main(String[] args) {
        // нужно бросить заданное количество костей и отобразить их в консоли, и
        // показать общий счет со всех выпавших костей

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int diceQuantity = 0;
        int totalOfDices = 0;

        diceQuantity = start(scanner);

        for (int i = 0; i < diceQuantity; i++) {
            int dice = random.nextInt(1, 7);
            totalOfDices += dice;

            showDice(dice);
        }

        System.out.printf("Total: %d\n", totalOfDices);

        scanner.close();
    }

    static int start(Scanner scanner) {
        System.out.println("---------------");
        System.out.println("--DICE ROLLER--");
        System.out.println("---------------");

        System.out.print("Enter quantity of dices (>0): ");
        int diceQuantity = scanner.nextInt();

        while (diceQuantity < 0) {
            System.out.print("Quantity must be greater than 0!\nEnter quantity of dices (>0): ");
            diceQuantity = scanner.nextInt();
        }

        return diceQuantity;
    }

    static void showDice(int dice) {
        System.out.println(" --------- ");
        switch (dice) {
            case 1 -> {
                System.out.println("|---------|");
                System.out.println("|--- * ---|");
                System.out.println("|---------|");
            }
            case 2 -> {
                System.out.println("|--- * ---|");
                System.out.println("|---------|");
                System.out.println("|--- * ---|");
            }
            case 3 -> {
                System.out.println("| * ------|");
                System.out.println("|--- * ---|");
                System.out.println("|------ * |");
            }
            case 4 -> {
                System.out.println("| * --- * |");
                System.out.println("|---------|");
                System.out.println("| * --- * |");
            }
            case 5 -> {
                System.out.println("| * --- * |");
                System.out.println("|--- * ---|");
                System.out.println("| * --- * |");
            }
            case 6 -> {
                System.out.println("| * --- * |");
                System.out.println("| * --- * |");
                System.out.println("| * --- * |");
            }
        }
        System.out.println(" --------- ");
    }

}