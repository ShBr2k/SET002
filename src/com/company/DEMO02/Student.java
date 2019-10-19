package com.company.DEMO02;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import static com.company.DEMO02.ConsoleReaders.DateReader;


public class Student extends Person implements Serializable {
    public Date yearOfEntry;


    public Student() {
    }

    public Student(String taxNumber, String firstName, String lastName, Date birthDate, Date yearOfEntry) {
        super(taxNumber, firstName, lastName, birthDate);
        this.yearOfEntry = yearOfEntry;
    }

    private void setYearOfEntry(Date yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public Date getYearOfEntry() {
        return this.yearOfEntry;
    }

    @Override
    protected void Input(Person student) throws ParseException {
        super.Input(this);
        System.out.print("Enter Year of Entry (DD.MM.YYYY): ");
        this.setYearOfEntry(DateReader());
    }

    @Override
    protected String Output(Person student) {
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

