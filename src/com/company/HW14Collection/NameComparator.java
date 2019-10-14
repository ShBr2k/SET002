package com.company.HW14Collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    public int compare(Student tmpStudentName1, Student tmpStudentName2) {
        String strStudentName1 = tmpStudentName1.getName();
        String strStudentName2 = tmpStudentName2.getName();
        //ASC order (DESC order in sort method)
        return strStudentName1.compareTo(strStudentName2);
    }
}

