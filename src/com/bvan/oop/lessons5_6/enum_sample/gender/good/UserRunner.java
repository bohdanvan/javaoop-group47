package com.bvan.oop.lessons5_6.enum_sample.gender.good;

/**
 * @author bvanchuhov
 */
public class UserRunner {

    public static void main(String[] args) {
        User john = new User("John", 25, Gender.MALE);
        System.out.println(john);
    }
}
