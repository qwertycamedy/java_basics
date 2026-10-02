public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 4; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.print("Happy new year!");
    }
}