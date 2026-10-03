import java.util.Arrays;

public class Collections {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "coconut", "banana"};

        //how to replace item in array with index;
        // fruits[0] = "pineapple";

        //how to show all fruits with regular ForLoop //how to find out the length of an array
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.print(fruits[i] + " ");
        // }

        //how to sort array;
        // Arrays.sort(fruits);

        //how to replace all items of an array;
        Arrays.fill(fruits, "pineapple");

        //how to show item of an array with ForInLoop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}