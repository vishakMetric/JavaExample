package com.java.leetcode;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSumArray {

    public static void main(String[]args) {
        //[2,7,11,15]
        int [] nums = new int [5];
        int target = 18;
        nums[0]=7; nums[1]=2;nums[2]=15;nums[3]=11;nums[4]=20;
        Arrays.sort(nums);
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        int i = 0;
        int j = nums.length-1;

        while(i < j) {
            if(nums[i]+nums[j] == target) {
                int[] result = new int[]{i,j};
                System.out.println("Indices are::"+i +"and::"+j);
                break;
            } else if(nums[i]+nums[j] < target) {
                System.out.println(i+"::"+j);
                i++;
            } else {
                System.out.println(i+"::"+j);
                j--;
            }
        }


    }
}
