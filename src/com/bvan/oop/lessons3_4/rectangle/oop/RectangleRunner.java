package com.bvan.oop.lessons3_4.rectangle.oop;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20.0, 10.0);

        double perimeter = rectangle.getPerimeter();
        double area = rectangle.getArea();
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        System.out.println(rectangle);
        System.out.println("P = " + perimeter);
        System.out.println("S = " + area);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
    }
}
