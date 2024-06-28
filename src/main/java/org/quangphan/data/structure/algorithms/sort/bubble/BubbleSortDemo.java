package org.quangphan.data.structure.algorithms.sort.bubble;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 7, 4, 3, 8, 11};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {
        if (numbers.length > 0) {
            int length = numbers.length;
            int swap;
            boolean isWwap;

            do {
                isWwap = false;
                for (int i = 1; i < length; i++) {
                    if (numbers[i - 1] > numbers[i]) {
                        swap = numbers[i];
                        numbers[i] = numbers[i - 1];
                        numbers[i - 1] = swap;
                        isWwap = true;
                    }
                }

                length--;
            } while (isWwap);
        }
    }
}
