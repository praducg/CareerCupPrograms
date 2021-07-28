package com.learning.careercup.programs;

public class OneWay {

    //Given two strings findout if two strings has one edit/zero edit

    //Use case: pale,ple-> true[1 edit which is a needs to be inserted]
    //Use case:pales,pale->true[1 edit which is removal fo s]
    //Use case :pale,bale->true[1 replace]
    //Use case:pale ,ba->false[Mulitple edits.
    public static void main(String[] args) {
        OneWay oneWay = new OneWay();
        boolean result = oneWay.checkNoOfEdits("pale", "bal");
        System.out.print(result);
    }

    public boolean checkNoOfEdits(String inp1, String inp2) {
        if (Math.abs(inp1.length() - inp2.length()) > 1) {
            return false;//More than 1 edit use case 4
        }
        if (inp1.length() == inp2.length()) {//Use case 3
            return checkForReplace(inp1, inp2);

        }
        if (inp1.length() + 1 > inp2.length()) {
            return checkForInsertOrDelete(inp1, inp2);
        }
        if (inp1.length() - 1 > inp2.length()) {
            return checkForInsertOrDelete(inp1, inp2);
        }
        return false;
    }

    public boolean checkForReplace(String in1, String in2) {
        boolean foundDifference = false;
        int count = 0;
        for (int i = 0; i < in1.length(); i++) {
            if (in1.charAt(i) != in2.charAt(i)) {//This will give me the character that has difference
                if (foundDifference) {
                    count++;
                    return false;
                }
            }
            foundDifference = true;
            System.out.println(count);
        }

        return true;
    }

    public boolean checkForInsertOrDelete(String in1, String in2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < in1.length() && index2 < in2.length()) {
            if (in1.charAt(index1) != in2.charAt(index2)) {//This will give me
                // the character that has difference
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }

        }
        return true;
    }

}

