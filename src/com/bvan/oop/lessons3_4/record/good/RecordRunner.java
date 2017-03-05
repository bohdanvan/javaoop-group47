package com.bvan.oop.lessons3_4.record.good;

import java.util.Date;

/**
 * @author bvanchuhov
 */
class RecordRunner {

    public static void main(String[] args) {
        Record record = new Record("Hello");
        System.out.println(record);

        Date date = record.getDate();
        date.setTime(0L);

        System.out.println(record);
    }
}

