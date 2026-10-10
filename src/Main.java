import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // при ошибке приложение полностью останавливает выполнение и оставшийся код не
        // отрабатывает
        // System.out.print("num: ");
        // например, если ввести здесь строковое значение, то программа заглохнет
        // int num = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println(num);
        // scanner.close();

        // для решения данной проблемы существуют "исключения"/exceptions, которые
        // позволяют обрабатывать ошибки с нашим собственным сценарием
        // реализовать мы это можем через try (Resourse) / catch (SomeException) /
        // finally

        // в try (...) можно вписывать ресурсы и, например, scanner.close() сам выполнится в finally
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("10 + num. Enter num: ");
            int num = scanner.nextInt();
            scanner.nextLine();

            int result = 10 + num;

            System.out.println("result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arifmetic Exception: " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            System.out.println("FINALLY ALERT!");
        }
    }
}
