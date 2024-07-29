package com.java.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class DuplicateArray {
    public static void main(String [] args) {

       // [1,1,1,3,3,4,3,2,4,2]
        int [] nums = new int [10];
        nums[0] = 1; nums[1]=1;nums[2]=1;nums[3]=3;nums[4]=3;nums[5]=4;nums[6]=3;nums[7]=2;nums[8]=4;nums[9]=2;
        int arrayLength =  nums.length;

        HashSet<Integer> hash = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        int count = hash.size();

        boolean result = (arrayLength != count);
        System.out.println("Result is::"+result);

    }
}
