package com.company.DEMO02;

import java.util.Comparator;


public class LastNameComparator implements Comparator<Person> {
    public int compare(Person LastNamePerson1, Person LastNamePerson2) {
        return LastNamePerson1.getLastName().compareTo(LastNamePerson2.getLastName());
    }
}