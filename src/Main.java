public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 4);

        circle.display();
        circle.area();

        rectangle.display();
        rectangle.area();
    }
}
