package com.company.DEMO02;


import com.company.HW21String.Word;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Main {



    public static void main(String[] args) throws ParseException {

        String patternDate = "dd.MM.yyyy";

        ArrayList<Person> arrayList = new ArrayList();  //Person, Object

        //create by constructor
        /*
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
*/


        Person person = new Person();
        person.inp(person);
        arrayList.add(person);

/*

        //add person by input/setter
        Person person = new Person(); // add to def const method input ??
        System.out.print("Enter TNP: ");
        person.setTaxNumber(person.setInput()); //tn
        System.out.print("Enter FN: ");
        person.setFirstname(person.setInput()); //fn
        System.out.print("Enter LN: ");
        person.setLastname(person.setInput());  //ln
        System.out.print("Enter BD (DD.MM.YYYY): ");
        person.setBirthdate(new SimpleDateFormat(patternDate).parse(person.setInput())); //bd
        arrayList.add(person); //add to arraylist

        //add student by input/setter
        Student student = new Student();
        System.out.print("Enter TNS: ");
        student.setTaxNumber(student.setInput()); //tn
        System.out.print("Enter FN: ");
        student.setFirstname(student.setInput()); //fn
        System.out.print("Enter LN: ");
        student.setLastname(student.setInput());  //ln
        System.out.print("Enter BD (DD.MM.YYYY): ");
        student.setBirthdate(new SimpleDateFormat(patternDate).parse(student.setInput())); //bd
        System.out.print("Enter YE (DD.MM.YYYY): ");
        student.setYearOfEntry(new SimpleDateFormat(patternDate).parse(student.setInput())); //ye
        arrayList.add(student); //add to arraylist


*/
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





