package com.java.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZeros {

    public static void main(String[]args) {
        int [] nums = new int[6];
        nums[0]=7;nums[1]=0;nums[2]=1;nums[3]=0;nums[4]=6;nums[5]=4;

        int high = nums.length;
        int nonZeroPointer = 0;
        for(int i = 0; i < high;i++) {
            if(nums[i] != 0) {
                nums[nonZeroPointer++] = nums[i];
            }
        }
        System.out.println("nonZeroPointer::"+nonZeroPointer);
        while(nonZeroPointer < high) {
            nums[nonZeroPointer++] = 0;
        }

        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }
}
