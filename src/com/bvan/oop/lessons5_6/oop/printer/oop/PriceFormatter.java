package com.bvan.oop.lessons5_6.oop.printer.oop;

import com.bvan.oop.lessons5_6.oop.printer.Product;

/**
 * @author bvanchuhov
 */
public class PriceFormatter implements ProductFormatter {
    @Override
    public String format(Product product) {
        long price = product.getPrice();
        return String.valueOf(price);
    }
}
