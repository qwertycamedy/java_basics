import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final String filePath = "/Users/qwertycamedy/Documents/dev/JavaFirstProject/src/words.txt";
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        String word = getWord();
        ArrayList<Character> wordState;
        int wrongGuesses = 0;

        welcome();
        wordState = initializeWordState(word);

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

    static String getWord() {
        ArrayList<String> words = new ArrayList<>();

        try (
                BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

            return words.get(random.nextInt(words.size()));
        } catch (FileNotFoundException e) {
            System.out.println("Words file was not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

        return null;
    }

    static ArrayList<Character> initializeWordState(String word) {
        ArrayList<Character> wordState = new ArrayList<>();

        System.out.print("word: ");
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
            System.out.print("_ ");
        }
        System.out.println();

        return wordState;
    }

    static void welcome() {
        System.out.println("******************");
        System.out.println("Java Hangman game!");
        System.out.println("******************");
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
