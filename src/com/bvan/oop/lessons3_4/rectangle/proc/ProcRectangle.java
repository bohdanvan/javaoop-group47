package com.bvan.oop.lessons3_4.rectangle.proc;

import com.bvan.oop.common.Mutable;

/**
 * @author bvanchuhov
 */
@Mutable
public class ProcRectangle {

    private double width;
    private double height;

    public ProcRectangle(double width, double height) {
        checkWidth(width);
        checkHeight(height);

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        checkWidth(width);
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        checkHeight(height);
        this.height = height;
    }

    @Override
    public String toString() {
        return "ProcRectangle{" +
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
