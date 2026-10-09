public class Car {
    String name;
    Engine engine;

    Car (String name, String engineType) {
        this.name = name;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println(name + " started");
    }
}
