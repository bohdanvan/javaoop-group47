package com.bvan.oop.lessons3_4.record.good;

import com.bvan.oop.common.Immutable;

import java.util.Date;

/**
 * @author bvanchuhov
 */
@Immutable
public final class Record {

    private final String name;
    private final Date date = new Date();

    public Record(String name) {
        this.name = name;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Record{" + "name='" + name + '\'' + ", date=" + date + '}';
    }
}

