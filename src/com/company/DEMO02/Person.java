package com.company.DEMO02; //static method ????


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import static com.company.DEMO02.Readers.stringReader;

public class Person {
    private String TaxNumber;
    private String Firstname;
    private String Lastname;
    private Date Birthdate;

    String patternDate = "dd.MM.yyyy";

    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }


    public Person() {
    }


    public Person(String taxNumber, String firstName, String lastName, Date birthDate) {
        this.TaxNumber = taxNumber;
        this.Firstname = firstName;
        this.Lastname = lastName;
        this.Birthdate = birthDate;
    }

    public void setTaxNumber(String taxNumber) {
        this.TaxNumber = taxNumber;
    }

    public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public void setBirthdate(Date birthdate) {
        this.Birthdate = birthdate;
    }

    public String getTaxNumber() {
        return this.TaxNumber;
    }

    public String getFirstname() {
        return this.Firstname;
    }

    public String getLastname() {
        return this.Lastname;
    }

    public Date getBirthdate() {
        return this.Birthdate;
    }

    protected int getAge() {
        LocalDate birthDay = convertToLocalDateViaInstant (this.getBirthdate());
        LocalDate today = LocalDate.now();
        Period diff = Period.between(birthDay, today);
        int age = diff.getYears();
        return age;
    }

    public void setInput(Person person) {
        System.out.print("Enter TN: ");
        this.setTaxNumber(stringReader());
        System.out.print("Enter FN: ");
        this.setFirstname(stringReader());
        System.out.print("Enter LN: ");
        this.setLastname(stringReader());
        System.out.print("Enter BD (DD.MM.YYYY): ");
        try {
            this.setBirthdate(new SimpleDateFormat(patternDate).parse(stringReader()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String Output(Person person) {
        int age = this.getAge();
        return "Person.  Age: " + age + ". "+ this.toString();
    }

    @Override
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() +
                ". First Name: " + this.getFirstname() +
                ". Last Name: " + this.getLastname() +
                ". Birthday: " +
                String.format("%td.%tm.%tY", this.getBirthdate(), this.getBirthdate(), this.getBirthdate());
    }


}
