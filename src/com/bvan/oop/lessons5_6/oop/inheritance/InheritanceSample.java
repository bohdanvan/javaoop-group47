package com.bvan.oop.lessons5_6.oop.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceSample {

    public static void main(String[] args) {
        Person person = new Developer("John", "Google");
        person.sayHello();
    }
}

class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Developer extends Person {

    private final String company;

    public Developer(String name, String company) {
        super(name);
        this.company = company;
    }

    public Developer(String company) {
        this("DEV", company);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm dev from " + company);
    }

    public void writeCode() {
        System.out.println("I'm writing code");
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}


