package com.company.HW14Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private String Name;
    private int Course;


    //Constructor
    public Student(String name, int course) {
        this.Name = name;
        this.Course = course;
    }


    //Print Students
    public static void printStudents(ArrayList<Student> arrayListStudent, int course) {

        Iterator<Student> iteratorStudent = arrayListStudent.iterator();
        while (iteratorStudent.hasNext()) {
            int curCourse = iteratorStudent.next().Course;
            if ((curCourse != course) && (course != 0)) {
                iteratorStudent.remove();
            }
        }

        iteratorStudent = arrayListStudent.iterator();
        while (iteratorStudent.hasNext()) {
            System.out.println(iteratorStudent.next());
        }
    }


    //Compare by Name
    public static void CompareName(ArrayList<Student> arrayListStudent) {
        for (int i = 0; i < arrayListStudent.size(); i++) {
            String firstName = arrayListStudent.get(i).Name;
            int firstCourse = arrayListStudent.get(i).Course;
            for (int j = i + 1; j < arrayListStudent.size(); j++) {
                String secondName = arrayListStudent.get(j).Name;
                int secondCourse = arrayListStudent.get(j).Course;
                if (secondName.equals(firstName)) {
                    System.out.println("** Matched: " + firstName + " - " + firstCourse + " : " + secondName + " - " + secondCourse);
                } else {
                    System.out.println("Mismatched: " + firstName + " - " + firstCourse + " : " + secondName + " - " + secondCourse);
                }
            }
        }
    }


    //Compare by Course
    public static void CompareCourse(ArrayList<Student> arrayListStudent) {
        for (int i = 0; i < arrayListStudent.size(); i++) {
            String firstName = arrayListStudent.get(i).Name;
            int firstCourse = arrayListStudent.get(i).Course;
            for (int j = i + 1; j < arrayListStudent.size(); j++) {
                String secondName = arrayListStudent.get(j).Name;
                int secondCourse = arrayListStudent.get(j).Course;
                if (secondCourse == firstCourse) {
                    System.out.println("** Matched: " + firstCourse + " - " + firstName + " : " + secondCourse + " - " + secondName);
                } else {
                    System.out.println("Mismatched: " + firstCourse + " - " + firstName + " : " + secondCourse + " - " + secondName);
                }
            }
        }
    }


    @Override
    public String toString() {
        return this.Name + " - " + this.Course;
    }


    public String getName() {
        return this.Name;
    }


    public int getCourse() {
        return this.Course;
    }


}
