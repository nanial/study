package com.task.fourth.agrigation_text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> uniqueSentence;

    public Sentence() {
        this.uniqueSentence = new ArrayList<>();
    }
    public void addWords(Word w){
        uniqueSentence.add(w);
    }

    public void printSentence(){

        for (Word v : uniqueSentence) {
            System.out.print(v.toString() + " ");
        }
    }
}
