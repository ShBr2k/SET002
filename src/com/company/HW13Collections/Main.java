package com.company.HW13Collections;


import java.util.*;

public class Main {


    private static Map personMap;
    private static ArrayList personFNArrayList;
    private static Map sameNamePersonMap;


    // Show TreeMap of all persons
    private static void showAllPersonTreeMap() {
        System.out.println(System.lineSeparator() + "TreeMap of all persons:");
        for (Object allPersonEntry : personMap.entrySet())
            System.out.println(allPersonEntry);
    }

    // Examine TreeMap of all persons
    private static void examineTreeMap() {
        for (int i = 0; i < personMap.size(); i++) {

            String curPersonFN = personFNArrayList.get(i).toString();           // get curPersonFN by id from arrayListPersonFN
            int count = Collections.frequency(personFNArrayList, curPersonFN);  // get count of the same curPersonValue in arrayListPersonValues
            if (count > 1)                                                      // if found the same FN of person than put to sameNamePersonMap TreeMap
                sameNamePersonMap.put(curPersonFN, count);                      // found more, but put once
        }
    }

    // Show TreeMap of the same FN of persons
    private static void showPersonFNTreeMap() {
        System.out.println(System.lineSeparator() + "TreeMap of the same name of persons:");
        for (Object sameNamePersonEntry : sameNamePersonMap.entrySet())
            System.out.println(sameNamePersonEntry);
    }


    public static void main(String[] args) {

        // Create TreeMap of all persons
        personMap = new TreeMap();
        personMap.put("LN01", "FN00");
        personMap.put("LN02", "FN05");
        personMap.put("LN03", "FN06");
        personMap.put("LN04", "FN04");
        personMap.put("LN05", "FN05");
        personMap.put("LN06", "FN06");
        personMap.put("LN07", "FN05");
        personMap.put("LN08", "FN08");
        personMap.put("LN09", "FN09");
        personMap.put("LN10", "FN00");

        // Create TreeMap of the same FN of persons
        sameNamePersonMap = new TreeMap();

        // Create arrayListPersonFN arrayList of FN of persons
        personFNArrayList = new ArrayList<String>(personMap.values());

        // Show TreeMap of all persons
        showAllPersonTreeMap();

        // Examine TreeMap of all persons for the same FN
        examineTreeMap();

        // Show TreeMap of the same FN of persons
        showPersonFNTreeMap();


        // ========================================= Delete LN07
        System.out.println(System.lineSeparator()+System.lineSeparator()+ "Delete LN07" + System.lineSeparator());


        // Delete Person LN07
        personMap.remove("LN07");

        // Reinitialize arrayListPersonFN, sameNamePersonMap;
        personFNArrayList = new ArrayList<String>(personMap.values());
        sameNamePersonMap.clear();

        // Show TreeMap of all persons
        showAllPersonTreeMap();

        // Examine TreeMap of all persons for the same FN
        examineTreeMap();

        // Show TreeMap of the same FN of persons
        showPersonFNTreeMap();
    }
}

