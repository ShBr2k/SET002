package com.company.HW14Collection;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    public int compare(Student tmpCourse1, Student tmpCourse2) {
        String strCourse1 = String.valueOf(tmpCourse1.getCourse());
        String strCourse2 = String.valueOf(tmpCourse2.getCourse());
        //ASC order (DESC order in sort method)
        return strCourse1.compareTo(strCourse2);
    }
}
