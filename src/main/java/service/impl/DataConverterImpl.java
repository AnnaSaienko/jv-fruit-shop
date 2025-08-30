package service.impl;

import java.util.List;
import model.FruitTransaction;
import service.DataConverter;
import service.Parser;

public class DataConverterImpl implements DataConverter {
    private Parser<FruitTransaction> parser = new ParserImpl();

    @Override
    public List<FruitTransaction> convertToTransaction(List<String> inputData) {
        return inputData.stream()
                .filter(string -> string.matches("^[bprs],[a-zA-Z]+,\\d+$"))
                .map(parser::parse)
                .toList();
    }
}
