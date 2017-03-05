package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Rectangle(10.0, 20.0));
        shapes.add(new Circle(10.0));
        shapes.add(new EquilateralTriangle(10.0));

        double area = shapes.getArea();
        System.out.println("S = " + area);

        System.out.println(shapes);
    }
}
