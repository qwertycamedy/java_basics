public class Employe extends Person {
    double salary;

    Employe(String first, String last, double salary) {
        super(first, last);

        this.salary = salary;
    }
    
    void showSalary() {
        System.out.println(this.first + " " + this.last + "'s salary is: $" + this.salary);
    }
}
