package com.company.DEMO02; //static method ????


import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import static com.company.DEMO02.Readers.*;


public class Person {
    private String taxNumber;
    private String firstName;
    private String lastName;
    private Date birthDate;
    protected int age;


    private LocalDate convertToLocalDateViaInstant(Date dateToConvert) { //move to helpers
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public Person() {
    }

    public Person(String taxNumber, String firstName, String lastName, Date birthDate) {
        this.taxNumber = taxNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    protected int getAge() {
        LocalDate birthDay = convertToLocalDateViaInstant(this.getBirthDate()); //error if null use
        LocalDate today = LocalDate.now();
        Period diff = Period.between(birthDay, today);
        return age = diff.getYears();
    }

    public void Input(Person person) throws ParseException {
        System.out.print("Enter Tax Number: ");
        this.setTaxNumber(StringReader());
        System.out.print("Enter First Name: ");
        this.setFirstName(StringReader());
        System.out.print("Enter Last Name:  ");
        this.setLastName(StringReader());
        System.out.print("Enter Birth Day (DD.MM.YYYY): ");
        this.setBirthDate(DateReader());
    }

    public String Output(Person person) {
        return "Person age:  " + age + ". " + this.toString();
    }

    @Override
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() +
                ". First Name: " + this.getFirstName() +
                ". Last Name: " + this.getLastName() +
                ". Birthday: " +
                String.format("%td.%tm.%tY", this.getBirthDate(), this.getBirthDate(), this.getBirthDate());
    }


}
