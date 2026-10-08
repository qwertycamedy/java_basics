public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("rectangle's area is = " + (this.width * this.height));
    }
}
