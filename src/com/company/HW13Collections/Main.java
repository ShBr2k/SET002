package com.company.HW13Collections;


import com.sun.xml.internal.bind.v2.runtime.AssociationMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Now allow null keys
        Map personMap = new TreeMap();
        personMap.put("LN01", "FN00");
        personMap.put("LN02", "FN02");
        personMap.put("LN03", "FN03");
        personMap.put("LN04", "FN04");
        personMap.put("LN05", "FN05");
        personMap.put("LN06", "FN06");
        personMap.put("LN07", "FN07");
        personMap.put("LN08", "FN08");
        personMap.put("LN09", "FN09");
        personMap.put("LN10", "FN00");
        //System.out.println(personMap.keySet());
        //System.out.println(personMap.values());
        //for (Object entry: personMap.entrySet()) {

        //    System.out.println(entry);

        //}


        

        for (int i = 0; i < personMap.size(); i++) {


            //System.out.println(new Vector(personMap.values()).get(i));
            //String ff= new Vector(personMap.values()).get(i);
            //System.out.println(entry.values());
            //System.out.println(personMap.get("LN01"));
            int count = Collections.frequency(new ArrayList<String>(personMap.values()), (new Vector(personMap.values()).get(i)));
            System.out.println(count);

        }

        /*
        Map<String, String> result = new TreeMap<String, String>();
        for (Map.Entry<String, String> entry:personMap.entrySet()) {
            String value = entry.getValue();
            Integer count = result.get(value);
            if (count == null)
                result.put(value, new Integer(1));
            else
                result.put(value, new Integer(count+1));
        }
        */



    }
}
