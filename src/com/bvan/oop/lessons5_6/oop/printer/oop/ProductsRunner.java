package com.bvan.oop.lessons5_6.oop.printer.oop;

import com.bvan.oop.lessons5_6.oop.printer.Product;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        ProductsPrinter productsPrinter = new ProductsPrinter();
        productsPrinter.add(new Product("MacBook", "notebook", 2000));
        productsPrinter.add(new Product("Meizu", "smartphone", 300));

        productsPrinter.print(new CsvFormatter());
        System.out.println();

        productsPrinter.print(new ProductFormatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        });
    }
}
