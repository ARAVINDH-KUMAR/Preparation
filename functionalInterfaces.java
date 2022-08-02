package com.learn.java;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class functionalInterfaces {
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("aravindkumar");

        Consumer<Student> S = (Student)-> System.out.println("Student Activities:  " + Student.getActivities());
        Consumer<Student> S1 = (Student)-> System.out.println("Student Name:  " + Student.getName());
        Consumer<Student> a = (Student)-> System.out.println("Student Grade:  " +Student.getGradeLevel());
        List<Student> slist= StudentDataBase.getAllStudents();
        slist.forEach(S1.andThen(S).andThen(a));
    }
}
