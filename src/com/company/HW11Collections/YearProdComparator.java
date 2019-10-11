package com.company.HW11Collections;

import java.util.Comparator;
import java.util.Date;

public class YearProdComparator implements Comparator<Car> {
    public int compare(Car tmpCarType1, Car tmpCarType2) {
        Date dateCarType1 = tmpCarType1.getYearProduction();
        Date dateCarType2 = tmpCarType2.getYearProduction();
        //ASC order (DESC order in sort method)
        return dateCarType1.compareTo(dateCarType2);
    }
}


