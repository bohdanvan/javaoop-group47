package com.bvan.oop.lessons3_4.inheritance_hw_code;

/**
 * @author bvanchuhov
 */
public class Developer extends Person {

    private final String level;

    public Developer(String name, String level) {
        super(name);
        this.level = level;
    }

    public Developer(String level) {
        this.level = level;
    }

    public void writeCode() {
        System.out.println("I'm writing code");
    }

    @Override
    public void howAreYou() {
        System.out.println("Hello, I'm dev " + getName());
        for (int i = 0; i < 10; i++) {
            super.howAreYou();
        }
    }
}
