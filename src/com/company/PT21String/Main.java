package com.company.PT21String;


import static com.company.zTools.Readers.stringReader;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please input are first sentence: ");
        String textFirst = stringReader();
        System.out.print("Please input are second sentence: ");
        String textSecond = stringReader();

        System.out.println("Result: " + textFirst.contains(textSecond));
    }
}





