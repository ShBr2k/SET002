package com.company.HW21String;


import com.company.HW14Collection.Student;

import java.util.ArrayList;

import static com.company.zTools.Readers.stringReader;

public class Main {

    public static void main(String[] args) {

        //read sentence, fill arrayListWord by words
        ArrayList<Word> arrayListWord;

        System.out.print("Input sentence: ");
        String sentenceInput = stringReader();

        Sentence sentence = new Sentence(sentenceInput);
        arrayListWord = sentence.sentenceRecognize();


        // show words and its length
        System.out.println(System.lineSeparator() + "Recognized words and its length: ");
        for (Word word : arrayListWord) {
            System.out.format("%-28s:%2d%n", word.getWord(), word.getLength());
        }


        // find longest word
        int maxIndex = 0;
        for (int i = 0; i < arrayListWord.size(); i++) {
            if (arrayListWord.get(i).getLength() > arrayListWord.get(maxIndex).getLength()) {
                maxIndex = i;
            }
        }
        System.out.println(System.lineSeparator() + "Longest word is: " + arrayListWord.get(maxIndex).getWord());


        // second word in reverse order
        String a = arrayListWord.get(arrayListWord.size() - 2).getWord();
        System.out.println(System.lineSeparator() + "Second word in reverse order is: " + a);
    }

}





