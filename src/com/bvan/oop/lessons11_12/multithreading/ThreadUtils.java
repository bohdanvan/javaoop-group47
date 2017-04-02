package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadUtils {

    public static void println(String message) {
        Thread thread = Thread.currentThread();
        System.out.println(thread + ": " + message);
    }
}
