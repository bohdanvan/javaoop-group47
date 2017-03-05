package com.bvan.oop.lessons3_4.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(", world");
        System.out.println(s); // Hello, world
    }
}
