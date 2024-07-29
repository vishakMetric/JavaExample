package com.java.interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample implements Comparable<ComparatorExample> {

    private int id;
    private double salary;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ComparatorExample(int id, double salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(ComparatorExample object) {
       return (int) (this.salary - object.salary);
    }

    public String toString() {
        return "[id::"+this.id + "Salary::"+this.salary + "FirstName::"+this.firstName+"]";
    }

    public static void main(String[]args) {

        ComparatorExample e1 = new ComparatorExample(100, 10000, "Vishak", "V");
        ComparatorExample e2 = new ComparatorExample(101, 1000, "John", "Doe");
        ComparatorExample e3 = new ComparatorExample(102, 5000, "Jane", "Doe");

        List<ComparatorExample> myList = new ArrayList<>();
        myList.add(e1);
        myList.add(e2);
        myList.add(e3);

        System.out.println(e2.compareTo(e1));

        Collections.sort(myList);
        System.out.println(myList);

    }
}
