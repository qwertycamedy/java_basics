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

        //////////////////////

        // CarOOP car = new CarOOP();

        // System.out.printf("My car is %s %s %.0f\n", car.make, car.model,
        // car.version);

        // // car.isDriving = true;
        // // System.out.println(car.isDriving);

        // car.start();
        // System.out.println(car.isDriving);

        // car.stop();
        // System.out.println(car.isDriving);

        /////////////////////

        // StudentOOP student1 = new StudentOOP("Ibb", 23, 3.0);
        // StudentOOP student2 = new StudentOOP("Adil", 23, 2.0);
        // StudentOOP student3 = new StudentOOP("Danik", 23, 1.5);

        // student1.showStudent();
        // student2.showStudent();
        // student3.showStudent();

        /////////////////////

        // OverloadedConstructor user1 = new OverloadedConstructor();
        // OverloadedConstructor user2 = new OverloadedConstructor("Spider-man");
        // OverloadedConstructor user3 = new OverloadedConstructor("Spider-man",
        // "spidey@gmail.com");
        // OverloadedConstructor user4 = new OverloadedConstructor("Spider-man",
        // "spidey@gmail.com", 23);

        // System.out.printf("name: %s email: %s age: %d \n", user1.name, user1.email,
        // user1.age);
        // System.out.printf("name: %s email: %s age: %d \n", user2.name, user2.email,
        // user2.age);
        // System.out.printf("name: %s email: %s age: %d \n", user3.name, user3.email,
        // user3.age);
        // System.out.printf("name: %s email: %s age: %d \n", user4.name, user4.email,
        // user4.age);

        /////////////////////

        // CarConstructor car1 = new CarConstructor("Silvia", "Black");
        // CarConstructor car2 = new CarConstructor("Charger", "Red");
        // CarConstructor car3 = new CarConstructor("Camaro", "Yellow");

        // CarConstructor[] cars = {car1, car2, car3};
        // CarConstructor[] cars = {new CarConstructor("Silvia", "Black"), new
        // CarConstructor("Charger", "Red"), new CarConstructor("Camaro", "Yellow")};

        // for (CarConstructor car : cars) {
        // car.color = "Pink";
        // }

        // for (CarConstructor car : cars) {
        // car.drive();
        // System.out.println();
        // }

        /////////////////////
        // static - благодаря данному пресету переменная/метод прикрепляются к всему
        // классу, а не к отдельному экземпляру

        // FriendOOP friend1 = new FriendOOP("Timka", 24);
        // FriendOOP friend2 = new FriendOOP("Violet", 23);
        // FriendOOP friend3 = new FriendOOP("Adil", 23);
        // FriendOOP friend4 = new FriendOOP("Danik", 23);

        // System.out.println(FriendOOP.friendsQuantity);
        // FriendOOP.showFriend();
    }
}
