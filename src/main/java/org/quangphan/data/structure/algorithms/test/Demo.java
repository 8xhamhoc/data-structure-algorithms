package org.quangphan.data.structure.algorithms.test;

public class Demo {

    public static void main(String[] args) {

        int[] numbers = {2, 1, 6, 8, 4, 12};

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                System.out.println("[" + numbers[i] + ", " + numbers[j] + "]");
//            }
//        }


        for (int i=0; i< numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                System.out.println("[" + numbers[j - 1] + ", " + numbers[j] + "]");
            }
        }
    }
}
