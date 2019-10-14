package com.company.HW14Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {


    public static void main(String[] args) {

        ArrayList<Student> arrayListStudent = new ArrayList<Student>();

        Student student01 = new Student("Name_0C", 2);
        Student student02 = new Student("Name_0E", 1);
        Student student03 = new Student("Name_0A", 5);
        Student student04 = new Student("Name_0D", 6);
        Student student05 = new Student("Name_0B", 2);

        arrayListStudent.add(student01);
        arrayListStudent.add(student02);
        arrayListStudent.add(student03);
        arrayListStudent.add(student04);
        arrayListStudent.add(student05);

        // Sorting by Name
        System.out.println("Sort by Name:");
        Collections.sort(arrayListStudent, new NameComparator());
        Student.printStudents(arrayListStudent, 0);


        // Sorting by Course
        System.out.println(System.lineSeparator() + "Sort by Course:");
        Collections.sort(arrayListStudent, new CourseComparator());
        Student.printStudents(arrayListStudent, 0);


        // Using a iterator
        int course = 2;
        System.out.println(System.lineSeparator() + "Select Course: " + course);
        Student.printStudents(arrayListStudent, course);

    }

}





