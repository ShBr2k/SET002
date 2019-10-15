package com.company.HW21String;


import com.company.HW14Collection.Student;

import java.util.ArrayList;

import static com.company.zTools.Readers.stringReader;

public class Main {

    public static void main(String[] args) {


        ArrayList<Word> arrayListWord = new ArrayList<Word>();


        System.out.println("Input sentence: ");
        String sentenceInput = stringReader();
        //System.out.println(sentenceInput);

        Sentence sentence = new Sentence(sentenceInput);

        arrayListWord = sentence.sentenceRecognize();

        for(Word word : arrayListWord){
            System.out.println(word.getWord() + " : " + word.getLength());
        }

        int d = 0;
        for (int i = 0; i < arrayListWord.size(); i++) {

            if (arrayListWord.get(i).getLength() > arrayListWord.get(d).getLength())
            {
                d = i;
            }

        }

        System.out.println(d);


    }

}





