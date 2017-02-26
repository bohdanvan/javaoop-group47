package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    // R

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // W

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }
    }

    private boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }
}
