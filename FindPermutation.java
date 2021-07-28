package com.learning.careercup.programs;

import java.util.Locale;

//This class takes string input and validates the given input can be converted to palindrome .
//If the string length has even length then all character will have same count
//If the string length has odd length then at max one character can have odd count
//https://www.topjavatutorial.com/java/java-programs/java-program-to-check-if-a-string-is-permutation-of-a-palindrome
public class FindPermutation {
    //This class provides an idea of permutation of string
    public static void main(String[] args) {
        boolean result=checkPalindromeString("tact ");
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
