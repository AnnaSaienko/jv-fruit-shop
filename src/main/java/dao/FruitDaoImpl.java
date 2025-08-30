package dao;

import db.Storage;
import java.util.HashMap;
import java.util.Map;

public class FruitDaoImpl implements FruitDao {
    @Override
    public void add(String fruit, int quantity) {
        if (quantity >= 0) {
            Storage.fruits.put(fruit,quantity);
        } else {
            throw new RuntimeException("The quantity can't be less than 0!");
        }
    }

    @Override
    public int getQuantity(String fruit) {
        return Storage.fruits.getOrDefault(fruit, 0);
    }

    @Override
    public int getSize() {
        return Storage.fruits.size();
    }

    @Override
    public Map<String, Integer> getAllItems() {
        return new HashMap<>(Storage.fruits);
    }
}
