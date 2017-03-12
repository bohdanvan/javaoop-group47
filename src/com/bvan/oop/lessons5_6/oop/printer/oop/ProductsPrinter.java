package com.bvan.oop.lessons5_6.oop.printer.oop;

import com.bvan.oop.lessons5_6.oop.printer.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProductsPrinter {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(ProductFormatter formatter) {
        for (Product product : products) {
            System.out.println(formatter.format(product));
        }
    }
}
