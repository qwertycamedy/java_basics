public class OverloadedConstructor {
    String name;
    String email;
    int age;

    OverloadedConstructor() {
        this.name = "Guest";
        this.email = "not provided";
        this.age = 0;
    };

    OverloadedConstructor(String name) {
        this.name = name;
        this.email = "not provided";
        this.age = 0;
    }

    OverloadedConstructor(String name, String email) {
        this.name = name;
        this.email = email;
        this.age = 0;
    }

    OverloadedConstructor(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}