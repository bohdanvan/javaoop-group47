package com.bvan.oop.lessons3_4.rectangle.proc;

/**
 * @author bvanchuhov
 */
public class ProcRectangleRunner {

    public static void main(String[] args) {
        ProcRectangle rectangle = new ProcRectangle(20.0, 10.0);

        System.out.println(rectangle);
        System.out.println("P = " + ProcRectangleUtils.perimeter(rectangle));
        System.out.println("S = " + ProcRectangleUtils.area(rectangle));
    }
}
