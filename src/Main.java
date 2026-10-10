import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // arrayLists / стандартные массивы в java имеют фиксированную длину, а
        // arraylist позволяет нам добавлять и легко изменять/удалять элементы в массив
        // ArrayList<String> list = new ArrayList<>(List.of("apple", "banana"));

        // list.add("orange");
        // list.add("grapefruit");

        // list.set(1, "pineapple");

        // list.remove(3);

        // System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3)); // чтобы хранить примитивы в arraylist, нужно
                                                                     // оборачивать их в объект Integer и делать их
                                                                     // refference data

        System.out.println("how many fruits you want to add to fruits arraylist?");
        System.out.println("Enter #: (int)");
        int numOfSum = Integer.parseInt(scanner.nextLine()); // тут кстати показывается, как примитивы оборачивать в
                                                             // объекты

        for (int i = 0; i < numOfSum; i++) {
            System.out.println("Enter fruit name: ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        System.out.println();
        System.out.println(fruits);
        System.out.println();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}
