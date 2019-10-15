package com.company.HW21String;


import java.util.ArrayList;

public class Sentence {
    String Sentence;


    public Sentence(String sentence) {
        this.Sentence = sentence;
    }


    public ArrayList sentenceRecognize() {
        ArrayList arrayListWord = new ArrayList();
        String foundWord = "";
        for (int i = 0; i < this.Sentence.length(); i++) {
            foundWord += this.Sentence.charAt(i);
            if ((this.Sentence.charAt(i) == ' ') || (i == this.Sentence.length() - 1)) {
                foundWord = foundWord.replace(" ", "");
                arrayListWord.add(new Word(foundWord, foundWord.length()));
                foundWord = "";
            }
        }
        return arrayListWord;
    }
}


