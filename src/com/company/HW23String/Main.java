package com.company.HW23String;


import static com.company.zTools.Readers.stringReader;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please input are number:");
        String text = stringReader();

        float currencyFloat = Float.parseFloat(text);
        String format = "$%.2f"; //rounded
        String currencyString = String.format(format, currencyFloat);
        System.out.println(currencyString);

    }
}





