package com.company.DEMO02;


import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import static com.company.DEMO02.ConsoleReaders.DateReader;


/**
 * The Student class provide creation of instances, used setter and getter.
 * The class is child of Person class.
 * The class implements interface Serializable.
 *
 * @author Roman Shamakhin
 * @version 0.22 26 Oct 2019
 */
public class Student extends Person implements Serializable {
    private Date yearOfEntry;


    /* Default constructor Student provide creation of instances */
    public Student() {
    }


    /* Constructor Student with parameters provide creation of parameterized instances */
    public Student(String taxNumber, String firstName, String lastName, Date birthDate, Date yearOfEntry) {
        super(taxNumber, firstName, lastName, birthDate);
        this.yearOfEntry = yearOfEntry;
    }


    /* Method setYearOfEntry provide setting value YearOfEntry for instance */
    public void setYearOfEntry(Date yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }


    /* Method getYearOfEntry provide getting value YearOfEntry of instance */
    public Date getYearOfEntry() {
        return this.yearOfEntry;
    }


    /* Method Input is overridden and provide input from console values for instance.
     * Used DateReader method, which check values. */
    @Override
    protected void Input(Person student) throws ParseException {
        super.Input(this);
        System.out.print("Enter Year of Entry (DD.MM.YYYY): ");
        this.setYearOfEntry(DateReader());
    }


    /* Method Output is overridden and provide output string with information of instance */
    @Override
    protected String Output(Person student) {
        return "Student age: " + this.getAge() + ". " + this.toString();
    }


    /* Method toString is overridden and provide compiled string with information of instance.
     * Used format of string for formatting date value. */
    @Override
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() +
                ". First Name: " + this.getFirstName() +
                ". Last Name: " + this.getLastName() +
                ". Birthday: " + String.format("%td.%tm.%tY", this.getBirthDate(), this.getBirthDate(), this.getBirthDate()) +
                ". Year Of Entry: " + String.format("%tY", this.getYearOfEntry());
    }

}

