package com.learning.careercup.programs;
//https://ide.tutorialhorizon.com/?gistUrl=https%3A%2F%2Fgist.githubusercontent.com%2Fthmain%2F4b78f7c94ee8b7e79c25%2Fraw%2F
public class ReplaceSpaceWithPercentage {
   /* public static void main(String[] args) {
        char[] str = "Mr John Smith ".toCharArray();

        // Prints the replaced string
         replaceSpaces(str,str.length);

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }*/




    /*Solution 1:
    public static String replaceAll(String str) {
        String[] words = str.split(" ");
        StringBuilder sentence = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; ++i) {
            sentence.append("%20");
            sentence.append(words[i]);
        }

        return sentence.toString();
    }*/
    public static void replace(String s1, int length) {
        char[] chars = s1.toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }
        int newLength = (length + 1) +( 2 * spaceCount);
      //  chars[newLength] = '\0';
        char [] charsNew = new char [newLength];
        for (int i = length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                charsNew[newLength - 1] = '0';
                charsNew[newLength - 2] = '2';
                charsNew[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
//				System.out.println(chars[i]);
                charsNew[newLength - 1] = chars[i];
                newLength = newLength - 1;
            }
        }
        System.out.println("Output String : " + String.valueOf(charsNew));
    }

    public static void main(String args[]) {
        String s1 = "Mr John Smith ";
        int trueLength = s1.length();
        System.out.println("Input String : " + s1);

        replace(s1, trueLength);
    }
}
