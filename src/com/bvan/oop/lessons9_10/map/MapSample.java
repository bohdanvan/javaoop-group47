package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.common.Person;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class MapSample {

    public static void main(String[] args) {
        // id -> Person
        Map<Long, Person> idToPersonMap = new TreeMap<>();

        idToPersonMap.put(10L, new Person("John", 25));
        idToPersonMap.put(300L, new Person("Alex", 40));
        idToPersonMap.put(100L, new Person("Bob", 30));
        idToPersonMap.put(200L, new Person("Phil", 20));

        idToPersonMap.put(10L, new Person("Clara", 18));

        System.out.println(idToPersonMap.get(10L));

        printKeys(idToPersonMap);
        printValues(idToPersonMap);
        printEntries(idToPersonMap);
    }

    private static void printKeys(Map<Long, Person> idToPersonMap) {
        System.out.println("Keys:");
        Set<Long> keySet = idToPersonMap.keySet();
        for (Long key : keySet) {
            System.out.println(key);
        }
        System.out.println();
    }

    private static void printValues(Map<Long, Person> idToPersonMap) {
        System.out.println("Values:");
        Collection<Person> values = idToPersonMap.values();
        for (Person value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    private static void printEntries(Map<Long, Person> idToPersonMap) {
        System.out.println("Entries:");
        Set<Map.Entry<Long, Person>> entries = idToPersonMap.entrySet();
        for (Map.Entry<Long, Person> entry : entries) {
            Long key = entry.getKey();
            Person value = entry.getValue();
            System.out.println("key = " + key + "; value = " + value);
        }
    }
}
