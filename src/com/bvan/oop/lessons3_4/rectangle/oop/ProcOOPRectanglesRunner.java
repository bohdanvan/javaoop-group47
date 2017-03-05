package com.bvan.oop.lessons3_4.rectangle.oop;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ProcOOPRectanglesRunner {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10.0, 20.0));
        rectangles.add(new Rectangle(3.0, 2.0));

        double sumArea = sumArea(rectangles);
        System.out.println("sumArea = " + sumArea);

        printRectangles(rectangles);
    }

    public static void printRectangles(ArrayList<Rectangle> rectangles) {
        System.out.println("Rectangles:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

    public static double sumArea(ArrayList<Rectangle> rectangles) {
        double sumArea = 0.0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }
}
