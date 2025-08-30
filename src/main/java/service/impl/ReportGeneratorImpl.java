package service.impl;

import dao.FruitDao;
import dao.FruitDaoImpl;
import java.util.Map;
import service.ReportGenerator;

public class ReportGeneratorImpl implements ReportGenerator {
    public static final String COLUMN_NAMES = "fruit,quantity";
    public static final String SEPARATOR = ",";
    public static final String NEW_LINE = "\n";

    @Override
    public String getReport() {
        StringBuilder builder = new StringBuilder();
        FruitDao fruitDao = new FruitDaoImpl();
        if (fruitDao.getSize() > 0) {
            builder.append(COLUMN_NAMES).append(NEW_LINE);
            Map<String,Integer> map = fruitDao.getAllItems();
            for (Map.Entry<String,Integer> entry : map.entrySet()) {
                builder.append(entry.getKey())
                        .append(SEPARATOR)
                        .append(entry.getValue())
                        .append(NEW_LINE);
            }
        } else {
            throw new RuntimeException("There is no transaction data in the store");
        }
        return builder.toString();
    }
}
