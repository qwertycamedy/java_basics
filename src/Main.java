public class Main {
    public static void main(String[] args) {
        // This is my first Java program

        /*
         * multi-line
         * comment
         */

        // System.out.println("Qwertycamedy");
        // System.out.print("Bb is cooking chicken in the kitchen\n");
        // System.out.print("New line 2");

        ////////////////////////

        // CarOOP car = new CarOOP();

        // System.out.printf("My car is %s %s %.0f\n", car.make, car.model, car.version);

        // // car.isDriving = true;
        // // System.out.println(car.isDriving);

        // car.start();
        // System.out.println(car.isDriving);

        // car.stop();
        // System.out.println(car.isDriving);

        ///////////////////////

        StudentOOP student1 = new StudentOOP("Ibb", 23, 3.0);
        StudentOOP student2 = new StudentOOP("Adil", 23, 2.0);
        StudentOOP student3 = new StudentOOP("Danik", 23, 1.5);

        student1.showStudent();
        student2.showStudent();
        student3.showStudent();
    }
}
