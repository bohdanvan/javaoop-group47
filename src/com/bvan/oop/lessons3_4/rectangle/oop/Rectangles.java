package com.bvan.oop.lessons3_4.rectangle.oop;

import com.bvan.oop.common.Mutable;
import com.bvan.oop.lessons3_4.rectangle.oop.Rectangle;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
@Mutable
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getArea() {
        double sumArea = 0.0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }

    public Rectangle findRectangleWithMinPerimeter() {
        if (rectangles.isEmpty()) {
            throw new IllegalStateException("no rectangles");
        }

        Rectangle res = rectangles.get(0);
        double resPerimeter = res.getPerimeter();
        for (Rectangle rectangle : rectangles) {
            double currentPerimeter = rectangle.getPerimeter();

            if (resPerimeter > currentPerimeter) {
                res = rectangle;
                resPerimeter = currentPerimeter;
            }
        }
        return res;
    }

    public Rectangles findWithHeight(double minHeight, double maxHeight) {
        Rectangles res = new Rectangles();
        for (Rectangle rectangle : rectangles) {
            double height = rectangle.getHeight();

            if (height >= minHeight && height <= maxHeight) {
                res.add(rectangle);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Rectangle rectangle : rectangles) {
            joiner.add(rectangle.toString());
        }
        return "Rectangles:\n" + joiner.toString();
    }
}
