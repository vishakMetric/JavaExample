package com.java.leetcode;

public class StockPriceSell {

    public static void main(String[]args) {

        //prices = [7,1,5,3,6,4]
        int [] prices = new int[6];
        prices[0]=7;prices[1]=5;prices[2]=1;prices[3]=3;prices[4]=6;prices[5]=4;

        int buyPrice = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length-1; i++) {
            if(buyPrice >  prices[i]) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyPrice);
            System.out.println(profit + "::"+i);
        }
    }
}
