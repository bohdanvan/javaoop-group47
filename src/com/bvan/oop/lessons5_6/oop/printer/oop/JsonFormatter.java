package com.bvan.oop.lessons5_6.oop.printer.oop;

import com.bvan.oop.lessons5_6.oop.printer.Product;

/**
 * @author bvanchuhov
 */
public class JsonFormatter implements ProductFormatter {
    @Override
    public String format(Product product) {
        return "{name='" + product.getName() + "', desrc='" + product.getDescription() + "', price=" + product.getPrice() + "}";
    }
}
