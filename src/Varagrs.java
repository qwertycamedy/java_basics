public class Varagrs {
    public static void main(String[] args) {
        // допустим, сейчас нам нужно найти среднее всех чисел массива
        System.out.println(average(1, 2, 3));
    }

    // троеточие позволяет добавлять сколько угодно однотипных данных в
    // переменную-массив
    static double average(double... numbers) {
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}