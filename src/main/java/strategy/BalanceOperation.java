package strategy;

import dao.FruitDao;
import model.FruitTransaction;

public class BalanceOperation implements OperationHandler {
    @Override
    public void apply(FruitDao fruitDao, FruitTransaction transaction) {
        fruitDao.add(transaction.getFruit(), transaction.getQuantity());
    }
}
