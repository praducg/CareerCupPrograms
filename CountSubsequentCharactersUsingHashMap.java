package com.learning.careercup.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubsequentCharactersUsingHashMap {

    public static void main(String[] args) {
       // System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        String input = "aaabbbcc";
        getCharacterCount(input);
    }

    public static void getCharacterCount(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count ++;
            if (map.containsKey(input.charAt(i))) {

                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
                //System.out.println(map.get(input.charAt(i)) + count);
            } else
                map.put(input.charAt(i),1);

        }

        map.entrySet().forEach(i->
            System.out.print(i.getKey() + "" + i.getValue()));


    }
}

