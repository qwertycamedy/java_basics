public class Main {
    public static void main(String[] args) {
        // generics - позволяют нам создавать в классах/методах/интерфейсах
        // концептуальные типы для того, чтобы иметь совместимость с реальными типами
        // данных

        // 1) вариант с одним дженериком
        // Box<Double> box = new Box<>();
        // box.setItem(3.14);
        // System.out.println(box.getItem());

        // 2) можно пробрасывать множество своих дженериков
        Product<String, Integer> p1 = new Product<>("apple", 10);
        Product<Character, Double> p2 = new Product<>('-', 0.0);
        System.out.println(p1.getItem() + " " + p1.getPrice());
        System.out.println(p2.getItem() + " " + p2.getPrice());
    }
}