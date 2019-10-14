package com.company.HW02Inheritance;


public class Main {

    public static void main(String[] args) {

        Employee[] arrayEmployee = new Employee[5];

        ContractEmployee contractEmployee01 = new ContractEmployee();
        contractEmployee01.setEmployeeID("ID001");
        contractEmployee01.setFederalTaxIDMember("FTID001");
        contractEmployee01.setName("Name001");
        contractEmployee01.setHourlyRate(100.0f);
        contractEmployee01.setNumbersHours(8);
        contractEmployee01.setCalculatePay();
        arrayEmployee[0] = contractEmployee01;

        ContractEmployee contractEmployee02 = new ContractEmployee();
        contractEmployee02.setEmployeeID("ID002");
        contractEmployee02.setFederalTaxIDMember("FTID002");
        contractEmployee02.setName("Name002");
        contractEmployee02.setHourlyRate(100.0f);
        contractEmployee02.setNumbersHours(7);
        contractEmployee02.setCalculatePay();
        arrayEmployee[1] = contractEmployee02;


        SalariedEmployee salariedEmployee01 = new SalariedEmployee();
        salariedEmployee01.setEmployeeID("ID011");                //003
        salariedEmployee01.setSocialSecurityNumber("SSN011");  //SSN001
        salariedEmployee01.setName("Name011");                //Name003
        salariedEmployee01.setFixedPayment(500.0f);
        salariedEmployee01.setCalculatePay();
        arrayEmployee[2] = salariedEmployee01;

        SalariedEmployee salariedEmployee02 = new SalariedEmployee();
        salariedEmployee02.setEmployeeID("ID012");                //004
        salariedEmployee02.setSocialSecurityNumber("SSN012");  //SSN002
        salariedEmployee02.setName("Name012");                //Name004
        salariedEmployee02.setFixedPayment(600.0f);
        salariedEmployee02.setCalculatePay();
        arrayEmployee[3] = salariedEmployee02;

        SalariedEmployee salariedEmployee03 = new SalariedEmployee();
        salariedEmployee03.setEmployeeID("ID013");                //004
        salariedEmployee03.setSocialSecurityNumber("SSN013");  //SSN002
        salariedEmployee03.setName("Name013");                //Name004
        salariedEmployee03.setFixedPayment(900.0f);
        salariedEmployee03.setCalculatePay();
        arrayEmployee[4] = salariedEmployee03;



        /* Do sorting elements by ascending. Use algorithm 'Sorting by inclusion | Insertion sort'. */
        Employee tmpEmp = new Employee();

        for (int i = 1; i < arrayEmployee.length; i++) {
            int j = i;
            float curIndexCalculatePay = ((Calculate) arrayEmployee[i]).calculatePay();

            while ((j > 0) && ((Calculate) arrayEmployee[j - 1]).calculatePay() > curIndexCalculatePay) {
                tmpEmp = arrayEmployee[j];                 // Save temporary instance from array [j]
                arrayEmployee[j] = arrayEmployee[j - 1];   // Move instance in array from [j-1] to [j]
                arrayEmployee[j - 1] = tmpEmp;             // Restore temporary instance to [j-1]
                j--;                                       // Use previous index
            }
        }



        // Show info
        for (Employee employee : arrayEmployee) {
            if (employee instanceof ContractEmployee) {
                String employeeID = ((ContractEmployee) employee).getID();
                String employeeName = ((ContractEmployee) employee).getName();
                float employeePay = ((ContractEmployee) employee).getCalculatePay();
                System.out.println("Contact: " + employeeID + " " + employeeName + " " + employeePay);
            } else {
                String employeeID = ((SalariedEmployee) employee).getID();
                String employeeName = ((SalariedEmployee) employee).getName();
                float employeePay = ((SalariedEmployee) employee).getCalculatePay();
                System.out.println("Salaried: " + employeeID + " " + employeeName + " " + employeePay);
            }
        }

    }
}









