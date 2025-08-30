package service.impl;

import model.FruitTransaction;
import service.Parser;

public class ParserImpl implements Parser<FruitTransaction> {
    @Override
    public FruitTransaction parse(String transaction) {
        String[] parts = transaction.split(",");
        FruitTransaction.Operation operation = FruitTransaction.Operation.fromCode(parts[0]);
        String fruit = parts[1];
        int quantity = Integer.parseInt(parts[2]);
        return new FruitTransaction(operation,fruit,quantity);
    }
}
