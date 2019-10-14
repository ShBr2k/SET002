package com.company.HW02Inheritance;


//hourly paid workers
//Include a description of federalTaxIdmember in the class of contractEmployee
//the average monthly salary = hourly rate * number of hours worked
//employee ID, name, and the average monthly wage

public class ContractEmployee extends Employee implements Calculate {
    private String Name;
    private String FederalTaxIDMember;
    private Float HourlyRate;
    private int NumbersHours;
    private float CalculatePay;


    public ContractEmployee() {
    }

    public void setFederalTaxIDMember(String federalTaxIDMember) {
        FederalTaxIDMember = federalTaxIDMember;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setHourlyRate(float hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public void setNumbersHours(int numbersHours) {
        NumbersHours = numbersHours;
    }

    public void setCalculatePay() {
        CalculatePay = calculatePay();
    }

    //implement calculatePay method from Calculate interface
    public float calculatePay() {
        return HourlyRate * NumbersHours;
    }

    public String getID() {
        return this.EmployeeID;
    }

    public String getFederalTaxIDMember() {
        return this.FederalTaxIDMember;
    }

    public String getName() {
        return this.Name;
    }

    public float getCalculatePay() {
        return this.CalculatePay;
    }


    @Override
    public String toString() {
        return "Contact Employee: " + getID() + " " + getName() + " " + getCalculatePay();
    }


    //@Override
    //public void showInfo () {
    //    System.out.println("Contact Employee: " + EmployeeID + " " + getName() + " " + getCalculatePay());
    //}


}
