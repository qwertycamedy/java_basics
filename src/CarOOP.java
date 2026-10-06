public class CarOOP {
    String make = "Nissan";
    String model = "Silvia";
    double version = 14;
    boolean isDriving = false;

    void start() {
        isDriving = true;
        System.out.println("Wrum Wrum!!!");
    }

    void stop() {
        isDriving = false;
        System.out.println("Pick pick!!!");
    }
}
