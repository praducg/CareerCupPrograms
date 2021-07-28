package com.learning.careercup.programs;

import java.util.Scanner;

/**
 * This class checks if the input string is ascii character and returns true
 * if the entered string has all characters are unique
 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println("Enter a string to check isUnique \t");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        System.out.println(isUnique(in));

    }

    static boolean isUnique(String input) {
        boolean[] inp = new boolean[256];
        if (input.length() > 256) {
            return false;
        }

        for (int i = 0; i <  input.length() ; i++) {
            if (inp[input.charAt(i)]) {

                return false;

            }
            inp[input.charAt(i)] = true;
        }

        return true;
    }
}
