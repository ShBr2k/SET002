package com.company.PT23String;


import com.company.HW21String.Word;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.company.zTools.Readers.stringReader;

public class Main {


    public static void main(String[] args) {

        ArrayList<Word> arrayListName = new ArrayList<Word>();

        Pattern pattern = Pattern.compile("^([A-Za-z0-9_]{3,15})$");

        // Enter User Names five times
        for (int i = 0; i < 5; i++) {
            System.out.print("Please input a User Name #" + (i + 1) + ": ");
            String nameInput = stringReader();
            arrayListName.add(new Word(nameInput, nameInput.length()));
        }

        // Checking User Names
        System.out.println(System.lineSeparator() + "Checking User Names:");
        for (int i = 0; i < arrayListName.size(); i++) {

            String userName = arrayListName.get(i).getWord();
            int userNameLength = arrayListName.get(i).getLength();
            Matcher matcher = pattern.matcher(userName);

            if (matcher.find()) {
                System.out.print("User Name # " + (i + 1) +  " is correct:     ");
            } else {
                System.out.print("User Name # " + (i + 1) +  " is not correct: ");
            }
            System.out.format("%-28s:%2d%n", userName, userNameLength);
        }
    }
}





