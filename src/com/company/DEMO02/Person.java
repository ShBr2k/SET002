package com.company.DEMO02;


import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import static com.company.DEMO02.ConsoleReaders.*;
import static com.company.DEMO02.Convertors.*;


/**
 * The Person class provide creation of instances, used setters and getters.
 * The class is parent of Student class.
 * The class implements interface Serializable.
 *
 * @author Roman Shamakhin
 * @version 0.21 26 Oct 2019
 */
public class Person implements Serializable {
    private String taxNumber;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int age;


    /* Default constructor Person provide creation of instances */
    public Person() {
    }


    /* Constructor Person with parameters provide creation of parameterized instances */
    public Person(String taxNumber, String firstName, String lastName, Date birthDate) {
        this.taxNumber = taxNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }


    /* Method setTaxNumber provide setting value TaxNumber for instance */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }


    /* Method setFirstName provide setting value FirstName for instance */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /* Method setLastName provide setting value LastName for instance */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /* Method setBirthDate provide setting value BirthDate for instance */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    /* Method getTaxNumber provide getting value TaxNumber of instance */
    public String getTaxNumber() {
        return this.taxNumber;
    }


    /* Method getFirstName provide getting value FirstName of instance */
    public String getFirstName() {
        return this.firstName;
    }


    /* Method getLastName provide getting value LastName of instance */
    public String getLastName() {
        return this.lastName;
    }


    /* Method getBirthDate provide getting value BirthDate of instance */
    public Date getBirthDate() {
        return this.birthDate;
    }


    /* Method getAge provide getting value BirthDate of instance.
     * Value age is calculated and equals difference between current year and year of birth.
     * convertToLocalDate method provide converting values of type Date to values of type LocalDate. */
    public int getAge() {
        LocalDate birthDay = convertToLocalDate(this.getBirthDate());
        LocalDate today = LocalDate.now();
        Period diff = Period.between(birthDay, today);
        return age = diff.getYears();
    }


    /* Method Input provide input from console values for instance.
     * Used StringReader and DateReader methods, which check values. */
    protected void Input(Person person) throws ParseException {
        System.out.print("Enter Tax Number: ");
        this.setTaxNumber(StringReader());
        System.out.print("Enter First Name: ");
        this.setFirstName(StringReader());
        System.out.print("Enter Last Name:  ");
        this.setLastName(StringReader());
        System.out.print("Enter Birth Day (DD.MM.YYYY): ");
        this.setBirthDate(DateReader());
    }


    /* Method Output provide output string with information of instance */
    protected String Output(Person person) {
        return "Person age:  " + this.getAge() + ". " + this.toString();
    }


    /* Method toString is overridden and provide to compile string with information of instance.
     * Used format of string for formatting date value. */
    @Override
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() +
                ". First Name: " + this.getFirstName() +
                ". Last Name: " + this.getLastName() +
                ". Birthday: " +
                String.format("%td.%tm.%tY", this.getBirthDate(), this.getBirthDate(), this.getBirthDate());
    }


}
