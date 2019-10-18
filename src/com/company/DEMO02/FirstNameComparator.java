package com.company.DEMO02;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {
    public int compare(Person FirstNamePerson1, Person FirstNamePerson2) {
        //ASC order (DESC order in sort method)
        return FirstNamePerson1.getFirstName().compareTo(FirstNamePerson2.getFirstName());
    }
}

