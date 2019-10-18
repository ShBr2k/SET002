package com.company.DEMO02; //static method ????


import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import static com.company.DEMO02.Main.dateFormat; //move to helpers
import static com.company.DEMO02.Readers.stringReader; //move to helpers

public class Person {
    private String taxNumber;
    private String firstName;
    private String lastName;
    private Date birthDate;


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
        return diff.getYears();
    }

    public void Input(Person person) throws ParseException {
        System.out.print("Enter TN: ");
        this.setTaxNumber(stringReader());
        System.out.print("Enter FN: ");
        this.setFirstName(stringReader());
        System.out.print("Enter LN: ");
        this.setLastName(stringReader());
        System.out.print("Enter BD (DD.MM.YYYY): ");  //check by reg or try...
        try {
            this.setBirthDate(dateFormat.parse(stringReader()));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("\nEntered date is wrong. Default value will be set to: 01.01.2000\n");
            this.setBirthDate(dateFormat.parse("01.01.2000"));
        }
    }

    public String Output(Person person) {
        return "Person age:  " + this.getAge() + ". " + this.toString();
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
