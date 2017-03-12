package com.bvan.oop.lessons5_6.oop.printer.proc;

import com.bvan.oop.lessons5_6.oop.printer.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcProductsPrinter {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(String formatType) {
        for (Product product : products) {
            System.out.println(format(formatType, product));
        }
    }

    private String format(String formatType, Product product) {
        switch (formatType) {
            case "name":
                return nameFormat(product);
            case "csv":
                return csvFormat(product);
            case "json":
                return jsonFormat(product);
            default:
                throw new IllegalArgumentException("no such format type: " + formatType);
        }
    }

    private String jsonFormat(Product product) {
        return "{name='" + product.getName() + "', desrc='" + product.getDescription() + "', price=" + product.getPrice() + "}";
    }

    private String csvFormat(Product product) {
        return product.getName() + ";" + product.getDescription() + ";" + product.getPrice();
    }

    private String nameFormat(Product product) {
        return product.getName();
    }
}
