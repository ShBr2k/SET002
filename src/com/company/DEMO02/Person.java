package com.company.DEMO02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import static com.company.DEMO02.Readers.stringReader;

public class Person {
    private String TaxNumber;
    private String Firstname;
    private String Lastname;
    private Date Birthdate;


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

    public int getAge() {

        // age =
        return 0; //return age
    }



    public void inp (Person person) {
        this.setTaxNumber(stringReader());
        this.setFirstname(stringReader());
        this.setLastname(stringReader());
        //this.setBirthdate(setInput());
    }

    public String setInput() {
        String input = null;

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            input = bufferedReader.readLine(); //all fields
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return input;
        }
    }


    public void Output() { //not void?
        // Output the collection to a file | console ?
    }

    @Override
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() + ". First Name: " + this.getFirstname() + ". Last Name: " + this.getLastname() +
                ". Birthday: " + String.format("%td.%tm.%tY", this.getBirthdate(), this.getBirthdate(), this.getBirthdate());
    }


}
