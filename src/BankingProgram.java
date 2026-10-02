import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currency = '$';
        double balance = 300.32;
        int choice;
        boolean isOnline = true;

        choice = preview(scanner);

        do {
            switch (choice) {
                case 0 -> {
                    choice = preview(scanner);
                }
                case 1 -> {
                    showBalance(currency, balance);
                    choice = previewOrExit(scanner);
                }
                case 2 -> {
                    balance = deposit(scanner, balance);
                    choice = previewOrExit(scanner);
                }
                case 3 -> {
                    balance = withdraw(scanner, balance);
                    choice = previewOrExit(scanner);
                }
                case 4 -> {
                    isOnline = exit();
                }
                default -> {
                    choice = previewAfterError();
                }
            }

        } while (isOnline);

        scanner.close();
    }

    static int preview(Scanner scanner) {
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");

        System.out.print("Enter your choice (1-4): ");

        return scanner.nextInt();
    }

    static int previewOrExit(Scanner scanner) {
        System.out.println("***************");
        System.out.println("Back to preview (1) or exit (2)?");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return 0;
        } else if (choice == 2) {
            return 4;
        }

        return choice;
    }

    static int previewAfterError() {
        System.out.println("***************");
        System.out.println("There is no such choice! You will be redirected to preview");
        System.out.println("***************");
        return 0;
    }

    static void showBalance(char currency, double balance) {
        System.out.println("***************");
        System.out.println("BALANCE");
        System.out.println("***************");
        System.out.println("Your balance is - " + currency + balance);
    }

    static double deposit(Scanner scanner, double balance) {
        System.out.println("***************");
        System.out.println("DEPOSIT");
        System.out.println("***************");

        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();

        double newBalance = balance + amount;

        System.out.println("Deposit has been successful.\nNow your balance: " + newBalance);

        return newBalance;
    }

    static double withdraw(Scanner scanner, double balance) {
        System.out.println("***************");
        System.out.println("WITHDRAW");
        System.out.println("***************");

        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();

        double newBalance = balance - amount;

        System.out.println("Deposit has been successful.\nNow your balance: " + newBalance);

        return newBalance;
    }

    static boolean exit() {
        System.out.println("Bye! :)");

        return false;
    }
}