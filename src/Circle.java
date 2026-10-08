public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("circle's area is = "
                + Math.round(Math.PI * this.radius * this.radius * Math.pow(10, 2)) / Math.pow(10, 2));
    }
}
