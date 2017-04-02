package com.bvan.oop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class ExecutorServiceSample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(8);

        service.execute(new Drinker());
        service.execute(new Drinker());
        service.execute(new Drinker());
        service.execute(new Drinker());

        service.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
