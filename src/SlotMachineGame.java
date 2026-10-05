import java.util.Random;
import java.util.Scanner;

public class SlotMachineGame {
    static final String[] slots = { "🍒", "🍉", "🍋", "🔔", "⭐" };
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        /*
         *************************
         * Welcome to Java Slots
         * Symbols: 🍒 🍉 🍋 🔔 ⭐
         *************************
         * Current balance: $100
         * Place your bet bet: 10
         * Spinning...
         *************
         * 🍉 | 🍒 | 🍉
         *************
         * Sorry you lost this round
         * Do you want to play again? (Y/N):
         */

        boolean isOnline = true;
        char currency = '$';
        double balance = 100;
        double bet = 0;

        welcome();
        showBalance(currency, balance);

        while (isOnline) {
            double[] newBetAndBalance = placeBet(balance);
            bet = newBetAndBalance[0];
            balance = newBetAndBalance[1];

            balance = game(balance, bet);

            showBalance(currency, balance);
            isOnline = playAgain();
            if (!isOnline) {
                exit();
            }
        }

        scanner.close();
    }

    static void welcome() {
        System.out.println("*********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
    }

    static void showBalance(char currency, double balance) {
        System.out.println("*********************");
        System.out.printf("Current balance: %c%.2f\n", currency, balance);
    }

    static double[] placeBet(double balance) {
        double bet = 0;
        boolean canGoOn = false;

        while (!canGoOn) {
            System.out.println("*********************");
            System.out.print("Place your bet bet: ");
            bet = scanner.nextDouble();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("*********************");
                System.out.println("bet greater than your balance!");
            } else if (bet <= 0) {
                System.out.println("*********************");
                System.out.println("bet should be greater 0!");
            } else {
                balance -= bet;
                canGoOn = true;
            }
        }

        return new double[] { bet, balance };
    }

    static double game(double balance, double bet) {
        System.out.println("*********************");
        System.out.println("Spinning...");

        String[] droppedSlots = new String[3];

        for (int i = 0; i < droppedSlots.length; i++) {
            droppedSlots[i] = slots[random.nextInt(0, 4)];
        }

        System.out.println("*********************");
        System.out.printf("%s | %s | %s\n", droppedSlots[0], droppedSlots[1], droppedSlots[2]);

        if (droppedSlots[0].equals(droppedSlots[1]) && droppedSlots[1].equals(droppedSlots[2])) {
            System.out.println("*********************");
            System.out.println("Yay! You ABSOLUTELY won this round!");
            return balance + bet * 10;
        } else if (droppedSlots[0].equals(droppedSlots[1]) && !droppedSlots[0].equals(droppedSlots[2])
                || droppedSlots[0].equals(droppedSlots[2]) && !droppedSlots[0].equals(droppedSlots[1])
                || droppedSlots[1].equals(droppedSlots[0]) && !droppedSlots[1].equals(droppedSlots[2])
                || droppedSlots[1].equals(droppedSlots[2]) && !droppedSlots[1].equals(droppedSlots[0])) {
            System.out.println("*********************");
            System.out.println("Yay! You PARTIALLY won this round!");
            return balance + bet * 5;
        } else {
            System.out.println("*********************");
            System.out.println("Sorry you lost this round...");
            return balance;
        }
    }

    static boolean playAgain() {
        System.out.println("*********************");
        System.out.println("Do you want to play again?");
        System.out.print("Enter Play (1) or Exit (2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            return true;
        } else {
            return false;
        }
    }

    static void exit() {
        System.out.println("*********************");
        System.out.print("Bye bye! :)");
    }
}