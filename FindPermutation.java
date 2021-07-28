package com.learning.careercup.programs;

import java.util.Locale;

public class FindPermutation {
    //This class provides an idea of permutation of string
    public static void main(String[] args) {
        boolean result=checkPalindromeString("tact coa");
        System.out.println(result);

    }

    public static boolean checkPalindromeString(String input) {
        int countOdd = 0;
        int[] inp = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (Character in : input.toCharArray()) {
           int find= getCharacterCount(in);
            if (find != -1) {
                inp[find]++;
                if (inp[find] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }

        }

        return countOdd <= 1;

    }


    public static int getCharacterCount(Character val) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(val);
        if (a <= value && value <= z) {//if a =0 z is 25
            return value - a;
        }


        return -1;
    }


}
