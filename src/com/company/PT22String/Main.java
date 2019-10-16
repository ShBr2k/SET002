package com.company.PT22String;


import com.company.HW21String.Sentence;
import com.company.HW21String.Word;

import java.util.ArrayList;

import static com.company.zTools.Readers.stringReader;

public class Main {

    public static void main(String[] args) {

        //read First Name, Name, Patronymic and fill arrayListWord by words
        ArrayList<Word> arrayListName;

        System.out.print("Enter Surname, Name and Patronymic: ");
        String nameInput = stringReader();

        Sentence name = new Sentence(nameInput);
        arrayListName = name.sentenceRecognize();

        System.out.println(arrayListName.get(0).getWord() + " " + arrayListName.get(1).getWord().charAt(0) + "." + arrayListName.get(2).getWord().charAt(0) + ".");
        System.out.println(arrayListName.get(1).getWord());
        System.out.println(arrayListName.get(1).getWord() + " " + arrayListName.get(2).getWord() + " " + arrayListName.get(0).getWord());
    }
}





