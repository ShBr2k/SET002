package com.company.DEMO02;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.ArrayList;

import static com.company.DEMO02.Deserialization.DeserializeArrayListPersonFromXML;
import static com.company.DEMO02.Serialization.SerializeArrayListPersonToXML;
import static com.company.DEMO02.Settings.dateFormat;
import static org.testng.Assert.*;


/**
 * The SerializationTest class provide to test Serialization and Deserialization methods.
 * The class provide two test.
 * First test is compare size of ListArrayPerson before Serialization and after Deserialization.
 * Second test is compare result of 'getAge' method of instance of class Person before Serialization and after Deserialization.
 * In first test expected value is 1.
 * in second test expected value is 40.
 *
 * @author Roman Shamakhin
 * @version 0.42 26 Oct 2019
 */
public class SerializationTest {

    ArrayList<Person> serializationArrayListPerson = new ArrayList<>();
    ArrayList<Person> deserializeArrayListPerson = new ArrayList<>();

    /* Do initialize, serialization|deserialization of instance of class Person */
    @BeforeTest
    public void initObjects() {

        //  Add instance Person in ArrayListPerson
        try {
            serializationArrayListPerson.add(new Person("TNTest01", "FNTestA", "LNTestA", dateFormat.parse("20.07.1979")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Do serialization of instance Person to XML file
        SerializeArrayListPersonToXML(serializationArrayListPerson);

        // Do deserialization of instance Person to deserializeArrayListPerson
        deserializeArrayListPerson = DeserializeArrayListPersonFromXML();
    }


    /* Size of serializationArrayListPerson should be equals to size deserializeArrayListPerson */
    @Test(priority = 1)
    public void testSizeSerializeArrayListPerson() {

        int expected = serializationArrayListPerson.size();
        int actual = deserializeArrayListPerson.size();

        System.out.println("\nResult of test #1:");
        System.out.println("Expected size of ArrayListPerson: " + expected);
        System.out.println("Actual size of ArrayListPerson: " + actual);

        //Assert
        assertEquals(actual, expected);

    }


    /* Result of 'getAge' method of instance before serialization should be equals to result after deserialization.
     * Actual and expected values should be equals 40. */
    @Test(priority = 2)
    public void testValueAgeSerializeArrayListPerson() {

        int expected = serializationArrayListPerson.get(0).getAge();
        int actual = deserializeArrayListPerson.get(0).getAge();

        System.out.println("\nResult of test #2:");
        System.out.println("Expected age: " + expected);
        System.out.println("Actual age: " + actual);

        //Assert
        assertEquals(actual, expected);

    }


    /* Clear instances */
    @AfterTest
    public void cleanup() {

        serializationArrayListPerson = null;
        deserializeArrayListPerson = null;

    }
}