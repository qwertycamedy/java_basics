public class Car {
    String make;
    String model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return this.make + " " + this.model;
    }
}
