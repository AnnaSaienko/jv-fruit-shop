package db;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    public static final Map<String,Integer> fruits = new HashMap<>();

    public static void add(String fruit, int quantity) {
        if (quantity >= 0) {
            fruits.put(fruit,quantity);
        } else {
            throw new RuntimeException("The quantity can't be less than 0!");
        }
    }

    public static int getQuantity(String fruit) {
        return fruits.getOrDefault(fruit, 0);
    }

    public static Map<String, Integer> getAllItems() {
        return new HashMap<>(fruits);
    }
}
