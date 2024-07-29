package com.java.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductExceptSelf {

    public static void main(String[]args) {
       // nums = [-1,1,0,-3,3]
        int [] nums = {-1,1,0,-3,3};
       // nums[0] = -1; nums[1] = 1; nums[2] = 0; nums[3] = -3;nums[4] = 3;
        int length = nums.length;
        int result[] = new int[length];
        int product = 1;
        int count = 0;

        for(int i = 0; i < length; i++) {
            if(nums[i] == 0) {
                count = count + 1;
            } else {
                product*=nums[i];
            }
        }

        for(int j = 0; j < length; j++) {
            if(nums[j] == 0) {
                result[j] = product;
            } else {
                result[j] = product/nums[j];
            }
        }
        System.out.println("Product is::"+product);
        System.out.println(Arrays.stream(result).boxed().collect(Collectors.toList()));
    }
}
