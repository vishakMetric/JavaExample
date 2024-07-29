package com.java;

import java.util.List;

public class Student {

    private int rollNo;
    private List<Integer> marks ;
    public Student(){
    }
    public Student(int rollNo, List<Integer> marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public void setRollNumber(int number){
        this.rollNo = number;
    }
    public void setMark(List marks){
        this.marks= marks;
    }
    public List<Integer> getAllMarks(){
        return marks;
    }
    public int getRollNum(){
        return rollNo;
    }
}
