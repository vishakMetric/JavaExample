package com.java.interviewprep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

public class FlatMapExample {

    public static void main(String[]args) {

        List<String> nameList = List.of("Vishak","Vivek","Anu","Gowri");

        List<Integer> intList1 = List.of(1,2,3,4,5,6,7,8,9,10,11,12,19);
        List<Integer> intList2 = List.of(10,1,11,13,3,14,15,5,6,19,16,17,9);

        List<List<Integer>> values = Stream.of(intList1, intList2).collect(Collectors.toList());
        System.out.println(values);
       List<Integer> flatList =  Stream.of(intList1, intList2).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatList);

        List<Integer> evenList = flatList.stream().filter(
                (n)->n%2==0
        ).collect(Collectors.toList());

        System.out.println(evenList);

       Optional<Optional<Integer>> intOptional = Optional.ofNullable(flatList.stream().filter(
                (n)->n==22
        ).findFirst());

       Integer result =  intOptional.get().orElse(-1);

       System.out.println(result);

    }
}
