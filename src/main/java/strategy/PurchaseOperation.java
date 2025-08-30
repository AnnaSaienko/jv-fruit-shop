package strategy;

import dao.FruitDao;
import model.FruitTransaction;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void apply(FruitDao fruitDao, FruitTransaction transaction) {
        int currentQuantity = fruitDao.getQuantity(transaction.getFruit());
        if (currentQuantity >= transaction.getQuantity()) {
            fruitDao.add(transaction.getFruit(), currentQuantity - transaction.getQuantity());
        } else {
            throw new RuntimeException("There is not enough of this fruit in the store.");
        }
    }
}
