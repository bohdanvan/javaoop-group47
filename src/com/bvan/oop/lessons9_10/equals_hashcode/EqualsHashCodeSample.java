package com.bvan.oop.lessons9_10.equals_hashcode;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class EqualsHashCodeSample {

    public static void main(String[] args) {
        A x = new A(10);
        A y = new A(10);
        A z = new A(20);

        System.out.println("Equals:");
        System.out.println(x.equals(x)); // T
        System.out.println(x.equals(y)); // T
        System.out.println(y.equals(x)); // T
        System.out.println(x.equals(z)); // F
        System.out.println();

        System.out.println("Hash code:");
        System.out.println(x.hashCode() == x.hashCode()); // T
        System.out.println(x.hashCode() == y.hashCode()); // T
        System.out.println(x.hashCode() == z.hashCode()); // F, but may be T

        System.out.println("x.hashCode() = " + x.hashCode());
        System.out.println("y.hashCode() = " + y.hashCode());
        System.out.println("z.hashCode() = " + z.hashCode());
    }
}

class A {
    private final int field;

    public A(int field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return field == a.field;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
