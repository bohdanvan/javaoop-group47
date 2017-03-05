package com.bvan.oop.lessons3_4.inheritance_hw_code;

/**
 * @author bvanchuhov
 */
public class Inheritance {

    public static void main(String[] args) {
        Person person = new Developer("John", "Middle");
        person.howAreYou();
        System.out.println(person.getName());
    }
}

