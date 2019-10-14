package com.company.HW02Inheritance;


//fixed paid workers
//Describe the string variable socialSecurityNumber in the class SalariedEmployee
//the average monthly salary = fixed monthly payment
//employee ID, name, and the average monthly wage

public class SalariedEmployee extends Employee implements Calculate {
    private String Name;
    private String SocialSecurityNumber;
    private Float FixedPayment;
    private float CalculatePay;


    public SalariedEmployee() {
    }


    public void setSocialSecurityNumber(String socialSecurityNumber) {
        SocialSecurityNumber = socialSecurityNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setFixedPayment(float fixedPayment) {
        FixedPayment = fixedPayment;
    }

    public void setCalculatePay() {
        CalculatePay = calculatePay();
    }

    //implement calculatePay method from Calculate interface
    public float calculatePay() {
        return FixedPayment;
    }

    public String getID() {
        return this.EmployeeID;
    }

    public String getSocialSecurityNumber() {
        return this.SocialSecurityNumber;
    }

    public String getName() {
        return this.Name;
    }

    public float getCalculatePay() {
        return this.CalculatePay;
    }


    @Override
    public String toString() {
        return "Salaried Employee: " + getID() + " " + getName() + " " + getCalculatePay();
    }


    //@Override
    //public void showInfo () {
    //    System.out.println("Salaried Employee: " + EmployeeID + " " + getName() + " " + getCalculatePay());
    //}

}
