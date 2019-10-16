package com.company.DEMO02;

import java.util.Date;

public class Person {
    private int TaxNumber;
    private String Firstname;
    private String Lastname;
    private Date Birthdate;


    public Person(int taxNumber, String firstName, String lastName, Date birthDate) {
        this.TaxNumber = taxNumber;
        this.Firstname = firstName;
        this.Lastname = lastName;
        this.Birthdate = birthDate;
    }

    public void setTaxNumber(int taxNumber) {
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

    public int getAge() {
        return 0; //return age
    }

    public void Input() { //not void?
        //add reader method from zTools
    }

    public void Output() { //not void?

    }

    @Override
    public String toString() {
        return "TaxNumber: " + this.TaxNumber + ". First Name: " + this.Firstname + ". Last Name: " + this.Lastname + ". Last Name: " + this.Birthdate;
    }


}
