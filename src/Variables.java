public class Variables {
    public static void main(String[] args) {
        // primitive reference
        /*
           int        string
           double
           boolean
           char
         */

        // primitive - прямо хранятся в памяти (тебе прямо дают 10 баксов)
        // reference - хранят ссылку на объект в памяти (тебе дают чек на 10 баксов, которые лежат в банке)

        int age = 23;
        double bill = 323.25;
        boolean isEmployed = false;
        char usdSymbol = '$';

        String name = "Adil";

        System.out.println("My name is " + name);

        System.out.println("I'm " + age + " years old");

        if (isEmployed) {
            System.out.println("I'm employed");
        } else {
            System.out.println("I'm not employed");
        }

        System.out.println("My bill is: " + usdSymbol + bill);
    }
}