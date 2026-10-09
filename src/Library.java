public class Library {
    String name;
    int age;
    Book[] books;

    Library(String name, int age, Book[] books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    void displayInfo() {
        System.out.printf("name: %s, age: %d\n", this.name, this.age);
        System.out.println("Books in library: ");

        for (Book book : books) {
            book.displayInfo();
        }
    }
}
