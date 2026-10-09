public class Book {
    String name;
    int age;

    Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("name: %s, age: %d\n", this.name, this.age);
    }
}
