package com.java.interview;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String departmantName;
    private int joinedYear;
    private String city;
    private int rank;

    public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
                   int joinedYear, String city, int rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmantName = departmantName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
                + city + ", rank=" + rank + "]";
    }

    public static void main(String[]args) {

        List<Student> list = Arrays.asList(
                new Student(1, "Aditya", "Mall", 30, "Male", "Mechanical Engineering", 2014, "Mumbai", 122),
                new Student(2, "Pulkith", "Singh", 26, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankita", "Patil", 25, "Female", "Computer Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Darshan", "Mukd", 23, "Male", "Instrumentation Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Satyam", "Pandey", 26, "Male", "Biotech Engineering", 2017, "Mumbai", 98)
        );

        //Group the students by department names.
        Map<String, List<Student>> departmentMap = list.stream().collect(Collectors.groupingBy(s->s.departmantName));
        System.out.println(departmentMap.keySet());

        //Find the count of students in each department.
        Map<String,Long> countMap = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println(countMap);

        //Find all departments names.
        List<String> departmentNames = list.stream().map(t->t.getDepartmantName()).distinct().collect(Collectors.toList());
        System.out.println("Distinct Department Names::"+departmentNames);

        //Find the list of students whose age is less than 25.
        List<Student> names = list.stream().filter(t->t.getAge() < 25).collect(Collectors.toList());
        System.out.println("Studenta age less than 25::"+names);

        //Find the max age of students.
      OptionalInt value =  list.stream().mapToInt(t->t.getAge()).max();
      System.out.println("Maximum age of the student::"+value.getAsInt());

      //Find the average age of male and female students.
       Map<String, Double> avgValue =  list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
       System.out.println("Averege value as per Gender::"+avgValue);

       //Find the young student in all departments.
       Student  youngList = list.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println("Young Student in all department::"+youngList);

        Map<String,Optional<Student>> age=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.minBy(Comparator.comparing(Student::getAge))));
        System.out.println("Min in all Deparment::"+age);

        //Find the senior female student in all departments.
        int seniorStudent = list.stream().filter(t->t.getGender().equals("Female")).mapToInt(Student::getAge).max().getAsInt();
        System.out.println("Senior Female Student::"+seniorStudent);

        //Find the list of students whose rank is between 50 and 100.
        List<Student> rankList = list.stream().filter(t->t.getRank()>50 && t.getRank()<100).collect(Collectors.toList());
        System.out.println("Students with rank between 50 and 100::"+rankList);

        //Find the department who is having maximum number of students.
       Entry<String, Long> mapEntry =  list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).
               entrySet().stream().max(Map.Entry.comparingByValue()).get();
       System.out.println("Department with max students::"+mapEntry.getKey());

       //Find the Students who stays in Mumbai and sort them by their names.
        List<Student> placeList = list.stream().filter(t->t.getCity().equals("Mumbai"))
                .sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        System.out.println("Students who stays in Mumbai and sort them by their names::"+placeList);

        //Find the total count of students.
        long totalStudents = list.stream().count();
        System.out.println("Total number of Students are::"+totalStudents+" Size of List::"+list.size());

        //Find the average rank in all departments.
       Map<String, Double> rankMapping = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
       System.out.println("Average rank in all departments::"+rankMapping);

       //Find the highest rank in each department.
        Map<String, Optional<Student>> highRankingMap = list.stream().
                collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("Highest rank in each department::"+highRankingMap);

        //Find the second highest rank student.
       Student secondHigh =  list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
       System.out.println("Second highest rank student::"+secondHigh);
    }

}
