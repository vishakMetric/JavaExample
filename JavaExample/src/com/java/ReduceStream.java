package com.java;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class ReduceStream {

    public static void main(String[]args) {
        Student stud1 = new Student();
        List<Integer> stud1Marks= new ArrayList();
        stud1Marks.add(70);
        stud1Marks.add(70);
        stud1.setRollNumber(1);
        stud1.setMark(stud1Marks);
        Student stud2 = new Student();
        List<Integer> stud2Marks= new ArrayList();
        stud2Marks.add(70);
        stud2Marks.add(80);
        stud2.setRollNumber(2);
        stud2.setMark(stud2Marks);
        Student stud3 = new Student();
        List<Integer> stud3Marks= new ArrayList();
        stud3Marks.add(70);
        stud3Marks.add(60);
        stud3.setRollNumber(3);
        stud3.setMark(stud3Marks);
        List<Student> list = new ArrayList<>();
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);

        System.out.println(list);

        list.sort(Comparator.comparing((Student student) -> student.getAllMarks().stream().reduce(0,(a,b)->a+b)).reversed());
        List<Student> studentList = list.stream().limit(5).collect(Collectors.toList());
        for(Student student : studentList){
            System.out.println(student.getRollNum() + " MARK : "+student.getAllMarks());
        }
    }
}
