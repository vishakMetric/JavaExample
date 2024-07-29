package com.java.leetcode;

public class ValidPalindrome {

    public static void main(String[]args) {
        String  s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");;
        System.out.println(s);
        int length =  s.length();
        for(int i = 0;i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(length-1)) {
                length = length -1;
                continue;
            } else {
                System.out.println("Not a palindrome.");
            }
        }
        System.out.println("Now  palindrome.");

       int capacity =  1 << 4;
       System.out.println(capacity);

        int capacity1 =  1 << 3;
        System.out.println(capacity1);

        int capacity2 =  4 << 3;
        System.out.println(capacity2);

        int capacity3 =  1 << 2;
        System.out.println(capacity3);
    }
}
