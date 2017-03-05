package com.bvan.oop.lessons3_4.record.bad;

import java.util.Date;

/**
 * @author bvanchuhov
 */
class BadRecordRunner {

    public static void main(String[] args) {
        BadRecord record = new BadRecord("Hello");
        System.out.println(record);

        Date date = record.getDate();
        date.setTime(0L);

        System.out.println(record);
    }
}

