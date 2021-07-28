package com.learning.careercup.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FoundFirstNonRepeatingCharacter {

    public static void main(String[] arg) {
        //Get the character count
        //Iterate over the character count and return the array
        String input = "megha";
        char result = getCharacter(input);
        System.out.print(result);


    }


    static char getCharacter(String input) {
        int[] array = new int[258];
        char c = '\0';
        for (int i = 0; i <= input.length() - 1; i++) {
            array[input.charAt(i)]++;
        }
        for (int i = 0; i <= input.length() - 1; i++) {
            if (array[input.charAt(i)]==1) {
                return input.charAt(i);
            }

        }

        return c;

    }




   /* static char getCharacter(String input){
        char c='\0';
        for (int i=0;i<input.length();i++){
            if(input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i))){
                return input.charAt(i);
            }
        }

        return c;

    }*/
}
