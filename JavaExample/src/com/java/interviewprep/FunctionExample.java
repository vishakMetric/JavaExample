package com.java.interviewprep;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[]args) {

        Function<Integer, String> intToString = num->"Number::"+num;
        String result = intToString.apply(43);
        System.out.println(result);

    }
}
