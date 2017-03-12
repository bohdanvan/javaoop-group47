package com.bvan.oop.lessons5_6.oop.construction;

/**
 * @author bvanchuhov
 */
public class ConstructionSample {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
    }
}

class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, -1);
    }

    public Person(int age) {
        this("UNNAMED", age);
    }

    public Person() {
        this("UNNAMED");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
