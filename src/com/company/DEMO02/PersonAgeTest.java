package com.company.DEMO02;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.text.ParseException;

import static com.company.DEMO02.Settings.dateFormat;


public class PersonAgeTest {

    Person person1 = null;
    Person person2 = null;

    @BeforeTest
    public void initObjects() {
        try {
            person1 = new Person("TN001", "FN0D", "LN0A", dateFormat.parse("20.07.1979"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            person2 = new Person("TN001", "FN0D", "LN0A", dateFormat.parse("20.07.1980"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    @Test(priority = 2)
    public void testGetAge1() {

        int expected = 40;
        int actual = person1.getAge();
        assertEquals(actual, expected);

    }


    @Test(priority = 1)
    public void testGetAge2() {

        int expected = 39;
        int actual = person2.getAge();
        assertEquals(actual, expected);

    }


    @AfterTest
    public void cleanup() {

        person1 = null;
        person2 = null;

    }
}