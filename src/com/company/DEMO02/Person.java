package com.company.DEMO02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public int getTaxNumber() {
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
        return 0; //return age
    }


    public String setInput() {
        String input = null;

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            input = bufferedReader.readLine(); //all fields
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return input;
        }
    }



    public void Output() { //not void?
        // Output the collection to a file | console
    }

    @Override
    public String toString() {
        return "Tax Number: " + this.TaxNumber + ". First Name: " + this.Firstname + ". Last Name: " + this.Lastname + ". Birthday: " + this.Birthdate;
    }


}
