package com.java.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPartTwo {

    public static void main(String[]args) {

        //1. Count the occurrences of each word in a Array of strings using streams.
        String[] words= {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Long> counts = Arrays.asList(words).stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(counts);

        //Stream::ofNullable;

        List<String> list = Arrays.asList(words);

       String maxLength =  list.stream().max(Comparator.comparing(String::length)).get();
       System.out.println(maxLength);

       //Given a list of integers, remove duplicates and keep them in the descending order using streams.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
       List<Integer> nonDuplicateList =  numbers.stream().distinct()
               .sorted(Comparator.comparingInt(Integer::intValue).reversed()).collect(Collectors.toList());
       System.out.println("List with Duplicates removed::"+nonDuplicateList);

       //Write a program to find the average of a list of doubles using streams.
        List<Double> doubles = Arrays.asList(1.2, 3.5, 2.8, 4.1, 5.7);
        Double value = doubles.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println("Average Double value is::"+value);

        //Merge two lists of integers and remove duplicates using streams.
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        List<Integer> finalList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(finalList);

        //Given a list of strings, concatenate them into a single string using streams.

        List<String> concatList = Arrays.asList("Hello", " ", "world", "!");
        String concatValue = concatList.stream().collect(Collectors.joining());
        System.out.println("ConcatValue::"+concatValue);

        //Given a list of strings, remove all strings that contain a specific character using streams

        List<String> removelist = Arrays.asList("apple", "banana", "orange", "kiwi");
        char specificChar = 'a';

       List<String> removedValues = removelist.stream().filter(s->!s.contains(String.valueOf(specificChar))).collect(Collectors.toList());
       System.out.println("Removed Values are::"+removedValues);

       //Given a list of integers, partition them into two groups: odd and even, using streams.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
       Map<Boolean, List<Integer>> partitionList =  numbers1.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
       System.out.println("Odd Even Partition::"+partitionList);

       //Given an array of integers, find the kth largest element.
        List<Integer> numList = Arrays.asList(1, 12, 44, 32, 52, 81, 59, 84, 72, 37);
        int k = 4;
       Integer kLargest =  numList.stream().sorted().limit(k).skip(k-1).findFirst().orElse(-1);
       System.out.println("K="+k+" Largest element is::"+kLargest);


       //Write a program to perform cube on list elements and filter numbers greater than 50
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        List<Integer> cubeList = integerList.stream().map(i-> i*i*i).filter(n->n>50).collect(Collectors.toList());
        System.out.println("CubeList is::"+cubeList);

        //Given a list of strings, find the count of strings starting with a vowels.
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "kiwi", "Astrawberry");
       long count =  stringList.stream().filter(s->"aeiou".contains(String.valueOf(s.toLowerCase().charAt(0)))).count();
       System.out.println("Count of string starting with vowel is::"+count);

       //Given a list of strings, find the longest palindrome string.

       List<String> palindromeList = List.of("level", "hello", "radar", "world", "madam", "java", "Malayalam");
       // palindromeList

        String valueString = "Anagha";
        Map<String, Long> lengthMap =  Arrays.stream(valueString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(lengthMap);


    }
}
