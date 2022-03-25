package com.learnjava.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities = new ArrayList<>();
    private Optional<Bike> bike = Optional.empty();
    private List<Bike> listBike = new ArrayList<>();

    public List<Bike> getListBike() {
        return listBike;
    }

    public void setListBike(List<Bike> listBike) {
        this.listBike = listBike;
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", bike=" + bike +
                ", noOfNoteBooks=" + noOfNoteBooks +
                '}';
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    public void setNoOfNoteBooks(int noOfNoteBooks) {
        this.noOfNoteBooks = noOfNoteBooks;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noOfNoteBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noOfNoteBooks = noOfNoteBooks;
    }

    public int getNoOfNoteBooks() {
        return noOfNoteBooks;
    }

    private int noOfNoteBooks;
    public Student() {

    }
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
    public void printActivies(){
        System.out.println(this.activities);
    }

}
