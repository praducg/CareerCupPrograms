package com.learning.careercup.programs;

public class CountSubsequentCharacters {


    public static void main(String[] args) {
        String result = countConseucutiveCharacters("aabccccaaa");
        System.out.println(result);
    }

    public static String countConseucutiveCharacters(String input) {
        int count = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            count++;
            if (i+1>=input.length() || input.charAt(i) != input.charAt(i + 1)) {

                builder.append(input.charAt(i));
                builder.append(count);
                count = 0;
            }


        }

        return builder.length() > input.length() ? input : builder.toString();

    }
}
