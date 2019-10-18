package com.company.DEMO02;


import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

import static com.company.DEMO02.FileWriter.FileWriter2;


public class Main {

    public static String patternDate = "dd.MM.yyyy"; //move to helpers
    public static SimpleDateFormat dateFormat = new SimpleDateFormat(patternDate); //move to helpers


    public static void main(String[] args) throws ParseException {

        ArrayList<Person> arrayList = new ArrayList();

        // Create by constructor
        arrayList.add(new Person("TN001", "FN0D", "LN0A", dateFormat.parse("20.07.1979")));
        arrayList.add(new Person("TN002", "FN0B", "LN0B", dateFormat.parse("22.07.2005")));
        arrayList.add(new Student("TN003", "FN0C", "LN0C", dateFormat.parse("23.07.1981"), dateFormat.parse("01.01.2000")));
        arrayList.add(new Student("TN004", "FN0A", "LN0D", dateFormat.parse("24.07.2002"), dateFormat.parse("01.01.2010")));

        // Create by input
        Person person = new Person();
        //person.Input(person);
        //arrayList.add(person);
        Student student = new Student();
        //student.setInput(student);
        //arrayList.add(student);

        // Show > 18 year old persons and students of all ages
        System.out.println("\nShow persons elder than 18 year and all students:");
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            if (((person.getAge() > 18) && (person instanceof Person)) || (person instanceof Student)) {
                System.out.println(person.Output(person));
            } else {
                //System.out.println(person.Output(person));
            }
        }

        // Sorting by First Name
        System.out.println("\nSorting by First Name:");
        Collections.sort(arrayList, new FirstNameComparator());
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            System.out.println(person.Output(person));
        }

        // Sorting by Last Name
        System.out.println("\nSorting by Last Name:");
        Collections.sort(arrayList, new LastNameComparator());
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            System.out.println(person.Output(person));
        }


        boolean res = FileWriter2(arrayList);
        if (res) {System.out.println("file writen");}


        System.exit(0);

        /*
        try(FileWriter writer = new FileWriter(fileName, false))
        {
            // запись всей строки
            //String text = "Hello Gold!\n";

            for (int i = 0; i < arrayList.size(); i++) {
                person = arrayList.get(i);
                //System.out.println(person.Output(person));
                writer.write(person.Output(person) + "\r\n");
            }

            writer.flush();
        }
        catch(IOException ex){
            ex.printStackTrace();
            //System.out.println(ex.getMessage());
        }

*/

    }
}





