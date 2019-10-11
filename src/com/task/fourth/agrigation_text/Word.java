package com.task.fourth.agrigation_text;

public class Word {
    private String uniqueWord;

    public Word(String uniqueWord) {
        this.uniqueWord = uniqueWord;
    }

    @Override
    public String toString() {
        return " " + uniqueWord;
    }
}
