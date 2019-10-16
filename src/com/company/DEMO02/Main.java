package com.company.DEMO02;


import com.company.HW21String.Word;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Main {


    public static void main(String[] args) throws ParseException {

        ArrayList <Object> arrayList = new ArrayList();  //Person

        //move to Class by input ??
        Date birthDate = new SimpleDateFormat("ddMMyyyy").parse("20071979");
        Person person = new Person(1,"FN01", "LN01", birthDate );
        //add new person by input/setter ??
        arrayList.add(person);

        //move to Class by input ??
        birthDate = new SimpleDateFormat("ddMMyyyy").parse("12021980");
        Date yearOfEntry = new SimpleDateFormat("ddMMyyyy").parse("01012000");
        Student student = new Student(2,"FN02", "LN02", birthDate, yearOfEntry);
        arrayList.add(student);

        String de = (arrayList.get(0)).toString();
        String dd = (arrayList.get(1)).toString();







    }
}





