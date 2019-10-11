package com.company.HW01Inheritance;

public class Main {

    public static void main(String[] args) {

        Bird[] massBird = new Bird[4];

        massBird[0] = new Eagle();
        massBird[1] = new Swallow();
        massBird[2] = new Penguin();
        massBird[3] = new Chicken();

        for (int i = 0; i < massBird.length; i++) {
            System.out.println(massBird[i].getName() + ". Fly: " + massBird[i].fly() + ". Feather: " + massBird[i].getFeathers() + ". Lay eggs:  " + massBird[i].getLayEggs());
        }


    }
}
