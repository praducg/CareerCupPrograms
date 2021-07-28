package com.learning.careercup.programs;

import java.util.ArrayList;
import java.util.List;

public class FIndUniqueCharactersInAnArray {
    public static void main(String[] args) {
        String input = "megha";
        boolean flag = findUniqueCharacters(input);
        System.out.println(flag);
    }


    static boolean findUniqueCharacters(String input) {

        boolean[] char_array = new boolean[128];


        //This check will filter all the ascii characters which are greater than 128
        if (input.length() > 128) {
            return false;
        }
        for (int i = 0; i <input.length(); i++) {

            if (char_array[input.charAt(i)]) {
                return false;
            }
            char_array[input.charAt(i)] = true;
        }
        return true;
    }
}


