package com.bvan.oop.lessons5_6.enum_sample.gender.bad;

/**
 * @author bvanchuhov
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser john = new BadUser("John", 25, -1);
        System.out.println(john);
    }
}
