package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private static final int INITIAL_CAPACITY = 10;
    private static final int GROWTH_FACTOR = 2;

    private int size = 0;
    private int[] elems = new int[INITIAL_CAPACITY];

    public void addLast(int n) {
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * GROWTH_FACTOR);
        }
        elems[size++] = n;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            joiner.add(String.valueOf(elems[i]));
        }
        return joiner.toString();
    }
}
