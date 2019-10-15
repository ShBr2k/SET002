package com.company.HW21String;


import javax.swing.*;
import java.util.ArrayList;

public class Sentence {
    String Sentence;


    public Sentence(String sentence) {
        this.Sentence = sentence;
    }


    public void sentenceRecognize() {
        ArrayList<Word> arrayListWord = new ArrayList<Word>();
        String foundWord = "";
        for (int i = 0; i < this.Sentence.length(); i++) {
            foundWord += this.Sentence.charAt(i);
            if ((this.Sentence.charAt(i) == ' ') || (i == this.Sentence.length() - 1)) {
                arrayListWord.add(new Word(foundWord.replace(" ", ""), foundWord.length()));
                foundWord = "";
            }
        }


        for(Word word : arrayListWord){

            System.out.println(word.getWord() + " : " + word.getLength());
        }
       // System.out.println(arrayListWord.get(i).toString());
    }
}
