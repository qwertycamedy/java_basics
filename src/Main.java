public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();

        //polymorphism это возможность использовать множество разных классов с чем-то общим, как например массив транспортных средств:
        Vehicle[] vehicles = {car, boat};
        
        // у всех vehicle есть метод go и мы можем его использовать, например, в цикле
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
