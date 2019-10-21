package com.company.DEMO02;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import static com.company.DEMO02.Deserialization.DeserializeArrayListPersonFromXML;
import static com.company.DEMO02.Serialization.SerializeArrayListPersonToXML;
import static com.company.DEMO02.Settings.dateFormat;
import static org.testng.Assert.*;

public class SerializationTest {

    ArrayList<Person> serializationArrayListPerson = new ArrayList<>();
    ArrayList<Person> deserializeArrayListPerson = new ArrayList<>();

    @BeforeTest
    public void initObjects() {

        // Add object in ArrayListPerson
        try {
            serializationArrayListPerson.add(new Person("TNTest01", "FNTestA", "LNTestA", dateFormat.parse("20.07.1979")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Serialization
        SerializeArrayListPersonToXML(serializationArrayListPerson);

        // Deserialization
        deserializeArrayListPerson = DeserializeArrayListPersonFromXML();
    }


    @Test(priority = 1)
    public void testSizeSerializeArrayListPerson() {

        int expected = serializationArrayListPerson.size();
        int actual = deserializeArrayListPerson.size();
        assertEquals(actual, expected);

    }


    @Test(priority = 2)
    public void testValueAgeSerializeArrayListPerson() {

        int expected = serializationArrayListPerson.get(0).getAge();
        int actual = deserializeArrayListPerson.get(0).getAge();

        System.out.println("Expected age: " + expected);
        System.out.println("Actual age: " + actual);

        assertEquals(actual, expected);

    }


    @AfterTest
    public void cleanup() {

        serializationArrayListPerson = null;
        deserializeArrayListPerson = null;

    }
}