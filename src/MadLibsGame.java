import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb (with +ing end): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.print("Today I was in " + adjective1 + " zoo. ");
        System.out.print("In the exhibit I saw " + noun1 + " . ");
        System.out.print("He was " + adjective2 + " and " + verb1 + " . ");
        System.out.print("I'm " + adjective3 + "!");

        scanner.close();
    }
}