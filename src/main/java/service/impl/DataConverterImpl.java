package service.impl;

import java.util.List;
import model.FruitTransaction;
import service.DataConverter;
import service.Parser;

public class DataConverterImpl implements DataConverter {
    private Parser<FruitTransaction> parser = new ParserImpl();

    @Override
    public List<FruitTransaction> convertToTransaction(List<String> inputData) {
        if (!inputData.get(0).matches("^[bprs],[a-zA-Z]+,\\d+$")) {
            inputData.remove(0);
        }
        return inputData.stream()
                .map(parser::parse)
                .toList();
    }
}
