package com.bvan.oop.lessons5_6.enum_sample.signleton;

/**
 * @author bvanchuhov
 */
public class ElvisRunner {

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.iAmKing();
    }
}
