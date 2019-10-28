package com.company.DEMO02;


import java.util.Comparator;


/**
 * The FirstNameComparator class provide comparing values of FirstName field of instances.
 *
 * @author Roman Shamakhin
 * @version 0.11 26 Oct 2019
 */
public class FirstNameComparator implements Comparator<Person> {

    public int compare(Person FirstNamePerson1, Person FirstNamePerson2) {
        return FirstNamePerson1.getFirstName().compareTo(FirstNamePerson2.getFirstName());
    }

}

