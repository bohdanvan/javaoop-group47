package com.bvan.oop.lessons3_4.rectangle.oop;

/**
 * @author bvanchuhov
 */
public class RectanglesRunner {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10.0, 20.0));
        rectangles.add(new Rectangle(3.0, 2.0));

        System.out.println("S = " + rectangles.getArea());
        System.out.println("Rectangle with min P = " + rectangles.findRectangleWithMinPerimeter());
        System.out.println(rectangles);
        System.out.println();

        System.out.println(rectangles.findWithHeight(15.0, 30.0));
    }
}
