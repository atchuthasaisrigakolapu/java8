package com.learnjava.streamsterminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamSumAvgExample {
    public static int sum(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoOfNoteBooks));
    }
    public static double avg(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoOfNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println("Total number of books"+sum());
        System.out.println("Average number of books"+avg());
    }
}
