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


    //Print
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
