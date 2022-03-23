package com.learnjava.streams;

import com.learnjava.data.StudentDataBase;

public class StreamMatchExample {
    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa()>3.0);
    }
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa()>3.0);
    }
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa()>3.0);
    }

    public static void main(String[] args) {
        System.out.println("Results of AllMatch:"+allMatch());
        System.out.println("Results of AnyMatch:"+anyMatch());
        System.out.println("Results of NoneMatch:"+noneMatch());
    }
}
