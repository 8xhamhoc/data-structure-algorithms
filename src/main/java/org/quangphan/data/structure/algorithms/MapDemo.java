package org.quangphan.data.structure.algorithms;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("2", "Hello 2");
        hashMap.put("1", "Hello 1");
        hashMap.put("7", "Hello 7");
        hashMap.put("4", "Hello 4");
        hashMap.put("6", "Hello 6");

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
