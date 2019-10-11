package com.company.HW11Collections;

import java.util.Comparator;
import java.util.Date;

/**
 * The Car class provide creation instance, setting and getting access to
 * the fields a class.
 * The Car class implements interface Comparator
 */
public class Car {
    private String Type;                // Field of Type Car
    private Date YearProduction;        // Field of Year production Car
    private float EngineCapacity;       // Engine Capacity

    // Use lambda expression
    // Comparator<Car> TypeCompareByLambda = (Car tmpCarType1, Car tmpCarType2) -> tmpCarType2.getType().compareTo( tmpCarType1.getType() );


    /**
     * Constructor Car provide creation of instances
     */
    public Car() {
    }

    /**
     * Method setType provide setting value type for instance
     */
    public void setType(String type) {
        this.Type = type;
    }

    /**
     * Method setYearProduction provide setting value yearProduction for instance
     */
    public void setYearProduction(Date yearProduction) {
        this.YearProduction = yearProduction;
    }

    /**
     * Method setEngineCapacity provide setting value EngineCapacity for instance
     */
    public void setEngineCapacity(float engineCapacity) {
        this.EngineCapacity = engineCapacity;
    }

    /**
     * Method getInformation provide reading all values of instance
     */
    public String getInformation(int numberCar) {
        String returnInformation = "Type of car #" + numberCar + ": " + this.getType() +
                ". Year of production: " + String.format("%tY", this.getYearProduction()) +
                ". Engine capacity: " + this.getEngineCapacity();
        return returnInformation;
    }

    /**
     * Method getType provide reading value Type of instance
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Method getYearProduction provide reading value YearProduction of instance
     */
    public Date getYearProduction() {
        return this.YearProduction;
    }

    /**
     * Method getEngineCapacity provide reading value EngineCapacity of instance
     */
    public float getEngineCapacity() {
        return this.EngineCapacity;
    }
}





















/**
 * Implements Interface Comparator for compare instance Car by Car Type
 */

    /*
    public static class TypeComparator implements Comparator<Car> {

        // Overriding method compare
        @Override
        public int compare(Car tmpCarType1, Car tmpCarType2) {

            String strCarType1 = tmpCarType1.getType();
            String strCarType2 = tmpCarType2.getType();

            //ASC order (DESC order in sort method)
            return strCarType1.compareTo(strCarType2);

            //DESC order
            //return strCarType2.compareTo(strCarType1);

        }
    }


    /*
    public static Comparator<Car> CarTypeComparator = new Comparator<Car>() {

        public int compare(Car tmpCarType1, Car tmpCarType2) {
            String strCarType1 = tmpCarType1.getType();
            String strCarType2 = tmpCarType2.getType();

            //ascending order
            //return strCarType1.compareTo(strCarType2);

            //descending order
            return strCarType2.compareTo(strCarType1);
        }
    };
    */


