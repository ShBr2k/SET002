package com.company.DEMO02;


import com.company.HW21String.Word;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) throws ParseException {

        String patternDate = "dd.MM.yyyy";

        ArrayList<Person> arrayList = new ArrayList();  //Person, Object

        //create by constructor
        arrayList.add(new Person("TNP001", "FN01", "LN01",
                new SimpleDateFormat(patternDate).parse("21.07.1979")));
        arrayList.add(new Person("TNP002", "FN02", "LN02",
                new SimpleDateFormat(patternDate).parse("22.07.1979")));

        arrayList.add(new Student("TNS003", "FN03", "LN03",
                new SimpleDateFormat(patternDate).parse("23.07.1980"),
                new SimpleDateFormat(patternDate).parse("01.01.2000")));
        arrayList.add(new Student("TNS004", "FN04", "LN04",
                new SimpleDateFormat(patternDate).parse("24.07.1980"),
                new SimpleDateFormat(patternDate).parse("01.01.2001")));


        //create by input
        Person person = new Person();
        person.setInput(person);
        arrayList.add(person);

        Student student = new Student();
        student.setInput(student);
        arrayList.add(student);


        //show
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }

























        //move to Class by input ??
        // birthDate = new SimpleDateFormat("ddMMyyyy").parse("12021980");
        //Date yearOfEntry = new SimpleDateFormat("ddMMyyyy").parse("01012000");


        // arrayList.add(student);

        String de = (arrayList.get(0)).toString();
        //String dd = (arrayList.get(1)).toString();


    }
}





