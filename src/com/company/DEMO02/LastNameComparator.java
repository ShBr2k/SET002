package com.company.DEMO02;


import java.util.Comparator;


/**
 * The LastNameComparator class provide comparing values of LastName field of instances.
 *
 * @author Roman Shamakhin
 * @version 0.11 26 Oct 2019
 */
public class LastNameComparator implements Comparator<Person> {

    public int compare(Person LastNamePerson1, Person LastNamePerson2) {
        return LastNamePerson1.getLastName().compareTo(LastNamePerson2.getLastName());

    }

}