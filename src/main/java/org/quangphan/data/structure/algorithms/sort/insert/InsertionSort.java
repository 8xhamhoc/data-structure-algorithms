package org.quangphan.data.structure.algorithms.sort.insert;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {20, 12, 10, 15, 2};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(int[] numbers) {
        if (numbers.length > 0) {
            int length = numbers.length;
            int temp;

            for (int i=0; i<length; i++) {
                int minIndex = i;
                for (int j=i+1; j<length; j++) {
                    if (numbers[j-1] > numbers[j]) {
                        minIndex = j;
                    }
                }

                System.out.println("swap with i: " + i);
                temp = numbers[minIndex];
                numbers[minIndex] = numbers[i];
                numbers[i] = temp;
            }
        }
    }
}
