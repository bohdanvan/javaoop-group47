package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Bar {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Drinker());
        thread.start();

        thread.join(1000);

        ThreadUtils.println("Bar is closed");
    }
}
