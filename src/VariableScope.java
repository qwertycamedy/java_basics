public class VariableScope {
    static int x = 1; // variable with class scope

    public static void main(String[] args) {
        // int x = 2; // variable with local scope;

        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        // int x = 3; // variable with local scope;

        System.out.println(x);
    }
}