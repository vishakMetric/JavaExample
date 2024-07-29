package com.java.leetcode;

import java.util.HashMap;

public class LongestPalindrome {

    public static void main(String[]args) {
        int i = LongestPalindrome.longestPalindrome("abccccdd");
    }

    public static int longestPalindrome(String s) {

        HashMap<Character, Integer> hashCount = new HashMap<>();

        for(char c:s.toCharArray()) {
            hashCount.put(c, hashCount.getOrDefault(c, 0)+1);
        }
        System.out.println(hashCount);
        return -1;
    }
}
