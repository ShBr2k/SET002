package com.company.DEMO02;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) throws ParseException {


        String patternDate = "dd.MM.yyyy";

        ArrayList<Person> arrayList = new ArrayList();


        //create by constructor
        arrayList.add(new Person("TNP001", "FN01", "LN01",
                new SimpleDateFormat(patternDate).parse("20.07.1979")));
        arrayList.add(new Person("TNP002", "FN02", "LN02",
                new SimpleDateFormat(patternDate).parse("22.07.1980")));

        arrayList.add(new Student("TNS003", "FN03", "LN03",
                new SimpleDateFormat(patternDate).parse("23.07.1981"),
                new SimpleDateFormat(patternDate).parse("01.01.2000")));
        arrayList.add(new Student("TNS004", "FN04", "LN04",
                new SimpleDateFormat(patternDate).parse("24.07.1982"),
                new SimpleDateFormat(patternDate).parse("01.01.2001")));


        //create by input
        Person person = new Person();
        person.setInput(person);
        arrayList.add(person);

        Student student = new Student();
        student.setInput(student);
        arrayList.add(student);


        //show > 18 year old
        for (int i = 0; i < arrayList.size(); i++) {
            person = arrayList.get(i);
            if (person.getAge() > 18) {
                System.out.println("+ " + person.Output(person));
            } else {
                //System.out.println("- " + person.Output(person));
            }
        }


    }
}





