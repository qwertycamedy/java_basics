import java.util.Scanner;

public class UserInputRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Enter width: ");
        width = scanner.nextDouble();

        System.out.println("Enter height: ");
        height = scanner.nextDouble();

        area = width * height;
        
        System.out.println("Area = " + area + "cm²");

        scanner.close();
    }
}