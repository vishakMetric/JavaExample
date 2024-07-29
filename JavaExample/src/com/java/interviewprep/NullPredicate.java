package com.java.interviewprep;

import java.util.*;
import java.util.function.Predicate;

public class NullPredicate {

    public static void main(String[]args) {
        List<String> list = new ArrayList<>(Arrays.asList("Virtusa", null, "India",null,"Limited"));

        System.out.println("Before::"+list);
        Predicate<String> nullPredicate = Objects::isNull;
        removeNull(list, nullPredicate);
        System.out.println("After::"+list);

    }

    public static List<String> removeNull(List<String> list, Predicate obj) {

        Iterator<String> listIt = list.iterator();

        while(listIt.hasNext()) {
            String next = listIt.next();
            if(obj.test(next)) {
                listIt.remove();
            }
        }
        return list;
    }
}
