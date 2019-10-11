package com.company.HW11Collections;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.company.zTools.Readers.stringReader;


/**
 * Class HW05 - main for current task
 *
 * @author Roman Shamakhin
 * @version 0.11 04 Oct 2019
 */

public class ComparableComparator {


    //
    ArrayList<Car> arrayListCar = new ArrayList<Car>();       // Create ArrayList of class Car

    /**
     * Method readArrayCar provide showing information of instances from arrayCar
     */
    private void readArrayListCar(int lengthArrayListCar) {
        for (int i = 0; i < lengthArrayListCar; i++) {
            System.out.println(arrayListCar.get(i).getInformation(i + 1));
        }
    }

    /**
     * Method runHW05 provide execution of task
     */
    public void runHW05() {

        /* Filling array of instances of class Car, value yearProduction input by console,
           values type, engineCapacity is calculated */
        int i = 1; //counter

        do {
            System.out.print("Input Year of Production Car #" + (i) + ": ");
            // Checking for correct of value of Year
            try {

                Date yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());

                Car car = new Car();
                car.setType(Character.toString((char) (i + 64)));
                car.setYearProduction(yearProduction);
                car.setEngineCapacity(1 + i * 0.1f);

                arrayListCar.add(car);

            } catch (ParseException e) {
                System.out.println("Entered value is not Year.");
                System.exit(0);
            } finally {
            }

            i++;

            System.out.print("Next car? Y|N ");
        }
        while (stringReader().equals("y"));

        /* Showing elements of array before sorting */
        System.out.println(System.lineSeparator() + "List of cars before sorting:");
        readArrayListCar(arrayListCar.size());

        /* Sorting arrayList of Type field by DESC (use lambda expression )*/
        // Collections.sort(arrayListCar, new Car().TypeCompareByLambda);

        /* Sorting arrayList of Type field by DESC (use class TypeComparator )*/
        System.out.println(System.lineSeparator() + "List of cars after sorting (Field Type by DESC):");
        Collections.sort(arrayListCar, new TypeComparator().reversed());
        readArrayListCar(arrayListCar.size());

        /* Sorting arrayList of Year field by DESC (use class YearComparator )*/
        System.out.println(System.lineSeparator() + "List of cars after sorting (Field Year by DESC):");
        Collections.sort(arrayListCar, new YearProdComparator().reversed());
        readArrayListCar(arrayListCar.size());

        /* Sorting elements of YearProduction field of array by ascending. Use algorithm 'Sorting by inclusion | Insertion sort'. */
        Car curCar;                                           // Create temporary instance of class Car
        Car tmpCar;                                           // Create temporary instance of class Car

        for (i = 1; i < arrayListCar.size(); i++) {           // External loop
            curCar = arrayListCar.get(i);                     // Save current instance
            int j = i;                                        // Used interface Comparable (compareTo, x.compare(y)>0)
            while ((j > 0) && (arrayListCar.get(j - 1).getYearProduction().compareTo(curCar.getYearProduction()) > 0)) {
                // loop is repeated unit reach first element of array and instance [i] greater than instance [j-1]
                tmpCar = arrayListCar.get(j);                  // Save temporary instance from array [j]
                arrayListCar.set(j, arrayListCar.get(j - 1));  // Move instance in array from [j-1] to [j]
                arrayListCar.set(j - 1, tmpCar);               // Restore temporary instance to [j-1]
                j--;                                           // use previous index
            }
        }

        /* Showing elements of arrayList before sorting */
        System.out.println(System.lineSeparator() + "List of cars after sorting (Field Year by ASC):");
        readArrayListCar(arrayListCar.size());

    }
}





















//Collections.sort(arrayListCar, Car.CarComarator);