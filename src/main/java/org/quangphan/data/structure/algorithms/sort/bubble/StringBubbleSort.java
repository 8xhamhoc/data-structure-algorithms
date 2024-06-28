package org.quangphan.data.structure.algorithms.sort.bubble;

import java.util.Arrays;

public class StringBubbleSort {

    public static void main(String[] args) {
        String[] strings = {"B", "A", "D", "F", "C", "E"};
        bubbleSort(strings);
        System.out.println(Arrays.toString(strings));
    }

    private static void bubbleSort(String[] strings) {
        if (strings.length > 0) {
            int length = strings.length;
            String swap;
            boolean isWwap;

            do {
                isWwap = false;
                for (int i = 1; i < length; i++) {
                    if (strings[i - 1].compareTo(strings[i]) > 0) {
                        swap = strings[i];
                        strings[i] = strings[i - 1];
                        strings[i - 1] = swap;
                        isWwap = true;
                    }
                }

                length--;
            } while (isWwap);
        }
    }
}
