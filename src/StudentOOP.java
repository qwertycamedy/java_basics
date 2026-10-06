public class StudentOOP {
    String name;
    int age;
    double gpa;
    boolean enrolled;

    StudentOOP(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.enrolled = true;
    }

    void showStudent() {
        System.out.printf("student %s is %d years old. His/Her gpa is %.1f and He/She enrolled: %b\n\n",
                this.name,
                this.age,
                this.gpa,
                this.enrolled);
    }
}
