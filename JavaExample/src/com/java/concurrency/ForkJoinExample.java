package com.java.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinExample {

    public static void main(String[]args) {
        ForkJoinPool pool = new ForkJoinPool(2);
       System.out.println(pool.getPoolSize());
        //pool.execute(populateList());
    }

    public static  List<String> populateList() {

        List<String> databaseNames = new ArrayList<>();
        databaseNames.add("Oracle");
        databaseNames.add("MySql");
        databaseNames.add("H2");
       // new ForkJoinTask(databaseNames);
        return databaseNames;
    }

    public List<String> populateLangList() {
        List<String> langValues = new ArrayList<>();
        langValues.add("JAVA");
        langValues.add("Python");
        langValues.add("C/C++");
        langValues.add("React");
        return langValues;
    }
}
