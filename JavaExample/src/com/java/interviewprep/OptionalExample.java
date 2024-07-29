package com.java.interviewprep;

import java.util.Optional;

public class OptionalExample {

    public static Student getStudentWithName(String name) {
            if(name.equalsIgnoreCase("Vishak")) {
                return new Student("Vishak", 38, "India");
            } else {
                return null;
            }
    }

    public static void main(String[] args) {
        Student optStudent = Optional.ofNullable(getStudentWithName("Vishak")).
                orElse(new Student("no One", 0, "Unknown"));

       System.out.println(optStudent.getCountry());

    }
}

class Student {
    private String name;
    private int age;

    private String country;

    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return this.name+"::"+this.age+"::"+this.country;
    }
}
