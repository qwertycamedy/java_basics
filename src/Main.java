public class Main {
    public static void main(String[] args) {
        Student bb = new Student("Bb", "Kairbekova", 3.5);
        Employe adil = new Employe("Adil", "Kairbekov", 1500);

        bb.showName();
        bb.showGpa();
        System.out.println();
        adil.showName();
        adil.showSalary();
    }
}
