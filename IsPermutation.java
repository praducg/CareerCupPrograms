package com.learning.careercup.programs;

import java.util.Arrays;

/**
 * This class checks if two strings are permutation are not .
 */
public class IsPermutation {
    public static void main(String[] args) {
        String input1 = "MEGHA";
        String input2 = "PRADE";
        boolean result = isPermutation(input1, input2);
        System.out.println(result);
    }


    static boolean isPermutation(String inp1, String inp2) {
        if (inp1.length() != inp2.length()) {
            return false;
        }
        return sort(inp1).equals(sort(inp2));
    }

    static public String sort(String in) {
        char[] array = in.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }


}
