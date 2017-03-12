package com.bvan.oop.lessons5_6.oop.printer.oop;

import com.bvan.oop.lessons5_6.oop.printer.Product;

/**
 * @author bvanchuhov
 */
public class CsvFormatter implements ProductFormatter {
    @Override
    public String format(Product product) {
        return product.getName() + ";" + product.getDescription() + ";" + product.getPrice();
    }
}
