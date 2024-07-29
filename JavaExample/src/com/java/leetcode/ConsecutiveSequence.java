package com.java.leetcode;

import java.util.HashSet;

public class ConsecutiveSequence {

    public static void main(String[]args) {

       // int [] nums = {100,4,200,1,3,2};
        int [] nums = {0,3,7,2,5,8,4,6,0,1};
        int maxLength = 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int i:nums) {
            numSet.add(i);
        }
        System.out.println(numSet);

        for(int num: numSet) {
            if(!numSet.contains(num-1)) {
                System.out.println(num);
                int currentNum = num;
                int currentLength = 1;

                while(numSet.contains(currentNum+1)) {
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        System.out.println("MaxLength is::"+maxLength);
    }
}
