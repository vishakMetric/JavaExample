package com.java.ds;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[]args) {
        int[] numbers = {4,3,12,9,25};
        System.out.println(numbers);
        Arrays.sort(numbers);
        int low = 0;
        int high = numbers.length;

        System.out.println(low);
        System.out.println(high);
        int searchValue = 25;

        while(low <= high) {
            int middleIndex = (low + high)/2;
            int middleValue = numbers[middleIndex];
            if(middleValue == searchValue) {
                System.out.println(middleIndex);
                break;
            }
            if(searchValue < middleValue) {
                high = middleIndex - 1;
            }
            if(searchValue > middleValue) {
                low = middleIndex + 1;
            }

        }

       // int a = 10;
       // System.out.println(a<<4);
    }
}
