public class CarConstructor {
    String model;
    String color;

    CarConstructor(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.printf("%s %s Wrum Wrum!!!", this.color, this.model);
    }

    void stop() {        
        System.out.printf("%s %s Pick Pick!!!", this.color, this.model);
    }
}
