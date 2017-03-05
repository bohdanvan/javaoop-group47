package com.bvan.oop.lessons3_4.record.bad;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class BadRecord {

    private final String name;
    private final Date date = new Date();

    public BadRecord(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date; // BAD! Returns a reference to the mutable date
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Record{" + "name='" + name + '\'' + ", date=" + date + '}';
    }
}
