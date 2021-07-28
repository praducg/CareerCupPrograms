package com.learning.careercup.programs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PermuatationWIthCharacterCount {

    public static void main(String[] args) {
        boolean flag = permuation("pradeep", "pradeep");
        System.out.println(flag);
    }

    static boolean permuation(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] charAr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            charAr[s.charAt(i)]++;
            System.out.println("i character " + s.charAt(i) + " " + charAr[s.charAt(i)]);
        }
        for (int j = 0; j < t.length(); j++) {
            charAr[t.charAt(j)]--;
            System.out.println("J character " + charAr[t.charAt(j)]);
            if (charAr[t.charAt(j)] < 0) {
                System.out.println(t.charAt(j) + t.charAt(j) + "  " + charAr[t.charAt(j)]);
                return false;
            }

        }

        return true;
    }
}
