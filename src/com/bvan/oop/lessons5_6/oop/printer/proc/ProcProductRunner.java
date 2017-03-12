package com.bvan.oop.lessons5_6.oop.printer.proc;

import com.bvan.oop.lessons5_6.oop.printer.Product;

/**
 * @author bvanchuhov
 */
public class ProcProductRunner {

    public static void main(String[] args) {
        ProcProductsPrinter products = new ProcProductsPrinter();
        products.add(new Product("MacBook", "notebook", 2000));
        products.add(new Product("Meizu", "smartphone", 300));

        products.print("json");
    }
}
