package service.impl;

import dao.FruitDao;
import dao.FruitDaoImpl;
import java.util.List;
import model.FruitTransaction;
import service.OperationStrategy;
import service.ShopService;

public class ShopServiceImpl implements ShopService {
    private OperationStrategy operationStrategy;
    private FruitDao fruitDao;

    public ShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
        fruitDao = new FruitDaoImpl();
    }

    @Override
    public void process(List<FruitTransaction> transactionList) {
        for (FruitTransaction transaction : transactionList) {
            operationStrategy.get(transaction.getOperation()).apply(fruitDao, transaction);
        }
    }
}
