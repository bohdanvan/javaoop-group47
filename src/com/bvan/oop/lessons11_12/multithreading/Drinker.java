package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId;
    private final int id = nextId++;

    @Override
    public void run() {
        for (int beer = 0; beer < 5; beer++) {
            ThreadUtils.println(
                    "I'm " + id + " drinker. " +
                    "I'm drinking " + beer + " beer"
            );
        }
    }
}
