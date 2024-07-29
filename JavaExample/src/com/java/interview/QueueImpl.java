package com.java.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QueueImpl {

    private int[] queue;
    private int  index = 0;

    public QueueImpl() {
        queue = new int[15];
        index = 0;
    }

    public void add(int value) {
        queue[index] = value;
        index++;
    }

    public void display() {
        System.out.println(Arrays.stream(queue).boxed().collect(Collectors.toList()));
    }

    public static void main(String[]args) {
        QueueImpl impl = new QueueImpl();
        impl.add(2);
        impl.add(3);
        impl.add(4);
        impl.add(5);
       impl.display();
    }


}
