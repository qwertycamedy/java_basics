public class InheritianceAnimal extends InheritianceOrganism {
    String name;

    InheritianceAnimal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.printf("%s is eating\n", this.name);
    }
}