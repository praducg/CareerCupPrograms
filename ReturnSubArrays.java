package com.learning.careercup.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

//This class reads integer input and forms the sum and create the array out of it
public class ReturnSubArrays {
    public static void main(String[] args) {
        Integer input = 3;
        System.out.println(getCombinations(3));


    }

    static List<List<Integer>> getCombinations(int num) {
        List<List<Integer>> allCombinations = Collections.singletonList(new ArrayList<Integer>());
        int val = num;
        int i = 1;
        while (val > 0) {
            List<Integer> temp1 = new ArrayList<Integer>();
            temp1.add(i++);
            List<List<Integer>> tempList = getCombinations(val--);
            int j = 0;
            for (List<Integer> subList : tempList) {
                temp1.addAll(subList);
            }
            allCombinations.add(temp1);
        }
                return allCombinations;

    }
}


