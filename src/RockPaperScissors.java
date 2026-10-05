import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static final String[] elements = { "rock", "paper", "scissors" };

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        // Rock-paper-scissors game

        // welcome message
        // get choice from the user
        // get random choice from the computer
        // check win conditions
        // ask to play again
        // bye bye

        boolean isOnline = true;
        String userInput;

        welcome();
        userInput = menu();

        while (isOnline) {
            switch (userInput.trim().toLowerCase()) {
                case "play" -> userInput = game();
                case "rules" -> userInput = rules();
                case "exit" -> {
                    exit();
                    isOnline = false;
                }
                default -> {
                    wrongInput();
                    userInput = menu();
                }
            }
        }

        scanner.close();
    }

    // welcome message
    static void welcome() {
        System.out.println("---------------------------");
        System.out.println("--- ROCK PAPER SCISSORS ---");
        System.out.println("---------------------------");
    }

    /*
     * menu
     * - play game
     * - show rules
     */
    static String menu() {
        System.out.println("- Play game (play) ");
        System.out.println("- Show rules (rules) ");
        System.out.println("- Exit game (exit)");
        System.out.println("-----------------------------");
        System.out.print("- Enter what do you want to do: ");
        return scanner.nextLine();
    }

    static String rules() {
        System.out.println("-----------------------------------");
        System.out.println("--- ROCK, PAPER, SCISSORS RULES ---");
        System.out.println("- Rock beats Scissors (crushes them).");
        System.out.println("- Scissors beat Paper (cut it).");
        System.out.println("- Paper beats Rock (covers it).");
        System.out.println("- If both players choose the same item, it's a tie.");
        System.out.println("-----------------------------------");

        System.out.print("- Do you want to <play> or <exit>? ");
        return scanner.nextLine();
    }

    static String game() {
        System.out.println("-------------------------------------");
        System.out.println("- Rock (1) / Paper (2) / Scissors (3)");
        System.out.print("- Enter your choice (1/2/3): ");

        String userChoice = elements[scanner.nextInt() - 1];
        scanner.nextLine();

        String computerChoice = elements[random.nextInt(0, 3)];

        System.out.println("-----------------------------------");
        System.out.printf("You %s / Computer %s", userChoice, computerChoice);
        System.out.println();

        System.out.println("-----------------------------------");

        if (userChoice.equals(computerChoice)) {
            System.out.println("--- TIE ---");
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")
                || userChoice.equals("paper") && computerChoice.equals("rock")
                || userChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("--- You won! :) ---");
        } else {
            System.out.println("--- You lost! :( ---");
        }

        System.out.println("-----------------------------------");
        System.out.print("- Do you want to <play> again or <exit>? ");
        return scanner.nextLine();
    }

    static void wrongInput() {
        System.out.println("-----------------------------------");
        System.out.println("- There is no such number! You will be return in menu");
    }

    static void exit() {
        System.out.println("-----------------------------------");
        System.out.println("- Bye bye! :)");
    }
}