package com.bvan.oop.lessons9_10.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ForEachSample {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>(
                Arrays.asList("John", null, "Bob"));
        System.out.println(name);
        System.out.println();

        System.out.println("Iteration:");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);

            if (s == null) {
                iterator.remove();
            }
        }
        System.out.println();

        System.out.println("After iteration");
        System.out.println(name);
    }
}
