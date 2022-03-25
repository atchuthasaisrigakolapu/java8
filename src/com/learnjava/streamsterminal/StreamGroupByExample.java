package com.learnjava.streamsterminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamGroupByExample {
    public static java.util.Map<String, java.util.List<Student>> groupStudentsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }
    public static Map<String, List<Student>> customizedStudentsByGpa() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student->student.getGpa()>3.9?"Outstanding":"super"));
    }
    public static Map<Integer,Map<String,List<Student>>> twoLevelGrouping_1(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy(student->student.getGpa()>3.9?"Outstanding":"super")));
    }
    public static Map<Integer,Integer> twoLevelGrouping_2(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNoOfNoteBooks)));
    }
    public static Map<String,Integer> twoLevelGrouping_3(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,Collectors.summingInt(Student::getNoOfNoteBooks)));
    }
  public static LinkedHashMap<String, Set<Student>> threeLevelGrouping(){
      return StudentDataBase.getAllStudents().stream()
              .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
  }
  public static Map<Integer, Optional<Student>>studentMapOptional(){
      return StudentDataBase.getAllStudents().stream()
              .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));
  }
    public static Map<Integer, Student> studentMapOptional2(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
    }



    public static void main(String[] args) {
       // System.out.println(groupStudentsByGpa());
        //System.out.println(customizedStudentsByGpa());
        //System.out.println(twoLevelGrouping_1());
        //System.out.println(twoLevelGrouping_2());
        //System.out.println(twoLevelGrouping_3());
       // System.out.println(threeLevelGrouping());
      //  System.out.println(studentMapOptional());
        System.out.println(studentMapOptional2());

    }
}
