package org.quangphan.data.structure.algorithms.leetcode;

public class PalindromeNumber {


    public static void main(String[] args) {



    }


    private static boolean check(int number) {
        if (number < 0 || isEvenCharacter(String.valueOf(number))) {
            return false;
        }
        if (number == 0) {
            return true;
        }

        String numberString = String.valueOf(number);



        return false;
    }

    private static boolean isEvenCharacter(String s) {
        return s.length() % 2 == 0;
    }
}
