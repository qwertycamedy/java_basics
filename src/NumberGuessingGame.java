import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(1, 11);
        int guessNum;
        int attempts = 0;

        System.out.println("Number Guessing Game!");

        do {

            String startingAlert = ((attempts > 0) ? "You did " + attempts + " attempts! Reenter " : "Enter ")
                    + "your guess number: ";
            System.out.print(startingAlert);

            guessNum = scanner.nextInt();
            attempts++;

            if (guessNum < randomNum) {
                System.out.println("Guess number is too low! Try again");
            } else if (guessNum > randomNum) {

                System.out.println("Guess number is too high! Try again");
            }
        } while (guessNum != randomNum);

        System.out
                .println("You guessed right! Random num is " + randomNum + ". It took you " + attempts
                        + " tries.");

        scanner.close();
    }
}