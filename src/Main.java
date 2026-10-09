public class Main {
    public static void main(String[] args) {
        //composition - part-of relationship / большие объекты могут строиться из частей меньших объектов
        Car car = new Car("nissan silvia s14", "SR20");

        car.start();
    }
}
