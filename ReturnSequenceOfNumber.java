package com.learning.careercup.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ReturnSequenceOfNumber {


    public static void main(String[] args) {
        int input = 3;
        ways(input);
    }


    public static void ways(int n) {
         waysUtil(n,"", n);
  }

     public static void waysUtil(int original, String str, int temp) {
        if(original == 0) {
            System.out.println(str+ " ");
            return;
        }
        if(original < 0) {
            return;
        }
        for(int i = 1; i < temp ; i++) {
            waysUtil(original - i, str + i, temp);
        }

    }



}