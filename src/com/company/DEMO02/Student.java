package com.company.DEMO02;


import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import static com.company.DEMO02.Main.dateFormat;      //helpers
import static com.company.DEMO02.Readers.stringReader; //helpers


public class Student extends Person implements Serializable {
    private Date yearOfEntry;


    public Student() {
    }

    public Student(String taxNumber, String firstName, String lastName, Date birthDate, Date yearOfEntry) {
        super(taxNumber, firstName, lastName, birthDate);
        this.yearOfEntry = yearOfEntry;
    }

    public void setYearOfEntry(Date yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public Date getYearOfEntry() {
        return this.yearOfEntry;
    }

    @Override
    public void Input(Person student) throws ParseException {
        super.Input(this);
        System.out.print("Enter YE (DD.MM.YYYY): "); //check by reg or try...
        try {
            this.setYearOfEntry(dateFormat.parse(stringReader()));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("\nEntered date is wrong. Default value will be set to: 01.01.2000\n");
            this.setYearOfEntry(dateFormat.parse("01.01.2000"));
        }
    }

    @Override
    public String Output(Person person) {
        return "Student age: " + this.getAge() + ". " + this.toString();
    }

    @Override
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() +
                ". First Name: " + this.getFirstName() +
                ". Last Name: " + this.getLastName() +
                ". Birthday: " + String.format("%td.%tm.%tY", this.getBirthDate(), this.getBirthDate(), this.getBirthDate()) +
                ". Year Of Entry: " + String.format("%tY", this.getYearOfEntry());
    }

}

