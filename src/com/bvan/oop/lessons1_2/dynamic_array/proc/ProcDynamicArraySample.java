package com.bvan.oop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArraySample {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();
        System.out.println("Your elems is " + Arrays.toString(elems));
    }

    private static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[10];
        int size = 0;

        int n = readClientElem(scanner);
        while (n != 0) {
            if (size == elems.length) {
                elems = Arrays.copyOf(elems, elems.length*2);
            }
            elems[size++] = n;

            n = readClientElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    private static int readClientElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Illegal number");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
