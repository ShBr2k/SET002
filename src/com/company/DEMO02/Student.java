package com.company.DEMO02;


import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import static com.company.DEMO02.Readers.DateReader;



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
        System.out.print("Enter Year of Entry (DD.MM.YYYY): ");
        this.setYearOfEntry(DateReader());
    }

    @Override
    public String Output(Person student) {
        return "Student age: " + this.getAge() + ". " + this.toString(); //age = 0 if deser.
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

