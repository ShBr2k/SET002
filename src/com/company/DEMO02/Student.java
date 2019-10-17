package com.company.DEMO02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student extends Person {
    private Date YearOfEntry;


    public Student () {
    }


    public Student(String taxNumber, String firstName, String lastName, Date birthDate, Date yearOfEntry) {
        super(taxNumber, firstName, lastName, birthDate);
        this.YearOfEntry = yearOfEntry;
    }

    public void setYearOfEntry(Date yearOfEntry) {
        this.YearOfEntry = yearOfEntry;
    }

    public Date getYearOfEntry () {
        return this.YearOfEntry;
    }



    /*
    @Override
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
    */


    @Override
    public void Output() { //not void?
        // Output the collection to a file | console ?
    }

    @Override
    public String toString() {
        return "Tax Number: " + this.getTaxNumber() + ". First Name: " + this.getFirstname() + ". Last Name: " + this.getLastname() +
                ". Birthday: " + String.format("%td.%tm.%tY", this.getBirthdate(), this.getBirthdate(), this.getBirthdate()) +
                ". Year Of Entry: " + String.format("%tY", this.getYearOfEntry()) ; //?  + get age
    }


}

