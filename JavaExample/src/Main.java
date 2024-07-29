import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //List<String> nameList = List.of("Alpha","Bravo","Delta","Gamma");
        List<String> nameList = new ArrayList<>();
        nameList.addAll(List.of("Alpha", "Bravo", "Delta", "Gamma"));
        nameList.removeIf(s->s.equalsIgnoreCase("Gamma"));
        System.out.println(nameList);

        Consumer<String> printWordsLambda = scentence -> {
            String[] parts = scentence.split(" ");
            for(String part: parts) {
                System.out.println(part);
            }
        };
        printWordsLambda.accept("Vishak is good Boy");

        Function<String, String> printEvenWordsLambda = words -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i =0; i<words.length();i++) {
                if(i%2 == 1) {
                    returnVal.append(words.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(printEvenWordsLambda.apply("Vishak is good Boy"));

        }


}