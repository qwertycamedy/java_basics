public class Student {
    //запрет просмотра и изменения имени
    private final String name;
    //запрет просмотра
    private double age;
    private double gpa;

    //создание объекта (не изменение)
    Student(String name, double age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    //методы просмотра данных для лучшей читаемости начинаются с "get"
    String getName() {
        return this.name;
    }

    double getAge() {
        return this.age;
    }

    double getGpa() {
        return this.gpa;
    }

    //методы изменения данных начинаются с "set"
    void setAge(double age) {
        this.age = age;
    }

    void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
