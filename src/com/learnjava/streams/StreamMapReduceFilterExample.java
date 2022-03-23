package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class StreamMapReduceFilterExample {
    public static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3.0)
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoOfNoteBooks)
                //.reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
