package strategy;

import dao.FruitDao;
import model.FruitTransaction;

public interface OperationHandler {
    void apply(FruitDao fruitDao, FruitTransaction transaction);
}
