package com.company;

public class JewelsNStones {
    //Takes a group of stones S and sees with there are any jewels J
    public static void main(String[] args) {
        System.out.println(newJewelsInStones("Gts", "dstwsG"));
    }

    public static int newJewelsInStones(String J, String S) {
        int count = 0;
        int interator = 0;
        char[] stones = S.toCharArray();
        do {
            for (char c : stones) {
                if (J.charAt(interator) == c) {
                    count++;
                }
            }
            interator++;
        } while (interator != J.length());

        return count;
    }
}
