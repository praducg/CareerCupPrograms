package com.learning.careercup.programs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree {

    public static void main(String[] args)
    {

        String str1 = "anagram";
        String str2 = "grammar";
        int k = 2;

        // Function Call
        kAnagrams(str1, str2, k);
        if (kAnagrams(str1, str2, k) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean kAnagrams(String str1,
                                    String str2, int k) {
        int flag=0;
        char[] first=str1.toCharArray();
        char[] second=str2.toCharArray();
        if(first.length!=second.length)
            return  false;
        List<Character> unequalCharacters=new ArrayList<>();

        Arrays.sort(first);
        Arrays.sort(second);
        for(int i=0;i<str1.length();i++){
            if(first!=second){
                unequalCharacters.add(second[i]);
            }


        }
        if(unequalCharacters.size()<=k)

            flag = 1;

            if (flag == 1)
                return true;
            else
                return false;


}}
