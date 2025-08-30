package strategy;

import dao.FruitDao;
import model.FruitTransaction;

public class ReturnOperation implements OperationHandler {
    @Override
    public void apply(FruitDao fruitDao, FruitTransaction transaction) {
        int currentQuantity = fruitDao.getQuantity(transaction.getFruit());
        fruitDao.add(transaction.getFruit(), currentQuantity + transaction.getQuantity());
    }
}
