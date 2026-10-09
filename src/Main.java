public class Main {
    public static void main(String[] args) {
        Student bb = new Student("bb", 23, 3.5);

        //GETTERS and SETTERS
        
        bb.setGpa(2);
        bb.setAge(8);

        System.out.printf("%s %.0f %.2f\n", bb.getName(), bb.getAge(), bb.getGpa());
    }
}
