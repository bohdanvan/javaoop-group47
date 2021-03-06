package com.bvan.oop.lessons3_4.shape;

import com.bvan.oop.common.Immutable;

/**
 * @author bvanchuhov
 */
@Immutable
public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        checkWidth(width);
        checkHeight(height);

        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    private void checkWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width: " + width);
        }
    }

    private void checkHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("negative height: " + height);
        }
    }
}
