public class TwoDArray {
    public static void main(String[] args) {
        // массивы в массиве
        String[] fruits = { "apple", "banana" };
        String[] vegetables = { "carrot", "potato", "onion" };
        String[] meats = { "eggs" };
        String[][] groceries = { fruits, vegetables, meats };

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}