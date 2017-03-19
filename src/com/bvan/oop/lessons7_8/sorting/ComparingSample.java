package com.bvan.oop.lessons7_8.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingSample {

    public static void main(String[] args) {
        System.out.println("Integer Comparing:");
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(10, 5)); // > 0
        System.out.println(Integer.compare(10, 10)); // 0
        System.out.println();

        System.out.println("String Comparing:");
        System.out.println("ABCD".compareTo("EFG"));
        System.out.println("Home".compareTo("House"));
        System.out.println("Homework".compareTo("Home"));
        System.out.println("Home".compareTo("Home"));
        System.out.println("HOME".compareTo("Home"));
    }
}
