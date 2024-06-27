package org.quangphan.data.structure.algorithms;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("Apple");
        set.add("Cherry");
        set.add("Banana");
        set.add("Date");
        set.add("Apple");

        set.forEach(System.out::println);
    }
}
