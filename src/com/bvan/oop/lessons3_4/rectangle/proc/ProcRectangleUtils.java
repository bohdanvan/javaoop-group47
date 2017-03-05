package com.bvan.oop.lessons3_4.rectangle.proc;

/**
 * @author bvanchuhov
 */
public class ProcRectangleUtils {

    private ProcRectangleUtils() {}

    public static double perimeter(ProcRectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    public static double area(ProcRectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
