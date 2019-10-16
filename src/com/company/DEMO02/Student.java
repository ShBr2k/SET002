package com.company.DEMO02;


import java.util.Date;

public class Student extends Person {
    private Date YearOfEntry;

    public Student(int taxNumber, String firstName, String lastName, Date birthDate, Date yearOfEntry) {
        super(taxNumber, firstName, lastName, birthDate);
        this.YearOfEntry = yearOfEntry;
    }

    public void setYearOfEntry(Date yearOfEntry) {
        this.YearOfEntry = yearOfEntry;
    }

    public Date getYearOfEntry () {
        return this.YearOfEntry;
    }
    //@Override
    //public String Input() { //not void?
    //    // Add reader method from zTools
    //    return null;
    //}

    @Override
    public void Output() { //not void?
        // Output the collection to a file | console

    }

    @Override
    public String toString() {
        return String.format("Year Of Entry: " + "%tY", this.getYearOfEntry()); //? get age
    }


}

