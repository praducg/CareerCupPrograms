package com.learning.careercup.programs;

import java.util.Arrays;

public class StringPermutation {
    //Find the permutation of two strings.
    public static void main(String[] args) {
        String s = "test";
        String s1 = "etst";
        boolean result = sort(s, s1);
        System.out.println(result);
    }


    public static boolean sort(String s, String s1) {
        char[] chars = s.toCharArray();
        char[] char1 = s1.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(char1);
        if (s.length() != s1.length()) {
            return false;

        }
        return new String(chars).equals(new String(char1));

    }
}

