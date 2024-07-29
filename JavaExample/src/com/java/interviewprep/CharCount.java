package com.java.interviewprep;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void main(String[]args) {
        String s1 = "Java is now Oracleooo";

       s1 = s1.replaceAll("\\s","");

       System.out.println(s1);

        Map<Character, Integer> countMap = new HashMap<>();

        for(Character ch: s1.trim().toCharArray()) {
            if(countMap.containsKey(ch)) {
                countMap.put(ch,  countMap.get(ch)+1);
            } else {
                countMap.put(ch, 1);
            }
        }

        System.out.println(countMap);
    }
}
