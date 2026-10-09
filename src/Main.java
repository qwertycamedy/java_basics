public class Main {
    public static void main(String[] args) {
        //agreagation - (has-a relationship / содержит-имеет) один объект содержит другой, но содержащийся объект и имеющий могут работать независимо друг от друга

        Book book1 = new Book("The lord of the rings", 1920);
        Book book2 = new Book("The lord of the rings || ", 1926);
        Book book3 = new Book("The lord of the rings ||| ", 1932);

        Book[] books = {book1,book2,book3};

        Library library = new Library("Astana library", 1980, books);

        book3.displayInfo();
        library.displayInfo();
    }
}
