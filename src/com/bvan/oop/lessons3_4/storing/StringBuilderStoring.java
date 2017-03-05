package com.bvan.oop.lessons3_4.storing;

/**
 * @author bvanchuhov
 */
public class StringBuilderStoring {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", world");
        String s = sb.toString();
        System.out.println(s); // Hello, world
    }
}
