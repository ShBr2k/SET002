package com.company.DEMO02;


import java.text.ParseException;
import java.util.ArrayList;

import static com.company.DEMO02.Serialization.SerializeArrayListPersonToXML;
import static com.company.DEMO02.Deserialization.DeserializeArrayListPersonFromXML;
import static com.company.DEMO02.FileWriter.TextArrayListPersonWriter;
import static com.company.DEMO02.Settings.*;


/**
 * The Main class provide running application and execute methods which implements further functional:
 * filtering and sorting records by fields of ArrayList and showing it on console;
 * writing text file with records of ArrayList;
 * executing Serialization|Deserialization records of ArrayList with saving and reading data to|from XML file.
 * The class provide creation parameterized instances of Person and Student classes
 * and creation instances by input values via console.
 *
 * @author Roman Shamakhin
 * @version 0.51 26 Oct 2019
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        ArrayList<Person> arrayList = new ArrayList();

        /* Create and add instances Person and Student by constructors of classes to arrayList */
        arrayList.add(new Person("TN1", "D", "B", dateFormat.parse("20.07.1979")));
        arrayList.add(new Person("TN2", "B", "D", dateFormat.parse("22.07.2005")));
        arrayList.add(new Student("TN3", "C", "A", dateFormat.parse("23.07.1981"), dateFormat.parse("01.01.2000")));
        arrayList.add(new Student("TN4", "A", "C", dateFormat.parse("24.07.2002"), dateFormat.parse("01.01.2010")));


        /* Create and add instances Person and Student by input values via console to arrayList */
        Person person = new Person();
        System.out.println("\nENTER INFO OF PERSON:");
        person.Input(person);
        arrayList.add(person);

        Student student = new Student();
        System.out.println("\nENTER INFO OF STUDENTS:");
        student.Input(student);
        arrayList.add(student);


        /* Filtering Persons older than 18 years, Students is not filtered */
        System.out.println("\nShow all students and persons older than 18 years:");
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            if (((person.getAge() > 18) && (person instanceof Person)) || (person instanceof Student)) {
                System.out.println(person.Output(person));
            } else {
                //System.out.println("- " + person.Output(person));
            }
        }


        /* Sorting records of listArray by First Name field. Used FirstNameComparator method. */
        System.out.println("\nSorting records by First Name:");
        arrayList.sort(new FirstNameComparator());
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            System.out.println(person.Output(person));
        }


        /* Sorting records of listArray by Last Name field. Used LastNameComparator method. */
        System.out.println("\nSorting records by Last Name:");
        arrayList.sort(new LastNameComparator());
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            System.out.println(person.Output(person));
        }


        /* Save records listArrayPerson to the text file */
        TextArrayListPersonWriter(arrayList);


        /* Serialization to XML file of a records of ArrayList*/
        SerializeArrayListPersonToXML(arrayList);


        /* Deserialization from XML file of a records of ArrayList */
        ArrayList<Person> deserializeArrayListPerson = DeserializeArrayListPersonFromXML();


        /* Show result of deserialization from XML file on console */
        for (int i = 0; i < deserializeArrayListPerson.size(); i++) {
            person = deserializeArrayListPerson.get(i);
            System.out.println(person.Output(person));
        }

    }

}





