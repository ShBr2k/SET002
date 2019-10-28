package com.company.DEMO02;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.text.ParseException;

import static com.company.DEMO02.Settings.dateFormat;


/**
 * The PersonAgeTest class provide to test getAge method.
 * Used two tests with different values.
 * First test with priority 1 (expected 39 Years).
 * Next test with priority 2 (expected 40 Years).
 *
 * @author Roman Shamakhin
 * @version 0.22 26 Oct 2019
 */
public class PersonAgeTest {

    Person person1 = null;
    Person person2 = null;

    /* Create two instances of Person class with different birthday dates: 20.07.1979 and 20.07.1980 */
    @BeforeTest
    public void initObjects() {

        try {
            person1 = new Person("TNTest01", "FNTestA", "LNTestA", dateFormat.parse("20.07.1979"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            person2 = new Person("TNTest02", "FNTestB", "LNTestB", dateFormat.parse("20.07.1980"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    /* Test should by passed: 2019 - 1979 = 40 */
    @Test(priority = 2)
    public void testGetAge1() {

        int expected = 40;
        int actual = person1.getAge();
        assertEquals(actual, expected);

    }


    /* Test should by passed: 2019 - 1980 = 39 */
    @Test(priority = 1)
    public void testGetAge2() {

        int expected = 39;
        int actual = person2.getAge();
        assertEquals(actual, expected);

    }


    /* Clear instances */
    @AfterTest
    public void cleanup() {

        person1 = null;
        person2 = null;

    }
}