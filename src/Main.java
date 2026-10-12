import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final String word = "pizza";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Character> wordState = initializeWordState(word);
        int wrongGuesses = 0;

        welcome();

        while (wrongGuesses < 6) {
            char guess = enterGuess();

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }

                    System.out.print(wordState.get(i) + " ");
                }

                System.out.println();

                if (!wordState.contains('_')) {
                    System.out.println("You win!");
                    showHangman(wrongGuesses);
                    System.out.println("The guess word was: " + word);
                    break;
                }
            } else {
                System.out.println("Uncorrect guess!");

                wrongGuesses++;
                showHangman(wrongGuesses);
            }
        }

        scanner.close();
    }

    static void welcome() {
        System.out.println("******************");
        System.out.println("Java Hangman game!");
        System.out.println("******************");
    }

    static ArrayList<Character> initializeWordState(String word) {
        ArrayList<Character> wordState = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        return wordState;
    }

    static void showHangman(int wrongGuesses) {
        switch (wrongGuesses) {
            case 0 -> {
                System.out.println("Clear victory!");
            }
            case 1 -> {
                System.out.println("""
                        *


                            """);
            }
            case 2 -> {
                System.out.println("""
                        *
                        |
                            """);
            }
            case 3 -> {
                System.out.println("""
                         *
                        /|

                         """);
            }
            case 4 -> {
                System.out.println("""
                         *
                        /|\\

                         """);
            }
            case 5 -> {
                System.out.println(
                        """
                                 *
                                /|\\
                                /
                                 """);
            }
            case 6 -> {
                System.out.println(
                        """
                                 *
                                /|\\
                                / \\
                                 """);
            }
            default -> {
                System.out.println("Invalid guess num!");
            }
        }
    }

    static char enterGuess() {
        System.out.print("Guess letter: ");
        char guess = scanner.next().toLowerCase().charAt(0);
        scanner.nextLine();

        return guess;
    }
}
