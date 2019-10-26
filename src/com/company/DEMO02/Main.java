package com.company.DEMO02;


import java.text.ParseException;
import java.util.ArrayList;

import static com.company.DEMO02.Serialization.SerializeArrayListPersonToXML;
import static com.company.DEMO02.Deserialization.DeserializeArrayListPersonFromXML;
import static com.company.DEMO02.FileWriter.TextArrayListPersonWriter;
import static com.company.DEMO02.Settings.*;


public class Main {

    public static void main(String[] args) throws ParseException {

        ArrayList<Person> arrayList = new ArrayList();


        // Create by constructor
        arrayList.add(new Person("TN1", "D", "B", dateFormat.parse("20.07.1979")));
        arrayList.add(new Person("TN2", "B", "D", dateFormat.parse("22.07.2005")));
        arrayList.add(new Student("TN3", "C", "A", dateFormat.parse("23.07.1981"), dateFormat.parse("01.01.2000")));
        arrayList.add(new Student("TN4", "A", "C", dateFormat.parse("24.07.2002"), dateFormat.parse("01.01.2010")));


        // Create by input
        Person person = new Person();
        System.out.println("\nENTER INFO FOR PERSON:");
        person.Input(person);
        arrayList.add(person);

        Student student = new Student();
        System.out.println("\nENTER INFO FOR STUDENTS:");
        student.Input(student);
        arrayList.add(student);


        // Show all students and persons older than 18 years
        System.out.println("\nShow all students and persons older than 18 years:");
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            if (((person.getAge() > 18) && (person instanceof Person)) || (person instanceof Student)) {
                System.out.println(person.Output(person));
            } else {
                //System.out.println("- " + person.Output(person));
            }
        }


        // Sorting listArray by First Name
        System.out.println("\nSorting records by First Name:");
        arrayList.sort(new FirstNameComparator());
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            System.out.println(person.Output(person));
        }


        // Sorting listArray by Last Name
        System.out.println("\nSorting records by Last Name:");
        arrayList.sort(new LastNameComparator());
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            System.out.println(person.Output(person));
        }


        // Save listArrayPerson to the file
        TextArrayListPersonWriter(arrayList);


        // Serialization
        SerializeArrayListPersonToXML(arrayList);


        // Deserialization
        ArrayList<Person> deserializeArrayListPerson = DeserializeArrayListPersonFromXML();


        // Show result of deserialization
        for (int i = 0; i < deserializeArrayListPerson.size(); i++) {
            person = deserializeArrayListPerson.get(i);
            System.out.println(person.Output(person));
        }
    }
}





