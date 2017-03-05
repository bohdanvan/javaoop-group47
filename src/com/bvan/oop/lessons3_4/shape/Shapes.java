package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getArea() {
        double sumArea = 0.0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Shape shape : shapes) {
            joiner.add(shape.toString());
        }
        return "Shapes:\n" + joiner.toString();
    }
}
