package com.learning.careercup.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Given a group of words we need to write a code which will group the words which are anagrams of each other. 
//For e.g. [art,cheese,cat,rat,tar,act,tca]
//Output: [[art,rat,tar],[cat,act,tca],[cheese]]
public class FindGroupOfAnagrams {


    public static void main(String[] args) {
        List<List<String>> groupAnagrams = groupAnagrams(new String[]{"art", "cheese", "cat", "rat", "tar", "act", "tca"});

        for (List<String> anaGrams : groupAnagrams) {
            anaGrams.forEach(i -> System.out.println(i));
        }


    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            if (map.containsKey(key)) {

                map.get(key).add(str);

            } else {
                List<String> finalList = new ArrayList<>();
                finalList.add(str);
                map.put(key, finalList);

            }


        }

        result.addAll(map.values());

        return result;
    }
}
