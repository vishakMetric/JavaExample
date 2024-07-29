package com.java.leetcode;
import java.util.HashMap;
import java.util.Map;

public class AnagramClass {

    public static void main(String[]args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(AnagramClass.isValidAnagram(s1, s2));

    }

    public static boolean isValidAnagram(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }
        Map<Character,Integer> frequencyMap = new HashMap<>();
       for(char ch : s1.toCharArray()) {
           frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
       }
        System.out.println(frequencyMap);

       for(char ch : s2.toCharArray()) {
           if(!frequencyMap.containsKey(ch)) {
               return false;
           }
           frequencyMap.put(ch, frequencyMap.get(ch) - 1);

           if(frequencyMap.get(ch) == 0) {
               frequencyMap.remove(ch);
           }
       }

       return frequencyMap.isEmpty();

    }
}
