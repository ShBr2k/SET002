package com.company.DEMO02;

import com.company.HW11Collections.Car;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Car> {
    public int compare(Car tmpCarType1, Car tmpCarType2) {
        String strCarType1 = tmpCarType1.getType();
        String strCarType2 = tmpCarType2.getType();
        //ASC order (DESC order in sort method)
        return strCarType1.compareTo(strCarType2);
    }
}
