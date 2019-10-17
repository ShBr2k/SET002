package com.company.DEMO02;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.company.DEMO02.Readers.stringReader;


public class Student extends Person {
    private Date YearOfEntry;


    public Student() {
    }


    public Student(String taxNumber, String firstName, String lastName, Date birthDate, Date yearOfEntry) {
        super(taxNumber, firstName, lastName, birthDate);
        this.YearOfEntry = yearOfEntry;
    }

    public void setYearOfEntry(Date yearOfEntry) {
        this.YearOfEntry = yearOfEntry;
    }

    public Date getYearOfEntry() {
        return this.YearOfEntry;
    }


    @Override
    public void setInput(Person student) {
        super.setInput(this);
        System.out.print("Enter YE (DD.MM.YYYY): ");
        try {
            this.setYearOfEntry(new SimpleDateFormat(patternDate).parse(stringReader()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void Output() { //not void?
        // Output the collection to a file | console ?
    }

    @Override //string.format
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() +
                ". First Name: " + this.getFirstname() +
                ". Last Name: " + this.getLastname() +
                ". Birthday: " + String.format("%td.%tm.%tY", this.getBirthdate(), this.getBirthdate(), this.getBirthdate()) +
                ". Year Of Entry: " + String.format("%tY", this.getYearOfEntry()); //?  + get age
    }


}

