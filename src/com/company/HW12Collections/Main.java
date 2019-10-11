package com.company.HW12Collections;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //ComparableComparator comparableComparator = new ComparableComparator();
        //comparableComparator.runHW05();

        HashSet<String> hashSetA = new HashSet<String>();
        hashSetA.add("1");
        hashSetA.add("2");
        hashSetA.add("3");
        hashSetA.add("4");
        hashSetA.add("5");
        hashSetA.add("6");

        HashSet<String> hashSetB = new HashSet<String>();
        hashSetB.add("1");
        hashSetB.add("2");
        hashSetB.add("6");
        hashSetB.add("7");
        hashSetB.add("8");
        hashSetB.add("9");

        HashSet<String> hashSetC = new HashSet<String>(hashSetA);
        HashSet<String> hashSetD = new HashSet<String>(hashSetA);

        System.out.print("Before retain: hashSet A: ");
        for (String i : hashSetA)
            System.out.print(i);

        System.out.print(System.lineSeparator() + "Before retain: hashSet B: ");
        for (String i : hashSetB)
            System.out.print(i);

        System.out.print(System.lineSeparator() + "Before retain: hashSet C: ");
        for (String i : hashSetC)
            System.out.print(i);

        hashSetC.retainAll(hashSetB);

        System.out.print(System.lineSeparator() + "After retain: hashSet A: ");
        for (String i : hashSetA)
            System.out.print(i);

        System.out.print(System.lineSeparator() + "After retain: hashSet B: ");
        for (String i : hashSetB)
            System.out.print(i);

        System.out.print(System.lineSeparator() + "After retain: hashSet C: ");
        for (String i : hashSetC)
            System.out.print(i);

        System.out.print(System.lineSeparator() + "Before add: hashSet D: ");
        for (String i : hashSetD)
            System.out.print(i);

        hashSetD.addAll(hashSetB);

        System.out.print(System.lineSeparator() + "After add: hashSet D: ");
        for (String i : hashSetD)
            System.out.print(i);


    }
}
