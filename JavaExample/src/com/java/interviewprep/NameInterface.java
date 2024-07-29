package com.java.interviewprep;

@FunctionalInterface
public interface NameInterface {

    int add(int a, int b);

    default void print(int result) {
        System.out.println(result);
    }

    default String returnName() {
        System.out.println("Name:JOHN");
        return "JOHN";
    }

    public static void main(String[]args) {
        NameInterface nameInterface = (a,b)->{
            return a+b;
        };

        nameInterface.print(nameInterface.add(10, 20));

        String name = nameInterface.returnName();
        System.out.println(name);



    }
}
