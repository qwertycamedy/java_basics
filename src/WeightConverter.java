import java.util.Scanner;

public class WeightConverter {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        double kgInLb = 2.20;
        double lbInKg = 0.45;

        int choice;
        double weight;

        System.out.println("Weight Conversion Program");
        System.out.println("1 - Convert lbs to kgs");
        System.out.println("2 - Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice > 2 || choice < 1) {
            System.out.print("Choice must be 1/2. Restart the program!");
        } else {
            if (choice == 1) {
                System.out.print("Enter weight in lbs: ");
                weight = scanner.nextInt() * lbInKg;

                System.out.printf("The new weight in kgs: %.2f", weight);
            } else if (choice == 2) {
                System.out.print("Enter weight in kgs: ");
                weight = scanner.nextInt() * kgInLb;

                System.out.printf("The new weight in lbs: %.2f", weight);
            }
        }

        scanner.close();
    }
}