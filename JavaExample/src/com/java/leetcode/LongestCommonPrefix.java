package com.java.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] values = {"flower", "flow", "flight"};
        String value = LongestCommonPrefix.longestCommonPrefix(values);
        System.out.println("Value is::"+value);

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return  "";
        }
        String prefix = strs[0];
        System.out.println(prefix);
        for(int i = 1;i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                System.out.println("Prefix is::"+prefix+"::"+strs[i]);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}