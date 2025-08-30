package dao;

import java.util.Map;

public interface FruitDao {
    void add(String fruit, int quantity);

    int getQuantity(String fruit);

    int getSize();

    Map<String,Integer> getAllItems();
}
