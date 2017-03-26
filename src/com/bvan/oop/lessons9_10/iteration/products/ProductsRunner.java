package com.bvan.oop.lessons9_10.iteration.products;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("iPhone", 1000));
        products.add(new Product("Lenovo", 800));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
