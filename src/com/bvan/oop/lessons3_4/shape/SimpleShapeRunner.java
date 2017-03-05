package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class SimpleShapeRunner {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10.0, 20.0);
        printInfo(shape);

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println(circle.getRadius());
        }

    }

    private static void printInfo(Shape shape) {
        System.out.println("P = " + shape.getPerimeter());
        System.out.println("S = " + shape.getArea());
    }
}
