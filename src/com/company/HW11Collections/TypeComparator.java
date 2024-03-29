package com.company.HW11Collections;

import java.util.Comparator;

public class TypeComparator implements Comparator<Car> {
    public int compare(Car tmpCarType1, Car tmpCarType2) {
        String strCarType1 = tmpCarType1.getType();
        String strCarType2 = tmpCarType2.getType();
        //ASC order (DESC order in sort method)
        return strCarType1.compareTo(strCarType2);
    }
}
