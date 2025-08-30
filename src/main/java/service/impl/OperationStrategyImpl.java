package service.impl;

import java.util.Map;
import model.FruitTransaction;
import service.OperationStrategy;
import strategy.OperationHandler;

public class OperationStrategyImpl implements OperationStrategy {
    private Map<FruitTransaction.Operation, OperationHandler> operationHandlerMap;

    public OperationStrategyImpl(Map<FruitTransaction.Operation, OperationHandler> map) {
        operationHandlerMap = map;
    }

    @Override
    public OperationHandler get(FruitTransaction.Operation operation) {
        return operationHandlerMap.get(operation);
    }
}
