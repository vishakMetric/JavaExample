package com.java.interviewprep;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringInterview {

    public static void main(String[]args) {

        String s1 = "abc";
        String s2 = "abc";
        String s4 = "Java is now Oracle";

        System.out.println(s1==s2);
        System.out.println(s1.hashCode()+"::::"+s2.hashCode());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf("b"));

        String s3 = s1.intern();
        System.out.println(s1==s3);

        System.out.println(s4.contains("Oracle"));
        System.out.println(s4.toLowerCase());

        String s5 = s4.toLowerCase();
        System.out.println(s4.hashCode()+"::::"+s5.hashCode());

        String s6 = new String("Vishak");
        String s7 = new String("Vishak");
        System.out.println(s6.hashCode()+"::::"+s7.hashCode());

        String s8  = s4.repeat(5);
        System.out.println(s8);

       IntStream intStream =  s1.codePoints();
        System.out.println( intStream.boxed().collect(Collectors.toList()));

       char[] ch = s1.toCharArray();
       System.out.println(ch);

       String value = "   Java is Awesome   ";
       //System.out.println(value.trim());
       System.out.println(value.stripTrailing());

       System.out.println(value.stripLeading());

       String value1 = "     ";
       System.out.println(value1.isBlank());


    }
}
