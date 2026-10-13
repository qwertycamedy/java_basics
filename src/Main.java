import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap - коллекция с данными ключ-значение
        // ключ - уникален, но можно перезатереть
        // значение - можно добавлять сколько угодно данных с одинаковыми значениями

        HashMap<String, Double> map = new HashMap<>();

        // основные методы HashMap
        map.put("apple", 0.5);
        map.put("pineapple", 0.7);
        map.put("grape", 1.0);
        map.put("granade", 1.2);

        map.put("pineapple", 1.0);
        System.out.println(map + " " +
                map.size());

        if (map.containsKey("apple")) {
            Double value = map.get("apple");
            System.out.println(value);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1.0) {
                System.out.println(map.containsValue(1.0));
            }
        }
    }
}