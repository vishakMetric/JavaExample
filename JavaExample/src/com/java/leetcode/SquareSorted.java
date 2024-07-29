package com.java.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareSorted {

    public static void main(String[]args) {
       // nums = [-4,-1,0,3,10]
       //[-7,-3,2,3,11]

        int[]nums = new int[5];
        //nums[0]=-4;nums[1]=-1;nums[2]=0;nums[3]=3;nums[4]=10;
        nums[0]=-7;nums[1]=-3;nums[2]=2;nums[3]=3;nums[4]=11;

        for(int i = 0; i<nums.length;i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }
}
