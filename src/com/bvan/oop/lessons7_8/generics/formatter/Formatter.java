package com.bvan.oop.lessons7_8.generics.formatter;

import com.bvan.oop.common.Person;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {
    String format(T value);
}
